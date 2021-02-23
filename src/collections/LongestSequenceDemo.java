package collections;

import java.util.ArrayList;
import java.util.List;

public class LongestSequenceDemo {

	public static void main(String[] args) {
		List<Integer> sequence = new ArrayList<Integer>();  
	    sequence.add(3);
	    sequence.add(2);
	    sequence.add(1);
	    sequence.add(2);
	    sequence.add(1);
	    sequence.add(2);        
	    sequence.add(1000);
	    sequence.add(97777);
	    sequence.add(97779);
	    sequence.add(97778);
	    sequence.add(487);
	    sequence.add(8274);
	    
	    LongestIncreasingSequence lis = new LongestIncreasingSequence();
	    lis.getSequence(sequence);

	}

}
