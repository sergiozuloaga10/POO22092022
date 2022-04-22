/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaejemplo;

/**
 *
 * @author Sergio
 */
public class CuentaHabiente {
    private int idCliente;
    private String nombre;
    private float balance;

    public CuentaHabiente() {
    }

    public CuentaHabiente(int idCliente, String nombre, float balance) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "CuentaHabiente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", balance=" + balance + '}';
    }
    
    public void retirarDinero(float monto){
        //código para restarle el monto al balance
        System.out.println("El cliente " + this.nombre + " retiró " + monto + " pesos");
        this.balance =  this.balance-monto;
        System.out.println(this.nombre+", su saldo después del retiro es de "+this.balance+" pesos");
    }
    
    public String evaluarNivelCliente(){
        return this.balance <= 50000.0f? this.nombre+" es Cliente Regular" : this.nombre+" es Cliente Premium";
    }
    
}
