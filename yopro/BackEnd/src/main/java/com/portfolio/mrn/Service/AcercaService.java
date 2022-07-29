/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mrn.Service;

import com.portfolio.mrn.Entity.Acerca;
import com.portfolio.mrn.Repository.AcercaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AcercaService {
     @Autowired
     AcercaRepository acercaRepository;
     
     public List<Acerca> list(){
         return acercaRepository.findAll();
     }
     
     public Optional<Acerca> getOne(int id){
         return acercaRepository.findById(id);
     }
     
     public Optional<Acerca> getByProfesionAcerca(String profesionAcerca){
         return acercaRepository.findByProfesionAcerca(profesionAcerca);
     }
     
     public void save(Acerca acerca){
         acercaRepository.save(acerca);
     }
     
     public void delete(int id){
         acercaRepository.deleteById(id);
     }
     
     public boolean existsById(int id){
         return acercaRepository.existsById(id);
     }
     
     public boolean existsByProfesionAcerca(String profesionAcerca){
         return acercaRepository.existsByProfesionAcerca(profesionAcerca);
     }
}
