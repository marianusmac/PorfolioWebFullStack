package com.portfolio.mrn.Service;

import com.portfolio.mrn.Entity.Skill;
import com.portfolio.mrn.Repository.SkillRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService {

    @Autowired
    SkillRepository skillRepository;
    
    public ArrayList<Skill> getAllSkill() {
        return (ArrayList<Skill>) skillRepository.findAll();
    }
        
    public Skill saveSkill(Skill skill) {
        return skillRepository.save(skill);
    }
    public Skill getSkillByID(Long id) {
        return skillRepository.findById(id).get();
    }

    public boolean deleteSkillById(Long id) {
        try {
        skillRepository.deleteById(id);
        return true;
        } catch (Exception e){
            return false;
        }
    }
    
    public Skill findSkill(Long id) {
        return skillRepository.findById(id).orElse(null);
    }

    public List<Skill> getSkillByPersonId(Long personId) {
        return skillRepository.findAllByPersonId(personId);
    }
    
}

