import java.util.Scanner;

public class UsluSayilar {
    public static void main(String[] args) {

        int n,k,total=1;
        Scanner input=new Scanner(System.in);
        System.out.println("üssü alınacak sayı  :");
        n=input.nextInt();
        System.out.println("üs olacak sayı  :");
        k=input.nextInt();

        for(int i=1; i<=k;i++){

            total*=n;


        }
        System.out.println("cevap :"+total);
    }
}
