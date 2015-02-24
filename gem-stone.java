import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int num_rocks = Integer.parseInt(sc.nextLine());
        Set<Character> result = new HashSet<Character>();
        if(num_rocks > 0){
            String rock = sc.nextLine();
            int length = rock.length();
            for(int i = 0; i < length; i ++){
                result.add(rock.charAt(i));
            }
        }
        
        for(int i = 1; i < num_rocks; i ++){
            Set<Character> gem_stone = new HashSet<Character>();
            String rock = sc.nextLine();
            int length = rock.length();
            for(int j = 0; j < length; j ++){
                char char_at = rock.charAt(j);
                if(result.contains(char_at)){
                    gem_stone.add(char_at);
                }
            }
            result = gem_stone;
        }
        System.out.println(result.size());
    
    }
}
