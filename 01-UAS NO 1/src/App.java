import java.util.Scanner;

import java.lang.Math;

public class Lingkaran {

    public static void main(String[] args){

        // Deklarasi
        Scanner Jari_Jari = new Scanner(System.in);

        Integer r,d ;
        double Luas, keliling;

        //Intro
        System.out.println("program Lingkaran Java");
        System.out.println("======================");

        //Input
        System.out.print("Jari-Jari: ");
        r = Jari_Jari.nextInt();


        //Proses
        d = 2 * r ;
        keliling = Math.pow(r,2);

        //Output
        System.out.print("Diameter: "+ d);
        System.out.print("Luas: "+ Luas);
        System.out.print("Keliling: "+ keliling);



    }

}
