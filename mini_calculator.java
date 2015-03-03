import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
        
    private static int evaluate(String exp){
        //Base case
        if(exp.indexOf("(") == -1){
            return Integer.parseInt(exp);
        }
        exp = exp.substring(1, exp.length() - 1);
        String[] eval = exp.split(" ");
        int first_index = exp.indexOf(" ");
        int last_index = exp.lastIndexOf(" ");
        if(eval[0].equals("add")){
            return evaluate(exp.substring(first_index + 1, last_index)) + evaluate(exp.substring(last_index + 1));
         }
         if(eval[0].equals("mult")){
            return evaluate(exp.substring(first_index + 1, last_index)) * evaluate(exp.substring(last_index + 1));
         }
        if(eval[0].equals("let")){
            String var = eval[1];
            int first_exp_open = exp.indexOf("(");
            int first_exp_close = exp.indexOf(")");
            int replace = evaluate(exp.substring(first_exp_open + 1, first_exp_close));
            String final_exp = exp.substring(first_exp_close + 2);
            final_exp = final_exp.replaceAll(var, Integer.toString(replace));
            System.out.println(final_exp);
            return evaluate(final_exp);
        }
        return 0;
    }
    
    //Main function
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String exp = sc.nextLine();
            System.out.println(evaluate(exp));
        }
    }
}
