import java.util.Scanner;

public class FizikFormülAsistani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double gravity = 9.81;

        System.out.println("Yapmak istediginiz formül hesabını secin: ");
        System.out.println("1: Hız ");
        System.out.println("2: İvme ");
        System.out.println("3: Kuvvet ");
        System.out.println("4: İş ");
        System.out.println("5: Güç ");
        System.out.println("6: Kinetik Enerji ");
        System.out.println("7: Potansiyel Enerji ");
        System.out.println("8: Momentum ");
        System.out.print("Seçiminiz (1, 2, 3, 4, 5, 6, 7, 8): ");

        int secim = input.nextInt();

        if (secim == 1) {
            System.out.print("Enter substituion: ");
            double substituion = input.nextDouble();
            System.out.print("Enter time: ");
            double time = input.nextDouble();
            double velocityResult = calculated_velocity(substituion, time);
            System.out.println("Calculated velocity (v = x/t): " + velocityResult + "m/s");
        }

        else if (secim == 2) {
            System.out.print("Enter the change in velocity (Δv): ");
            double velocity_change = input.nextDouble();
            System.out.print("Enter elapsed time (time): ");
            double time = input.nextDouble();
            double accelerationResult = calculated_acceleration(velocity_change,time);
            System.out.println("Calculated acceleration (a = Δv/t): " + accelerationResult + "m/s²");
        }
        else if (secim == 3) {
            System.out.print("Enter mass(m): ");
            double  mass = input.nextDouble();
            System.out.print("Enter acceleration(a): ");
            double acceleration = input.nextDouble();
            double forceResult = calculated_force(mass,acceleration);
            System.out.println("Calculated force: " +  forceResult);
        }
        else if (secim == 4) {
            System.out.print("Enter Force (F): ");
            double force = input.nextDouble();
            System.out.print("Enter distance(d): ");
            double distance = input.nextDouble();
            double workResult = calculated_work(force,distance);
            System.out.println("Calculated force: " +  workResult);
        }
        else  if (secim == 5) {
            System.out.print("Enter work(W): ");
            double work = input.nextDouble();
            System.out.println("Enter time: ");
            double time = input.nextDouble();
            double powerResult = calculated_work(work,time);
        }
        input.close();
    }

    public static double calculated_velocity(double substituion, double time) {
        // Hata kontrolü: Zaman 0 olamaz
        if (time == 0) {
            System.out.println("Hata: Zaman 0 olamaz. Sonsuz hız!");
            return 0; // Veya Double.POSITIVE_INFINITY
        }
        return substituion / time;
    }
    public static double calculated_acceleration(double velocity_change, double time) {
        if (time == 0) {
            System.out.println("Hata: Zaman 0 olamaz.");
            return 0;
        }
        return velocity_change / time;
    }
    public static double calculated_force(double mass, double acceleration) {
        return mass * acceleration;
    }
    public static double calculated_work(double force, double distance){
        return distance * force;
    }
    public static double calculated_power(double work, double time){
        return work / time;
    }
}
