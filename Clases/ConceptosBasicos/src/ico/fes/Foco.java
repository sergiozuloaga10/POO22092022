/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

/**
 *
 * @author Sergio
 */
public class Foco {
    private String color;
    private String Tipo;
    private int tamano;

    public Foco() {
    }
    
    public Foco(String color, String Tipo, int tamano) {
        this.color = color;
        this.Tipo = Tipo;
        this.tamano = tamano;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    @Override
    public String toString() {
        return "Foco{" + "color=" + color + ", Tipo=" + Tipo + ", tamano=" + tamano + '}';
    }
    
  
    
}
