/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioPerro;

import EntidadesPerro.Perro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Mariana
 */
public class PerroServicio {

    private ArrayList<String> razas;
    private Scanner leer;

    public PerroServicio() {
        this.razas = new ArrayList<>();
        this.leer = new Scanner(System.in);
    }

    public void pedirRaza() {
        String respuesta;
        int contador = 1;
        do {
            System.out.println("Ingrese la raza de la mascota " + contador);
            contador++;
            String leerraza = leer.nextLine();
            razas.add(leerraza);
            System.out.println("¿Desea continuar cargando razas? si/no");
            respuesta = leer.nextLine();
        } while (respuesta.equals("si"));
    }

    public void mostrarRaza() {
        System.out.println("Las razas de esta lista son: ");
        for (String aux : razas) {
            System.out.println(aux);
        }
        System.out.println("La cantidad de razas ingresadas es: " + razas.size());
    }

//    public void buscarRaza() {
//        System.out.println("Ingrese la raza a buscar");
//        String razabuscada = leer.nextLine();
//        razas.remove(razabuscada);
//        Collections.sort(razas);
//        Iterator<String> buscar = razas.iterator();
//     
//        while (buscar.hasNext()) {
//           // String borrar=(String)buscar.next();
//            if (razabuscada.equals(buscar.next())) {
//                buscar.remove();
//                Collections.sort(razas);
//metodo buscar raza, colaboracion Margarita
    public void buscarRaza() {
        System.out.println("Ingrese la raza deperro que desea eliminar");
        String razaBuscada = leer.nextLine();
        String raz = "";
        for (int i = 0; i < razas.size(); i++) {
            raz = razas.get(i);
            if (raz.equals(razaBuscada)) {
                razas.remove(raz);
            }
        }
        if (raz.equals(razaBuscada) == true) {
            razas.remove(raz);
        } else {
            System.out.println("La raza no fue encontrada");
        }

    }

}
