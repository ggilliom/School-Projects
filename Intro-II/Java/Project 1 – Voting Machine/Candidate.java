
/** 
	A Candidate object contains information about a candidate
	who is running for office on a ballot. Candidate contains
	fields for the name, party, and total votes of the candidate.
 */
public class Candidate
{
	/** 
		The name of the candidate running for office
 	 */	
	private String name;

	/** 
		The name of the party of the candidate
 	 */	
	private String party;

	/** 
		Total number of votes cast for the candidate
 	 */	
	private int totalVotes;


	/** 
		Construct a Candidate.
		@param name the name of the candidate
		@param affiliation the party affiliation of the candidate
 	 */	
	public Candidate(String name, String affiliation)
	{
		this.name = name;
		party = affiliation;

	}


	/** 
		Return the name of the candidate
		@return the name of the candidate
 	 */	
	public String getName()
	{
		return name;

	}


	/** 
		Return the name of the party of the candidate
		@return the name of the party of the candidate
 	 */	
	public String getAffiliation()
	{
		return party;
	}


	/** 
		Return the number of votes cast for the candidate
		@return the number of votes cast for the candidate
 	 */	
	public int getVoteCount()
	{
		return totalVotes;
	}


	/** 
		Increment the total number of votes cast for the candidate
 	 */	
	public void tallyVote()
	{
		totalVotes++;
	}


	/** 
		Determines if a Candidate object is equivalent to another Candidate object
		@param other the Candidate object to be tested for equivalency
		@return true if equivalent, false if different
 	 */	
	public boolean equals(Candidate other){
		if (this.name.equals(other.getName()) && this.party.equals(other.getAffiliation()) && this.getVoteCount() == other.getVoteCount()){
			return true;
		}
		else {
			return false;
		}
	}


	/** 
		Compares one Candidate object to another based on vote count
		@param other the Candidate object to be compared to
		@return difference in votes between the original Candidate and the other Candidate
 	 */	
	public int compareTo(Candidate other){
		return this.getVoteCount() - other.getVoteCount();
	}

	/** 
		Return the name of, party of, and total votes cast for the candidate
		@return the name of, party of, and total votes cast for the candidate
 	 */	
	public String toString()
	{
		return name + " - " + party;
	}
}
