 
// YOU ARE NOT REQUIRED TO FULLY UNDERSTAND THIS CODE; READ IT BUT YOU MAY NOT
// MODIFY IT.

/** 
	This software prompts a user to enter an input file to read in details
	of an upcoming election. Then, once prompted with information about each
	ballot and candidate, the user may cast votes for the candidate of their 
	choosing. Once the election is finished, the final tallies for each 
	candidate is displayed and a winner is declared.
 */
import java.io.IOException;
import javax.swing.JOptionPane;


public class PerfectCandidate
{
	public static void main(String[] args)
	{
		Ballot ballot = null;

		do
		{
			FileSelector inputSelector = new FileSelector(
				null, "Select Input File", "Path to input file", true);
			
			inputSelector.setVisible(true);
	
			String inputFilename = inputSelector.getSelectedFile();
	
			if (inputFilename == null)
			{
				return;
			}
	
			try
			{
				ballot = BallotReader.readBallot(inputFilename);
			}
			catch (IOException e)
			{
				JOptionPane.showMessageDialog(null,
					"Could not open and read input file",
					"Input Error",
					JOptionPane.ERROR_MESSAGE);
			}
		}
		while (ballot == null);

		BallotDialog bf = new BallotDialog(null, ballot);
		bf.setVisible(true);

		FileSelector outputSelector = new FileSelector(
			null, "Select Output File", "Path to output file", false);
			
		outputSelector.setVisible(true);
	
		String outputFilename = outputSelector.getSelectedFile();

		if (outputFilename == null)
		{
			return;
		}

		try
		{
			ResultWriter.writeResults(outputFilename, ballot);
		}
		catch (IOException e)
		{
			JOptionPane.showMessageDialog(null,
				"Could not write results to output file",
				"Output Error",
				JOptionPane.ERROR_MESSAGE);
		}
	}
}
