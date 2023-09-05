package Assignment;

import java.io.FileNotFoundException;
import java.util.*;

public class MaximumProfitTesting {
	public static void main(String [] args) {
		
		 
		try {
			Algorithms greedyAlgorithms = new GreedyAlgorithms();
			Algorithms bruteForceAlgorithm = new BruteForceAlgorithms();
			greedyAlgorithms.printJobSequencing();
			bruteForceAlgorithm.printJobSequencing();
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
}
