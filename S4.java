package LatUKL031125;

import java.util.Scanner;

public class S4 {
    public static double Volumetabung(double r, double t) {
        return Math.PI * r * r * t;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Jari-jari tabung: ");
        double r = in.nextDouble();
        System.out.println("Tinggi tabung: ");
        double t = in.nextDouble();
        double volume = Volumetabung(r, t);

        System.out.println("Volume tabung adalah " + volume + " cm^3");
        in.close();
    }
}