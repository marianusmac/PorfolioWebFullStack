package com.portfolio.mrn.Dto;


public class SkillDto {

	private String nombreSkill;
	private int porcentajeSkill;
	private String imagenSkill;

	//Constructores

	public SkillDto() {
            System.out.println("AAAAAAAA");
	}

	public SkillDto(String nombreSkill, int porcentajeSkill, String imagenSkill) {
		this.nombreSkill = nombreSkill;
		this.porcentajeSkill = porcentajeSkill;
		this.imagenSkill = imagenSkill;
	}

	//Getters and Setters x Lombok

    public String getNombreSkill() {
        return nombreSkill;
    }

    public void setNombreSkill(String nombreSkill) {
        this.nombreSkill = nombreSkill;
    }

    public int getPorcentajeSkill() {
        return porcentajeSkill;
    }

    public void setPorcentajeSkill(int porcentajeSkill) {
        this.porcentajeSkill = porcentajeSkill;
    }

    public String getImagenSkill() {
        return imagenSkill;
    }

    public void setImagenSkill(String imagenSkill) {
        this.imagenSkill = imagenSkill;
    }
        
        
}