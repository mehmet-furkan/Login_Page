import java.util.Scanner;

public class rakamToplamıIteratif {
    public static int rakamToplaIteratif(int sayi) {
        int toplam = 0;

        while (sayi > 0) {
            int sonRakam = sayi % 10;
            toplam = toplam + sonRakam;
            sayi = sayi / 10;
        }
        return toplam;
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Bir sayi girin: ");
        int kullaniciSayisi = in.nextInt();

        int sonuc = rakamToplaIteratif(kullaniciSayisi);

        System.out.println("Rakamların toplamı: " + sonuc);
    }
}