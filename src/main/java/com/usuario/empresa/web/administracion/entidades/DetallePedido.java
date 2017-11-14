package com.usuario.empresa.web.administracion.entidades;

public class DetallePedido {
   
    /**
     * atributos
     */
    public int id_Detalle;
    public int unidades;
    public int subtotal;
    public int tipo_moneda;
    public int id_vino;
    public int id_pedido;

     /**
     * Default constructor
     */
    public DetallePedido() {
    }

    /**
     * getters
     */
    public int obtenersubTotal() {
        return subtotal;
    }

    public int obtenerUnidades() {
        return unidades;
    }

    public int obtenerTipoMoneda() {
        return tipo_moneda;
    }

    public int obtenerId_vino() {
        return id_vino;
    }

    public int obtenerId_Pedido() {
        return id_pedido;
    }

     public int obtenerIdDetalle() {
        return id_Detalle;
    }

     /**
     * setters
     */
     public void setidDetalle(int id_Detalle) {
        this.id_Detalle = id_Detalle;
    }
    public void setidVino(int id_vino) {
        this.id_vino = id_vino;
    }
     public void setidPedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }
    public void setSubtotal(int subtotal){
        this.subtotal=subtotal;
    }
    public void setunidades(int unidades){
        this.unidades=this.unidades-unidades;
    }
    public void setTipomoneda(int tipo_moneda){
        this.tipo_moneda=tipo_moneda;
    }
}