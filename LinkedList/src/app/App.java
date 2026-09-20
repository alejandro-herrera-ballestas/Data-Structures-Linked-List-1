// Alejandro Herrera -> 6902510014
// Juan Esteban Primera -> 6902510051
// Aaron Hernandez -> 6902510046
package app;

import java.util.Scanner;
import co.edu.unicartagena.list.Lista;
import co.edu.unicartagena.list.Nodo;
import models.Bloque;
import models.Blockchain;


public class App {
    public static void main(String args[]){
        
        Blockchain blockchain = new Blockchain();
        blockchain.agregarBloque("Alice envía 10 BTC a Bob");
        blockchain.agregarBloque("Bob envía 5 BTC a Charlie");
        blockchain.agregarBloque("Charlie envía 2 BTC a Alice");
        blockchain.mostrarCadena();
        
        Scanner sc = new Scanner(System.in);
        int op = -1;

        while (op != 0) {

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
        op = sc.nextInt();

            switch (op) {
                
                case 1: 
                    
                    System.out.println("Ingrese los datos de la transaccion: ");
                    sc.nextLine(); // consume the newline character
                    String datos = sc.nextLine();
                    blockchain.agregarBloque(datos);
                    break;
                    
                case 2:
                    
                    System.out.println("Transacciones en la cadena de bloques:");
                    blockchain.mostrarCadena();
                    break;
                    
                case 3:
                    
                    System.out.println("Ingrese el hash del bloque a actualizar: ");
                    sc.nextLine();
                    String hashActualizar = sc.nextLine();
                    System.out.println("Ingrese los nuevos datos (correccion): ");
                    String nuevosDatos = sc.nextLine();
                    boolean actualizado = blockchain.actualizarBloque(hashActualizar, nuevosDatos);
                    if (actualizado) {
                        System.out.println("Correccion agregada exitosamente como nuevo bloque.");
                    } else {
                        System.out.println("No se encontro un bloque con ese hash.");
                    }
                    break;
                
                case 4:
                    
                    System.out.println("Ingrese el bloque");
                    sc.nextLine();
                    String hashEliminar = sc.nextLine();
                    blockchain.eliminarBloque(hashEliminar);
                    break;
                
                case 5:
                    
                    System.out.println("Ingrese el hash del bloque a buscar: ");
                    sc.nextLine(); // consume the newline character
                    String hash = sc.nextLine();
                    Bloque bloque = blockchain.buscarBloque(hash);
                    if (bloque != null) {
                        System.out.println("Bloque encontrado: " + bloque);
                    } else {
                        System.out.println("Bloque no encontrado");
                    }
                    break;
                
                case 6:
                    
                    System.out.println("Ingrese el nombre del archivo para guardar la cadena de bloques: ");
                    sc.nextLine();
                    String nombreArchivo = sc.nextLine();
                    blockchain.guardarArchivo(nombreArchivo);
                    
                    break;
                case 7:
                    
                    System.out.println("Ingrese el nombre del archivo para abrir la cadena de bloques: ");
                    sc.nextLine();
                    String nombreArchivoAbrir = sc.nextLine();
                    blockchain.abrirArchivo(nombreArchivoAbrir);
                    break;
                
                case 0:
                    
                    System.out.println("Saliendo exitosamente del sistema...");
                        break;
                
                default:
                    
                    System.out.println("Ingrese una opcion valida!");
                    break;
            }
        }
       sc.close();
    }
}