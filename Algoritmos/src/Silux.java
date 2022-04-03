
import java.util.ArrayList;
import java.util.Scanner;

public class Silux {


    public static int funtion(int n) {
        if(n%2==0) return n/2;
        else return -1*((n+1)/2);
    }

    public static int[] count(String input) {
        int[] valores = new int[3];
        
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == 49) valores[0]+= 1;
            if(input.charAt(i) == 50) valores[1] += 1;
            if(input.charAt(i) == 51) valores[2] += 1;
        }
        return valores;
    }
    public static String str(String input) {
        String re = "";
        int[] count = count(input);

        for (int i = 0; i < count.length; i++) {
            String aux = "";
            switch(i){
                case 0: 
                    aux = "1+";
                break;
                case 1:
                    aux="2+";
                    break;
                case 2:
                    aux = "3+";
                    break;
            }

            aux = aux.repeat(count[i]);
            re += aux;

        }

        return re.substring(0, re.length()-1);
    }

    public static String wayLongWord(String word) {
        int length = word.length();
        if(length<=10) return word;
        return word.charAt(0)+""+(length-2)+""+word.charAt(length-1);
    }

    public static int capacity(int pi, int qi) {
        return pi<qi? 1: 0;
    }

    public static int bitLand(String statement) {
        return (statement.equalsIgnoreCase("++x") || statement.equalsIgnoreCase("x++")) ? 1 : -1;  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print(funtion(6));
        String input = "1+3+3+2+1+2+3+1";
        System.out.println(str(input.replace("+", "")));
    
       /*System.out.println(wayLongWord("word"));
        System.out.println(wayLongWord("localization"));
        System.out.println(wayLongWord("internationalization"));
        System.out.println(wayLongWord("pneumonoultramicroscopicsilicovolcanoconiosis"));*/
        /*int rooms = 3;
        int sum  = 0;
        while (rooms-- > 0) {
            int pi = sc.nextInt();
            int qi = sc.nextInt();
            sum += capacity(pi, qi);
        }
        System.out.println(sum);*/

        /*int input = 5;
        int sum = 0;
        while (input-- > 0) {
            String statement = sc.nextLine();
            sum += bitLand(statement);
        }
        System.out.println(sum);*/

        ArrayList<Integer> numbers = new ArrayList<>();

    }
}
