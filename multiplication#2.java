
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static int[] get_multiplications(int[] arr){
        int[] result = new int[arr.length];
        for(int i = 0; i < arr.length; i ++){
        	result[i] = 1;
        }
        int multiple = 1;
        for(int i = 0; i < arr.length - 1; i ++){
       		multiple *= arr[i];
            result[i + 1] = multiple;
        }
        multiple = 1;
        for(int i = arr.length - 1; i > 0; i --){
        	multiple *= arr[i];
            result[i - 1] = result[i - 1] * multiple;
        }
        return result;
    }
    
    public static void main(String[] args) {
		int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 6;
        arr[3] = 5;
        arr[4] = 9;
        int[] result = get_multiplications(arr);
        for(int i = 0; i < result.length; i ++){
        	System.out.println(result[i]);    
        }
    }
}
