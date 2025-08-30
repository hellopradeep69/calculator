// package Project.java.Calculator;
import java.util.Scanner;

public class Multiplication {
    Scanner s = new Scanner(System.in);
    public void multiplication() {
        System.out.println("enter a value for a : ");
        int a = s.nextInt();
        System.out.println("enter a value for b : ");
        int b = s.nextInt();
        System.out.println("--------multiplication--------");
        int mul = a*b;
        System.out.println("the mul of " + a + " and " + b +" is " +mul );
    }
    // public static void main(String[] args) {
    //     multiplication add = new multiplication();
    //     add.multiplication();
    // }
}

