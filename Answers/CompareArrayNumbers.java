//CompareArrayNumbers: That receives two lists of numbers and returns a list with the max of both
import java.util.Scanner;

public class CompareArrayNumbers {
    public static void main(String[] args){
        Scanner lec = new Scanner(System.in);
        int size;

        double[] arrayMax = new double[2];

        System.out.println("Enter size of the first array:");
        size = lec.nextInt();
        double[] array1 = new double[size];
        array1 = createArray(size,lec);
        arrayMax[0] = maxValueOf(array1, size);

        System.out.println("Enter size of the second array:");
        size = lec.nextInt();
        double[] array2 = new double[size];
        array2 = createArray(size,lec);
        arrayMax[1] = maxValueOf(array2, size);

        System.out.println("The max values are: " + arrayMax[0] + " and " + arrayMax[1]);

    lec.close();
    }

    static double maxValueOf(double[] array, int size){
    //gets max value of an array,
    // taking as arguments the array itself and its size

        double max = array[0];

        for(int i=1;i<size;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }

     static double[] createArray(int size, Scanner scan){
        //creates an array and fills it by user input
        double[] array = new double[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter a number");
            array[i] = scan.nextDouble();
        }
            return array;
    }
}
