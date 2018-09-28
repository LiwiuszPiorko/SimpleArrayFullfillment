import java.util.Random;
import java.util.Arrays;

public class Tablica {
    public static void main(String[] args) {

        int[] tab = new int[10];
        Random x = new Random();

        for (int i = 0; i < tab.length; i++) {

            tab[i] = x.nextInt(10);

            String something = Arrays.toString(tab);
            System.out.println(something);
        }
    }
}


