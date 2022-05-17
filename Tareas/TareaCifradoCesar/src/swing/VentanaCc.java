/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;

import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

/**
 *
 * @author Sergio
 */
public class VentanaCc extends JFrame{ //Esta es nuestra interfaz grafica, la ventana principal
    
    //Llamamos a nuestros paneles, para juntarlos en la interfaz, asi como pestañas
    CifrarMensajes cifrar; //Este panel se encarga de cifrar los mensajes
    DescifrarMensajes descifrar; //Este otro panel se encarga de descifrar los mensajes
    JTabbedPane pestanas; // aquí vamos a juntar ambos paneles, como pestañas de navegador

    public VentanaCc() throws HeadlessException {
        
        setTitle("Cifrado César"); //Declaramos el nombre de nuestra ventana
        setSize(600,600);  //Elegimos su tamaño por defecto
        setLocationRelativeTo(null); //Para que la ventana aparezca en el centro de la pantalla
        
        cifrar = new CifrarMensajes(); //Creamos nuestro panel para cifrar
        descifrar = new DescifrarMensajes();  //creamos nuestro panel para descifrar
       
        pestanas = new JTabbedPane(); //Con JTabbedPane juntaremos nuestros dos paneles como si fueran pestañas de navegador
        
        pestanas.add("Cifrado", cifrar); //agregamos nuestro panel como si fuera una pestaña
        pestanas.add("Descifrado", descifrar); //agrgamos nuestro otro panel como si fuera una pestaña
       
        add(pestanas); //agregamos ambos paneles a la interfaz, ya con el formato para poder cambiar de uno a otro facilmente
        this.validate();
        this.setVisible(true);

        this.addWindowListener(new WindowAdapter() { //Agregamos el evento para cerrar la ventana y concluir la ejecucion del codigo
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
            
        });
        
    }
   
}
