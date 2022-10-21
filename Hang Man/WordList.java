import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class WordList {
  
  String word;
  ArrayList<String> wordList;
  
public WordList(ArrayList<String> list){
  this.wordList = list;
}
  public void setWord(String word){    
    this.word=word;
 
  }

  public String getWord(){
    try{
    Random rand = new Random();
    int index = rand.nextInt(1000);
    String setword = wordList.get(index);
    word = setword;
    return word;
  }catch(Exception IndexArrayOutofBoundsException){
    Random rand = new Random();
    int index = rand.nextInt(26);
    String setword = wordList.get(index);
    word = setword;
    return word;
  }
  }
} 
