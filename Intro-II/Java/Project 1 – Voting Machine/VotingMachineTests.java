import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.runner.RunWith;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class VotingMachineTests {
	
	private Ballot ballot1;
	private Ballot ballot2;
	private Ballot ballot3;
	private Candidate can1;
	private Candidate can2;
	private Candidate can3;


	@BeforeEach
	public void setUp(){
		can1 = new Candidate("Joe Douglas", "Democrat");
		can2 = new Candidate("Bob Harvey", "Republican");
		can2.tallyVote();
		can3 = new Candidate("Steve Smith", "Green");
		can3.tallyVote(); can3.tallyVote();

		ballot1 = new Ballot("President");
		ballot2 = new Ballot("Mayor");
		ballot3 = new Ballot("Governor");
	}

	@Test // Tests the creation of a Candidate
	public void testCreateCand(){
		assertNotNull(new Candidate("Mary Jones", "Independent"));
		assertNotNull(new Candidate("Rick Moss", "Libertarian"));
		assertNotNull(new Candidate("Mary Jones", "Action"));
	}

	@Test // Tests the getVoteCount() method
	public void testGetCount(){
		assertEquals(0, can1.getVoteCount(), 0.000000001);
		assertEquals(1, can2.getVoteCount(), 0.000000001);
		assertEquals(2, can3.getVoteCount(), 0.000000001);
	}

	@Test // Tests the getName() method 
	public void testGetName(){
		assertEquals("Joe Douglas", can1.getName()); 
		assertEquals("Bob Harvey", can2.getName());
		assertEquals("Steve Smith", can3.getName());
	}

	@Test // Tests the getAffiliation() method
	public void testGetAffiliation(){
		assertEquals("Democrat", can1.getAffiliation()); 
		assertEquals("Republican", can2.getAffiliation());
		assertEquals("Green", can3.getAffiliation());
	}

	@Test // Tests the tallyVote() method
	public void testTallyVote(){
		can1.tallyVote();
		can2.tallyVote();
		can3.tallyVote();
		assertEquals(1, can1.getVoteCount(), 0.000000001); 
		assertEquals(2, can2.getVoteCount(), 0.000000001);
		assertEquals(3, can3.getVoteCount(), 0.000000001);
	}

	@Test // Tests the toString() method in Candidate
	public void testGetString(){
		assertEquals("Joe Douglas - Democrat", can1.toString()); 
		assertEquals("Bob Harvey - Republican", can2.toString());
		assertEquals("Steve Smith - Green", can3.toString());
	}

	@Test // Tests the equals() method in Candidate
	public void testEquals(){
		assertEquals(true, can1.equals(can1));
		assertEquals(true, can2.equals(can2));
		assertEquals(true, can3.equals(can3));
		assertEquals(false, can1.equals(can2));
	}

	@Test // Tests the addCandidate() method
	public void testAddCandidate(){
		ballot1.addCandidate(can1);
		ballot1.addCandidate(can2);
		ballot1.addCandidate(can3);
		assertEquals(can1, ballot1.getCandidates().get(0));
		assertEquals(can2, ballot1.getCandidates().get(1));
		assertEquals(can3, ballot1.getCandidates().get(2));
	}


	@Test // Tests the getOfficeName() method
	public void testOfficeName(){
		assertEquals("President", ballot1.getOfficeName());
		assertEquals("Mayor", ballot2.getOfficeName());
		assertEquals("Governor", ballot3.getOfficeName());
	}


	@Test // Tests the listing of all candidates through the getCandidates() method
	public void testListCandidates(){

		ballot1.addCandidate(can1);
		ballot1.addCandidate(can2);
		ballot1.addCandidate(can3);

		String list1 = "";
		for(Candidate item : ballot1.getCandidates()){
			list1 += item.toString() + "\n";
		}

		assertEquals("Joe Douglas - Democrat\nBob Harvey - Republican\nSteve Smith - Green\n", list1);

	}
}
