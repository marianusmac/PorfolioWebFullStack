package com.portfolio.mrn.Interface;

import com.portfolio.mrn.Entity.Persona;
import java.util.List;
public interface IPersonaService {
    //Traer una persona
    public List<Persona> getPersona();
    
    //Guardar objeto tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar objeto buscado por ID
    public void deletePersona(Long id);
    
    //Buscar persona
    public Persona findPersona(Long id);
}
