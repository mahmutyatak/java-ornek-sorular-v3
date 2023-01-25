package ornek_sorular;

import java.util.ArrayList;
import java.util.List;

public class c22_soru {
    public static void main(String[] args) {
        /*
        Verilen bir arrayin elemanlarını ardışık toplamını hesaplayan metodu yazınız
input={ 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
output={3, 5+1, 2+7+9, 2+3+5+7}
       {3,  6,   18,     17}
         */
        int [] arr={ 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 };
        int toplam=0;
        int sayi=0;
        List<Integer> toplamlar=new ArrayList<>();
        for (int i = 0; i <arr.length ; i+=sayi) {
            for (int j = i; j <=i+sayi ; j++) {
                toplam+=arr[j];

            }
            toplamlar.add(toplam);
            sayi++;
            toplam=0;
        }
        System.out.println(toplamlar);
    }
}
