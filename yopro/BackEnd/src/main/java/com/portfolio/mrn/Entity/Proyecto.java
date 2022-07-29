package com.portfolio.mrn.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombrePro;
    private String descripcionPro;
    private String fechaPro;
    private String imagenPro;

    //Constructores

    public Proyecto() {
    }

    public Proyecto(String nombrePro, String descripcionPro, String fechaPro, String imagenPro) {
        this.nombrePro = nombrePro;
        this.descripcionPro = descripcionPro;
        this.fechaPro = fechaPro;
        this.imagenPro = imagenPro;
    }    

    //Getter y setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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