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
public class DescifrarMensajes extends JPanel{
    
    private JTextField cuadro;
    private JTextArea cuadro1, cuadro2;
    private JButton boton;
    private JLabel label, label1, label2;
    private JLabel mensajeCifrado;
    private JScrollPane sc, sc1;

    public DescifrarMensajes() {
        JPanel descifrar = new JPanel(); //creamos un panel que ejecute el descifrado del mensaje
        
        this.setBackground(Color.GRAY);
        this.setLayout(new GridBagLayout());  //Use GridBagLayout en vez de Flowlayout para acomodar mejor los lementos.
        GridBagConstraints gbc = new GridBagConstraints();
        
        label = new JLabel("Tipo de desplazamiento:");
        cuadro = new JTextField(6);
        label1 = new JLabel("Ingresa el mensaje a Descifrar:");
        cuadro1 = new JTextArea(20,20);  //Creamos nuestra area de texto
        sc = new JScrollPane(cuadro1);   //A esa area de texto le agregamos su barra de desplazamiento
        label2 = new JLabel("Mensaje Descifrado:");
        cuadro2 = new JTextArea(20,20);  //Creamos nuestra area de texto
        cuadro2.setEditable(false);  //Para que el usuario no pueda modificar el texto cifrado
        sc1 = new JScrollPane(cuadro2);  //A esa area de texto le agregamos su barra de desplazamiento
        
        boton = new JButton("Descifrar"); //Creamos nuestro boton para descifrar los mensajes
        boton.setBackground(Color.cyan);
        boton.setOpaque(true);
        boton.setToolTipText("Clic para descifrar el mensaje");
        
        //Se repite el mismo procedimiento que la clase "CifrarMensajes" se implementan los elementos
        //de la misma manera, usando el GridBagLayout
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        this.add(label,gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        this.add(cuadro,gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        this.add(label1,gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.gridheight = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        this.add(sc,gbc);
        
        gbc.gridx = 20;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        this.add(label2,gbc);
        
        gbc.gridx = 20;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.gridheight = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        this.add(sc1,gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 10;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        this.add(boton,gbc);
        
        this.boton.addMouseListener(new MouseAdapter() { //usamos un evento para el boton en caso de darle clic
            @Override
            public void mouseClicked(MouseEvent e) {
                
                try {
                   descifrado();  //se tratara de ejecutar el metodo para descifrar
                } catch (Exception ex) {
                    System.out.println(ex.toString()); //En caso de excepcion se despliega un cuadro indicando el error con JOptionPane
                    JOptionPane.showMessageDialog(null, "Solo debes ingresar valores numéricos", "Error de captura", JOptionPane.ERROR_MESSAGE);
                }
                
            }
            
        });
       
    }
    
    private void descifrado(){ //esta es la funcion que descifra los mensajes, se complementa con el metodo descodificar
        
        String mensaje;
        
        String letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        
        mensaje = cuadro1.getText();
         
        String texto = descodificar(letras, mensaje);
        
        cuadro2.setText(texto);
        
    }
    
    private String descodificar(String letras, String texto){ //se complementa con el metodo descifrar
        String textoDescodificado = "";
        int desplazamiento;
        desplazamiento = Integer.parseInt(cuadro.getText());
        texto = texto.toUpperCase();
 
        char caracter;
        for (int i = 0; i < texto.length(); i++) {
            caracter = texto.charAt(i);
 
            int pos = letras.indexOf(caracter);
 
            if(pos == -1){
                textoDescodificado += caracter;
            }else{     
                if(pos - 3 < 0){
                    textoDescodificado += letras.charAt( letras.length() + (pos - desplazamiento) );
                }else{
                    textoDescodificado += letras.charAt( Math.abs(pos - desplazamiento) % letras.length() );
                }     
            }
 
        }
 
        return textoDescodificado;
    }
    
}
