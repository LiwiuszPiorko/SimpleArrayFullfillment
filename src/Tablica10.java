import java.util.Random;
import java.util.Arrays;

public class Tablica10 {
    public static void main(String[] args) {

        int[]tab = new int[10];
        Random x = new Random();
        for (int i = 0; i<10; i++) {

            tab[i] = x.nextInt(10);
        }

        String tablica = Arrays.toString(tab);
        System.out.println(tablica);
    }

}

