/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author alejandro
 */
public class Bloque {
    int id;
    String datos;
    String hashAnterior;
    String hashActual;

    public Bloque(int id, String datos, String hashAnterior, String hashActual) {
        this.id = id;
        this.datos = datos;
        this.hashAnterior = hashAnterior;
        this.hashActual = hashActual;
    }
    
    
    
}
