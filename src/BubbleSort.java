import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
    static int[] array = new int[10];
    static int i;
    static int medium;
    static int left;
    static int right;
    static int number;

    public static void main(String[] args) {
        Random rn = new Random();
        for(i = 0; i < array.length; i++) {
            array[i] = rn.nextInt(10);
            System.out.print(array[i] + ";");
        }
        bubbleSort(array);
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("Please enter digit you would like to find in array");
        number = in.nextInt();
        binarySearch(array, number);
    }

    public static int[] bubbleSort(int[] array) {
        boolean flag = true;
        while(flag) {
            flag = false;
            for(i = 0; i < array.length - 1; i++) {
                if(array[i] > array[i + 1]) {
                    int temp = array[i + 1];
                    flag = true;
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.println();
        for(i = 0; i < array.length; i++) {
            System.out.print(array[i] + ";");
        }
        return array;
    }

    public static int binarySearch(int[] array, int number) {
        left = 0;
        right = array.length - 1;
        do {
            medium = (left + right) / 2;
            if(array[medium] < number) {
                left = medium + 1;
            } else if(array[medium] > number) {
                right = medium - 1;
            } else {
                System.out.println("Your digit index in array " + medium);
                break;
            }
        } while(left <= right);
        if(left > right) {
            medium = -1;
            System.out.println("Your digit index in array " + medium);
        }
        return medium;
    }
}
