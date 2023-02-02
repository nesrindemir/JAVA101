import java.util.Arrays;
import java.util.Scanner;
public class MaxMinDegerleri {
    public static void main(String[] args) {
        int number; System.out.println("Bir sayi giriniz :");
        Scanner input= new Scanner(System.in);
        number= input.nextInt();
        int min;
        int max;
        int [] list={-1,75,15,-25,6,45,112,number};


        Arrays.toString(list);
        System.out.println(Arrays.toString(list));//diziyi yazdırmak için kullanıyoruz.
        Arrays.sort(list);//diziyi küçükten büyüğe sıralıyor.
        System.out.println(Arrays.toString(list));

        int index=Arrays.binarySearch(list,number);//listedeki index numarasını  bulmak için kullanıyoruz.
        min=list[index-1];
        max=list[index+1];
        System.out.println("en yakın minimum sayı :"+min);
        System.out.println("en yakın maximum sayı :"+max);

    }
}
