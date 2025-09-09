// write a java method to computre the average of three number

import java.util.*;
public class qes1 {

public static void avrgofThreeNUmb(double a,double b,double c){
    double average  = (a+b+c)/3;
    System.out.println("average of Three NUmber: " + average );
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System .out.println("Enter first number ");
        double a = sc.nextInt();
        System.out.println("Enter second number ");
        double b = sc.nextDouble();
        System.out.println("Enter Third number");
        double c = sc.nextDouble();
        avrgofThreeNUmb(a, b, c);
    }
}