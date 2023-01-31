package ornek_sorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class c31_soru {
    public static void main(String[] args) {
        /*
    10 kişilik bir sınıftaki öğrencilerin bir dersine ait vize ve
    final not bilgileri klavyeden giriş yapılacaktır
            (Uygun bir dizi tanımlanıp bilgiler diziye aktarılacak);
    a. Her öğrencinin ortalamasını bulup ekrana yazdırınız(ortalama=vize*0.4+final*0.6).
    b. Vizesi 50 den küçük olan öğrencilerin final notlarını ekrana yazdırınız.
            c. Ortalaması 70 den buyuk olanlar için ekrana “Geçti”, eşit
    ve ya kucuk olanlar için “Kaldı” yazdırınız.
            d. Vizesi 60-70 arası olup Finali 70 den büyük olan öğrencilerin notlarını
    ekrana yazdırınız ve kaç adet olduğunu bulup ekrana yazdırınız.

         */

        List<Integer> vize = new ArrayList(Arrays.asList(80, 65, 90, 40, 20, 50, 68, 15, 62, 70));
        List<Integer> final1 = new ArrayList(Arrays.asList(100, 80, 40, 15, 25, 60, 80, 90, 100, 10));

        double ortalama = 0;
        int sayc = 1;
        int sayma = 1;
        for (int i = 0; i < vize.size(); i++) {
            ortalama = vize.get(i) * 0.4 + final1.get(i) * 0.6;
            System.out.println(sayc + " .ogrenci not ortalaması :" + ortalama);
            sayc++;


        }
        System.out.println("----------------");
        for (int i = 0; i < vize.size(); i++) {
            sayma++;
            if (vize.get(i) < 50) {
                System.out.println(sayma + " .ogrenci fianl notu :" + final1.get(i));
            }

        }
        System.out.println("-------------");
        sayc = 0;
        for (int i = 0; i < vize.size(); i++) {
            ortalama = vize.get(i) * 0.4 + final1.get(i) * 0.6;
            sayc++;
            if (ortalama <= 70) {
                System.out.println(sayc + " .ogrenci not ortalaması :" + ortalama + " kaldi");
            } else {
                System.out.println(sayc + " .ogrenci not ortalaması :" + ortalama + " gecti");
            }


        }
        System.out.println("---------------------");
        sayma = 0;
        sayc = 0;
        for (int i = 0; i < vize.size(); i++) {
            sayma++;
            if ((vize.get(i) > 60 && vize.get(i) < 70) && final1.get(i) > 70) {
                System.out.println(sayma + " .ogrenci notları vize :" + vize.get(i) + " final :" + final1.get(i) + " adet :");
                sayc++;
            }

        }
        System.out.println(sayc+" ogrenci");
    }
}
