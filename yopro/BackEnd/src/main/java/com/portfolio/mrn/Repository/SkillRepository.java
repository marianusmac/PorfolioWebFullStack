package com.portfolio.mrn.Repository;

import com.portfolio.mrn.Entity.Skill;
import java.util.ArrayList;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long>{
    
    public abstract ArrayList<Skill> findByName(String name);

    public Skill getByName(String name);

    public List<Skill> findAllByPersonId(Long personId);
}
