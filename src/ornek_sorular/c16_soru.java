package ornek_sorular;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class c16_soru {
    public static void main(String[] args) {
         /* kullanıcının istediği büyüklükte diziye 0-100 arası rastgele sayılarla
        doldurup kaçının ortalamanın altında,
        kaçının ortalamanın üzerinde olduğunu bulan metodu bulunuz

        */
        Scanner scan=new Scanner(System.in);
        System.out.println("ARRAYİN BOYUTUNU GİRİNİZ");
        int boyut=scan.nextInt();
        Random rnd=new Random();
        double ortalama=0;
        int toplam=0;
        int ust=0;
        int alt=0;
        int esit=0;

        int [] arr=new int[boyut];
        for (int i = 0; i <boyut ; i++) {
            arr[i]=rnd.nextInt(100);
            toplam+=arr[i];
        }
        System.out.println(Arrays.toString(arr));
        ortalama=toplam/boyut;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>=ortalama){
                ust++;
            }

        }
        System.out.println("ortalamanın üstünde "+ust+" sayı var\n"+
                "ortalamanın altında "+(boyut-ust)+" sayi var");

    }
    }

