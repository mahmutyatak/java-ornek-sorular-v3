package ornek_sorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class c28_soru {

        static List<String> urunList=new ArrayList<>(Arrays.asList("Portakal","Mandalina","Elma","Ispanak","Muz"));
        static List<Integer> fiyatList=new ArrayList<>(Arrays.asList(10,12,15,10,18));


        public static void main(String[] args) {

            /* * Basit bir 5 ürünlü manav alisveris programi yaziniz.
             *
             * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor. 2. Adim :
             * Baska bir urun almak isteyip istemedigini sor. istemiyorsa toplam miktari
             * goster, istiyorsa tekrar urun sectir. Bu islemi alisverisi bitirmek isteyene
             * kadar tekrarla. 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini
             * toplam fiyata ekle. 4. Adim : Alisveris bitince toplam odemesi gereken tutari
             * goster.

             */
            System.out.println("Alisverisiniz toplami :"+toplam());


        }public static int toplam(){
            Scanner scan=new Scanner(System.in);
            int sayac=1;
            int toplam=0;
            System.out.println("secmek istediginiz urunun numarasını giriniz");
            for (int i = 0; i <urunList.size() ; i++) {
                for (int j = i; j <=i ; j++) {
                    System.out.println(sayac+"."+urunList.get(i)+" :"+ fiyatList.get(j)+" TL");
                }
                sayac++;
            }

            int numara=scan.nextInt();
            System.out.println("kac kilo istersiniz");
            int kilo=scan.nextInt();
            toplam+=fiyatList.get(numara-1)*kilo;
            System.out.println("Alisverise devam etmek isterseniz \"'e\"' ye istemzseniz \"'h\"' ye basiniz" );
            String str=scan.next();

            if (str.equalsIgnoreCase("E")){
                return toplam();
            }
            return toplam;
    }
}
