package Project4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class LongestSubsequence {
	

		int n;
		ArrayList<Integer> sequence;
		
		
		public void getInput() {
			Scanner input = new Scanner(System.in);
			System.out.print("Input a number for the size of the random arrary you want to generate: ");
			n = input.nextInt();
			SequenceGenerator sg = new SequenceGenerator(n);
			sequence = sg.GenerateSequence();
			input.close();
		}
		
		
		public void printSeq() {
			System.out.println(sequence);
		}
		
		
		public void searchArray() {
			if((sequence == null)) {
			getInput();
			}
			int temp =0;
			int checked = 0;
			int start = 0;
			int end = 0;
			int tempstart=0;
			for(int i = 0; i<sequence.size()-1; i ++) {
				if( sequence.get(i)<sequence.get(i+1)) {
					 if(temp == 0) {
						 tempstart = i;
					 }
					temp++;                      
				}
				else if (temp>checked) {
					start = tempstart;
					checked = temp;
					end = i;
					temp = 0;
				}
				else {										
					temp = 0;	
				}
			}
			System.out.println("The longest subsequence starts at index "+start);
			System.out.println("The longest subsequence ends at index "+end);
			System.out.println("The longest subsequence is "+sequence.subList(start, end+1));	
		}
	
}
