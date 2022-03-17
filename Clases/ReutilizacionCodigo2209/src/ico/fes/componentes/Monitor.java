/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.componentes;

/**
 *
 * @author Sergio
 */
public class Monitor {
    private String marca;
    private Float pulgadas;

    public Monitor() {
    }

    public Monitor(String marca, Float pulgadas) {
        this.marca = marca;
        this.pulgadas = pulgadas;
    }

    public Float getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Float pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Monitor{" + "marca=" + marca + ", pulgadas=" + pulgadas + '}';
    }
    
    
}
