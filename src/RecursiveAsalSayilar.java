import java.util.Scanner;
public class RecursiveAsalSayilar {
    static int asallar(int sayi){
         int sonuc=0;
         int sayac=0;
        for(int i=1;i<=sayi; i++){
            sonuc=sayi%i;
            sayac++;
        }
        if(sayac>2 && sonuc!=0){
            System.out.println(sayi + " sayısı asal değildir.");
        }else
            System.out.println(sayi+ " sayısı asaldır");

       return sayi;
    }


    public static void main(String[] args) {
        int sayi;
        Scanner scan =new Scanner(System.in);
        System.out.print("Bir sayi giriniz :");
        sayi= scan.nextInt();
        asallar(sayi);
    }

}
