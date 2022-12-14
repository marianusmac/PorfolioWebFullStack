package com.portfolio.mrn.Controller;

import com.portfolio.mrn.Dto.dtoProyecto;
import com.portfolio.mrn.Entity.Proyecto;
import com.portfolio.mrn.Security.Controller.Mensaje;
import com.portfolio.mrn.Service.EducacionService;
import com.portfolio.mrn.Service.ProyectoService;
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
@RequestMapping("/proyecto")
@CrossOrigin(origins = "http://localhost:4200")
public class ProyectoController {
    @Autowired
    ProyectoService proyectoService;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Proyecto>> list(){
        List<Proyecto> list = proyectoService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Proyecto> getById(@PathVariable("id") int id){
        if(!proyectoService.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Proyecto proyecto = proyectoService.getOne(id).get();
        return new ResponseEntity(proyecto, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!proyectoService.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        proyectoService.delete(id);
        return new ResponseEntity(new Mensaje("Entrada eliminada"), HttpStatus.OK);
    }

    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoProyecto dtopro){      
        if(StringUtils.isBlank(dtopro.getNombrePro()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(proyectoService.existsByNombrePro(dtopro.getNombrePro()))
            return new ResponseEntity(new Mensaje("Esa entrada ya existe"), HttpStatus.BAD_REQUEST);
        
        Proyecto proyecto = new Proyecto(dtopro.getNombrePro(), dtopro.getDescripcionPro(), dtopro.getFechaPro(), dtopro.getImagenPro());
        proyectoService.save(proyecto);
        
        return new ResponseEntity(new Mensaje("Proyecto agregado"), HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoProyecto dtopro){
        //Validamos si existe el ID
        if(!proyectoService.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        //Compara nombre de proyecto
        if(proyectoService.existsByNombrePro(dtopro.getNombrePro()) && proyectoService.getByNombrePro(dtopro.getNombrePro()).get().getId() != id)
            return new ResponseEntity(new Mensaje("Ese proyecto ya existe"), HttpStatus.BAD_REQUEST);
        //No puede estar vacio
        if(StringUtils.isBlank(dtopro.getNombrePro()))
            return new ResponseEntity(new Mensaje("El proyecto es obligatoria"), HttpStatus.BAD_REQUEST);
        
        Proyecto proyecto = proyectoService.getOne(id).get();
        proyecto.setNombrePro(dtopro.getNombrePro());
        proyecto.setDescripcionPro(dtopro.getDescripcionPro());
        proyecto.setFechaPro(dtopro.getFechaPro());
        proyecto.setImagenPro(dtopro.getImagenPro());
        
        proyectoService.save(proyecto);
        return new ResponseEntity(new Mensaje("Proyecto actualizada"), HttpStatus.OK);
             
    }
}
