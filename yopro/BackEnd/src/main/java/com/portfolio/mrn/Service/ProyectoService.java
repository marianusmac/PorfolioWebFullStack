package com.portfolio.mrn.Service;

import com.portfolio.mrn.Entity.Proyecto;
import com.portfolio.mrn.Repository.ProyectoRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProyectoService {
     @Autowired
     ProyectoRepository proyectoRepository;
     
     public List<Proyecto> list(){
         return proyectoRepository.findAll();
     }
     
     public Optional<Proyecto> getOne(int id){
         return proyectoRepository.findById(id);
     }
     
     public Optional<Proyecto> getByNombrePro(String nombrePro){
         return proyectoRepository.findByNombrePro(nombrePro);
     }
     
     public void save(Proyecto proyecto){
         proyectoRepository.save(proyecto);
     }
     
     public void delete(int id){
         proyectoRepository.deleteById(id);
     }
     
     public boolean existsById(int id){
         return proyectoRepository.existsById(id);
     }
     
     public boolean existsByNombrePro(String nombrePro){
         return proyectoRepository.existsByNombrePro(nombrePro);
     }
}