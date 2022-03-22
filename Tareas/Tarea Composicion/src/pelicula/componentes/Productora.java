/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pelicula.componentes;

/**
 *
 * @author Sergio
 */
public class Productora {
    private String nombreProductora;
    private String paisSede;

    public Productora() {
    }

    public Productora(String nombreProductora, String paisSede) {
        this.nombreProductora = nombreProductora;
        this.paisSede = paisSede;
    }

    public String getPaisSede() {
        return paisSede;
    }

    public void setPaisSede(String paisSede) {
        this.paisSede = paisSede;
    }

    public String getNombreProductora() {
        return nombreProductora;
    }

    public void setNombreProductora(String nombreProductora) {
        this.nombreProductora = nombreProductora;
    }

    @Override
    public String toString() {
        return "Productora{" + "nombreProductora=" + nombreProductora + ", paisSede=" + paisSede + '}';
    }
    
    public void producir(String nombrePelicula){
        System.out.println(this.nombreProductora + " produce la pelicula " + nombrePelicula);
    }
}
