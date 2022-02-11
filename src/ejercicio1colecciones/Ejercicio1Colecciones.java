/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1colecciones;

import ServicioPerro.PerroServicio;

/**
 *
 * @author Mariana
 */
public class Ejercicio1Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PerroServicio ps = new PerroServicio();
        ps.pedirRaza();
        ps.mostrarRaza();
        ps.buscarRaza();
        ps.mostrarRaza();
    }
    
    
    
}
