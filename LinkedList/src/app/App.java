package app;

import java.util.Scanner;
import co.edu.unicartagena.list.Lista;
import co.edu.unicartagena.list.Nodo;
import models.Bloque;


public class App {
    public static void main(String args[]){
	
        Lista<Bloque> l = new Lista<>();
        
        //              MENU
        System.out.println("            Menu                ");
        System.out.println("1. Nueva Transaccion");     // create
        System.out.println("2. Ver transacciones");     // read
        System.out.println("3. Actualizar (Limitado)");     // update
        System.out.println("4. Eliminar (limitado)");       // delete
        System.out.println("5. Buscar");        // search
        System.out.println("6. Guardar archivo");      // save, guarda en un archivo
        System.out.println("7. Abrir archivo");     // open, abre el archivo que decribe los bloques blockchain
        System.out.println("0. Salir");
        System.out.println("Seleccione una opcion: ");
        
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        while (op != 0) {
            switch (op) {
                case 1: 
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 0:
                    System.out.println("Saliendo exitosamente del sistema...");
                        break;
                default:
                    System.out.println("Ingrese una opcion valida!");
                    break;
            }
        }
       
    }
}