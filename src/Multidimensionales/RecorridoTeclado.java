package Multidimensionales;

import java.util.Scanner;

public class RecorridoTeclado {
	public static void main(String[] args) {
		// Inicialización
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el numero de la fila" + " ");
		int filas = sc.nextInt();
		System.out.println("Escriba el numero de la  columna" + " ");
		int columna = sc.nextInt();

		int[][] matriz = new int[filas][columna];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("celda (%d,%d):", i, j);
				matriz[i][j] = sc.nextInt();
			}
			for (i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					System.out.printf(matriz[i][j] + "\t");
				}
				System.out.println();
			}
		}
	}
}
