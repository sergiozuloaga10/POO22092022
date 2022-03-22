/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro.object;

import libro.componentes.Autor;
import libro.componentes.Editorial;

/**
 *
 * @author Sergio
 */
public class Libro {
    private String nombreLibro;
    private int anhoPublicacion;
    private Autor escritor;
    private Editorial publicadora;

    public Libro(){
        escritor = new Autor();
        publicadora = new Editorial();
    }

    public Libro(String nombreLibro, int anhoPublicacion, Autor escritor, Editorial publicadora) {
        this.nombreLibro = nombreLibro;
        this.anhoPublicacion = anhoPublicacion;
        this.escritor = escritor;
        this.publicadora = publicadora;
    }

    public Editorial getPublicadora() {
        return publicadora;
    }

    public void setPublicadora(Editorial publicadora) {
        this.publicadora = publicadora;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public int getAnhoPublicacion() {
        return anhoPublicacion;
    }

    public void setAnhoPublicacion(int anhoPublicacion) {
        this.anhoPublicacion = anhoPublicacion;
    }

    public Autor getEscritor() {
        return escritor;
    }

    public void setEscritor(Autor escritor) {
        this.escritor = escritor;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombreLibro=" + nombreLibro + ", anhoPublicacion=" + anhoPublicacion + ", escritor=" + escritor + ", publicadora=" + publicadora + '}';
    }
    
    public void leer(){
        System.out.println(this.nombreLibro + " esta abierto y lo estan leyendo");
    }
}
