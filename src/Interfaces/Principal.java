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
public class Principal implements Serializable {
     public ArrayList <Cuenta> listaCuenta ;//lista de cuentas
    public ArrayList <Cliente> listaCliente ;//lista de clientes
    
    public Principal (){
    listaCuenta=new ArrayList ();
     listaCliente=new ArrayList ();
    
    }
    /**
     * Obtiene la lista de clientes.
     * 
     * @return Una lista de objetos Cliente.
     */
    public ArrayList<Cliente> getListaCliente() {
        return listaCliente;
    }

    /**
     * Establece la lista de clientes.
     * 
     * @param listaClientes Una lista de objetos Cliente que se asignará a listaCliente.
     */
    public void setListaCliente(ArrayList<Cliente> listaClientes) {
        this.listaCliente = listaClientes;
    }

    /**
     * Obtiene la lista de cuentas.
     * 
     * @return Una lista de objetos Cuenta.
     */
    public ArrayList<Cuenta> getListaCuenta() {
        return listaCuenta;
    }

    /**
     * Establece la lista de cuentas.
     * 
     * @param listaCuentas Una lista de objetos Cuenta que se asignará a listaCuenta.
     */
    public void setListaCuenta(ArrayList<Cuenta> listaCuentas) {
        this.listaCuenta = listaCuentas;
    }
}
