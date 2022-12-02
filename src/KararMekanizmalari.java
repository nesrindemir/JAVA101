
import java.util.Scanner;

public class KararMekanizmalari {
    public static void main(String[] args) {
        int sayi;

        Scanner input = new Scanner(System.in);
    
      System.out.print("sayi giriniz :");  
      sayi=input.nextInt();
      int i=1;
      while(i<=sayi){

        if(i%2==0){

           System.out.println(i);

        }
        i++;
      }
      
  
      input.close();

    }
    
 
}
