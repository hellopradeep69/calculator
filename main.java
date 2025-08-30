// package Project.java.Calculator;
// import Project.java.Calculator.addition;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        System.out.println("---------Calculator---------");
            Scanner s = new Scanner(System.in);
        int choice;
 
        do {
            System.out.println("\n 1.addition \n 2.subtraction \n 3.multiplication \n 4.division \n 5.quit");
         choice = s.nextInt();
        switch (choice) {
            case 1:
            Addition add = new Addition();
            add.addition();
            break;
            case 2:
            Subtraction sub = new Subtraction();
            sub.subtraction();
            break;
            case 3:
            Multiplication mul = new Multiplication();
            mul.multiplication();
            break;
            case 4:
            Division div= new Division();
            div.division();
            break;
            case 5:
            System.out.println("----------closed----------");
            break;





            default:
            System.out.println("-----WARNING-----");
            System.out.println("wrong !!! try again ");
            System.out.println("enter a valid number ");
            break;
            }
        } while (choice != 5);
    }
}
