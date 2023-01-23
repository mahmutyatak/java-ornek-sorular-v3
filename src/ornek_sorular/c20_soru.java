package ornek_sorular;

public class c20_soru {
    public static void main(String[] args) {
          /*
        1-Kullanıcı tarafından girilen string
          ifadenin içindeki sayısal değerleri toplayan metodu yazınız

         */
        String str="sdjkhfkjshdg12536987sajhsbhjb";

        int toplam=0;
        for (int i = 0; i <str.length() ; i++) {
            if (Character.isDigit(str.charAt(i))){
                toplam+=Integer.parseInt(str.substring(i,i+1));
            }
        }
        System.out.println(toplam);
        toplam=0;
        str=str.replaceAll("\\D","");
        String [] arr=str.split("");
        for (int i = 0; i <arr.length ; i++) {
            toplam+=Integer.parseInt(arr[i]);

        }
        System.out.println(toplam);
    }
}
