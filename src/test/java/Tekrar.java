import java.util.Scanner;

public class Tekrar {
    public static void main(String[] args) {

        do {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi giriniz");
        int ilkSayi= scan.nextInt();
        System.out.println("Bir sayi daha giriniz");
        int ikinciSayi = scan.nextInt();
        

        System.out.println("Islem seciniz");
        String islem = scan.next();
        int sonuc = 0;



            if (islem.equals("+")) {
                sonuc = ilkSayi + ikinciSayi;

            }
            if (islem.equals("-")) {
                if (ilkSayi >= ikinciSayi) {
                    sonuc = ilkSayi - ikinciSayi;

                } else {
                    sonuc = ikinciSayi - ilkSayi;
                }
            }

            if (islem.equals("*")) {
                sonuc = ilkSayi * ikinciSayi;
            }
            if (islem.equals("/")) {
                sonuc = ilkSayi / ikinciSayi;
            }
            System.out.println("Sonuc = " + sonuc);
        }while (true);
    }
}
