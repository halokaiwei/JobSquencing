package Assignment;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ReadData {
	
	//to read the data from the SeptemberArtCommission txt file
	public static ArrayList<ArtCommission> readData() throws FileNotFoundException {
		//create a arraylist to store the data
		ArrayList<ArtCommission> artJob = new ArrayList <ArtCommission>();
		
		String readLine;
		File readFile = new File("SeptemberArtCommission.txt");
		Scanner inputFile = new Scanner(readFile);
		
		//Iterator is used to get all the data from the file and store in the arrayList
		while(inputFile.hasNext()) {
			readLine = inputFile.nextLine();
			String [] temp = readLine.split(";");
			artJob.add(new ArtCommission(temp[0],Integer.parseInt(temp[1]), Integer.parseInt(temp[2]) ));
			
		}
		
		inputFile.close();
		
		return artJob;
	}	

}
