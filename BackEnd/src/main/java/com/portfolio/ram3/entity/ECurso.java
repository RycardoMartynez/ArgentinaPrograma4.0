
package com.portfolio.ram3.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ECurso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreC;
    private String imgC;
    private String descripcionC;
    private String tituloC;
    private String conocimientosC;
    private String fechaC;
    
    //Constructor

    public ECurso() {
    }

    public ECurso(String nombreC, String imgC, String descripcionC, String tituloC, String conocimientosC, String fechaC) {
        this.nombreC = nombreC;
        this.imgC = imgC;
        this.descripcionC = descripcionC;
        this.tituloC = tituloC;
        this.conocimientosC = conocimientosC;
        this.fechaC = fechaC;
    }
    // G&S

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String getImgC() {
        return imgC;
    }

    public void setImgC(String imgC) {
        this.imgC = imgC;
    }

    public String getDescripcionC() {
        return descripcionC;
    }

    public void setDescripcionC(String descripcionC) {
        this.descripcionC = descripcionC;
    }

    public String getTituloC() {
        return tituloC;
    }

    public void setTituloC(String tituloC) {
        this.tituloC = tituloC;
    }

    public String getConocimientosC() {
        return conocimientosC;
    }

    public void setConocimientosC(String conocimientosC) {
        this.conocimientosC = conocimientosC;
    }

    public String getFechaC() {
        return fechaC;
    }

    public void setFechaC(String fechaC) {
        this.fechaC = fechaC;
    }
    
    
}
