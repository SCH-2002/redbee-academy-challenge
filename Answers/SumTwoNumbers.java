//SumTwoNumbers: That receives two numbers and returns the sum of both

import java.util.Scanner;
public class SumTwoNumbers{
    public static void main(String[] args){
        Scanner lec = new Scanner(System.in);
        System.out.println("Enter a number");
        double i = lec.nextDouble();
        System.out.println("Enter a second number:");
        double j = lec.nextDouble();
        System.out.println("The sum of both numbers is: "+(i+j));
        lec.close();
    }
}
