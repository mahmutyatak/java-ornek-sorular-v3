package ornek_sorular;

public class c15_soru {
    public static void main(String[] args) {
           /*
           Bir sayinin mükemmel olup olmadiğini bulan
            bir method yaziniz.
        Mükemmel sayi :
        bir sayinin kendisi hariç bölenlerinin toplamı,
        kendisine eşitse o sayi mükemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (Mükemmel)

         */
        int sayi=15;
        int toplam=0;
        for (int i = 1; i <sayi ; i++) {
            if (sayi%i==0){
                toplam+=i;

            }
        }
        if (sayi==toplam){
            System.out.println("mukemmel sayi");
        }else System.out.println("mükemmel sayi degil");
    }
}



