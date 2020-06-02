import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class PracticeClass {

	private String word;
	private int num;

	public PracticeClass(String string, int number){
		word = string;
		num = number;
	}

	public String toString(){
		return word + " " + num;
	}

}