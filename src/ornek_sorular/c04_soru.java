package ornek_sorular;

import java.util.Scanner;

public class c04_soru {
    public static void main(String[] args) {
           /*
        Kullanicidan uslu sayi hesabi icin iki adet integer sayi isteyin. integer
donus tipli, iki argumanli bir uslu sayi hesaplama methodu olusturun.
Argumanlardan birini taban sayisi icin digerini ise ussu icin kullanin.
Islemin sonucunu main method’ dan verilen komutla yazdirin.
         */
        System.out.println(uslusayi());
    }public static double uslusayi(){
        Scanner scan=new Scanner(System.in);
        System.out.println("üssünü almak isteniğiniz sayiyi giriniz");
        double sayi=scan.nextInt();
        System.out.println("kac üssünü almak istersiniz");
        int us=scan.nextInt();
        double carpim=1;

        if (us==0){
            return 1;
        } else if (us>0) {
            for (int i = 0; i <us ; i++) {
                carpim*=sayi;
            }

            return carpim;
        }else for (int i = 0; i >us ; i--) {
            carpim*=sayi;
        }
        return 1/carpim;

    }
}



