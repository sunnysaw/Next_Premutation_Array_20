/*
Question : A permutation of an array of integers is an arrangement of its members into a sequence or linear order.
_____________________________________________________________________________________________________________________
Example 1:
Input: nums = [1,2,3]
Output: [1,3,2]
________________________________________________
Example 2:
Input: nums = [3,2,1]
Output: [1,2,3]
_____________________________________________________________
Example 3:
Input: nums = [1,1,5]
Output: [1,5,1]
_________________________________________________________
 Constraints:
1 <= nums.length <= 100
0 <= nums[i] <= 100
____________________________________________
 */

import java.util.Scanner;
public class Main {
    static void next_premutation(int[] array){
        int start = array.length - 2;
        int second_Start = 0;
        while (start >= 0 && array[start] >= array[start + 1]) start--;
        if (start >= 0){
            second_Start = array.length - 1;
            while (array[second_Start] <= array[start]) second_Start--;
            swap(array,start,second_Start);
        }
        reverse_function(array , start + 1 , array.length - 1);
        print_function(array);
    }
    static void swap(int[] array , int start , int end){
        int temporary_stroge = array[start];
        array[start] = array[end];
        array[end] = temporary_stroge;
    }
    static void reverse_function(int[] array , int start , int end){
        while (start < end){
            swap(array,start++,end--);
        }
    }
    static void print_function(int[] array){
        for (int start = 0; start < array.length; start++){
            System.out.print(array[start] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array :");
        int length = input.nextInt();
        System.out.println("Enter the element inside array :");
        int[] array = new int[length];
        for (int start = 0; start < array.length; start++){
            array[start] = input.nextInt();
        }
        System.out.println("Printing the result :");
        next_premutation(array);
    }
}