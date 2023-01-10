package ornek_sorular;

import java.util.Scanner;

public class c07_soru {
    public static void main(String[] args) {
          /*
        Kullanicidan bir sayi alin ve
        bu sayiyi tam bolen sayilari ve toplam kac
tane olduklarini ekranda yazdirin.(while dongusu ile)
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi=scan.nextInt();

        int bolen=1;
        int sayac=0;
        while (bolen<=sayi){
            if (sayi%bolen==0){
                System.out.print(bolen+" ");
                sayac++;
            }

            bolen++;
        }
        System.out.print(" "+sayac+" tane sayi");
    }
}


