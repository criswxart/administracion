package com.usuario.empresa.web.administracion.entidades;


public class Administrador extends Usuario {

    /**
     * atributos
     */
    private int id_usuario;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String email;

    
    /**
     *  constructor
     */
    public Administrador() {
    }


    /**
     * getters
     */
    public String obteneNombre() {
        return nombre;
    }

    public String obtieneApellidoP() {
        return apellidoP;
    }

    public String obtieneApellidoM() {
        return apellidoM;
    }

    public String obtieneEmail() {
        return email;
    }

    public int obtieneidAdmin() {
        return id_usuario;
    }
    /*setters
    */
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApellidoP(String apellidoP){
        this.apellidoP=apellidoP;
    }
    public void setApellidoM(String apellidoM){
        this.apellidoM=apellidoM;
    }
     public void setEmail(String email){
        this.email=email;
    }

    public void setidAdmin(int id_usuario) {
        this.id_usuario = id_usuario;
    }
}