import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_problems = Integer.parseInt(sc.nextLine());
        for(int k = 0; k < num_problems; k ++){
            int num_elem = Integer.parseInt(sc.nextLine());
            int[] elems = new int[num_elem];
            int max_non_cont = 0;
            for(int i = 0; i < num_elem; i ++){
                elems[i] = sc.nextInt();
                if(elems[i] > 0) max_non_cont += elems[i];   
            }
            if(k != num_problems - 1) sc.nextLine();
            
            //Need to fix the algorithm here
            int cur_best = 0;
            ArrayList<Integer> best = new ArrayList<Integer> ();
            for(int i = 0; i < num_elem; i ++){
                int val = cur_best + elems[i];
                if(val > 0){
                    cur_best = cur_best + elems[i];
                }
                else{
                    best.add(cur_best);
                    cur_best = 0;
                }
            }
            
            best.add(cur_best);
            int max_cont = best.get(0);
            for(int elem : best){
                if(max_cont < elem) max_cont = elem;
            }
            System.out.println(max_cont + " " + max_non_cont);
        }
    }
}