package com.usuario.empresa.web.administracion.entidades;

public class Vino {

    
      //atributos
     
    private int id_vino;
    private String nombre;
    private int valor_Dolar;
    private int valor_Euro;
    private int valor_CLP;
    private String imagen;
    private int stock;
    private String tipo_botella;
    private int id_productor;
    private int id_cepa;

    
      //constructor
     
    public Vino() {
    
    }

    
     //getters
     
    public int obtenerId_vino() {
        return id_vino;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerValorDolar() {
        return valor_Dolar;
    }

    public int obtenerValorEuro() {
        return valor_Euro;
    }

    public int obtenerValorCLP() {
        return valor_CLP;
    }

    public String obtenerImagen() {
        return imagen;
    }

    public int obtenerId_productor() {
        return id_productor;
    }

    public int obtenerIdCepa() {
        return id_cepa;
    }

    public int obtenerStock(){
        return stock;
    }
     public String obtenerTipoBotella(){
        return tipo_botella;
    }
    
    //setters
    
    public void cambiarStock(int cantidad) {
        this.stock=this.stock-cantidad;
    }
    public void setidVino(int id_vino) {
        this.id_vino = id_vino;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setvalorDolar(int valor_Dolar) {
        this.valor_Dolar = valor_Dolar;
    }
     public void setvalorEuro(int valor_Euro) {
        this.valor_Euro = valor_Euro;
    }
     public void setvalorCLP(int valor_CLP) {
        this.valor_CLP = valor_CLP;
    }
     public void setidProductor(int id_productor) {
        this.id_productor = id_productor;
    }
     public void setidCepa(int id_cepa) {
        this.id_cepa = id_cepa;
    }
     public void setTipoBotella(String tipo_botella) {
        this.tipo_botella = tipo_botella;
    }


 

   
}