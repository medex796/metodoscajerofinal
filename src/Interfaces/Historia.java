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
public class Historia implements Serializable{
    // Atributos de la clase Historia
    public String fecha; // Fecha de la transacción
    public String descripcion; // Descripción de la transacción
    public String monto; // Monto de la transacción
    public String destinatario; // Nombre del destinatario de la transacción
    public int cuentadestinatario; // Número de cuenta del destinatario
    public String saldo; // Saldo de la cuenta después de la transacción
    /**
     * Constructor de la clase Historia con parámetros.
     * @param fecha Fecha de la transacción
     * @param descripcion Descripción de la transacción
     * @param monto Monto de la transacción
     * @param destinatario Nombre del destinatario de la transacción
     * @param cuentadestinario Número de cuenta del destinatario
     * @param saldo Saldo de la cuenta después de la transacción
     */
    public Historia(String fecha ,String descripcion,String monto,String destinatario,int cuentadestinario,String saldo){
    this.fecha = fecha; // Asigna la fecha de la transacción al atributo fecha
        this.descripcion = descripcion; // Asigna la descripción de la transacción al atributo descripcion
        this.monto = monto; // Asigna el monto de la transacción al atributo monto
        this.cuentadestinatario = cuentadestinario; // Asigna el número de cuenta del destinatario al atributo cuentadestinatario
        this.destinatario = destinatario; // Asigna el nombre del destinatario al atributo destinatario
        this.saldo = saldo; // Asigna el saldo de la cuenta después de la transacción al atributo saldo
    }
    /**
     * Constructor por defecto de la clase Historia.
     * Inicializa los atributos con valores predeterminados.
     */
    public Historia() {
        this.fecha = null; // Inicializa el atributo fecha como null
        this.descripcion = null; // Inicializa el atributo descripcion como null
        this.monto = null; // Inicializa el atributo monto como null
        this.cuentadestinatario = 00; // Inicializa el atributo cuentadestinatario como 0
        this.destinatario = null; // Inicializa el atributo destinatario como null
        this.saldo = null; // Inicializa el atributo saldo como null
    }

    /**
     * Setter para el atributo fecha.
     * @param fecha La nueva fecha de la transacción
     */
    public void setFecha(String fecha) {
        this.fecha = fecha; // Asigna la nueva fecha al atributo fecha
    }

    /**
     * Getter para el atributo saldo.
     * @return El saldo de la cuenta después de la transacción
     */
    public String getSaldo() {
        return saldo; // Devuelve el valor del atributo saldo
    }

    /**
     * Getter para el atributo destinatario.
     * @return El nombre del destinatario de la transacción
     */
    public String getDestinatario() {
        return destinatario; // Devuelve el valor del atributo destinatario
    }

    /**
     * Getter para el atributo cuentadestinatario.
     * @return El número de cuenta del destinatario
     */
    public int getCuenta() {
        return cuentadestinatario; // Devuelve el valor del atributo cuentadestinatario
    }

    /**
     * Getter para el atributo fecha.
     * @return La fecha de la transacción
     */
    public String getFecha() {
        return fecha; // Devuelve el valor del atributo fecha
    }

    /**
     * Setter para el atributo descripcion.
     * @param descripcion La nueva descripción de la transacción
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion; // Asigna la nueva descripción al atributo descripcion
    }

    /**
     * Getter para el atributo descripcion.
     * @return La descripción de la transacción
     */
    public String getDescripcion() {
        return descripcion; // Devuelve el valor del atributo descripcion
    }

    /**
     * Setter para el atributo monto.
     * @param monto El nuevo monto de la transacción
     */
    public void setMonto(String monto) {
        this.monto = monto; // Asigna el nuevo monto al atributo monto
    }

    /**
     * Getter para el atributo monto.
     * @return El monto de la transacción
     */
    public String getMonto() {
        return monto; // Devuelve el valor del atributo monto
    }
}
