import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Still in progress
public class Solution {
    private class Meeting {
    	private int start;
        private int end;
        public Meeting(int start, int end){
        	this.start = start;
            this.end = end;
        }
        public int get_start(){
        	return start;
        }
        public int get_end(){
        	return end;   
        }
    }
    
    private Meeting condense_meeting(Meeting first, Meeting second){
        if(first.get_start() >= second.get_start() && first.get_start() <= second.get_end()){
            int ending = Math.max(first.get_end(), second.get_end());
            Meeting new_meeting = new Meeting(second.get_start(), ending);
            return new_meeting;
        }
        else if(second.get_start() >= first.get_start() && second.get_start() <= first.get_end()){
            int ending = math.max(first.get_end(), second.get_end());
            Meeting new_meeting = new Meeting(first.get_start(), ending);
            return new_meeting;
        }
        return first;
    }
    
    public static void main(String[] args) {
   		Meeting[] array = new Meeting[2];
        Meeting first = Meeting(1,5);
        Meeting second = Meeting(4,7);
        array[0] = first;
        array[1] = second;
        System.out.println(condense_meeting(first, second));
    }
}
