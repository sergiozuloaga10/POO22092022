/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro.componentes;

/**
 *
 * @author Sergio
 */
public class Editorial {
    private String nombreEditorial;
    private String ciudadUbicacion;

    public Editorial() {
    }

    public Editorial(String nombreEditorial, String ciudadUbicacion) {
        this.nombreEditorial = nombreEditorial;
        this.ciudadUbicacion = ciudadUbicacion;
    }

    public String getCiudadUbicacion() {
        return ciudadUbicacion;
    }

    public void setCiudadUbicacion(String ciudadUbicacion) {
        this.ciudadUbicacion = ciudadUbicacion;
    }

    public String getNombreEditorial() {
        return nombreEditorial;
    }

    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombreEditorial=" + nombreEditorial + ", ciudadUbicacion=" + ciudadUbicacion + '}';
    }
    
    public void publicar(String entrega){
        System.out.println(this.nombreEditorial + " esta publicando " + entrega);
    }
}
