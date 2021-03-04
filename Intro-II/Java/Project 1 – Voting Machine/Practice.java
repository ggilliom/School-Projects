import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.io.File;

public class Practice {
	public static void main(String[] args) throws IOException{

		ArrayList<String> candidates = new ArrayList<String>();

		candidates.add("Hello");
		candidates.add("My");
		candidates.add("Name");
		candidates.add("Is");
		candidates.add("Garrett");

		for(String word : candidates){
			System.out.println(word);
		}

		for(int spot = 0; spot < candidates.size(); spot++){
			System.out.println(candidates.get(spot));
		}

		System.out.println(candidates);
		System.out.println("Hello");

	}
}