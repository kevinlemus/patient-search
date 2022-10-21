import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

class AnimalsList extends ChooseList{

  @Override
 public String wordandList(){
  
ArrayList<String> animalsList = new ArrayList<String>();
  
animalsList.add("anaconda");
animalsList.add("baboon");
animalsList.add("caribou");
animalsList.add("donkey");
animalsList.add("elephant");
animalsList.add("ferret");
animalsList.add("giraffe");
animalsList.add("hedgehog");
animalsList.add("iguana");
animalsList.add("jaguar");
animalsList.add("kitten");
animalsList.add("lion");
animalsList.add("mouse");
animalsList.add("newt");
animalsList.add("ostrich");
animalsList.add("pig");
animalsList.add("quagga");
animalsList.add("rabbit");
animalsList.add("snake");
animalsList.add("tiger");
animalsList.add("urial");
animalsList.add("viper");
animalsList.add("walrus");
animalsList.add("xerus");
animalsList.add("yabby");
animalsList.add("zebra");

WordList word = new WordList(animalsList);
String randomWord = word.getWord();
return randomWord;
   
 }
}