package Project4;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class SequenceGenerator {
	
		private int n;
	    private ArrayList<Integer> arrayList = new ArrayList<Integer>();
	 
	 
	    public SequenceGenerator(int n) {
	        this.n = n;
	    }
	  
	  
	    public ArrayList<Integer> getArrayList() {
	        return arrayList;
	    }


	    public ArrayList<Integer> GenerateSequence() {
	        arrayList.clear();
	        for (int i = 0; i < n; i++) {
	            arrayList.add(ThreadLocalRandom.current().nextInt(0,  100 + 1));
	        }
	        return this.arrayList;
	    }
	
}
