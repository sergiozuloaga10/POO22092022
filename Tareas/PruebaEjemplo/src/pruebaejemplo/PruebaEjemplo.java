/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaejemplo;

/**
 *
 * @author Sergio
 */
public class PruebaEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creamos nuestro arreglo
        CuentaHabiente[] laLista = new CuentaHabiente[5] ;
        laLista[0] = new CuentaHabiente(554465658, "Sergio Zuloaga", 2093657.0f);
        laLista[1] = new CuentaHabiente(554465658, "Arturo Villareal", 30056.0f);
        laLista[2] = new CuentaHabiente(554465658, "Cristencio Mario", 679324.0f);
        laLista[3] = new CuentaHabiente(554465658, "Sara Garcia", 98712.0f);
        laLista[4] = new CuentaHabiente(554465658, "Ingrid Rojas", 45980.0f);
       
        //Probamos nuestro metodo evaluarNivelCliente()
        for (CuentaHabiente cuentaHabiente : laLista) {
            System.out.println(cuentaHabiente.evaluarNivelCliente());
        }
        
        /*Probamos nuestro metodo retirarDinero, en esta ocacion solo lo use con la primer persona
        solo para er que funcione bien el metodo
        */
        System.out.println("--------------Metodo Retirar dinero--------------");
        laLista[0].retirarDinero(105567.0f);
        
    }
    
}
