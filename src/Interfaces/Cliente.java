/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import java.io.Serializable;
import java.util.ArrayList;
/**
 * 
 *
 * @author Jhonny
 */
public class Cliente implements Serializable {
    // Atributos de la clase Cliente
    public String nombre; // Nombre del cliente
    public String apellido; // Apellido del cliente
    public int ci; // Cédula de Identidad del cliente
    public String direccion; // Dirección del cliente
    public int telefono; // Número de teléfono del cliente
    public String usuario; // Nombre de usuario del cliente
    public String contraseña; // Contraseña del cliente
    public ArrayList<Cuenta> listaCuentas; // Lista de cuentas asociadas al cliente
    /**
     * Constructor de la clase Cliente.
     * @param nombre Nombre del cliente
     * @param apellido Apellido del cliente
     * @param ci Cédula de Identidad del cliente
     * @param direccion Dirección del cliente
     * @param telefono Número de teléfono del cliente
     * @param usuario Nombre de usuario del cliente
     * @param contraseña Contraseña del cliente
     */
    public  Cliente (String nombre,String apellido,int ci,String direccion,int telefono,String usuario,String contraseña){
        
        this.nombre = nombre; // Asigna el nombre al atributo nombre
        this.apellido = apellido; // Asigna el apellido al atributo apellido
        this.ci = ci; // Asigna la cédula de identidad al atributo ci
        this.direccion = direccion; // Asigna la dirección al atributo direccion
        this.telefono = telefono; // Asigna el teléfono al atributo telefono
        this.usuario = usuario; // Asigna el usuario al atributo usuario
        this.contraseña = contraseña; // Asigna la contraseña al atributo contraseña
        listaCuentas = new ArrayList<>(); // Inicializa la lista de cuentas
    
    }
    // Métodos de acceso para obtener los valores de los atributos
    
    /**
     * Método para obtener el nombre del cliente.
     * @return El nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el nombre del cliente.
     * @param nombre El nombre del cliente a establecer
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el apellido del cliente.
     * @return El apellido del cliente
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Método para establecer el apellido del cliente.
     * @param apellido El apellido del cliente a establecer
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Método para obtener la cédula de identidad del cliente.
     * @return La cédula de identidad del cliente
     */
    public int getCi() {
        return ci;
    }

    /**
     * Método para establecer la cédula de identidad del cliente.
     * @param ci La cédula de identidad del cliente a establecer
     */
    public void setCi(int ci) {
        this.ci = ci;
    }

    /**
     * Método para obtener la dirección del cliente.
     * @return La dirección del cliente
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Método para establecer la dirección del cliente.
     * @param direccion La dirección del cliente a establecer
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Método para obtener el teléfono del cliente.
     * @return El teléfono del cliente
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * Método para establecer el teléfono del cliente.
     * @param telefono El teléfono del cliente a establecer
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * Método para obtener el nombre de usuario del cliente.
     * @return El nombre de usuario del cliente
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Método para establecer el nombre de usuario del cliente.
     * @param usuario El nombre de usuario del cliente a establecer
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Método para obtener la contraseña del cliente.
     * @return La contraseña del cliente
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * Método para establecer la contraseña del cliente.
     * @param contraseña La contraseña del cliente a establecer
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
}
