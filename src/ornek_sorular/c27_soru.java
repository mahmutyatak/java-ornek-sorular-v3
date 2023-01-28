package ornek_sorular;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class c27_soru {
    public static void main(String[] args) {
         /*
        Girilen desimal değeri
        // binary(0,1) değere çeviren metodu oluşturunuz.
//Örnek: 12 = 1 1 0 0
         */
        int sayi=100;
        List<Integer> binary=new ArrayList<>();
        while (sayi>=1){
            binary.add(sayi%2);
            sayi=sayi/2;
        }
        Collections.reverse(binary);
        System.out.println(binary);
    }
}
