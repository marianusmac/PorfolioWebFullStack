package com.portfolio.mrn.Repository;

import com.portfolio.mrn.Entity.Acerca;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcercaRepository extends JpaRepository<Acerca, Integer>{
    public Optional<Acerca> findByProfesionAcerca(String profesionAcerca);
    public boolean existsByProfesionAcerca(String profesionAcerca);
}
