import java.util.Scanner;

public class RosterMain{
	public static void main(String[] args){
		
		int[] jers = new int[5];
		int[] rats = new int[5];
		int current = 0;

		Scanner keyboard = new Scanner(System.in);

		// Collects jersey numbers and ratings
		for(int spot = 0; spot < 5; spot++) {
			System.out.print("Enter player " + (spot + 1) + "\'s jersey number (0-99): ");
			jers[spot] = keyboard.nextInt();
			System.out.print("Enter player " + (spot + 1) + "\'s rating (1-9): ");
			rats[spot] = keyboard.nextInt();
			System.out.println();
		}


		System.out.println();

		// Prints roster
		for(int spot = 0; spot < 5; spot++) {
			System.out.println("Player " + (spot + 1) + " -- Jersey number: " 
				+ jers[spot] + ", Rating: " + rats[spot]);
		}

		boolean checker = true;

		String option = "";

		System.out.println();


		while (checker){

			System.out.println("u - Update player rating");
			System.out.println("a - Output players above a rating");
			System.out.println("r - Replace player");
			System.out.println("o - Output roster");
			System.out.println("q - Quit");
			System.out.println();

			option = keyboard.next();


			// Output Roster option
			if(option.equals("o")){
				// Prints roster
				for(int spot = 0; spot < 5; spot++) {
					System.out.println("Player " + (spot + 1) + " -- Jersey number: " 
						+ jers[spot] + ", Rating: " + rats[spot]);
				}
			}


			// Update Player Rating
			if(option.equals("u")){
				System.out.print("Enter a jersey number: ");
				int num = keyboard.nextInt();
				System.out.print("Enter a new rating for player: ");
				int newRate = keyboard.nextInt();

				int index = 0;
				for(int spot = 0; spot < 5; spot++){
					if(jers[spot] == num){
						index = spot;
					}
				}

				rats[index] = newRate;
				
			}


			// Output Players above a rating
			if(option.equals("a")){
				System.out.println("Enter a rating: ");
				int rating = keyboard.nextInt();

				System.out.println("ABOVE " + rating);

				for(int spot = 0; spot < 5; spot++){
					if(rats[spot] > rating){
						System.out.println("Player " + (spot + 1) + " -- Jersey number: " 
						+ jers[spot] + ", Rating: " + rats[spot]);
					}
				}
			}


			// Replace Players
			if(option.equals("r")){
				System.out.print("Enter a jersey number: ");
				int oldNum = keyboard.nextInt();
				System.out.print("Enter a new jersey number: ");
				int newNum = keyboard.nextInt();
				System.out.print("Enter a rating for the new player: ");
				int newRate = keyboard.nextInt();

				for(int spot = 0; spot < 5; spot++){
					if(jers[spot] == oldNum){
						jers[spot] = newNum;
						rats[spot] = newRate;
					}
				}
			}
		
			// Quit
			if(option.equals("q")){
				checker = false;
			}
		}

	}
}