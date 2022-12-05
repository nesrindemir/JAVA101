import java.util.Scanner;
public class Faktoryel {
    public static void main(String[] args) {
        int n,faktoryel=1;
//n!=1*2*3*4....*n
        Scanner scan= new Scanner(System.in);
        System.out.println("bir sayi giriniz :");
        n=scan.nextInt();
        for (int i=1 ;i<=n; i++){

            faktoryel=faktoryel*i;
            System.out.println(faktoryel);
        }


    }
}

