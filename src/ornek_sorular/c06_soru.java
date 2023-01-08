package ornek_sorular;

import java.util.Scanner;

public class c06_soru {
    public static void main(String[] args) {
            /*
        Kullanicidan baslangic ve bitis degerlerini alin.
        Baslangic degeri ve bitis
degeri dahil aradalarindaki tum cift tamsayilari
 while loop kullanarak
ekrana yazdiriniz.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("baslangic degeri");
        int bas=scan.nextInt();
        System.out.println("bitis değeri");
        int bit=scan.nextInt();

        while (bas<=bit){
            if (bas%2==0){
                System.out.print(bas+" ");
            }
            bas++;
        }
    }
}
