package Simples;

import java.util.Scanner;

public class usuario {

	public static void main(String[] args) {
		//Declaracion
		String [] usuarios;
		//Dimensionamiento
		usuarios = new String [10];
		//Inicialización
		usuarios [0] = "Alvaro";
		usuarios [1] = "Pedro";
		usuarios [2] = "Luis";
		usuarios [3] = "Fabio";
		usuarios [4] = "Elizabeth";
		usuarios [5] = "Jacobo";
		usuarios [6] = "Guillermo";
		usuarios [7] = "Nacho";
		usuarios [8] = "Juan";
		usuarios [9] = "Alvaro E";
		int usuarios2;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("");
			 usuarios2 = sc.nextInt();
		} while (usuarios2 <= 0);
		System.out.println(usuarios);
		
	}

}
