import java.util.Scanner;
public class recursiveUsalma {
    static int power(int base,int exponent){
        while(exponent==0){
            return 1;
        }
        int result=1;
        for(int i=1;i<=exponent;i++){
            result*=base;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("taban sayısını giriniz:");
        int base= scan.nextInt();
        System.out.print("üs sayısını giriniz :");
        int exponent =scan.nextInt();
        System.out.println(power(base,exponent));
    }
}
