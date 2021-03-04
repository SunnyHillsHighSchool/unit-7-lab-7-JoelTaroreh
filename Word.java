import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Word
{
   private  String vowels = "AEIOUaeiou";   	//why is this here?
   																//why is it static?
   
   //add an instance variable
  private String word;
	//create a constructor
	public Word(String s) {
    word = s;
  }
	//create other methods
	//look at the sample runner code
	//on the lab handout

  //method header for getNumVowels()
  public int getNumVowels() {
    //create int counter
    int counter = 0;
    //for loop from 0 to word.length()-1 (i as control variable)
    for(int i = 0; i <word.length(); i++) {
      //for loop from 0 to vowels.length()-1 (j as control variable)
      for(int j = 0; j < vowels.length(); j++) {
        //if statement, if vowels at index j equals char of word at index i
        if(vowels.substring(j,j+1).equals(word.substring(i,i+1))) {
          //increment counter by 1
          counter++;
        }
      }
    }
    //return counter
    return counter;
  }

  //method header for getLength()
  public int getLength() {
    //return word.length()
    return word.length();
  }

  //
  public void setWord(String s) {
    word = s;
  }

	//create a toString method
  public String toString() {
    return word;
  }
}