import java.util.Scanner;
public class basamakToplamlari {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int number;
        int tempNumber;
        System.out.println("Bir sayı giriniz:");
        number=scan.nextInt();
        tempNumber=number;
        int basValue;
        int total=0;
        while(tempNumber !=0){

              basValue = tempNumber % 10;

              number/=10;
              tempNumber=number;
              System.out.println(basValue);
              total+=basValue;

        }
        System.out.println("basamak değeri toplamı :"+total);
    }
}
