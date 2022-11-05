package com.LineComparision;
import java.util.Scanner;

public class UCThree {
    public static int x1,x2,x3,x4,y1,y2,y3,y4;
    public static double Length_of_line1,Length_of_line2;
    public static void main(String[] args) {
        lineCampare();
        lengthOfLine();
        equality();
    }
    public static void lineCampare() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1-cordinate of first point: ");
        x1 = sc.nextInt();
        System.out.println("Enter y1-cordinate of first point: ");
        y1= sc.nextInt();
        System.out.println("Enter x2-cordinate of second point: ");
        x2 = sc.nextInt();
        System.out.println("Enter y2-cordinate of second point: ");
        y2 = sc.nextInt();
        System.out.println("Enter x3-cordinate of first point: ");
        x3 = sc.nextInt();
        System.out.println("Enter y3-cordinate of first point: ");
        y3= sc.nextInt();
        System.out.println("Enter x4-cordinate of second point: ");
        x4 = sc.nextInt();
        System.out.println("Enter y4-cordinate of second point: ");
        y4 = sc.nextInt();
    }
    public static void lengthOfLine(){
        Double Length_of_line1 = Math.sqrt((x2 - x1)^2 + (y2 - y1)^2);
        System.out.println("length of line is:" +Length_of_line1);
        Double Length_of_line2 = Math.sqrt((x4 - x3)^2 + (y4 - y3)^2);
        System.out.println("length of line is:" +Length_of_line2);
        //int value = Length_of_line1.compareTo(Length_of_line2);
    }
    public static void equality(){
        if (Length_of_line1 ==Length_of_line2 )
        {
            System.out.println("Two lines are equals");
        }
        else if(Length_of_line1 > Length_of_line2)
        {
            System.out.println("Length of lines1 is greater than lenght of lines2");
        }
        else
        {
            System.out.println("Length of lines2 is greater than lenght of lines1");
        }
    }
}