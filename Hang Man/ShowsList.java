import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

class ShowsList extends ChooseList{

  @Override
public String wordandList(){  
ArrayList<String> showList = new ArrayList<String>();
  
showList.add("adventure time");
showList.add("big time rush");
showList.add("caillou");
showList.add("drake and josh");
showList.add("ed edd and eddy");
showList.add("family guy");
showList.add("game of thrones");
showList.add("hannah montana");
showList.add("icarly");
showList.add("jackass");
showList.add("kenan and kel");
showList.add("lizzie mcguire");
showList.add("malcolm in the middle");
showList.add("naruto");
showList.add("the office");
showList.add("parks and recreation");
showList.add("queer duck");
showList.add("regular show");
showList.add("scrubs");
showList.add("teen titans");
showList.add("ugly betty");
showList.add("viva la bam");
showList.add("the walking dead");
showList.add("x files");
showList.add("yu gi oh");
showList.add("z nation");

WordList word = new WordList(showList);
String randomWord = word.getWord();
return randomWord;
}}