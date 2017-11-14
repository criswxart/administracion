

public class Cepa {


    /**
     * atributos
     */
    private int id_cepa;
    private String nombreCepa;
    private String descripcion;
    private String viña;


   
    /**
     * constructor
     */
    public Cepa() {
    }

    /**
     * getters
     */
    public int obtenerIdCepa() {
        return id_cepa;
    }

    public String obtenerNombreCepa() {
        return nombreCepa;
    }

    
    public String obtenerDescripcion() {
        return descripcion;
    }

    public String obtenerViña() {
        return viña;
    }
    /**
     * setters
     */
     public void setidCepa(int id_cepa) {
        this.id_cepa = id_cepa;
    }
     public void setNombreCepa(String nombreCepa) {
        this.nombreCepa = nombreCepa;
    }
     public void setDescipcion(String descripcion) {
        this.descripcion = descripcion;
    }
     public void setviña(String viña) {
        this.viña = viña;
    }



}