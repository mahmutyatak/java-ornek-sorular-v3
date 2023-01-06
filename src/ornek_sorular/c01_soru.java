package ornek_sorular;

import java.util.Scanner;

public class c01_soru {
    public static void main(String[] args) {
          /*
         1)Kullanicidan e mail hesabini girmesini isteyiniz. Bu e mail’ i
olusturacaginiz method' a arguman olarak gonderip asagidaki kurallara
gore e mail kontrolu yapiniz.

-@ isareti icermiyorsa “gecersiz email” yazdirin
-@gmail icermiyorsa  yazdirin
-@gmail.com ile bitmiyorsa “Yazimda bir sorun var, maili kontrol ediniz”
yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        boolean gmail = true;
        while (gmail) {
            System.out.println("lütfen gecerli email adresinizi giriniz");
            String email = scan.nextLine();
            if (sifretekrari(email)){
                System.out.println("giris basarili");
                gmail=false;
            }


        }
    }public static boolean sifretekrari(String email){
        int flag=0;
        if (!email.contains("@")){
            System.out.println("gecersiz email");
            flag++;
        }if (!email.contains("@gmail")){
            System.out.println("g mail olmali");
            flag++;
        }if (!email.endsWith("@gmail.com")){
            System.out.println("Yazimda bir sorun var, maili kontrol ediniz");
            flag++;
        }if (flag==0){
            return true;
        }else return false;

    }
}

