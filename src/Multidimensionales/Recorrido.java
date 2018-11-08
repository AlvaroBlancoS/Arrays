package Multidimensionales;

public class Recorrido {
public static void main(String[] args) {
	int [][] matrizDeEnteros = { {1,3,5,7}, {5,4,1,16}, {7,9,61,13} };
	
	for (int fila = 0; fila < matrizDeEnteros.length; fila++) {
		for (int columna = 0; columna < matrizDeEnteros[fila].length; columna++) {
			System.out.printf("%2d ", matrizDeEnteros[fila][columna]);
		}
		System.out.println("");
	}
}
}
