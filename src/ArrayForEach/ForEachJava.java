package ArrayForEach;

public class ForEachJava {

	public static void main(String[] args) {
		// Inicialización
		int[] arrayEjemplo = { 1, 2, 3, 4 };
		boolean EstaOrdenado = true;
		// Proceso
		int anterior = Integer.MIN_VALUE;
		for (int i : arrayEjemplo) {
			if (anterior > i)
				EstaOrdenado = false;
			anterior = i;
		}

		// Salida
		if (EstaOrdenado)
			System.out.println("Esta ordenado");
		else
			System.out.println("No esta ordenado");
	}

}
