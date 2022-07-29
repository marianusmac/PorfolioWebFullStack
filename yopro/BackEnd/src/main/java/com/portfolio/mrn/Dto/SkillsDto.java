package com.portfolio.mrn.Dto;

import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.NotBlank;
@Getter @Setter
public class SkillsDto {

	@NotBlank
	private String nombreSkills;
	@NotBlank
	private String porcentajeSkills;
	@NotBlank
	private String imagenSkills;

	//Constructores

	public SkillsDto() {
	}

	public SkillsDto(String nombreSkill, String porcentajeSkill, String imagenSkill) {
		this.nombreSkills = nombreSkill;
		this.porcentajeSkills = porcentajeSkill;
		this.imagenSkills = imagenSkill;
	}

	//Getters and Setters x Lombok

}
