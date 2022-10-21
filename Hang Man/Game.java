import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

class Game {

  public void game(){

Scanner scan2 = new Scanner(System.in);
    boolean isBad = true;
    String underScore;
    Scanner scan4 = new Scanner(System.in);
    Welcome welcome = new Welcome();
    
welcome.welcome();
    
//----------------------------------------------------------------------------------------
    
ArrayList<Character> playerGuesses = new ArrayList<>();
//WordsoFar.printWordsoFar(randomWord, playerGuesses);
//System.out.println(randomWord);
int wrongCount = 0;

        ShowsList show = new ShowsList ();
        AnimalsList animal = new AnimalsList();
        FoodList food = new FoodList(); 
        String randomWord = "_";

    
  
      System.out.println("What category would you like to pick? \n Food \n Shows \n Animals \n");
String category = scan4.nextLine().toLowerCase();

     
    switch(category){   

      case "food": 
       randomWord = food.wordandList();
        break;

      case "shows": 
       randomWord = show.wordandList();
        break;

      case "animals": 
       randomWord = animal.wordandList();
        break;
        
      default: System.out.println("Your choice is not an option. Restart the game to try again!");
        System.exit(0);
      //isBad = true;
      break;
      }   


//System.out.println(randomWord);
//WordList word = new WordList(wordList);
//String randomWord = word.getWord();
//--------------------------------------------------------------------------------------------

while(isBad){
    
            if (wrongCount == 1) {
System.out.println("  ______________");
System.out.println("  | /          |");
System.out.println("  |/           😥");
System.out.println("  |");
System.out.println("  |");
System.out.println("  | ");
System.out.println("  |\\ ");
System.out.println(" _|_\\___________");
System.out.println("|_______________|");
            }

  if (wrongCount == 2) {
System.out.println("  ______________");
System.out.println("  | /          |");
System.out.println("  |/           😥");
System.out.println("  |            👕");
System.out.println("  |");
System.out.println("  | ");
System.out.println("  |\\ ");
System.out.println(" _|_\\___________");
System.out.println("|_______________|");
  }

  if (wrongCount == 3) {
System.out.println("  ______________");
System.out.println("  | /          |");
System.out.println("  |/           😥");
System.out.println("  |           /👕");
System.out.println("  |");
System.out.println("  | ");
System.out.println("  |\\ ");
System.out.println(" _|_\\___________");
System.out.println("|_______________|");
  }

  if (wrongCount == 4) {
System.out.println("  ______________");
System.out.println("  | /          |");
System.out.println("  |/           😥");
System.out.println("  |           /👕\\ ");
System.out.println("  |");
System.out.println("  | ");
System.out.println("  |\\ ");
System.out.println(" _|_\\___________");
System.out.println("|_______________|");
  }  

  if (wrongCount == 5) {
System.out.println("  ______________");
System.out.println("  | /          |");
System.out.println("  |/           😥");
System.out.println("  |           /👕\\ ");
System.out.println("  |            👖 ");
System.out.println("  | ");
System.out.println("  |\\ ");
System.out.println(" _|_\\___________");
System.out.println("|_______________|");
  }

  if (wrongCount == 6) {
System.out.println("  ______________");
System.out.println("  | /          |");
System.out.println("  |/           💀");
System.out.println("  |           /👕\\ ");
System.out.println("  |            👖 ");
System.out.println("  |            🥾 ");
System.out.println("  |\\ ");
System.out.println(" _|_\\___________");
System.out.println("|_______________|");
System.out.println("");

  }


  else{
    System.out.println("");   
  }

  if (wrongCount >= 6){
 System.out.println("Oh no! The man wasn't saved. ☹️ You lose!");
    break;
  }



  while(isBad){
    isBad = false;
    
  System.out.println("Type 'letter' to guess a letter or 'answer' to guess the answer:");
    String choice = scan2.nextLine().toLowerCase();
  
  
  switch(choice) {
    case "letter": System.out.println("What letter would you like to pick?");
     
      break;

    case "answer" : System.out.println("What is your answer?");
   
      break;

    default: System.out.println("Your choice is not an option. Please choose again! ");
      isBad = true;
      break;
  
      }
  }

//----------------------------------------------------------------

  Scanner scan = new Scanner(System.in);
  
  String inputAnswer = scan.nextLine().toLowerCase();
  
  int caseNumber=0; 

    

    if (!randomWord.contains(inputAnswer)){
    wrongCount++;
    }
    //-------------------------------------------------------------------------
    
    if( inputAnswer.length() <= 1 ){
     caseNumber=1;
   
     
    }
        
    else if( inputAnswer.equals(randomWord) ) {
     caseNumber=3;
      
    }

    else{
      caseNumber=2;
      
    }

///---------------------------------------------------------------------------
  switch(caseNumber) {
      
  case 1:

      playerGuesses.add(inputAnswer.charAt(0)); 
      isBad = true;
      break;

  case 2:      
      System.out.println("Your answer is incorrect! Please try again: ");
    isBad = true;   
    break;

      
    case 3:

for (char c : inputAnswer.toCharArray()) {
  playerGuesses.add(c);
}
      //System.out.println("Congratulations, you've saved the man. You're a hero! 😎 ");     
    break;  

      
}
if (WordsoFar.printWordsoFar(randomWord, playerGuesses)) {
    System.out.println("Congratulations, you've saved the man. You're a hero! 😎 ");   
        break;    
  
}}

  }}