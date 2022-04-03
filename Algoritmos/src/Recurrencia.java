import javax.lang.model.element.Element;

/**
 * Recurrencia
 */
public class Recurrencia {

    public static int recursiveAdd(int a, int b) {
        if (b == 1)
            return a;
        return a + recursiveAdd(a, b - 1);
    }

    public static int recursiveDivision(int a, int b) {
        if (b == 0)
            return -1;
        if (b > a)
            return 0;
        return 1 + recursiveDivision(a - b, b);
    }

    public static int recursiveSumOfElements(int A[], int n) {
        if (n == 0)
            return A[0];
        return A[n - 1] + recursiveSumOfElements(A, n - 1);
    }

    // ii. Encontrar la posición del mayor valor en el array
    public static int largestElement(int array[], int element, int position, int length) {
        if (position < length) {
            if (element <= array[position]) {
                element = array[position];
            }
            element = largestElement(array, element, position + 1, length);
        }
        return element;
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
    }

    // iv. Encontrar el primer índice tal que A[i] sea igual a i
    public static int firstMatch(int array[], int length, int position) {
        if(position == length) return -1;
        if(position == array[position]) return position;
        return  firstMatch(array, length, position+1);
    }

    //v.	Con otro array B de tamaño n, construir un tercer array que contenga 
    //la intersección de los dos arrays originales (elementos comunes).

    public static void main(String[] args) {
        // System.out.println(recursiveAdd(5, 2));
        // System.out.println(recursiveDivision(15, 4));
        //int[] array = { 5, 10, 2, 5, 78, 5, 8, 250, 11, 10, 25, 69, 30, 154, 15 };
        // System.out.println(recursiveSumOfElements(array, array.length));
        // System.out.println(largestElement(array, array[0], 0, array.length));
        // int a[] = recursiveInvertArray(array, array.length , 0);
        // for(int i: a ) System.out.print(i+", ");
        // int array2[] = { 3, 5, 5, 4, 4 };
        // System.out.println(firstMatch(array2, array2.length, 0));

    }
}