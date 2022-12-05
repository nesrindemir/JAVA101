import java.util.Scanner;
public class Kombinasyon {
    public static void main(String[] args) {

        int n,r,nr=0;
        double kombinasyon;
        int ntoplam=1,rtoplam=1,nrtoplam=1;
        Scanner input = new Scanner(System.in);
        System.out.println("kombinasyonu hesaplanacak sayıyı giriniz :");
        n=input.nextInt();
        System.out.println("r sayısını giriniz :");
        r= input.nextInt();
        if(n>r){
            nr=n-r;
        }
        for (int i=1 ;i<=n ; i++){

            ntoplam =ntoplam*i;




        }
        for(int j=1 ;j<=r;j++){

            rtoplam=rtoplam*j;
        }

        for(int i=1;i<=nr; i++){
            nrtoplam*=i;

        }

        kombinasyon=ntoplam/(rtoplam*nrtoplam);

        System.out.println("kombinasyon  :"+kombinasyon);




    }
}
