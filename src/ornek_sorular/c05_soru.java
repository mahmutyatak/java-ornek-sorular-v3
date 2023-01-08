package ornek_sorular;

import java.util.Scanner;

public class c05_soru {
    public static void main(String[] args) {
          /*
      Kullanıcıdan aldıgınız 5 b
      asamaklı sayının rakamlarının toplamını
yazdıran programi for döngüsü ile yazınız.
       */
        Scanner scan=new Scanner(System.in);
        System.out.println("rakamlarını toplamak istediginiz 5 basamkli sayiyiyi giriniz");
        int sayi=scan.nextInt();

        int birlerbasamagi=0;
        int rakamlarToplami=0;
        for (int i = 0; i <5 ; i++) {
            birlerbasamagi=sayi%10;
            rakamlarToplami=rakamlarToplami+birlerbasamagi;
            sayi=sayi/10;
        }
        System.out.println(rakamlarToplami);
    }
}

