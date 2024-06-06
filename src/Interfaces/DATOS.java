/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import java.io.Serializable;

/**
 *
 * @author Jhonny
 */
public class DATOS implements Serializable{
   // Atributos de la clase DATOS
    public String numeroCuenta; // Número de la cuenta bancaria
    public String nombreApellido; // Nombre y apellido del titular de la cuenta
    public String tipoCuenta; // Tipo de cuenta (e.g., ahorros, corriente)
    public String tipoMoneda; // Tipo de moneda (e.g., USD para dólares, BOB para bolivianos)
    public String saldo; // Saldo de la cuenta
    /**
     * Constructor de la clase DATOS.
     * @param numeroCuenta Número de la cuenta bancaria
     * @param nombreApellido Nombre y apellido del titular de la cuenta
     * @param tipoCuenta Tipo de cuenta (e.g., ahorros, corriente)
     * @param tipoMoneda Tipo de moneda (e.g., USD para dólares, BOB para bolivianos)
     * @param saldo Saldo de la cuenta
     */
    public DATOS(String numeroCuenta, String nombreApellido, String tipoCuenta, String tipoMoneda, String saldo) {
        this.numeroCuenta = numeroCuenta; // Asigna el número de cuenta al atributo numeroCuenta
        this.nombreApellido = nombreApellido; // Asigna el nombre y apellido al atributo nombreApellido
        this.tipoCuenta = tipoCuenta; // Asigna el tipo de cuenta al atributo tipoCuenta
        this.tipoMoneda = tipoMoneda; // Asigna el tipo de moneda al atributo tipoMoneda
        this.saldo = saldo; // Asigna el saldo al atributo saldo
    }

     // Métodos de acceso para obtener los valores de los atributos

    /**
     * Método para obtener el número de cuenta.
     * @return El número de cuenta
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Método para obtener el nombre y apellido del titular de la cuenta.
     * @return El nombre y apellido del titular de la cuenta
     */
    public String getNombreApellido() {
        return nombreApellido;
    }

    /**
     * Método para obtener el tipo de cuenta.
     * @return El tipo de cuenta
     */
    public String getTipoCuenta() {
        return tipoCuenta;
    }

    /**
     * Método para obtener el tipo de moneda.
     * @return El tipo de moneda
     */
    public String getTipoMoneda() {
        return tipoMoneda;
    }

    /**
     * Método para obtener el saldo de la cuenta.
     * @return El saldo de la cuenta
     */
    public String getSaldo() {
        return saldo;
    } 
}
