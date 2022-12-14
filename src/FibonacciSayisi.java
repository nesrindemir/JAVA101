import java.util.Scanner;

public class FibonacciSayisi {
    public static void main(String[] args) {
        int a, b = 1, sonuc = 0;



        for(int i = 0; i<10; i++){

            a = b;
            b = sonuc;
            sonuc = a + b;

            System.out.println(sonuc);

        }
    }
}
