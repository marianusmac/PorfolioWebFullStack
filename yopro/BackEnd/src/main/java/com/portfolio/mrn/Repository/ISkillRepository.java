package com.portfolio.mrn.Repository;

import com.portfolio.mrn.Entity.Skill;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISkillRepository extends JpaRepository<Skill, Long>{
	public Optional<Skill> findByNombreSkill(String nombreSkill);
	public boolean existsByNombreSkill(String nombreSkill);
}
