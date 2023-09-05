package Assignment;

import java.io.FileNotFoundException;

//Java implementation of above approach

//Program to find the maximum profit
//job sequence from a given array
//of jobs with deadlines and profits
import java.util.*;

public class GreedyAlgorithms implements Algorithms{
	private ArrayList <ArtCommission> artJob;
	
	public GreedyAlgorithms() throws FileNotFoundException {
		this.artJob = ReadData.readData();
	}

	 public void printJobSequencing()
	 {
		 //We only choose 4 jobs because 4 weeks in a month.
		 int t = 4;
	     int n = artJob.size();
	     
	     Collections.sort(artJob,
                 (a, b) -> b.profit - a.profit);

		// To keep track of free time slots
		boolean availableSlot[] = new boolean[t];
		
		// To store result (Sequence of jobs)
		String maximumProfit[] = new String[t];
		int totalProfit = 0;
		
		
		// Iterate through all given jobs
		for (int i = 0; i < n; i++) {
			// Find a free slot for this job (Note that we
            // start from the last possible slot)
		    // Place the job in the array if the slot is empty
			// Skip the job if the slot is occupied 
		
		    for (int j = Math.min(t - 1, artJob.get(i).deadline - 1); j >= 0; j--) {
		        // Free slot found
		    
		        if (availableSlot[j] == false) {
		        	availableSlot[j] = true;
		            maximumProfit[j] = artJob.get(i).getId();
		            totalProfit += artJob.get(i).getProfit();
	
		            break;
		        } 
		    }
		}
		 System.out.println("Job sequencing according to Greedy Algorithms: ");
	     for (String jobID : maximumProfit) {
	         System.out.print(jobID+ " ");
	     }
	     
	     System.out.println("\nMaximum Profit Achieved:" +totalProfit);
	     
	     System.out.println();
	     
	  // This code is credited to Aditya Kumar (adityakumar129)
	  // Website: https://www.geeksforgeeks.org/job-sequencing-problem/
	 }
}