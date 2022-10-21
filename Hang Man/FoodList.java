import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

class FoodList extends ChooseList{

  @Override
public String wordandList(){
  ArrayList<String> foodList = new ArrayList<String>();
  
foodList.add("apple");
foodList.add("banana");
foodList.add("cantaloupe");
foodList.add("durian");
foodList.add("elderberry");
foodList.add("fig");
foodList.add("grapefruit");
foodList.add("hashbrown");
foodList.add("ice cream");
foodList.add("jackfruit");
foodList.add("kale");
foodList.add("lettuce");
foodList.add("mango");
foodList.add("nachos");
foodList.add("oatmeal");
foodList.add("plum");
foodList.add("quesadilla");
foodList.add("raspberry");
foodList.add("strawberry");
foodList.add("tangelo");
foodList.add("udon noodles");
foodList.add("venison");
foodList.add("watermelon");
foodList.add("xigua");
foodList.add("yogurt");
foodList.add("zucchini");

WordList word = new WordList(foodList);
String randomWord = word.getWord();
return randomWord;
}  
}
