
import java.io.IOException;
import java.io.File;
import java.util.Scanner;


/** 
	BallotReader class has only one method that reads in a ballot from a file specified
	by the user. BallotReader contains no private instance variables.
 */
public class BallotReader
{
	/** 
		The readBallot method returns a Ballot that is read in from an input file
		specified by the user. Lines are read in from the file to create a new Callot
		object and to add Candidate objects to that Ballot.
 	 */
	public static Ballot readBallot(String filename) throws IOException
	{

			/**
				File to be read
 	 	 	 */	
			File file = new File(filename);

			/**
				Scanner used to read the file
 	 	 	 */	
			Scanner input = new Scanner(file);

			/**
				Name of office
 	 	 	 */	
			String office = input.nextLine();

			/**
				Number of Candidates running
 	 	 	 */	
			int numCands = input.nextInt();

			/**
				New Ballot created with the office name
 	 	 	 */	
			Ballot ballot = new Ballot(office);

			/**
				Length of array storing candidate information (only will contain name and party)
 	 	 	 */	
			final int LENGTH = 2;

			/**
				Array to store the name and party of a candidate
 	 	 	 */	
			String[] info = new String[LENGTH];

			/**
				Hard-read string of the candidate directly from the file
 	 	 	 */	
			String semiColon = input.nextLine();

			/**
				Candidate name
 	 	 	 */	
			String name = "";

			/**
				Candidate party
 	 	 	 */	
			String party = "";

			for(int spot = 0; spot < numCands; spot++){
				semiColon = input.nextLine();
				info = semiColon.split(";",2);
				name = info[0];
				party = info[1];

				ballot.addCandidate(new Candidate(name, party));
			}

			return ballot;
		
	}
}
