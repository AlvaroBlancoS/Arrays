package Multidimensionales;

import java.util.Arrays;

public class Ejemplo {

	public static void main(String[] args) {
		// Arrays de 1, 2 y 3 dimensiones 
	int [] ventas = new int [5];
	int [][] ventas2 = new int [10][5];
	int [][][] ventas3 = new int [20][10][5];
	System.out.println(Arrays.toString(ventas));
	
		//Entrada
	
	
		//Otras forma de declarar un array multidimensional
	int [][] noMatriz = new int [5][];
	noMatriz[0] = new int [1];
	noMatriz[1] = new int [3];
	noMatriz[2] = new int [2];
	noMatriz[3] = new int [4];
	noMatriz[4] = new int [1];
 	}

}
