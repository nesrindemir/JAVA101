import java.util.Scanner;
public class Girilensayiyakadar2ininkatlari {

    public static void main(String[] args) {
        int k;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");

        k=input.nextInt();
        for(int i=1;i<k; i*=2){
        System.out.println(i);

        }

        
    }
}