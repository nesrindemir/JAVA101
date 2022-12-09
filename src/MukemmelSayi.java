import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner getValue =new Scanner(System.in);
        //System.out.println("bir sayi giriniz  : ");
         int number=0;
        int n=getValue.nextInt();
        for(int i =1; i<n;i++){

            if(n%i==0){
               System.out.println(i);
                number+=i;

            }

        }
        if(number==n){
            System.out.println(n + " mükemmel sayıdır.");
        }else{
            System.out.println(n +" mükemmel sayı değildir.");
        }

    }
}
