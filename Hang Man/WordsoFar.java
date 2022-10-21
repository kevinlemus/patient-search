import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class WordsoFar{

public static boolean printWordsoFar(String randomWord, ArrayList<Character> playerGuesses){

  char space = ' ';
  int correctCount = 0;

  
  for (int i=0; i<randomWord.length(); i++){
  if (playerGuesses.contains(randomWord.charAt(i))){
    System.out.print(randomWord.charAt(i));
    correctCount++;
  }

  else if(space == randomWord.charAt(i)){        
  System.out.print(' ');
  }
    
  else{
    System.out.print("_");
  }
}
System.out.println();

return (randomWord.length() == correctCount);
}}