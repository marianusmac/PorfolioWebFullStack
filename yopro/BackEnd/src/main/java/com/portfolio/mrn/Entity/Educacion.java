package com.portfolio.mrn.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String institucionEdu;
    private String descripcionEdu;
    private String fechaEdu;
    private String imagenEdu;

    //Constructores

    public Educacion() {
    }

    public Educacion(String institucionEdu, String descripcionEdu, String fechaEdu, String imagenEdu) {
        this.institucionEdu = institucionEdu;
        this.descripcionEdu = descripcionEdu;
        this.fechaEdu = fechaEdu;
        this.imagenEdu = imagenEdu;
    }    

    //Getter y setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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