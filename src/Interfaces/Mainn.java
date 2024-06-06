/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author Jhonny
 */
public class Mainn {
    /**
     * El método main es el punto de entrada de la aplicación.
     * Inicializa una instancia de la clase IngresoPinQuechua, configura su visibilidad y posición en la pantalla.
     *
     * @param args Los argumentos de la línea de comandos (no utilizados en este programa).
     */
    public static void main(String []args){
    // Crea una nueva instancia de la clase IngresoPinQuechua
        IngresoPinQuechua ventana = new IngresoPinQuechua();

        // Establece la visibilidad de la ventana a true, para que sea visible
        ventana.setVisible(true);

        // Coloca la ventana en el centro de la pantalla
        ventana.setLocationRelativeTo(null);
                       
     
     
     }
}
