import java.util.Scanner;
public class YildizlarlaElmasYapimi {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int n;
        System.out.print("satır sayısını giriniz :");
        n = key.nextInt();


        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }

            System.out.println(" ");

        }

        for (int l = (n-1); l >= 0; l--) {

            for (int a = 0; a < (n - l); a++) {
                System.out.print(" ");
            }
            for (int b = 1; b <= (2 * l + 1); b++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }

     }
}

