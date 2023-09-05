package Assignment;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class BruteForceAlgorithms implements Algorithms{
	
	private ArrayList <ArtCommission> artJob;
	
	//read in the data from the ReadData class
	public BruteForceAlgorithms() throws FileNotFoundException {
		this.artJob = ReadData.readData();
	}
	
	@Override
	public void printJobSequencing()
	{
		//sort the deadline in ascending
		for (int i=0; i<artJob.size();i++) {	
			for (int j=0; j<artJob.size()-i-1;j++) {
				
				//compare the deadline side by side
				//if the first artJob has the longer deadline than the second artJob
				if (artJob.get(j+1).getDeadline() < artJob.get(j).getDeadline()) {
					ArtCommission temp = artJob.get(j+1);
					artJob.set(j+1, artJob.get(j));
					artJob.set(j, temp);
				}
			}
		}
		
		
		//After sorting deadline, sort the profit in ascending
		for (int i=0; i<artJob.size();i++) {	
			for (int j=0; j<artJob.size()-i-1;j++) {
				if (artJob.get(j+1).getDeadline() == artJob.get(j).getDeadline()) {
					if(artJob.get(j+1).getProfit() > artJob.get(j).getProfit()) {
						ArtCommission temp = artJob.get(j+1);
						artJob.set(j+1, artJob.get(j));
						artJob.set(j, temp);
					}
					artJob.remove(j+1);	//remove the low profit option
				}
			}
		}
		int total = 0;
		//print all the possible job sequencing
		System.out.println("Job sequencing according to Brute Force Algorithms: ");
		for (int i=0;i<artJob.size();i++) {
			System.out.print(artJob.get(i).getId() +" ");
			total += artJob.get(i).getProfit();
		
		}
		System.out.print("\nMaximum profit achieved: " + total);
	}
	

}
