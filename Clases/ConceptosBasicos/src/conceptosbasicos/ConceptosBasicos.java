/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conceptosbasicos;

import ico.fes.Alumno;
import ico.fes.Automovil;
import ico.fes.Persona;
import ico.fes.Silla;
import java.awt.Color;

/**
 *
 * @author Sergio
 */
public class ConceptosBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola de nuevo");
        Silla s1 = new Silla();
        System.out.println(s1);//imprimira la direccion de memoria 
        System.out.println(s1.toString());//imprime lo mismo
        
        Automovil miBocho = new Automovil();//constructor por defecto
        miBocho.setMarca("VW");
        miBocho.setSubMarca("Sedan");
        miBocho.setModelo(1970);
        miBocho.setColor(Color.BLUE);
        System.out.println(miBocho);
        
        //con constructor sobre cargado crtl + tecla espacio
        Automovil miMustan = new Automovil("Ford", "Mustang", 2010, Color.yellow);
        System.out.println(miMustan);
        
        Automovil miAkura = new Automovil("Akura", "NSX", 2017, Color.GRAY);
        System.out.println(miAkura);
        
        Persona per1 = new Persona();
        //per1.edad = 200000;      no se permite por seguridad
        per1.setEdad(22);
        System.out.println(per1);
        
        Alumno al = new Alumno();
        al.setNombre("Jose");
        al.setNumeroCuenta(314251281);
        System.out.println(al);
        
    }
    
}
