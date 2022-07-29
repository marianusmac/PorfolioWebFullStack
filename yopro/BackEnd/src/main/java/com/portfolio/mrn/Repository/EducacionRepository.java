package com.portfolio.mrn.Repository;

import com.portfolio.mrn.Entity.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion, Integer>{
    public Optional<Educacion> findByInstitucionEdu(String institucionEdu);
    public boolean existsByInstitucionEdu(String institucionEdu);
}
