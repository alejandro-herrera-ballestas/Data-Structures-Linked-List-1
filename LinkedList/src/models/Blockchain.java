/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import co.edu.unicartagena.list.Lista;
import co.edu.unicartagena.list.Nodo;

/**
 *
 * @author alejandro
 */
public class Blockchain {
    private Lista<Bloque> cadena;

    public Blockchain() {
        this.cadena = new Lista<>();
    }

    public void agregarBloque(String datos) {
        int id = 1;
        String hashAnterior = "0";

        for (Bloque bloque : cadena) {
            id = bloque.id + 1;
            hashAnterior = bloque.hashActual;
        }

        cadena.adicionarFinal(new Nodo<>(new Bloque(id, datos, hashAnterior)));
    }

    public void mostrarCadena() {
        for (Bloque bloque : cadena) {
            System.out.println(bloque);
        }
    }

    public Bloque buscarBloque(String hash) {
        for (Bloque bloque : cadena) {
            if (bloque.hashActual.equals(hash)) {
                return bloque;
            }
        }
        return null;
    }
}
