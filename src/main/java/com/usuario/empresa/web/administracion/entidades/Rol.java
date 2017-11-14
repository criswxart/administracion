

public class Rol {

    /**
     * atributos
     */
    private int id_rol;
    private String nombreRol;

   /**
     * constructor
     */
    public Rol() {
    }

    /**
     * getters
     */
    public int getId() {
        return id_rol;
    }

    public String getnombreRol() {
        return nombreRol;
    }

    /*setters
    */

    public void setidRol(int id_rol){
        this.id_rol=id_rol;
    }
     public void setNombreRol(String nombreRol){
        this.nombreRol=nombreRol;
    }



}