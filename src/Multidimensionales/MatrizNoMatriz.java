package Multidimensionales;

import java.util.Scanner;

public class MatrizNoMatriz {
	private static final int[][] MatrizNoMatriz = null;

	public static boolean main(String[] args) {
		// Inicialización
	public static boolean casoDePrueba() {
		int dimension = Integer.parseInt(in.nextLine());
		if (dimension == 0)
			return false;
		
		//creación de matriz
		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args.length; j++) {
				MatrizNoMatriz[i][j]=in.nextInt();
			}
		}
		i.nextLine();
		//Proceso de la matriz
		boolean triSuperior = true;
		boolean triInferior = true;
		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args.length; j++) {
			//Busco cas en el no sea triangular
			if (i<j && MatrizNoMatriz[i][j] != 0) {
				boolean triInterior = false;
			}
			if (i>j && MatrizNoMatriz[i][j] != 0) {
				triSuperior=false;
			}
			}
		}
		if (triSuperior || triInferior)
			System.out.println("Si");
		else 
			System.out.println("No");
		return true;
	}
	}
}
