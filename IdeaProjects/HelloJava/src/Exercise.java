import java.util.Scanner;
public class Exercise {
    public static void printAmerican( String haftaninGunu, String month, int day, int year){
        if (( day > 0 && year > 0 ) && (day < 32 && year < 2026)){
        }
        System.out.printf("%s, %s %d, %d \n", haftaninGunu, month, day, year);

    }
    public static void printEuropean(int day, String month, int year, String day_name){
        if (( day > 0 && year > 0 ) && (day < 32 && year < 2026)){
        }
        System.out.printf("%d %s %d, %s \n",day ,month ,year ,day_name);
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int gun, yil;
        String gunAdi, ay;
        System.out.println("Gün: ");
        gun = keyboard.nextInt();
        System.out.println("Ay: ");
        keyboard.nextLine();
        ay = keyboard.nextLine();
        System.out.println("Yil: ");
        yil = keyboard.nextInt();
        System.out.println("Gunun Adi: ");
        gunAdi =  keyboard.next();

        printEuropean(gun ,ay , yil, gunAdi);

        printAmerican(gunAdi, ay, gun, yil);
    }

}
