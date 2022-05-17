/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Sergio
 */
public class CifrarMensajes extends JPanel {
    
    private JTextField cuadro;
    private JTextArea cuadro1, cuadro2;
    private JButton boton;
    private JLabel label, label1, label2;
    private JLabel mensajeCifrado;
    private JScrollPane sc, sc1;   //Barra de desplazamiento

    public CifrarMensajes() {
        JPanel cifrar = new JPanel(); //creamos un panel que ejecute el cifrado del mensaje
        
        this.setBackground(Color.LIGHT_GRAY);
        this.setLayout(new GridBagLayout()); //Use GridBagLayout en vez de Flowlayout para acomodar mejor los lementos.
        GridBagConstraints gbc = new GridBagConstraints(); //Para definir como se redimensionan los elementos al alargar o achicar la interfaz
        
        label = new JLabel("Tipo de desplazamiento:");
        cuadro = new JTextField(5);
        label1 = new JLabel("Ingresa un mensaje:");
        cuadro1 = new JTextArea(20,20);  //Creamos nuestra area de texto
        sc = new JScrollPane(cuadro1);   //A esa area de texto le agregamos su barra de desplazamiento
        label2 = new JLabel("Mensaje Cifrado:");
        cuadro2 = new JTextArea(20,20); //Creamos nuestra area de texto
        cuadro2.setEditable(false); //Para que el usuario no pueda modificar el texto cifrado
        sc1 = new JScrollPane(cuadro2);  //A esa area de texto le agregamos su barra de desplazamiento
        
        boton = new JButton("Cifrar");
        boton.setBackground(Color.magenta);  //Creamos nuestro boton, como ya sabemos hacerlo
        boton.setOpaque(true);
        boton.setToolTipText("Clic para cifrar el mensaje");
        
        //Aqui vamos acomodando cada elemento en el panel, en que posicion x,y, como queremos que se expanda,
        //su largo y ancho, y en que ejes se va a expandir o a contraer, lo hacemos con los 7 elementos.
        //Primero agregamos el Label: "Tipo de desplazamiento"
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        this.add(label,gbc);
        
        //Agregamos al panel el cuadro de texto donde insertaremos el numero de desplazamientos n 
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        this.add(cuadro,gbc);
        
        //Agregamos al panel el Label: "Ingrese un mensaje"
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        this.add(label1,gbc);
        
        //Agregamos al panel el area de texto donde se introduce el texto a cifrar
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.gridheight = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        this.add(sc,gbc);
        
        //Agregamos al panel el Label: "Mensaje cifrado"
        gbc.gridx = 20;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        this.add(label2,gbc);
        
        //Agregamos al panel el area de texto donde se mostrara el texto ya cifrado
        gbc.gridx = 20;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.gridheight = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        this.add(sc1,gbc);
        
        //Agregamos al panel nuestro boton para cifrar
        gbc.gridx = 2;
        gbc.gridy = 10;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        this.add(boton,gbc);
        
        //Implementamos un evento, en caso de que se haga clic en el boton
        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                try { // usamos un try catch para el manejo de excepciones
                   cifrado(); //Intentara ejecutar nuestro metodo para cifrar el mensaje
                } catch (Exception ex) {
                    System.out.println(ex.toString()); //En caso de error se muestra una mini advertencia con JOptionPane
                    JOptionPane.showMessageDialog(null, "Solo debes ingresar valores numéricos", "Error de captura", JOptionPane.ERROR_MESSAGE);
                }
                
                
            }
            
        });
        
    }
    
    private void cifrado(){ //Este metodo se encargara de cifrar el texto, se complementa con el metodo codificar
       
        String mensaje;
        
        String letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        
        mensaje = cuadro1.getText();
         
        String texto = codificar(letras, mensaje);
        
        cuadro2.setText(texto);
        
    }
    
    private String codificar(String letras, String texto){ //se complementa con el metodo cifrado
       
        String textoCodificado = "";
        int desplazamiento;
        desplazamiento = Integer.parseInt(cuadro.getText());
        texto = texto.toUpperCase();
 
        char caracter;
        for (int i = 0; i < texto.length(); i++) {
            caracter = texto.charAt(i);
 
            int pos = letras.indexOf(caracter);
 
            if(pos == -1){
                textoCodificado += caracter;
            }else{
                textoCodificado += letras.charAt( (pos + desplazamiento) % letras.length() );
            }
        }
 
        return textoCodificado;
    }
    
}
