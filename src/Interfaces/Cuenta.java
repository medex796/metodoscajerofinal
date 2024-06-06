/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;
import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author Jhonny
 */
public class Cuenta implements Serializable {
    // Atributos de la clase Cuenta
    public int numeroCuenta; // Número de cuenta
    public String moneda; // Tipo de moneda (true para bolivianos, false para dólares)
    public double saldo; // Saldo de la cuenta
    public String tipoCuenta; // Tipo de cuenta (por ejemplo, ahorro o corriente)
    public String usuario; // Usuario asociado a la cuenta
    public ArrayList<Historia> Historia = new ArrayList<>(); // Lista de historias de transacciones de la cuenta
    
    /**
     * Constructor de la clase Cuenta.
     * @param numerocuenta Número de cuenta
     * @param moneda Tipo de moneda (true para bolivianos, false para dólares)
     * @param saldo Saldo de la cuenta
     * @param tipoCuenta Tipo de cuenta (por ejemplo, ahorro o corriente)
     * @param usuario Usuario asociado a la cuenta
     */
    public  Cuenta (int numerocuenta , String moneda,double saldo,String tipoCuenta,String usuario){
    
        this.numeroCuenta = numerocuenta; // Asigna el número de cuenta al atributo numeroCuenta
        this.moneda = moneda; // Asigna el tipo de moneda al atributo moneda
        this.saldo = saldo; // Asigna el saldo al atributo saldo
        this.tipoCuenta = tipoCuenta; // Asigna el tipo de cuenta al atributo tipoCuenta
        this.usuario = usuario; // Asigna el usuario al atributo usuario
    }
    
   /**
     * Método para obtener el número de cuenta.
     * @return El número de cuenta
     */
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    
/**
     * Método para obtener el tipo de moneda.
     * @return El tipo de moneda (true para bolivianos, false para dólares)
     */
    public String getMoneda() {
        return moneda;
    }
    /**
     * Método para obtener el tipo de cuenta.
     * @return El tipo de cuenta (por ejemplo, ahorro o corriente)
     */
    public String getTipoCuenta() {
        return tipoCuenta;
    }
    

   /**
     * Método para obtener el saldo de la cuenta.
     * @return El saldo de la cuenta
     */

    public double getSaldo() {
        return saldo;
    }
/**
     * Método para establecer el saldo de la cuenta.
     * @param saldo El saldo de la cuenta a establecer
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    /**
     * Método para obtener la lista de historias de transacciones de la cuenta.
     * @return La lista de historias de transacciones
     */
    public ArrayList<Historia> getListaHistoria(){
        return Historia;
    /**
     * Método para obtener el usuario asociado a la cuenta.
     * @return El usuario asociado a la cuenta
     */
    }
    public String  getUsuario(){
        return usuario;
    
    }
}
