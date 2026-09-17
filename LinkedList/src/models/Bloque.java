
package models;
import java.util.Objects;
/**
 *
 * @author alejandro
 */
public class Bloque {
    int id;
    String datos;
    String hashAnterior;
    String hashActual;

    public Bloque(int id, String datos, String hashAnterior) {
        this.id = id;
        this.datos = datos;
        this.hashAnterior = hashAnterior;
        this.hashActual = Integer.toHexString(Objects.hash(id, datos, hashAnterior));
    }
    
    
    
}
