import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static void get_best_product(int[] arr){
       	int positive_2 = arr[0] * arr[1];
        int negative_2 = arr[0] * arr[1];
        int positive_3 = arr[0] * arr[1] * arr[2];
        int negative = Math.min(arr[0], arr[1]);
        int positive = Math.max(arr[0], arr[1]);
       
        for(int i = 2; i < arr.length; i ++){
       		if(positive_2 * arr[i] > positive_3) positive_3 = positive_2 * arr[i];
            if(negative_2 * arr[i] > positive_3) positive_3 = negative_2 * arr[i];
            
            if(positive * arr[i] > positive_2) positive_2 = positive * arr[i];
            if(negative * arr[i] > positive_2) positive_2 = negative * arr[i];
            
            if(negative * arr[i] < negative_2) negative_2 = negative * arr[i];
            if(positive * arr[i] < negative_2) negative_2 = positive * arr[i];
            
            if(negative > arr[i]) negative = arr[i];
            if(positive < arr[i]) positive = arr[i];
        }
        System.out.println(positive_3);
    }
    
    public static void main(String[] args) {
   		int[] array = new int[5];
        array[0] = 1;
        array[1] = 10;
        array[2] = -5;
        array[3] = 1;
        array[4] = -100;
        get_best_product(array);
    }
}
