
import java.util.Scanner;

public class OgrenciNotDegerlendirme {

    public static double calculateAverage (int vize_notu, int final_notu, int odev_notu) {
        double ortalama = vize_notu * 0.3
                + final_notu * 0.4
                + odev_notu * 0.3;
        return ortalama;
    }
    public static boolean isPasssingGrade(double ortalama) {
        if (ortalama >= 50) {
            return true;
        }
        else  {
            return false;
        }

    }
    public static String getLetterGrade(double ortalama) {
        String letterGrade = "";
        if (ortalama >= 90 && ortalama <= 100) {
            letterGrade = "A";
        }
        else if (ortalama >= 80 && ortalama < 90) {
            letterGrade = "B";
        }
        else if (ortalama >= 70 && ortalama < 80) {
            letterGrade = "C";
        }
        else if (ortalama >= 60 && ortalama < 70) {
            letterGrade = "D";
        }
        else {
            letterGrade = "F : Mal mısın olm git biraz ders çalış!!!";
        }
        return letterGrade;
    }
    public static boolean isHonorList(double ortalama, int vize_notu, int final_notu, int odev_notu) {
        if (ortalama >= 85 && vize_notu >= 70 && final_notu >= 70 && odev_notu >= 70) {
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean hasRetakeRight(double ortalama){
        if (ortalama >= 40 && ortalama < 50) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int vize_notu, final_notu, odev_notu;

        System.out.println("Vize notunuzu giriniz: ");
        vize_notu = input.nextInt();
        System.out.println("Final notunuzu giriniz: ");
        final_notu = input.nextInt();
        System.out.println("Odev notunuzu giriniz: ");
        odev_notu = input.nextInt();


        System.out.println("========== ÖĞRENCİ NOT RAPORU ==========");
        System.out.println("Vize notu     : " + vize_notu);
        System.out.println("Final notu    : " + final_notu);
        System.out.println("Ödev notu     : " + odev_notu);
        System.out.println("----------------------------------------");
        double ortalama = calculateAverage(vize_notu, final_notu, odev_notu);
        System.out.println("Ortalama      : " + ortalama);
        System.out.println("Harf Notu     : " + getLetterGrade(ortalama));
        System.out.println("Durum         : " + (isPasssingGrade(ortalama) == true ? "GEÇTİ" : "GEÇEMEDİ"));
        System.out.println("Onur Listesi  : " + (isHonorList(ortalama, vize_notu, final_notu, odev_notu) == true ? "EVET" : "HAYIR"));
        System.out.println("Bütünleme     : " + (hasRetakeRight(ortalama) == true ? "VAR" : "YOK"));
    }

}
