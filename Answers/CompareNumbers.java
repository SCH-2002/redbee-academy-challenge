//CompareNumbers: That receives three numbers and return the max of them

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args){
        double[] nums = new double[3];
        Scanner lec = new Scanner(System.in);
        double max = 0;

        //filling array
        for(int i=0;i<3;i++){
            System.out.println("Enter a number:");
            nums[i] = lec.nextDouble();
        }
        lec.close();
        //comparing each number
        max = nums[0];
        for(int i=1;i<3;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }

        System.out.println("The max number is: "+max);
    }
}
