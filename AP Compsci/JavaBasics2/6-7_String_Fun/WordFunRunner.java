//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Garrett Gilliom
//Date - 10/16/18
//Class - APCSA Period 8
//Lab  - 6-7 String Fun

import static java.lang.System.*;

public class WordFunRunner
{
 public static void main( String args[] )
 {
    WordFun test = new WordFun("Hello World");
    out.println(test.toString());
    test.makeUpper();
    out.println(test.toString());
    test.addHyphen();
    out.println(test.toString());
    test.alphabetize();
    out.println(test.toString());
    
    test = new WordFun("Jeroo Bob");
    out.println(test);
    test.makeUpper();
    out.println(test);
    test.addHyphen();
    out.println(test);
    test.alphabetize();
    out.println(test);
    
    test = new WordFun("Computer Science");
    out.println(test);
    test.makeUpper();
    out.println(test);
    test.addHyphen();
    out.println(test);
    test.alphabetize();
    out.println(test);
    
    test = new WordFun("Golden Bears");
    out.println(test);
    test.makeUpper();
    out.println(test);
    test.addHyphen();
    out.println(test);
    test.alphabetize();
    out.println(test);
    
    test = new WordFun("Upper Arlington");
    out.println(test);
    test.makeUpper();
    out.println(test);
    test.addHyphen();
    out.println(test);
    test.alphabetize();
    out.println(test);
    

    //add more test cases

 }
}