package ornek_sorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class c26_soru {
    public static void main(String[] args) {
        /*
         * Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
         * 1-1-2-3-5-8-13-21-34....

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("bir tam sayi giriniz");
        int sayi=scan.nextInt();
        List<Integer> fibonachi=new ArrayList<>();
        int sayi1=0;
        int sayi2=1;
        int sayi3=0;
        fibonachi.add(0);
        fibonachi.add(1);
        while (sayi3<sayi){
            sayi3=sayi1+sayi2;
            if (sayi3>sayi)break;
            fibonachi.add(sayi3);
            sayi1=sayi2;
            sayi2=sayi3;
        }
        System.out.println(fibonachi);
    }
    }

