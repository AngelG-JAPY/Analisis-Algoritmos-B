import java.security.cert.X509CRL;

public class Exercices {

	// Exercice 1s
	public static int pow(int base, byte exp) {
		int pow = 1; // 1
		int i = 1; // 1
		while (i <= exp) { // 1
			pow = pow * base; // 2
			i = i + 1; // 2
		}
		return pow; // 1

		/*
		 * Calculo T(n)
		 * T(n) = 4 + n(5)
		 * T(n) = 5n + 4
		 * O(n)
		 */
	}

	// Exercice 2
	public static int residue(int m, int n) {

		while (m >= n) { // 1
			m = m - n; // 2
		}

		return m; // 1

		/*
		 * T(n) = 2 + m/n (3)
		 * T(n) = 2 + 3m/n
		 * O(m/n);
		 */
	}

	// Exercice 3
	public static int appearancesOfX(int[] array, int length, int x) {
		int counter = 0; // 1
		int i = 0; // 1

		while (i < length) { // 1
			if (array[i] == x) // 2
				counter = (counter + 1); // 2
			i = (i + 1); // 2
		}

		return counter; // 1

		/*
		 * T(n) = 4 + n(1+2+max(2,2))
		 * T(n) = 4 + 5n
		 * O(n)
		 */
	}

	// Exercice 4
	public static int sumOfEvenPositions(int[] array, int length) {
		int sum = 0; // 1
		int i = 0; // 1

		while (i < length) { // 1
			sum = sum + array[i]; // 3
			i = (i + 2); // 2
		}

		return sum; // 1

		/*
		 * T(n) = 4 + n/2(6)
		 * T(n) = 4 + 3n
		 * O(n)
		 */
	}

	// Exercice 5
	public static int sumOfElements(int[][] matrix, int length) {
		int sum = 0; // 1
		int i = 0, j; // 1

		while (i < length) { // 1
			j = 0; // 1

			while (j < length) { // 1
				sum = sum + matrix[i][j]; // 4
				j = (j + 1); // 2
			}

			i = (i + 1); // 2

		}
		return sum; // 1

		/**
		 * T(n) = 4 + n(5+(n(7)))
		 * T(n) = 4 + n(5+7n)
		 * T(n) = 4 + 5n + 7n^2
		 * O(n^2)
		 */
	}

	// Exercice 6
	public static boolean symmetricMatrix(int[][] matrix, int length) {
		int i = 0, j; // 1

		while (i < length - 1) { // 2
			j = i + 1; // 2

			while (j < length) { // 1
				if (matrix[i][j] != matrix[j][i]) { // 5
					return false; // 1
				}
				j = j + 1; // 2
			}

			i = i + 1; // 2
		}

		return true; // 1
		/**
		 * T(n) = 4n^2 + 3n - 3
		 * O(n^2)
		 */
	}

	// Exercice 7
	// Suponemos que la matriz siempre es de n*n
	public static int mainDiagonal(int[][] matrix, int length) {
		int sum = 0; // 1
		int i = 0; // 1

		while (i < length) { // 1
			sum = sum + matrix[i][i]; // 4
			i = (i + 1); // 2
		}

		return sum; // 1
		/**
		 * T(n) = 4 + n(7)
		 * T(n) = 7n + 4
		 * O(n)
		 */
	}

	// Exericice 8
	public static int secondaryDiagonal(int[][] matrix, int length) {
		int sum = 0; // 1
		int i = length; // 1

		while (i >= 0) { // 1
			sum = sum + matrix[i][length - i - 1]; // 6
			i = (i - 1); // 1
		}

		return sum;// 1
		/**
		 * T(n) = 4 + n(8)
		 * T(n) = 8n + 4
		 * O(n)
		 */
	}

	// Exercice 9
	public static int[] invertArray(int[] array, int length) {

		int aux = 0; // 1
		int i = 0; // 1

		while (i < length / 2) { // 2
			aux = array[i]; // 2
			array[i] = array[length - i - 1]; // 5
			array[length - i - 1] = aux; // 4
			i = (i + 1); // 2
		}

		return array; // 1

		/**
		 * T(n) = 5 + n/2(15)
		 * T(n) = 15n/2 + 5
		 * O(n)
		 */

	}

	// Exercice 10
	public static boolean ascArray(int[] array, int length) {

		int i = 0; // 1

		while (i < length) { // 1
			if (array[i] > array[i + 1]) { // 4
				return false; // 1
			}
			i = (i + 1); // 2
		}

		return true; // 1

		/**
		 * T(n) = 3 + n(7)
		 * T(n) = 7n + 3
		 * O(n)
		 */
	}

