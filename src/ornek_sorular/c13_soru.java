package ornek_sorular;

public class c13_soru {

        public static void main(String[] args) {
            // 0-255 e kadar olan harflerin ,
            // sayı ve harf değerini konsola yazdırınız.

            for (char i = 0; i <255 ; i++) {
                if ((i>='a' && i<='z')||i>='A' && i<='Z')
                    System.out.print(i+" "+(int)i+" ");
            }
        }
    }


