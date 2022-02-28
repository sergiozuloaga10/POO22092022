/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarealibro;

import Libro.Libro;

/**
 *
 * @author Sergio
 */
public class TareaLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //primer objeto Libro
        Libro pLibro = new Libro();
        pLibro.setNombre("La Metamorfosis");
        System.out.println("Nombre del libro: " + pLibro.getNombre());
        pLibro.setAutor("Franz Kafka");
        System.out.println("Autor: " + pLibro.getAutor());
        pLibro.setGeneroLiterario("Novela");
        System.out.println("Genero Literario: " + pLibro.getGeneroLiterario());
        pLibro.setColorPasta("Blanco");
        System.out.println("Color de Pasta: " + pLibro.getColorPasta());
        pLibro.setNumPaginas(256);
        System.out.println("Numero de Paginas: " + pLibro.getNumPaginas());
        pLibro.abierto();
        System.out.println("\n");
        
        //segundo objeto Libro
        Libro sLibro = new Libro();
        sLibro.setNombre("La Divina Comedia");
        System.out.println("Nombre del libro: " + sLibro.getNombre());
        sLibro.setAutor("Dante Alighieri");
        System.out.println("Autor: " + sLibro.getAutor());
        sLibro.setGeneroLiterario("Epopeya");
        System.out.println("Genero Literario: " + sLibro.getGeneroLiterario());
        sLibro.setColorPasta("Rojo");
        System.out.println("Color de Pasta: " + sLibro.getColorPasta());
        sLibro.setNumPaginas(806);
        System.out.println("Numero de Paginas: " + sLibro.getNumPaginas());
        sLibro.sellado();
        System.out.println("\n");
        
        //tercer objeto Libro
        Libro tLibro = new Libro();
        tLibro.setNombre("La Dama de las Camelias");
        System.out.println("Nombre del libro: " + tLibro.getNombre());
        tLibro.setAutor("Alexandre Dumas");
        System.out.println("Autor: " + tLibro.getAutor());
        tLibro.setGeneroLiterario("Novela del Realismo");
        System.out.println("Genero Literario: " + tLibro.getGeneroLiterario());
        tLibro.setColorPasta("Verde");
        System.out.println("Color de Pasta: " + tLibro.getColorPasta());
        tLibro.setNumPaginas(272);
        System.out.println("Numero de Paginas: " + tLibro.getNumPaginas());
        tLibro.cambPag();
    } 
    
}
