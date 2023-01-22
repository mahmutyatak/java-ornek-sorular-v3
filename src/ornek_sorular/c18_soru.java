package ornek_sorular;

public class c18_soru {
    public static void main(String[] args) {
         /*
        String' lerden oluşan bir arrayde öğeler
        'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini ekrana yazdıran metodu yazınız.
                Örnek: { "Kemal", "Jonathan", "Mark", "Jackson", "Ali" } ==> Çıktı JMJ
         */
        String [] str={ "Kemal", "Jonathan", "Mark", "Jackson", "Ali" };
        basharf(str);

    }public static void basharf(String [] str){
        String basharf="";
        for (int i = 0; i <str.length ; i++) {
            if (str[i].endsWith("n")||str[i].endsWith("k")){
                basharf+=str[i].charAt(0);
            }
        }
        System.out.println(basharf);
    }
    }

