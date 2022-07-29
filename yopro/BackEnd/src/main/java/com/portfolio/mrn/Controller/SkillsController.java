package com.portfolio.mrn.Controller;

import com.portfolio.mrn.Dto.SkillsDto;
import com.portfolio.mrn.Entity.Skills;
import com.portfolio.mrn.Security.Controller.Mensaje;
import com.portfolio.mrn.Service.SkillsService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/skills")
@CrossOrigin(origins = "http://localhost:4200")
public class SkillsController {
	@Autowired
	SkillsService skillsService;

	@GetMapping("/lista")
	public ResponseEntity<List<Skills>> list(){
		List<Skills> list = skillsService.list();
		return new ResponseEntity(list, HttpStatus.OK);
	}

	@GetMapping("/detail/{id}")
	public ResponseEntity<Skills> getById(@PathVariable("id") int id){
		if(!skillsService.existsById(id))
			return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
		Skills skills = skillsService.getOne(id).get();
		return new ResponseEntity(skills, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") int id) {
		if (!skillsService.existsById(id)) {
			return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
		}
		skillsService.delete(id);
		return new ResponseEntity(new Mensaje("producto eliminado"), HttpStatus.OK);
	}


	@PostMapping("/create")
	public ResponseEntity<?> create(@RequestBody SkillsDto skillsDto){
		if(StringUtils.isBlank(skillsDto.getNombreSkills()))
			return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
		if(skillsService.existsByNombreSkills(skillsDto.getNombreSkills()))
			return new ResponseEntity(new Mensaje("Esa skill existe"), HttpStatus.BAD_REQUEST);

		Skills skill = new Skills(skillsDto.getNombreSkills(),
				skillsDto.getPorcentajeSkills(),
				skillsDto.getImagenSkills());
		skillsService.save(skills);

		return new ResponseEntity(new Mensaje("Skill agregada"), HttpStatus.OK);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody SkillsDto skillsDto){
		//Validamos si existe el ID
		if(!skillsService.existsById(id))
			return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
		//Compara nombre de skill
		if(skillsService.existsByNombreSkills(skillsDto.getNombreSkills()) &&
				skillsService.getByNombreSkills(skillsDto.getNombreSkills()).get().getId() != id)
			return new ResponseEntity(new Mensaje("Esa skill ya existe"), HttpStatus.BAD_REQUEST);
		//No puede estar vacio
		if(StringUtils.isBlank(skillsDto.getNombreSkills()))
			return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);

		Skills skills = skillsService.getOne(id).get();
		skills.setNombreSkills(skillsDto.getNombreSkills());
		skills.setPorcentajeSkills(skillsDto.getPorcentajeSkills());
		skills.setImagenSkills(skillsDto.getImagenSkills());

		skillsService.save(skills);
		return new ResponseEntity(new Mensaje("Skill actualizada"), HttpStatus.OK);

	}
}
