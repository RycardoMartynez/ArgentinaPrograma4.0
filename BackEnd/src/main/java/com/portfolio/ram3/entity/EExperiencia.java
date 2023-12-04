package com.portfolio.ram3.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class EExperiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String imgE;
    @Lob
    @Column(columnDefinition = "TEXT")
    private String descripcionE;
    private String puestoE;
    private String tareasE;
    private String fechaE;

    // Constructor
    public EExperiencia() {
    }

    public EExperiencia(String nombreE, String imgE, String descripcionE, String puestoE, String tareasE, String fechaE) {
        this.nombreE = nombreE;
        this.imgE = imgE;
        this.descripcionE = descripcionE;
        this.puestoE = puestoE;
        this.tareasE = tareasE;
        this.fechaE = fechaE;
    }
    //G & S

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getImgE() {
        return imgE;
    }

    public void setImgE(String imgE) {
        this.imgE = imgE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getPuestoE() {
        return puestoE;
    }

    public void setPuestoE(String puestoE) {
        this.puestoE = puestoE;
    }

    public String getTareasE() {
        return tareasE;
    }

    public void setTareasE(String tareasE) {
        this.tareasE = tareasE;
    }

    public String getFechaE() {
        return fechaE;
    }

    public void setFechaE(String fechaE) {
        this.fechaE = fechaE;
    }

}
