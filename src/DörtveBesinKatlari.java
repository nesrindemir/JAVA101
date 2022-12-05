import java.util.Scanner;
public class DörtveBesinKatlari {
    public static void main(String[] args) {
     int k;
     Scanner input=new Scanner(System.in);

     System.out.println("Sınır sayısını giriniz :");

        k=input.nextInt();
        int i=1;
        int y=1;
        while(i<k || y<k){

  if(i<k){

    System.out.println("dördün katları :"+i);
  }
  i*=4;
       if(y<k){
        System.out.println("besin katları :"+y);

       }
      

       
          y*=5;  
        }
        input.close();
    }
}
