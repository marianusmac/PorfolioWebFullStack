package com.portfolio.mrn.Dto;

import javax.validation.constraints.NotBlank;

public class dtoProyecto {
    @NotBlank
    private String nombrePro;
    @NotBlank
    private String descripcionPro;
    @NotBlank
    private String fechaPro;
    @NotBlank
    private String imagenPro;
    
    
    //Constructores

    public dtoProyecto() {
    }

    public dtoProyecto(String nombrePro, String descripcionPro, String fechaPro, String imagenPro) {
        this.nombrePro = nombrePro;
        this.descripcionPro = descripcionPro;
        this.fechaPro = fechaPro;
        this.imagenPro = imagenPro;
    }
    
    //GYS

    public String getNombrePro() {
        return nombrePro;
    }

    public void setNombrePro(String nombrePro) {
        this.nombrePro = nombrePro;
    }

    public String getDescripcionPro() {
        return descripcionPro;
    }

    public void setDescripcionPro(String descripcionPro) {
        this.descripcionPro = descripcionPro;
    }

    public String getFechaPro() {
        return fechaPro;
    }

    public void setFechaPro(String fechaPro) {
        this.fechaPro = fechaPro;
    }

    public String getImagenPro() {
        return imagenPro;
    }

    public void setImagenPro(String imagenPro) {
        this.imagenPro = imagenPro;
    }
    
    
    
}