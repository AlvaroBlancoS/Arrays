package ArrayForEach;

import java.util.Arrays;

public class Envoltorio {

	public static void main(String[] args) {
		// Inicializaci�n
		int[] miVector = { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(miVector));
		// Ordenaci�n del vector
		Arrays.sort(miVector);
		// Busco un elemento en concreto en un vector ordenado
		System.out.println(Arrays.binarySearch(miVector, 4));
		// Imprimir un vector
		System.out.println(Arrays.toString(miVector));

	}
}