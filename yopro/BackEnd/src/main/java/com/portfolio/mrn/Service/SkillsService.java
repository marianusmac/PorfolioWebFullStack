package com.portfolio.mrn.Service;


import com.portfolio.mrn.Entity.Skills;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.mrn.Repository.SkillsRepository;

@Service
@Transactional
public class SkillsService {
	@Autowired
	SkillsRepository SkillsRepository;

	public List<Skills> list(){
		return SkillsRepository.findAll();
	}

	public Optional<Skills> getOne(int id){
		return SkillsRepository.findById(id);
	}

	public Optional<Skills> getByNombreSkill(String nombreSkills){
		return SkillsRepository.findByNombreSkills(nombreSkills);
	}

	public void save(Skills skills){
		SkillsRepository.save(skills);
	}

	public void delete(int id){
		SkillsRepository.deleteById(id);
	}

	public boolean existsById(int id){
		return SkillsRepository.existsById(id);
	}

	public boolean existsByNombreSkills(String nombreSkills){
		return SkillsRepository.existsByNombreSkills(nombreSkills);
	}
}
