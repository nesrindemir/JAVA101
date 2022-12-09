import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        int n;
        System.out.print("Basamak sayısını giriniz :");
        n= key.nextInt();
        for(int i=n; i>=0; i--){

            for (int a = 0; a < (n - i); a++) {
                System.out.print(" ");
            }
            for (int b = 1; b <= (2 * i + 1); b++) {
                System.out.print("*");
            }

            System.out.println(" ");

        }


    }
}
