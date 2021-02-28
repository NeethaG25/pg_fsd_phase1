package collections;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSequence {
	
	public void getSequence(List<Integer> sequence) {
		List<Integer> output = new ArrayList<Integer>();    
	    List<Integer> temp = new ArrayList<Integer>();  
	    for(int i = 0; i < sequence.size(); i++) {
	        int current = sequence.get(i);          
	        int next = Integer.MIN_VALUE;
	        if(i + 1 < sequence.size()) next = sequence.get(i + 1);
	        if(current > next) {
	            if(output.size() <= temp.size()) {
	                temp.add(current);
	                output = new ArrayList<Integer>(temp);
	            }
	            temp.clear();
	        } else {
	            temp.add(current);      
	        }
	    }
	    System.out.println("Longest Increasing Sequence : "+output);
	}

}
