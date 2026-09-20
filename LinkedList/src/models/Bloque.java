// Alejandro Herrera -> 6902510014
// Juan Esteban Primera -> 6902510051
// Aaron Hernandez -> 6902510046


package models;
import java.util.Objects;

public class Bloque {
    int id;
    String datos;
    String hashAnterior;
    String hashActual;

    public Bloque(int id, String datos, String hashAnterior) {
        this.id = id;
        this.datos = datos;
        this.hashAnterior = hashAnterior;
        this.hashActual =  calcularHash(id, datos, hashAnterior);
    }

    // metodo para calcular hash
    private String calcularHash(int id, String datos, String hashAnterior) {
        return Integer.toHexString(Objects.hash(id, datos, hashAnterior));
    }
    
    // formato para mostrar el bloque
    @Override
    public String toString() {
        return "Bloque " + id + ":\n" +
                "Datos: \"" + datos + "\"\n" +
                "Hash anterior: " + hashAnterior + "\n" +
                "Hash actual: " + hashActual + "\n";
    }

    public int getId() {
        return id;
    }

    public String getDatos() {
        return datos;
    }

    public String getHashAnterior() {
        return hashAnterior;
    }

    public String getHashActual() {
        return hashActual;
    }

    
    
    
    
}
