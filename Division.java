
// package Project.java.Calculator;
import java.util.Scanner;

public class Division {
    Scanner s = new Scanner(System.in);
    public void division() {
        System.out.println("enter a value for a : ");
        int a = s.nextInt();
        System.out.println("enter a value for b : ");
        int b = s.nextInt();
        System.out.println("--------division--------");
        int sum = a/b;
        System.out.println("the sum of " + a + " and " + b +" is " +sum );
    }
    // public static void main(String[] args) {
    //     division add = new division();
    //     add.division();
    // }
}
