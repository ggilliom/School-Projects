 

import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;

/** 
	ResultWriter class has only one method that writes a ballot to a file specified
	by the user. The file is written in using a specific format, and only contains
	the single method to write the results with no private instance variables.
 */
public class ResultWriter
{
	/** 
		The writeResults method writes a summary of a Ballot object into an output
		file once voting is done. The output file to be written to is specified by
		the user. The file contains the office, vote tallies, and the winner.
 	 */
	public static void writeResults(String filename, Ballot ballot) throws IOException{

		/**
			String to eventually be written to a file
 	 	 */	
		String out = "";

		out = ballot.toString();

		/**
			Object used to write the Ballot summary into a file
 	 	 */	
		FileWriter writer = new FileWriter(filename);

		writer.write(out);
		writer.close();

	}
}
