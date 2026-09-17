package app;

import java.util.Scanner;
import co.edu.unicartagena.list.Lista;
import co.edu.unicartagena.list.Nodo;
import models.Bloque;


public class App {
    public static void main(String args[]){
	
        Lista<Bloque> l = new Lista<>();
        System.out.println("            Menu                ");
        System.out.println("1. Nueva Transaccion");     // create
        System.out.println("2. Ver transacciones");     // read
        System.out.println("3. Actualizar (Limitado)");     // update
        System.out.println("4. Eliminar (limitado)");       // delete
        System.out.println("5. Buscar");        // search
        System.out.println("6. Guardar");      // save, guarda en un archivo
        System.out.println("7. Abrir");     // open, abre el archivo que decribe los bloques blockchain
        System.out.println("Seleccione una opcion: ");
        Scanner op = new Scanner(System.in);
        
       
    }
}