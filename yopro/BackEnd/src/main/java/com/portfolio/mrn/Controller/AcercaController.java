package com.portfolio.mrn.Controller;

import com.portfolio.mrn.Dto.dtoAcerca;
import com.portfolio.mrn.Entity.Acerca;
import com.portfolio.mrn.Entity.Educacion;
import com.portfolio.mrn.Security.Controller.Mensaje;
import com.portfolio.mrn.Service.AcercaService;
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
@RequestMapping("/acerca")
@CrossOrigin(origins = "http://localhost:4200")
public class AcercaController {
    @Autowired
    AcercaService acercaService;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Acerca>> list(){
        List<Acerca> list = acercaService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Acerca> getById(@PathVariable("id") int id){
        if(!acercaService.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Acerca acerca = acercaService.getOne(id).get();
        return new ResponseEntity(acerca, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!acercaService.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        acercaService.delete(id);
        return new ResponseEntity(new Mensaje("Entrada eliminada"), HttpStatus.OK);
    }

    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoAcerca dtoacerca){      
        if(StringUtils.isBlank(dtoacerca.getProfesionAcerca()))
            return new ResponseEntity(new Mensaje("La profesión es obligatoria"), HttpStatus.BAD_REQUEST);
        if(acercaService.existsByProfesionAcerca(dtoacerca.getProfesionAcerca()))
            return new ResponseEntity(new Mensaje("Esa profesión ya existe"), HttpStatus.BAD_REQUEST);
        
        Acerca acerca = new Acerca(dtoacerca.getProfesionAcerca(), dtoacerca.getUbicacionAcerca(), dtoacerca.getFechaAcerca(), dtoacerca.getEmailAcerca(), dtoacerca.getSobremiAcerca());
        acercaService.save(acerca);
        
        return new ResponseEntity(new Mensaje("Acerca agregada"), HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoAcerca dtoacerca){
        //Validamos si existe el ID
        if(!acercaService.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        //Compara nombre de acerca
        if(acercaService.existsByProfesionAcerca(dtoacerca.getProfesionAcerca()) && acercaService.getByProfesionAcerca(dtoacerca.getProfesionAcerca()).get().getId() != id)
            return new ResponseEntity(new Mensaje("Esa profesión ya existe"), HttpStatus.BAD_REQUEST);
        //No puede estar vacio
        if(StringUtils.isBlank(dtoacerca.getProfesionAcerca()))
            return new ResponseEntity(new Mensaje("La profesión es obligatoria"), HttpStatus.BAD_REQUEST);
        
        Acerca acerca = acercaService.getOne(id).get();
        acerca.setProfesionAcerca(dtoacerca.getProfesionAcerca());
        acerca.setUbicacionAcerca(dtoacerca.getUbicacionAcerca());
        acerca.setFechaAcerca(dtoacerca.getFechaAcerca());
        acerca.setEmailAcerca(dtoacerca.getEmailAcerca());
        
        acercaService.save(acerca);
        return new ResponseEntity(new Mensaje("Acerca actualizada"), HttpStatus.OK);
             
    }
}