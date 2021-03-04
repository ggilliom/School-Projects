//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Garrett Gilliom
//Date - 10/16/18
//Class - APCSA Period 8
//Lab  - 6-7 String Fun

import static java.lang.System.*;

public class WordFun
{
 private String word, letters;

 public WordFun()
 {
   setWord("");
 }

 public WordFun(String w)
 {
   setWord(w);
 }

 public void setWord(String w)
 {
   word = w;
   letters = w;
 }

 public void makeUpper()
 {

   letters = word.toUpperCase();
 }

 public void addHyphen()
 {
  int length = word.length();
  int loc = word.indexOf(' ');
  String first = word.substring(0, loc);
  String second = word.substring(loc + 1);
  letters = first + "-" + second;

 }

 public void alphabetize()
 {
   int length = word.length();
   int loc = word.indexOf (' ');
   String alpha = word.substring(0, loc);
   String beta = word.substring(loc + 1);
   char begin = alpha.charAt(0);
   char start = beta.charAt(0);
   
   if ((int) begin > (int) start)
   {
     letters = beta + " " + alpha;
   }
   
   else 
   { 
   letters = word;
   }
 }
 
 public String toString()
 {
  return "" + letters;
 }
}