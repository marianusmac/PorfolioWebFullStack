package com.portfolio.mrn.Service;

import com.portfolio.mrn.Entity.Educacion;
import com.portfolio.mrn.Repository.EducacionRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EducacionService {
     @Autowired
     EducacionRepository educacionRepository;
     
     public List<Educacion> list(){
         return educacionRepository.findAll();
     }
     
     public Optional<Educacion> getOne(int id){
         return educacionRepository.findById(id);
     }
     
     public Optional<Educacion> getByInstitucionEdu(String institucionEdu){
         return educacionRepository.findByInstitucionEdu(institucionEdu);
     }
     
     public void save(Educacion educacion){
         educacionRepository.save(educacion);
     }
     
     public void delete(int id){
         educacionRepository.deleteById(id);
     }
     
     public boolean existsById(int id){
         return educacionRepository.existsById(id);
     }
     
     public boolean existsByInstitucionEdu(String institucionEdu){
         return educacionRepository.existsByInstitucionEdu(institucionEdu);
     }
}
