package com.portfolio.mrn.Dto;

import javax.validation.constraints.NotBlank;

public class dtoExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private String imagenE;
    
    //Constructores

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String descripcionE, String imagenE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.imagenE = imagenE;
    }

    //GYS

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getImagenE() {
        return imagenE;
    }

    public void setImagenE(String imagenE) {
        this.imagenE = imagenE;
    }
    
    
}