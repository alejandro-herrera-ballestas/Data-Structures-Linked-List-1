// Alejandro Herrera -> 6902510014
// Juan Esteban Primera -> 6902510051
// Aaron Hernandez -> 6902510046

package models;

import co.edu.unicartagena.list.Lista;
import co.edu.unicartagena.list.Nodo;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.Desktop;

public class Blockchain {
    private Lista<Bloque> cadena;   // lista enlazada para almacenar los bloques de la cadena de bloques

    public Blockchain() {
        this.cadena = new Lista<>();
    }

    // funcion que agrega un nuevo bloque a la cadena de bloques 
    public void agregarBloque(String datos) {
        int id = 1;
        String hashAnterior = "None";

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

    // busca un bloque en la cadena de bloques por su hash 
    public Bloque buscarBloque(String hash) {
        for (Bloque bloque : cadena) {
            if (bloque.hashActual.equals(hash)) {
                return bloque;
            }
        }
        return null;
    }

    // utiliza buscarBloque y corrige / actuatilza los dats (sin eliminar)
    public boolean actualizarBloque(String hashOriginal, String nuevosDatos) {
        Bloque bloqueOriginal = buscarBloque(hashOriginal);
        if (bloqueOriginal == null) {
            return false; 
        }
        String datosCorreccion = "[Correccion del bloque " + bloqueOriginal.id + "]: " + nuevosDatos;
        agregarBloque(datosCorreccion); 
        return true;
    } 
    // guardar en un archivo la cadena de bloques 
    public void guardarArchivo(String nombreArchivo) {
        try {
            FileWriter archivo = new FileWriter(nombreArchivo);
            for (Bloque bloque : cadena) {
                archivo.write(bloque.id + "," + bloque.datos + "," + bloque.hashAnterior + "," + bloque.hashActual + "\n");
            }
            archivo.close();
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    // abrir un archivo archivo
    public void abrirArchivo(String nombreArchivo) {
        try {
            File archivo = new File(nombreArchivo);
                if (!archivo.exists()) {
                    System.out.println("Archivo no encontrado: " + nombreArchivo);
                    return;
                }
                if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(archivo);
                } else {
                    System.out.println("El sistema no soporta abrir archivos automáticamente.");
                }
        } catch (IOException e) {
            System.out.println("Error al abrir el archivo: " + e.getMessage());
        }
    }
    
    // busca el bloque y lo "elimina"
    public boolean eliminarBloque(String hashObjetivo) {
    Bloque objetivo = buscarBloque(hashObjetivo); 
    if (objetivo == null) {
        return false; // no existe ese bloque
    }
    String mensaje = "Bloque " + objetivo.getId() + " invalidado (reversión de: " + objetivo.getDatos() + ")";
    agregarBloque(mensaje); // se agrega como un bloque normal, encadenado al final
    return true;
}
}
