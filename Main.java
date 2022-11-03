import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the number of elements (Max 10)");
        int n = userInput.nextInt();

        int[] array = new int[10];

        System.out.println("Enter the numbers in the sequence");
        for (int i = 0; i < n; i++) {
            array[i] = userInput.nextInt();
        }

        //Calling the method
        if(checkAP(array, n))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    static boolean checkAP(int array[], int n)
    {

        //Sorting the array
        Arrays.sort(array);

        // Calculating the difference between the first two items
        // in the array and comparing if there is an AP or not.
        int d = array[1] - array[0];
        for (int i = 2; i < n; i++)
            if (array[i] - array[i-1] != d)
                return false;

        return true;
    }
}