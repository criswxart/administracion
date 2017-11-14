package com.usuario.empresa.web.administracion.entidades;

public class Pedido {

    /**
     * atributos 
     */
    private int id_pedido;
    private Date fecha;
    private int MontoTotal;
    private boolean estado;
    private int id_cliente;

    /**
     *  constructor
     */
    public Pedido() {
    }

    /**
     * getters
     */
    public Date obtenerFecha() {
        return fecha;
    }

    public int obtenerId_Pedido() {
        return id_pedido;
    }

    public int obtenerMontoTotal() {
        return MontoTotal;
    }

    public boolean obtenerEstado() {
        return estado;
    }

    public int obtenerId_cliente() {
        return id_cliente;
    }
    
    /**
     * setters
     */
   public void setidPedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }
    public void setfecha(Date fecha) {
        this.fecha = fecha;
    }
    public void setMontoTotal(int MontoTotal) {
        this.MontoTotal = MontoTotal;
    }
    public void cambiarEstado(boolean estado) {
        this.estado=estado;
    }
    public void setidCliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }



 
  

}