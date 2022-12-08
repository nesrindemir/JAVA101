
import java.util.Scanner;
public class AtmProjesi {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String username,password;
        int right=3;
        int select;
        double balance=0,price;

        while (right>0){
            System.out.print("Kullanıcı adını giriniz :");
            username=input.next();
            System.out.print("Şifrenizi giriniz :");
            password= input.next();

            if (username.equals("patikaDev")&&password.equals("dev1234")){
                System.out.println("Sisteme giriş yaptınız!");
               do {

                   System.out.println("1 -Para Yatırma\n" +
                           "2 -Para Çekme\n" +
                           "3 -Bakiye Sorgulama\n" +
                           "4 -Çıkış Yap");
                   System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz :");

                    select= input.nextInt();

                   switch (select) {
                       case 1 -> {

                           System.out.print("Para miktarı :");
                           price = input.nextDouble();
                           balance += price;

                           break;
                       }
                       case 2 -> {
                           System.out.print("Para miktarı  :");
                           price = input.nextDouble();
                           if (balance < price) {
                               System.out.println("Bakiyeniz yetersiz");
                           } else {
                               balance -= price;
                           }
                           break;
                       }
                       case 3 -> {
                           System.out.println("Bakiyeniz :" + balance);
                           break;
                       }
                   }

               }while(select!=4);
                System.out.println("Tekrar görüşmek üzere!...");
                break;

            }else{
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if(right==0){
                    System.out.println("hesabınız bloke olmuştur.Banka ile iletişime geçiniz!");

                }else{
                System.out.println("Kalan Hakkınız :"+right);
                }
            }


        }


    }
}
