package ArrayFor;
public class Ordenacion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] vector = new int[5];
		System.out.println("Escribe los cinco numeros enteros: ");
		for (int i = 0; i < vector.length; i++) {
			vector[i] = in.nextInt();
		}
		int aux;
		for (int k = 0; k < vector.length; k++) {
			for (int i = 0; i < vector.length - k - 1; i++) {
				if (vector[i] > vector[i + 1]) {
					aux = vector[i];
					vector[i] = vector[i + 1];
					vector[i + 1] = aux;
				}
			}
		}
		System.out.println(Arrays.toString(vector));
	}

}
