// Alejandro Herrera -> 6902510014
// Juan Esteban Primera -> 6902510051
// Aaron Hernandez -> 6902510046

package co.edu.unicartagena.list;

public class Nodo<T> {
	T dato;
	Nodo<T> sig;
	public Nodo(T dato){
		this.dato=dato;
		this.sig=null;
	}
	public Nodo(T dato, Nodo<T> sig){
		this.dato=dato;
		this.sig=sig;
	}
	public T getDato(){
		return this.dato;
	}
}