/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.composicion;

import libro.componentes.Autor;
import libro.componentes.Editorial;
import libro.object.Libro;
import pelicula.componentes.Actor;
import pelicula.componentes.Director;
import pelicula.componentes.Productora;
import pelicula.object.Pelicula;

/**
 *
 * @author Sergio
 */
public class TareaComposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Objeto 1 Libro
        Libro miLibro = new Libro();
        miLibro.setNombreLibro("La Metamorfosis");
        miLibro.setAnhoPublicacion(1915);
        miLibro.setEscritor(new Autor("Franz Kafka", "Austrohungaro"));
        miLibro.setPublicadora(new Editorial("Era", "CDMX"));
        miLibro.leer();
        System.out.println(miLibro);
        
        //Objeto2 Libro
        Libro elLibro = new Libro();
        elLibro.setNombreLibro("La Divina Comedia");
        elLibro.setAnhoPublicacion(1472);
        elLibro.setEscritor(new Autor("Dante Alighieri", "Italiano"));
        elLibro.setPublicadora(new Editorial("Akal", "CDMX"));
        elLibro.leer();
        System.out.println(elLibro);
        
        //Objeto1 Pelicula
        Pelicula miPeli = new Pelicula();
        miPeli.setNombrePeli("The Batman");
        miPeli.setFechaEstreno(2022);
        miPeli.setProtagonista(new Actor("Robert Pattinson", 35 ));
        miPeli.setDirecter(new Director("Matt Reeves", "Estadounidense"));
        miPeli.setProducer(new Productora("Dc Filmes WB", "Estados Unidos"));
        miPeli.durar(176);
        System.out.println(miPeli);
        
        //Objeto2 Pelicula
        Pelicula laPeli = new Pelicula();
        laPeli.setNombrePeli("Jocker");
        laPeli.setFechaEstreno(2019);
        laPeli.setProtagonista(new Actor("Joaquin Phoenix", 47 ));
        laPeli.setDirecter(new Director("Todd Phillips", "Estadounidense"));
        laPeli.setProducer(new Productora("Dc Filmes WB", "Estados Unidos"));
        laPeli.durar(122);
        System.out.println(laPeli);
        
    }
    
}
