package ornek_sorular;

import java.util.Scanner;

public class c08_soru {
    public static void main(String[] args) {
         /*
        Kullanicidan toplamak uzere pozitif sayilar isteyin,
        islemi bitirmek icin
0’a basmasini soyleyin.
Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini ve girdigi pozitif
sayilarin toplaminin kac oldugunu yazdirin.(do while dongusu ile)
         */
        Scanner scan=new Scanner(System.in);
        int sayi;
        int toplam=0;
        int sayac=0;

        do {
            System.out.println("toplamak istediğiniz sayiyi giriniz cikmak için 0 a basınız");
            sayi=scan.nextInt();
            if (sayi==0)break;
            toplam+=sayi;
            sayac++;

        }while (sayi!=0);

        System.out.println(sayac+" tane sayinin toplam :"+toplam);
    }
}
