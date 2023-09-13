import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] meuArray1={
                1789,2035,1899,1456,2013,
                1458,2458,1254,1472,2365,
                1456,2156,1457,2456
        };
        String[] meuArray2= {
            "Java",
            "Python",
            "PHP",
            "C#",
            "C Programming",
            "C++"
        };
        System.out.println("Essa é a lista desordenada: "+(Arrays.toString(meuArray1)));
        Arrays.sort(meuArray1);
        System.out.println("Essa é a lista ordenada: "+(Arrays.toString(meuArray1)));
        System.out.println("Essa é a lista de linguagens desordenadas: "+(Arrays.toString(meuArray2)));
        Arrays.sort(meuArray2);
        System.out.println("Essa é a lista de linguagens ordenadas: " + Arrays.toString(meuArray2));
    }
}