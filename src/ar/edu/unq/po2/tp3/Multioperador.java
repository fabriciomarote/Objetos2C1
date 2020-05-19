package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {
	
    private ArrayList<Integer> numeros;
	
    public ArrayList<Integer> numeros() {
    	return numeros;
    }

	public Multioperador(ArrayList<Integer> numeros) {
		this.numeros = numeros;
	}

	public Integer sumaTotal() {
		Integer total = 0;
		for ( Integer numero:numeros) {
			total = total + numero;	
		}
		return total;
	}

	public Integer restaTotal() {
		ArrayList<Integer> enteros = numeros;
		int total = enteros.get(1);
		for ( Integer entero:enteros ) {
			total = total - entero;	
		}
		return total;
	}
	
	public int multiplicacionTotal() {
		ArrayList<Integer> enteros = numeros;
		int multiplicacion = enteros.get(1);
		enteros.remove(1);
		for ( int entero:enteros ) {
			multiplicacion = multiplicacion * entero;	
		}
		return multiplicacion;
	}
}