	// Exercice 11
	public static int findTheNumber(int[] array, int length) {
		int sum = 0; // 1
		int i = 0; // 1

		while (i < length) { // 1
			sum = sum + array[i]; // 3
			i = (i + 1);// 2
		}

		return ((length + 1) * (length + 2)) / 2 - sum; // 5

		/**
		 * T(n) = 8 + n(6)
		 * T(n) = 6n + 8
		 * O(n)
		 */
	}

	public static void algoritmo4(int n, int a) {
		int i = 0; // 1
		int j = 0; // 1
		int k = 0; // 1
		while (i < n) { // 1
			while (j < n) { // 1
				while (k < n) { // 1
					a = a + k; // 2
					k = k + 1; // 2
				}
				j++; // 2
			}
			i++; // 2
		}
		return; // 1
		/**
		 * T(n) = 5 + n(4+n(4+n(5)))
		 * T(n) = 5 + n(4+n(4+5n))
		 * T(n) = 5 + n(4+4n+5n^2)
		 * T(n) = 5 + 4n + 4n^2 + 5n^3
		 * O(n^3)
		 */
	}

	public static void haceAlgo(int A[], int n) {

		int i = 1; // 1

		while (i <= n) { // 1
			if (A[i] >= A[n]) // 3
				A[n] = A[i]; // 3
			i = i * 2; // 2
		}

		return; // 1

		/**
		 * T(n) = 3 + 2^k(7)
		 * T(n) = 3 + 7*2^k
		 * pero 2^k = n => k = lg(n)
		 * T(n) = 3 + 7lg(n)
		 * O(lg(n))
		 */

	}

	// Angel Garcia😁👍
	public static boolean isTriangle(int n) {
		int sum = 0; // 1

		// Suponiendo que tenga coste 1 el Math.sqrt()
		int xRepeticiones = (-1 + (int) (Math.sqrt(1 + (8 * n)))) / 2; // 7

		for (int i = 1; i <= xRepeticiones; i++) {
			sum += i;
			if (sum == n)
				return true;
		} // O(n)

		for (int i = 1; i <= n; i++) {
			sum += i;
			if (sum == n)
				return true;
		}
		return false;
	}

	public static int euclides(int a, int b) {
		if (b == 0)
			return a;
		return euclides(b, a % b);
	}

	public static int pelosAlgoritmo(int n) {
		int p = 0;
		int contador = 0;
		for (int i = 1; i <= n; i++) {
			p = i*i;
			for (int j = 1; j <= p; j++) {
				contador ++;
			}
			contador++;
		}
		return contador;
	}



	public static void main(String[] args) throws Exception {
		// System.out.println(pow(5, (byte)5));
		// System.out.println(residue(4, 2));

		// int[] array = { 5, 10, 2, 5, 78, 5, 8, 8, 11, 10, 25, 69, 30, 154, 15 };
		// int [] array = {5,5,5,5,5};
		// int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		/*
		 * int[][] matrix = {
		 * { 4, 9, 1, 2 },
		 * { 9, 4, 6, 3 },
		 * { 1, 6, 2, 2 },
		 * { 2, 3, 2, 2 } };
		 */
		// System.out.println(appearancesOfX(array, array.length, 5));
		// System.out.println(sumOfEvenPositions(array, array.length));
		// System.out.println(sumOfElements(matrix, matrix.length));
		// System.out.println(symmetricMatrix(matrix, matrix.length));
		// System.out.println(mainDiagonal(matrix, matrix.length));
		// System.out.println(secondaryDiagonal(matrix, matrix.length));
		/*
		 * int [] invert = invertArray(array, array.length);
		 * for(int i: invert){
		 * System.out.print(i+" ");
		 * }
		 */

		// int[] array2 = { 1, 2, 5, 4, 5, 6 };
		// System.out.println(ascArray(array2, array2.length-1));

		// int[] array3 = { 1,2,3,4,5,7};
		// System.out.println(findTheNumber(array3, array3.length));
		// System.out.println(caminos(7));

		// algoritmo4(2, 2);
		// System.out.println(haceAlgo(array2, array2.length - 1));
		// System.out.println(isTriangle(10));
		//System.out.println(euclides(6, 6));
		System.out.println(pelosAlgoritmo(5));
	}
}
