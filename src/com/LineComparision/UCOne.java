
package com.LineComparision;

import java.util.Scanner;
public class UCOne {
    public static void main(String[] args) {
        lineCampare();
    }
    public static void lineCampare() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x-cordinate of first point: ");
        int x1 = sc.nextInt();
        System.out.println("Enter y-cordinate of first point: ");
        int y1= sc.nextInt();
        System.out.println("Enter x-cordinate of second point: ");
        int x2 = sc.nextInt();
        System.out.println("Enter y-cordinate of second point: ");
        int y2 = sc.nextInt();
        //computation

        double Length_of_line = Math.sqrt((x2 - x1)^2 + (y2 - y1)^2);
        System.out.println("length of line is:" +Length_of_line);
        sc.close();
    }
}
