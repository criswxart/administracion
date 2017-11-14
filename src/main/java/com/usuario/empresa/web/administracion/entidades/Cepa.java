package com.usuario.empresa.web.administracion.entidades;

public class Cepa {


    //atributos
    private int id_cepa;
    private String nombreCepa;
    private String descripcion;
    private String vina;


   
    
    //constructor
     
    public Cepa() {
    }

    
     //getters
     
    public int obtenerIdCepa() {
        return id_cepa;
    }

    public String obtenerNombreCepa() {
        return nombreCepa;
    }

    
    public String obtenerDescripcion() {
        return descripcion;
    }

    public String obtenerVina() {
        return vina;
    }
    
    //setters
     
     public void setidCepa(int id_cepa) {
        this.id_cepa = id_cepa;
    }
     public void setNombreCepa(String nombreCepa) {
        this.nombreCepa = nombreCepa;
    }
     public void setDescipcion(String descripcion) {
        this.descripcion = descripcion;
    }
     public void setvina(String vina) {
        this.vina = vina;
    }



}