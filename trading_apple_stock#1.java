
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static void get_best_profit(int[] stock_price_yesterday){
        int max_profit = 0;
        int current_price = stock_price_yesterday[0];
        for(int i = 1; i < stock_price_yesterday.length; i ++){
            if(max_profit < (stock_price_yesterday[i] - current_price)){
            	max_profit = stock_price_yesterday[i] - current_price;   
            }
            if(current_price > stock_price_yesterday[i]) current_price = stock_price_yesterday[i];
        }
        System.out.println(max_profit);
    }
    
    public static void main(String[] args) {
   		int[] array = new int[5];
        array[0] = 100;
        array[1] = 150;
        array[2] = 50;
        array[3] = 70;
        array[4] = 200;
        get_best_profit(array);
    }
}
