/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.componentes;

/**
 *
 * @author Sergio
 */
public class Teclado {
    String marca;
    int numeroDeTeclas;

    public Teclado() {
    }

    public Teclado(String marca, int numeroDeTeclas) {
        this.marca = marca;
        this.numeroDeTeclas = numeroDeTeclas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumeroDeTeclas() {
        return numeroDeTeclas;
    }

    public void setNumeroDeTeclas(int numeroDeTeclas) {
        this.numeroDeTeclas = numeroDeTeclas;
    }

    @Override
    public String toString() {
        return "Teclado{" + "marca=" + marca + ", numeroDeTeclas=" + numeroDeTeclas + '}';
    }
    
    
}
