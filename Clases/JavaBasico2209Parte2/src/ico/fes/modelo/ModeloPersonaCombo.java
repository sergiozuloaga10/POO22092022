/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.modelo;

import ico.fes.db.PersonaDAO;
import ico.fes.herencia.Persona;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;
import org.sqlite.SQLiteException;

/**
 *
 * @author Sergio
 */
public class ModeloPersonaCombo implements ComboBoxModel<Persona>{
    private ArrayList<Persona> datos;
    private Persona selected;

    public ModeloPersonaCombo() {
    }

    public ModeloPersonaCombo(ArrayList datos, Persona selected) {
        this.datos = datos;
        this.selected = selected;
    }

    public ArrayList getDatos() {
        return datos;
    }

    public void setDatos(ArrayList datos) {
        this.datos = datos;
    }

    @Override
    public void setSelectedItem(Object o) {
        this.selected = (Persona)o;
    }

    @Override
    public Object getSelectedItem() {
        return selected;
    }

    @Override
    public int getSize() {
        //regresará el numero de elementos a mostrar
        return datos.size();
    }

    @Override
    public Persona getElementAt(int i) {
        return datos.get(i);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
        
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
        
    }
    
    public void consultarBaseDatos() throws SQLiteException{
        //simular una consulta a una base de datos
        PersonaDAO pdao = new PersonaDAO();
        datos = pdao.obtenerTodo();
        try {
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        
        
    }
    
    public void agregarPersona(Persona p){
      
        //Insertar a Base de Datos
        PersonaDAO pdao = new PersonaDAO();
        datos.add(p);
        try {
            pdao.insertar(p);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
