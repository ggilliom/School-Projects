
import java.util.ArrayList;

/** 
	A Ballot object is created when an office position is up 
	for election. A Ballot contains an office field and a list
	of candidates who are running for that office. 
 */
public class Ballot
{
	/** 
		The name of the office of the ballot
 	 */	
	private String office;

	/** 
		A list of candidates running for office on the ballot
 	 */	
	private ArrayList<Candidate> candidates;


	/** 
		Construct a Ballot.
		@param officeName the name of the office on the ballow
 	 */	
	public Ballot(String officeName)
	{
		office = officeName;
		candidates = new ArrayList<Candidate>();

	}


	/** 
		Return the name of the office.
		@return the name of the office
 	 */	
	public String getOfficeName()
	{
		return office;
	}


	/** 
		Add a candidate to the ballot.
		@param c the candidate to be added to the ballow
 	 */	
	public void addCandidate(Candidate c)
	{
		boolean checker = true;
		for(Candidate candidate : candidates){
			if(c.equals(candidate)){
				checker = false;
			}
		}
		if(checker){
		candidates.add(c);
		}
	}


	/** 
		Return a list of candidates for the ballot.
		@return the list of candidates for the ballot
 	 */	
	public ArrayList<Candidate> getCandidates()
	{
		return candidates;

	}


	/** 
		Return a summary of the ballot, including the office, total votes cast for each
		candidate, and election winner
		@return a summary of the ballot
 	 */	
	public String toString(){

		/** 
			The final String to be returned at the end of the method. Everything is added to out
 	 	 */	
		String out = "RESULTS - " + getOfficeName() + "\n";

		/** 
			String with the length of hyphens
 	 	 */	
		String hyphens = "----------";

		/**
			Stores length of the current office name in the loop
 	 	 */	
		int nameLength = getOfficeName().length();
		for(int spot = 0; spot < nameLength; spot++){
			hyphens = hyphens + "-";
		}
		out = out + hyphens + "\n";

		/** 
			Longest office name
 	 	 */	
		int maxLength = 0;

		/** 
			Stores number of digits of the current vote count in the loop
 	 	 */	
		int voteLength = 0;

		for(Candidate item : candidates){
			if(item.toString().length() > maxLength){
				maxLength = item.toString().length();
			}
			if(("" + item.getVoteCount()).length() > voteLength){
				voteLength = ("" + item.getVoteCount()).length();
			}
		}

		/** 
			Difference of spaces between the vote total with most digits vs.
			the current vote total's digits
 	 	 */	
		int numDiff = 0;

		/** 
			Difference of spaces between the length of the longest office name
			vs. the current office name's length
 	 	 */	
		int stringDiff = 0;

		for(Candidate item : candidates){
			out = out + item.toString();
			stringDiff = maxLength - item.toString().length();
			numDiff = voteLength - ("" + item.getVoteCount()).length();
			for(int spot = 0; spot < 12 + stringDiff + numDiff; spot++){
				out = out + " ";
			}
			out = out + item.getVoteCount() + "\n";
		}


		out = out + "\n";

		if(candidates.size() == 0){
			out = out + "NO WINNER";
			return out;
		}

		/** 
			Stores the line that will contain who the winner is in the final output
 	 	 */	
		String winner = "";

		/** 
			Stores the largest number of votes for a candidate
 	 	 */	
		int mostVotes = 0;

		for (Candidate item : candidates){
			if(item.getVoteCount() == mostVotes){
				winner = "NO WINNER";
			}
			else if(item.getVoteCount() > mostVotes) {
				winner = "WINNER: " + item.toString();
				mostVotes = item.getVoteCount();
			}
		}

		out = out + winner;

		return out;

	}
}
