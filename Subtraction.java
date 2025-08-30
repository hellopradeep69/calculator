// package Project.java.Calculator;
import java.util.Scanner;

public class Subtraction {
    Scanner s = new Scanner(System.in);
    public void subtraction() {
        System.out.println("enter a value for a : ");
        int a = s.nextInt();
        System.out.println("enter a value for b : ");
        int b = s.nextInt();
        System.out.println("--------subraction--------");
        int sub = a-b;
        System.out.println("the subraction of " + a + " and " + b +" is " +sub );
    }
    // public static void main(String[] args) {
    //     subraction add = new subraction();
    //     add.subraction();
    // }
}
