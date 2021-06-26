import java.util.Scanner;

public class Tekrar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi giriniz");
        int ilkSayi= scan.nextInt();
        System.out.println("Bir sayi daha giriniz");
        int ikinciSayi = scan.nextInt();

        int toplam = ilkSayi+ikinciSayi;
        System.out.println("Girdiginiz sayilarin toplami = " + toplam);

        int carpim = ilkSayi*ikinciSayi;
        System.out.println("Girdiginiz sayilarin toplami = " + carpim);

        int fark = ilkSayi-ikinciSayi;
        System.out.println("Girdiginiz sayilarin toplami = " + fark);

        double bolum  = ilkSayi/ikinciSayi;
        System.out.println("Girdiginiz sayilarin toplami = " + bolum);
    }
}
