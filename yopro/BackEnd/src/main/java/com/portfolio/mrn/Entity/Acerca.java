package com.portfolio.mrn.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Acerca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String profesionAcerca;
    private String ubicacionAcerca;
    private String fechaAcerca;
    private String emailAcerca;
    private String sobremiAcerca;

    //Constructores

    public Acerca() {
    }

    public Acerca(String profesionAcerca, String ubicacionAcerca, String fechaAcerca, String emailAcerca, String sobremiAcerca) {
        this.profesionAcerca = profesionAcerca;
        this.ubicacionAcerca = ubicacionAcerca;
        this.fechaAcerca = fechaAcerca;
        this.emailAcerca = emailAcerca;
        this.sobremiAcerca = sobremiAcerca;
    }
    
    //GYS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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