


package com.portfolio.ram3.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;


@Entity
public class EProyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreP;
    @Lob
    @Column(columnDefinition = "TEXT")
    private String descripcion;
    private String tecnologia;
    private String img;
    private String link;
    
    //Constructor

    public EProyecto() {
    }

    public EProyecto(String nombreP, String descripcion, String tecnologia, String img, String link) {
        this.nombreP = nombreP;
        this.descripcion = descripcion;
        this.tecnologia = tecnologia;
        this.img = img;
        this.link = link;
    }
    
    //G&S

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    
    
}
