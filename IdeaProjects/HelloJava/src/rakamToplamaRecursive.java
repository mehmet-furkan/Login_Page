import java.util.Scanner;

public class rakamToplamaRecursive {
    public static int rakamToplaRecursive(int sayi) {
        int toplam = 0;

        if (sayi == 0){
            return 0;
        }
        else {
            return (sayi % 10) + rakamToplaRecursive(sayi / 10);
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int kullaniciSayisi = input.nextInt();

        int sonuc = rakamToplaRecursive(kullaniciSayisi);

        System.out.println("Rakamların toplamı: " + sonuc);
    }
}