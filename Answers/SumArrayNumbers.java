//SumArrayNumbers: That receives a list and return the sum of entire list
import java.util.Scanner;
public class SumArrayNumbers {
    public static void main(String[] args){
        Scanner lec = new Scanner(System.in);
        
        double sum = 0;
        int s;
        System.out.println("How many numbers you wanna list?");
        s = lec.nextInt();
        double[] list = new double[s];

        //filling the array
        for(int i=0;i<s;i++){
            System.out.println("Enter a number:");
            list[i] = lec.nextDouble();
        }
        lec.close();

        //adding each number of the array
        for(double i : list){
            sum+=i;
        }
        
        System.out.println("The total sum is: "+sum);
        
    }
}
