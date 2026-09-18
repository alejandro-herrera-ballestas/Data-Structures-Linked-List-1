// Alejandro Herrera -> 6902510014
// Juan Esteban Primera -> 69025100
// Aaron Hernandez -> 69025100

package models;

import co.edu.unicartagena.list.Lista;
import co.edu.unicartagena.list.Nodo;

/**
 *
 * @author alejandro
 */
public class Blockchain {
    private Lista<Bloque> cadena;   // lista enlazada para almacenar los bloques de la cadena de bloques

    public Blockchain() {
        this.cadena = new Lista<>();
    }

    // funcion que agrega un nuevo bloque a la cadena de bloques (automaticamente al final de la lista)
    public void agregarBloque(String datos) {
        int id = 1;
        String hashAnterior = "0";

        for (Bloque bloque : cadena) {      // recorrer la lista de bloques para obtener el último bloque y calcular el id y hashAnterior del nuevo bloque
            id = bloque.id + 1;
            hashAnterior = bloque.hashActual;      
        }

        cadena.adicionarFinal(new Nodo<>(new Bloque(id, datos, hashAnterior))); // agregar el nuevo bloque al final de la lista
    }

    // recorre el bloque y muestra la secuencia de bloques en la cadena de bloques
    public void mostrarCadena() {       
        for (Bloque bloque : cadena) {
            System.out.println(bloque);    
        }
    }

    // busca un bloque en la cadena de bloques por su hash y devuelve el bloque si se encuentra, o null si no se encuentra
    public Bloque buscarBloque(String hash) {
        for (Bloque bloque : cadena) {
            if (bloque.hashActual.equals(hash)) {
                return bloque;
            }
        }
        return null;
    }
}
