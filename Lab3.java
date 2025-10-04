import java.util.Arrays;
import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] labArray = {2,5,8,3,4,6,10,15,20,1};
        int searchArray = 0;
        int indexArray = 0;
        boolean found = false;

        // Identify index given a value
        System.out.print("Looking for: ");
        searchArray =  input.nextInt();
        for (int i = 0 ; i < labArray.length ; i++){
            if (labArray[i] == searchArray) {
                System.out.println(searchArray + " is at index [" + i + "]");
                found = true;
                break;
            }     
        }
        if (!found) {
            System.out.println("Value not found");
        }

        System.out.println();

        // Swapping two values in an array
        System.out.print("Index of first swap: ");
        int firstSwap = input.nextInt();

        System.out.print("Index of second swap: ");
        int secondSwap = input.nextInt();
        
        if (secondSwap > labArray.length - 1 || secondSwap < 0 || firstSwap > labArray.length - 1 || firstSwap < 0 ) {
            System.out.println("Invalid index");
        } else {
        int originalFirstSwap = labArray[firstSwap];
        labArray[firstSwap] = labArray[secondSwap];
        labArray[secondSwap] = originalFirstSwap;
        
        System.out.println("Swappping " + labArray[secondSwap] + " and " + labArray[firstSwap]);
        System.out.println("New array is: " + Arrays.toString(labArray));
    }

        // Sort an array in ascending and descending order
        System.out.print("Ascending order: ");
        for (int i = 0 ; i < labArray.length ; i++) {
            int minimum = labArray[i];
            int minimumIndex = i;

            for (int j = i + 1; j < labArray.length; j++) {
                if (minimum > labArray[j]){
                    minimum = labArray[j];
                    minimumIndex = j;
            }
        }
        if (minimumIndex != i){
            labArray[minimumIndex] = labArray[i];
            labArray[i] = minimum;
        }
        System.out.print(labArray[i] + " ");
    }

        System.out.println();

        System.out.print("Descending order: ");
        for (int i = 0 ; i < labArray.length ; i++) {
            int maximum = labArray[i];
            int maximumIndex = i;

            for (int j = i + 1; j < labArray.length; j++) {
                if (maximum < labArray[j]){
                    maximum = labArray[j];
                    maximumIndex = j;
            }
        }
        if (maximumIndex != i){
            labArray[maximumIndex] = labArray[i];
            labArray[i] = maximum;
        }
        System.out.print(labArray[i] + " ");
    }
        System.out.println();

        // Linear Search
        System.out.print("Looking for: ");
        searchArray =  input.nextInt();
        for (int i = 0 ; i < labArray.length ; i++){
            if (labArray[i] != searchArray) {
                System.out.println("Value not found");
                break;
            } else {
                System.out.println(searchArray + " is at index [" + i + "]");
        }
    }

        System.out.println();

        // Binary Search
        java.util.Arrays.sort(labArray);
        System.out.print("Binary search for an element: ");
        searchArray = input.nextInt();
        int result = Arrays.binarySearch(labArray,searchArray);
        if (result < 0) {
            System.out.println("Value not found");
        } else {
            System.out.println(searchArray + " is found at index [" + result + "]");
    }
        System.out.println();

        // Identify value given an index
        System.out.print("Search for an element in the array with the index: ");
        indexArray = input.nextInt();
        if (indexArray > labArray.length - 1 || indexArray < 0) {
            System.out.println("Invalid index");
        } else {
            System.out.println("Index [" + indexArray + "] is " + labArray[indexArray]);
        }
    }
}
