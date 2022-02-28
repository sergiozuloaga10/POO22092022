/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libro;

/**
 *
 * @author Sergio
 */
public class Libro {
    private String nombre;
    private String autor;
    private String generoLiterario;
    private String colorPasta;
    private int numPaginas;

    public Libro() {
    }

    public Libro(String nombre, String autor, String generoLiterario, String colorPasta, int numPaginas) {
        this.nombre = nombre;
        this.autor = autor;
        this.generoLiterario = generoLiterario;
        this.colorPasta = colorPasta;
        this.numPaginas = numPaginas;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGeneroLiterario() {
        return generoLiterario;
    }

    public void setGeneroLiterario(String generoLiterario) {
        this.generoLiterario = generoLiterario;
    }

    public String getColorPasta() {
        return colorPasta;
    }

    public void setColorPasta(String colorPasta) {
        this.colorPasta = colorPasta;
    }
    
    public void abierto(){
        System.out.println("El libro " + this.nombre + " esta abierto");
    }
    
    public void sellado(){
        System.out.println("El libro " + this.nombre + " es nuevo, esta sellado");
    }
    
    public void cambPag(){
        System.out.println("El libro " + this.nombre + " esta siendo utilizado y estan cambiando de pagina");
    }
}
