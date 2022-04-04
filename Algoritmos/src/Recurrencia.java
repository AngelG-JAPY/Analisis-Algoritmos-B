import java.util.ArrayList;

/**
 * Recurrencia
 */
public class Recurrencia {

    public static int recursiveAdd(int a, int b) {
        if (b == 1)
            return a;
        return a + recursiveAdd(a, b - 1);

        /**
         * -------------
         * T(n) = | c, b == 1
         * | T(n-1) + c
         * --------------
         * T(n) = T(n-1) + c;
         * = T(n-2) + c + c = T(n-2) + 2c
         * = (T(n-3) + c) + 2c
         * = T(n-3) + 3c
         * = .
         * = .
         * = .
         * = T(n-(n-1)) + (n-1)c
         * = T(1) + (n-1)c
         * = c + cn - c
         * T(n) = cn
         * O(n)
         * 
         */
    }

    public static int recursiveDivision(int a, int b) {
        if (b > a)
            return 0;
        return 1 + recursiveDivision(a - b, b);
        /*
         * --------------
         * T(a,b) | c, b > a
         * | T(a-b) + c
         * ---------------
         * 
         * T(a,b) = T(a-b) + c
         * = (T((a-b)-b) + c) + c
         * = T(a- 2b) + 2c
         * = (T((a-2b)-b) + c) + c
         * = T(a-3b) + 3c
         * = ........
         * Se tiene que b > a para retornar c, luego a/b < a
         * = T(a/b) + a/bc
         * = T(1) + (a/b)c
         * = c + ac/b
         * T(a,b) = a/b
         * O(a/b)
         */
    }

    public static int recursiveSumOfElements(int A[], int n) {
        if (n == 0)
            return A[0];
        return A[n - 1] + recursiveSumOfElements(A, n - 1);
        /*
         * --------------
         * T(n) = | c, n = 0
         * | T(n-1) + c
         * ---------------
         * 
         * T(n) = T(n-1) + c
         * = (T(n-2) + c) + c
         * = (T(n-3) + c) + 2c
         * = (T(n-4) + c) + 3c
         * = T(n-4) + 4c
         * = ................
         * = T(n-(n-1)) + (n-1)c
         * = T(1) + (n-1)c
         * = c + cn - c
         * T(n) = cn
         * O(n)
         */
    }

    // ii. Encontrar la posición del mayor valor en el array
    public static int largestElement(int array[], int element, int length) {
        if (length == 0)
            return element;
        if (element <= array[length-1])
            element = array[length-1];
        return largestElement(array,element,length-1);
        /*
         *         --------------
         * T(n) = | c, n = 0
         *        | T(n-1) + c
         *        ---------------
         * 
         * T(n) = T(n-1) + c
         *      = (T(n-2) + c) + c
         *      = (T(n-3) + c) + 2c
         *      = (T(n-4) + c) + 3c
         *      = T(n-4) + 4c
         *      = ................
         *      = T(n-(n-1)) + (n-1)c
         *      = T(1) + (n-1)c
         *      = c + cn - c
         *      T(n) = cn
         *      O(n)
         */
    }

    // iii. Invertir el array sobre el mismo
    public static int[] recursiveInvertArray(int A[], int length, int position) {

        if (position < length / 2) {

            // save the element at the current position
            int aux = A[position];
            // change the element in the current position to the element in the last
            // position
            A[position] = A[length - position - 1];
            // change the last element to aux
            A[length - position - 1] = aux;

            recursiveInvertArray(A, length, position + 1);
        }
        return A;
         /*
         *         --------------
         * T(n) = | c, n < n/2
         *        | T(n+1) + c
         *        ---------------
         * 
         * T(n) = T(n+1) + c
         *      = (T(n+2) + c) + c
         *      = (T(n+3) + c) + 2c
         *      = (T(n+4) + c) + 3c
         *      = T(n+4) + 4c
         *      = ................
         *      = T(n+(n+1)) + (n+1)c
         *      pero n < n/2 podemos decir que n == n
         *      = T(n) + (n+1)c
         * T(n) = c + (n+1)c
         * T(n) = c + cn + c
         * T(n) = cn + 2c
         * T(n) = cn + c
         * O(n)
         */
    }

    // iv. Encontrar el primer índice tal que A[i] sea igual a i
    public static int firstMatch(int array[], int length, int position) {
        if (position == length)
            return -1;
        if (position == array[position])
            return position;
        return firstMatch(array, length, position + 1);
    }

    // v. Con otro array B de tamaño n, construir un tercer array que contenga
    // la intersección de los dos arrays originales (elementos comunes).
    public static ArrayList<Integer> recursiveIntersection(int[] A, int[] B, int lengthA, int lengthB, int i, int j,
            ArrayList<Integer> l) {
        if (i < lengthA) {
            if (j < lengthB) {
                if (A[i] == B[j])
                    l.add(B[j]);
                return recursiveIntersection(A, B, lengthA, lengthB, i, j + 1, l);
            }
            j = 0;
            recursiveIntersection(A, B, lengthA, lengthB, i + 1, j, l);
        }
        return l;
    }

    public static void main(String[] args) {
        // System.out.println(recursiveAdd(5, 2));
        // System.out.println(recursiveDivision(15, 4));
        int[] array = { 5, 10, 2, 5, 78, 5, 8, 250, 11, 10, 25, 69, 30, 154, 15 };
        // System.out.println(recursiveSumOfElements(array, array.length));
        System.out.println(largestElement(array, array[0],array.length));
        // int a[] = recursiveInvertArray(array, array.length , 0);
        // for(int i: a ) System.out.print(i+", ");
        // int array2[] = { 3, 5, 5, 4, 4 };
        // System.out.println(firstMatch(array2, array2.length, 0));
        // int a[] = { 1, 2, 3, 5, 7 };
        // int b[] = { 5, 3, 2 };
        // // System.out.println(lol(a, b));
        // System.out.println(recursiveIntersection(a, b, a.length, b.length, 0, 0, new
        // ArrayList<Integer>()));
    }
}