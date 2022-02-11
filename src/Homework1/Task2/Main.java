package Homework1.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Scanner in = new Scanner(System.in);

        System.out.println("Choose length : ");
        double num1 = in.nextDouble();

        System.out.println("Choose width : ");
        double num2 = in.nextDouble();
        rec.areaCalculator(num1,num2);
        rec.perimetrCalculator(num1,num2);
        rec.viewResults();
    }
}
