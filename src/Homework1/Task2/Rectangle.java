package Homework1.Task2;

public class Rectangle {
    public double side1;
    public double side2;


    public Rectangle() {}



    public double areaCalculator (double num1, double num2){
        side1 = (num1 * num2);
        return side1;
    }


    public double perimetrCalculator(double num1 , double num2){
        side2 = (num1+num2)*2;
        return side2;
    }

    public void viewResults(){
        System.out.println("Area" + side1);
        System.out.println("Perimetr " + side2);

    }

}
