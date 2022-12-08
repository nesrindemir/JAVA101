import  java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        int n1,n2,a,b = 0,ebob=0,ekok=0;
        System.out.println("birinc sayıyı  giriniz :");
        n1=key.nextInt();
        System.out.println("ikinci sayiyi giriniz :");
        n2= key.nextInt();
         if(n1<n2){
             a=n1;
             b=n2;
         }else if(n2<n1){
             a=n2;
             b=n1;
         }else{
             a=n1=n2;
         }
        //System.out.println(a+" "+b);

        int i=a;
        while (i>0){
            if(a % i==0 && b % i==0){
                ebob=i;
                System.out.println("ebob :"+ebob);
                break;
            }
            i--;

        }
        int k=1;
        while (k<=n1){
            ekok=n1*n2/ebob;
            System.out.println("ekok :"+ekok);
            break;

        }
     k++;

    }
}
