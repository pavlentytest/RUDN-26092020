package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Scanner a = new Scanner(System.in);
        //int c = a.nextInt();
        //int b = a.nextInt();
        double z = 5.678;
       // System.out.println(c + " " + b);
        //System.out.printf("%.2f",z);


        if(z > 0) {
            z++;
        } else if(z == 5) {

        } else if(4 == 3) {

        } else {

        }

        char ch = 'P';

        switch (ch) {
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'C':
                System.out.println("C");
                break;
            default:
                System.out.println("default");


        }
        // тернарный оператор
        int m = (z > 8.5) ? 100 : 900;
        System.out.println((z > 8.5) ? 100 : 900);

        // логическое И
        if(z > 5.6 && z < 0) {

        }
        // логическое ИЛИ
        if(z < -9 || z > 900) {
            
        }



    }
}
