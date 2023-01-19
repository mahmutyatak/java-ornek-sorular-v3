package ornek_sorular;

public class c14_soru {
    /*
     Girilen bir stringdeki a harfi sayısını bulunuz.
      ama c harfine gelirse
* döngüden çıkılsın
*
* Bugün hava oldukca güzel.-> 2

       */
    public static void main(String[] args) {
        String str="Bugun hava oldukca guzel";
        int count=0;
        for(int i = 0; i <str.length() ; i++) {
            if (str.substring(i,i+1).equalsIgnoreCase("a")){
                count++;
            }if (str.substring(i,i+1).equalsIgnoreCase("c"))break;
        }
        System.out.println(count);
    }
    }


