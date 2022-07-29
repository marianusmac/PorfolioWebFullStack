package com.portfolio.mrn.Dto;

import javax.validation.constraints.NotBlank;

public class dtoAcerca {
    @NotBlank
    private String profesionAcerca;
    @NotBlank
    private String ubicacionAcerca;
    @NotBlank
    private String fechaAcerca;
    @NotBlank
    private String emailAcerca;
    @NotBlank
    private String sobremiAcerca;
    
    //Constructores

    public dtoAcerca() {
    }

    public dtoAcerca(String profesionAcerca, String ubicacionAcerca, String fechaAcerca, String emailAcerca, String sobremiAcerca) {
        this.profesionAcerca = profesionAcerca;
        this.ubicacionAcerca = ubicacionAcerca;
        this.fechaAcerca = fechaAcerca;
        this.emailAcerca = emailAcerca;
        this.sobremiAcerca = sobremiAcerca;
    }
    
    //GYS

    public String getProfesionAcerca() {
        return profesionAcerca;
    }

    public void setProfesionAcerca(String profesionAcerca) {
        this.profesionAcerca = profesionAcerca;
    }

    public String getUbicacionAcerca() {
        return ubicacionAcerca;
    }

    public void setUbicacionAcerca(String ubicacionAcerca) {
        this.ubicacionAcerca = ubicacionAcerca;
    }

    public String getFechaAcerca() {
        return fechaAcerca;
    }

    public void setFechaAcerca(String fechaAcerca) {
        this.fechaAcerca = fechaAcerca;
    }

    public String getEmailAcerca() {
        return emailAcerca;
    }

    public void setEmailAcerca(String emailAcerca) {
        this.emailAcerca = emailAcerca;
    }

    public String getSobremiAcerca() {
        return sobremiAcerca;
    }

    public void setSobremiAcerca(String sobremiAcerca) {
        this.sobremiAcerca = sobremiAcerca;
    }
    
}