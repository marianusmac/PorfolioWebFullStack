package com.portfolio.mrn.Dto;

import javax.validation.constraints.NotBlank;

public class dtoEducacion {
    @NotBlank
    private String institucionEdu;
    @NotBlank
    private String descripcionEdu;
    @NotBlank
    private String fechaEdu;
    @NotBlank
    private String imagenEdu;
    
    //Constructores

    public dtoEducacion() {
    }

    public dtoEducacion(String institucionEdu, String descripcionEdu, String fechaEdu, String imagenEdu) {
        this.institucionEdu = institucionEdu;
        this.descripcionEdu = descripcionEdu;
        this.fechaEdu = fechaEdu;
        this.imagenEdu = imagenEdu;
    }
    
    //Getters & Setters

    public String getInstitucionEdu() {
        return institucionEdu;
    }

    public void setInstitucionEdu(String institucionEdu) {
        this.institucionEdu = institucionEdu;
    }

    public String getDescripcionEdu() {
        return descripcionEdu;
    }

    public void setDescripcionEdu(String descripcionEdu) {
        this.descripcionEdu = descripcionEdu;
    }

    public String getFechaEdu() {
        return fechaEdu;
    }

    public void setFechaEdu(String fechaEdu) {
        this.fechaEdu = fechaEdu;
    }

    public String getImagenEdu() {
        return imagenEdu;
    }

    public void setImagenEdu(String imagenEdu) {
        this.imagenEdu = imagenEdu;
    }
    
    
    
}