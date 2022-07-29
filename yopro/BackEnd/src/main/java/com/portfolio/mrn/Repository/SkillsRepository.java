package com.portfolio.mrn.Repository;

import com.portfolio.mrn.Entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface SkillsRepository extends JpaRepository<Skills, Integer>{
	public Optional<Skills> findByNombreSkills(String nombreSkills);

}
