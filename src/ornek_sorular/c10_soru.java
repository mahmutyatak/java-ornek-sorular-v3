package ornek_sorular;

import java.util.Scanner;

public class c10_soru {
    public static void main(String[] args) {
         /*
         Kullanicidan toplamak icin sayi isteyin ve sayilarin toplami 500’e
ulasincaya kadar sayi istemeye devam edin. Toplam 500’e ulastiginda
veya gectiginde sayilarin toplami ve kac sayi girildigini yazdirin.(do while
dongusu ile)
         */
        Scanner scan=new Scanner(System.in);
        int sayi;
        int toplam=0;
        int sayac=0;

        do {
            System.out.println("toplamak istediğiniz sayiyi giriniz ");
            sayi=scan.nextInt();
            if (toplam>=499)break;
            toplam+=sayi;
            sayac++;

        }while (toplam<=499);
        System.out.println(sayac+" tane sayinin toplam :"+toplam);
    }
}


