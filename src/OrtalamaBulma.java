import java.util.Scanner;

public class OrtalamaBulma {
    public static void main(String[] args) {
      int sayi;
      double ortamala=0,toplam=0,sayac=0;


        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        sayi=input.nextInt();

       for(int i=1;i<=sayi;i++){
        if((i%3==0) && (i % 4==0)){
         sayac+=1;
         toplam+=i;
         System.out.println("3 ve 4 ile bölünebilen sayılar :" +i);
        }
      
        ortamala=  toplam/sayac;

       }

       System.out.println("ortalama :"+ortamala);
       System.out.println("toplam :"+toplam);
       input.close();
    }
    
}
