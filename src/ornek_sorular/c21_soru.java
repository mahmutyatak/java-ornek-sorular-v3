package ornek_sorular;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

public class c21_soru {
    public static void main(String[] args) {
         /*
        Elinizde bir miktar farklı boylarda somun ve bu somunlara uyacak civatalar olsun.
Civataları somunlara eşlemek için nasıl bir algoritma yazarsınız.
int somun[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
      int civata[] = { 3, 6, 5, 7, 79, 9, 3, 1, 33 };
         */
        int somun[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int civata[] = { 3, 6, 5, 7, 79, 9, 3, 1, 33 };
        List<Integer> uygunSomun=new ArrayList<>();

        for (int i = 0; i <somun.length ; i++) {
            for (int j = 0; j <civata.length ; j++) {
                if (somun[i]==civata[j]){
                    if (!uygunSomun.contains(somun[i]))
                        uygunSomun.add(somun[i]);
                }
            }

        }
        System.out.println("uygun civatası olan somunlar :"+uygunSomun);
    }
}
