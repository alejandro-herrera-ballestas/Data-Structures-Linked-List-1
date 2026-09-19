// Alejandro Herrera -> 6902510014
// Juan Esteban Primera -> 69025100
// Aaron Hernandez -> 69025100


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
        this.hashActual = Integer.toHexString(Objects.hash(id, datos, hashAnterior));       // calcular el hash actual del bloque
    }

    @Override
    public String toString() {
        return "Bloque{" +
                "id=" + id +
                ", datos='" + datos + '\'' +
                ", hashAnterior='" + hashAnterior + '\'' +
                ", hashActual='" + hashActual + '\'' +
                '}';
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
