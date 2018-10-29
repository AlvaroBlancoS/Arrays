package Simples;

public class caracteristicas {

	public static void main(String[] args) {
		// ejercicio 1: depurar paso a paso
		int m = 5;
		int[] vector = new int[m];
		vector[1] = 2;
		vector[2] = vector[1];
		vector[0] = vector[1] + vector[2] + 2;
		vector[0]++;
		vector[3] = m + 10;
		vector[vector.length - 1] = vector[0];

		/*
		 * Ejercicio 2: Si tienes 22 días laborales de vacaciones, ¿Qué día de la semana
		 * volverás a trabajar si hoy es jueves?
		 */
		String[] laborales = { "lunes", "martes", "miercoles", "jueves", "viernes" };
		int actual = 3; // Lunes es 0 y el viernes es 4,
						// por lo que el jueves es 3
		int vacaciones = 22;
		int finalVacaciones = (actual + vacaciones) % 5;
		System.out.println(laborales[finalVacaciones]);
	}

}
