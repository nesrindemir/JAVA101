import java.util.Scanner;
public class CiftSayilarinToplami {
    public static void main(String[] args) {
      int k,toplam=0;

      Scanner scan = new Scanner(System.in);
      do {
        System.out.println("Bir sayi giriniz :");
        k=scan.nextInt();
        if((k%2==0)&&(k%4==0)){
            toplam+=k;
        }
        
      } while (k%2==0);
        
        System.out.println("sayilarin toplamaı= "+toplam);

    }
    
}
