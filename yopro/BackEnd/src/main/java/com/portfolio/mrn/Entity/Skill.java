package com.portfolio.mrn.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombreSkill;
	private int porcentajeSkill;
	private String imagenSkill;
        
        @ManyToOne
        @JoinColumn(name = "id_persona", referencedColumnName = "id")
        Persona persona;
        
	//Constructores

	public Skill() {
	}

	public Skill(String nombreSkill, int porcentajeSkill, String imagenSkill) {
		this.nombreSkill = nombreSkill;
		this.porcentajeSkill = porcentajeSkill;
		this.imagenSkill = imagenSkill;
	}
        
}
