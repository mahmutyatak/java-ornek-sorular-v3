package ornek_sorular;

import java.util.Scanner;

public class c11_soru {
    public static void main(String[] args) {
         /*
        Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore
carpim tablosu olusturun. Ornek,kullanici 3 girerse,
1 2 3
2 4 6
3 6 9
(ic ice for ile) [Zor seviye – Yapamazsaniz onemli deil.]
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi=scan.nextInt();
        for (int i = 1; i <=sayi ; i++) {
            for (int j = 1; j <=sayi ; j++) {
                System.out.print((i*j)+" ");
            }
            System.out.println("");
        }
    }
}

