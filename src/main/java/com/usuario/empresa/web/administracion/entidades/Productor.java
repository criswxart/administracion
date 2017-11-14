
public class Productor extends Usuario {

    /**
     * atributos 
     */
    private int id_usuario;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String ubicacion;
    private String direccion;
    private String email;


    /**
     * constructor
     */
    public Productor() {
    }

    /**
     * getters
     */
    public int obtenerId_productor() {
        return id_usuario;
    }

    public String obtenerNombreCompleto() {
        return nombre+apellidoP+apellidoM;
    }

    public String obtenerUbicacion() {
        return ubicacion;
    }

    public String obtenerDireccion() {
        return direccion;
    }

    public String obtenerEmail() {
        return email;
    }

    /*setters
    */

    public void setidProductor(int id_usuario) {
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
     public void setubicacion(String ubicacion){
        this.ubicacion=ubicacion;
    }
     public void setemail(String email){
        this.email=email;
    }

    

}