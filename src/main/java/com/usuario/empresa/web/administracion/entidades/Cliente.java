package com.usuario.empresa.web.administracion.entidades;


public class Cliente extends Usuario {

    /**
     * atributos 
     */
    private int id_usuario;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String direccion;
    private String email;
    private int telefono;

    /**
     * constructor
     */
    public Cliente() {
    }

    
    /**
     * getters
     */
    public int obtenerId_cliente() {
        return id_usuario;
    }

    public String obtenerNombreCompleto() {
        return nombre+apellidoP+apellidoM;
    }

    public String obtenerDireccion() {
        return direccion;
    }

    public String obtenerEmail() {
        return email;
    }

    public int obtenerTelefono() {
        return telefono;
    }
     /**
     * setters
     */
     public void setidCliente(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApellidoP(String apellidoP){
        this.apellidoP=apellidoP;
    }
    public void setApellidoM(String apellidoM){
        this.apellidoM=apellidoM;
    }
     public void setdireccion(String direccion){
        this.direccion=direccion;
    }
     public void setemail(String email){
        this.email=email;
    }
     public void settelefono(int telefono){
        this.telefono=telefono;
    }



   


}