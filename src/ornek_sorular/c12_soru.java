package ornek_sorular;

public class c12_soru {
    public static void main(String[] args) {
        //100'den 0'a kadar 13'e tam bölünebilen sayıları ve
        // toplamlarını ekrana yazdırınız (büyükten küçüğe)
        int toplam=0;

        for (int i = 100; i >=0 ; i--) {
            if (i%13==0){
                toplam+=i;
                System.out.print(i+" ");
            }
        }
        System.out.print("sayilarin tplami :"+toplam);
    }
}
