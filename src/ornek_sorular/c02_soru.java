package ornek_sorular;

public class c02_soru {
    public static void main(String[] args) {
          /*
        2) ”InfotechAcademy1234...!’^.+” String ifadesinde,
a.kac harf
b.kac rakam
c.kac ozel karakter oldugunu ekrana yazdıran
karakterSay() metodunu yazınız.
         */

        String str="iNfotechAcademy1234...!’^.+";
        karakterSay(str);
    }public static void karakterSay(String str){
        int harf=0;
        int rakam=0;
        int karakter=0;
        str=str.toLowerCase();

        for (int i = 0; i <str.length() ; i++) {
            if (Character.isDigit(str.charAt(i))){
                rakam++;
            }
            if (str.charAt(i)>='a' && str.charAt(i)<='z'){
                harf++;
            }
            if (!Character.isLetterOrDigit(str.charAt(i))){
                karakter++;
            }

        }

        System.out.println(rakam+" "+harf+" "+karakter);

    }
}


