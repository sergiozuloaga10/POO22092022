/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pelicula.object;

import pelicula.componentes.Actor;
import pelicula.componentes.Director;
import pelicula.componentes.Productora;

/**
 *
 * @author Sergio
 */
public class Pelicula {
    private String nombrePeli;
    private int fechaEstreno;
    private Actor protagonista;
    private Director directer;
    private Productora producer;

    public Pelicula() {
        protagonista = new Actor();
        directer = new Director();
        producer = new Productora();
    }

    public Pelicula(String nombrePeli, int fechaEstreno, Actor protagonista, Director directer, Productora producer) {
        this.nombrePeli = nombrePeli;
        this.fechaEstreno = fechaEstreno;
        this.protagonista = protagonista;
        this.directer = directer;
        this.producer = producer;
    }

    public String getNombrePeli() {
        return nombrePeli;
    }

    public void setNombrePeli(String nombrePeli) {
        this.nombrePeli = nombrePeli;
    }

    public int getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(int fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public Actor getProtagonista() {
        return protagonista;
    }

    public void setProtagonista(Actor protagonista) {
        this.protagonista = protagonista;
    }

    public Director getDirecter() {
        return directer;
    }

    public void setDirecter(Director directer) {
        this.directer = directer;
    }

    public Productora getProducer() {
        return producer;
    }

    public void setProducer(Productora producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombrePeli=" + nombrePeli + ", fechaEstreno=" + fechaEstreno + ", protagonista=" + protagonista + ", directer=" + directer + ", producer=" + producer + '}';
    }
    
    public void durar(int duracion){
        System.out.println(this.nombrePeli + " dura " + duracion + " minutos");
    }
}
