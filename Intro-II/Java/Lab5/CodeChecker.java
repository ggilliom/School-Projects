// Libraries to use
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

/**
* CodeChecker can be used to detect mismatched parentheses (including
* {}, [], and()) in a source file passed in through the command line
* arguments. 
* <br>
* Usage: {@code java CodeChecker /path/to/source.java}
*/
public class CodeChecker {

	public static void main(String[] args) throws IOException {
    System.out.println();

    try {
      FileInputStream fStream = new FileInputStream(args[0]);
      Scanner keyboard = new Scanner(fStream);
      ArrayList<String> lines = new ArrayList<String>();

      while(keyboard.hasNextLine()){
        lines.add(keyboard.nextLine());

      }

      if(!(containsMismatchedParentheses(lines))){
        System.out.println("The file contains no mismatched parentheses. Parentheses are balanced.");
      } else {
        System.out.println();
        System.out.println("The file contains mismatched parentheses.");
      }
    } catch(IOException e){
        System.out.println("File not found. Please try a different file and run again.");
    }

		System.out.println();

    // end of main
	}

  /**
  * Return true if the list of lines contains mismatched parentheses.
  * This method also prints out error messages to std out if
  * mismatched parentheses are discovered. Parentheses checked include
  * {}, [], and ().
  * @param lines the list of lines
  * @return true if thae lines contain mismatched parentheses, false
  * otherwise
  */
  public static boolean containsMismatchedParentheses(List<String> lines) {
    // Stubbed. Implement this method.
    String current = "";
    Stack<String> nextClose = new Stack<String>();
    String opens = "({[";
    String closes = ")}]";
    int count = 1;

    for(String line : lines){

      for (int spot = 0; spot < line.length(); spot++){

        current = "" + line.charAt(spot);

        if(opens.contains(current)){

          if(current.equals("(")){
            nextClose.push(")");
          }

          if(current.equals("{")){
            nextClose.push("}");
          }

          if(current.equals("[")){
            nextClose.push("]");
          }


        } else if(closes.contains(current)){

          // if nextClose is empty, then there is an extra closer: ([])}
          if(nextClose.empty()){
            System.out.print("Line " + count + ": ");
            System.out.println("Error. Extra closing " + current + " encountered.");
            return true;

            // checks if current closer if the correct next closer
          } else if(current.equals(nextClose.peek())){
            nextClose.pop();

            // runs when current closer is not the correct next closer
          } else {
            System.out.print("Line " + count + ": ");
            System.out.println("Error. Misplaced " + current + " encountered.");
            return true;
          }
        }
        // end of for loop
      }

      
      count++;

      // end of for each loop
    }


    // if nextClose is not empty, return true
    if(!(nextClose.empty())){
      System.out.print("Line " + count + ": ");
      System.out.print("Error. Leftover open parentheses found: ");

      while(!(nextClose.empty())){
        if(nextClose.peek().equals(")")){
          System.out.print("(");
        }

        if(nextClose.peek().equals("}")){
          System.out.print("{");
        }

        if(nextClose.peek().equals("]")){
          System.out.print("[");
        }

        System.out.print(" ");
        nextClose.pop();

      }

      return true;

    }

    return false;

  }

}
