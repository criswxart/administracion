package com.usuario.empresa.web.administracion.entidades;


public class Usuario {

    
     //atributos
     
    private int id_usuario;
    private String nombreU;
    private String contrasena;
    private int id_rol;
     
     //constructor
     
    public Usuario() {
    }

    
      //getters
     
    public int obtenerId_usuario() {
        return id_usuario;
    }

    public String obtenerNombreU() {
        return nombreU;
    }

    public String obtenerPass() { 
        return contrasena;
    }

    public int obtenerid_Rol(){
        return id_rol;
    }

    //setters
    
     public void setidUsuario(int id_usuario){
        this.id_usuario=id_usuario;
    }
     public void setnombreU(String nombreU){
        this.nombreU=nombreU;
    }
    public void setPass(String contrasena){
        this.contrasena=contrasena;
    }
    public void setidRol(int id_rol){
        this.id_rol=id_rol;
    }

}