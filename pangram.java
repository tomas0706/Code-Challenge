import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        ArrayList<Character> char_array = new ArrayList<Character>();
        for(int i = 0; i < line.length(); i++){
            char at = line.charAt(i);
            at = Character.toLowerCase(at);
            if(!char_array.contains(at) && at >= 'a' && at <= 'z'){
                char_array.add(at);
            }
        }
        if(char_array.size() == 26){
            System.out.println("pangram");
        }
        else{
            System.out.println("not pangram");   
        } 
    }
}
