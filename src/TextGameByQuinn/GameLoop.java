//This is going to be where everything happens in your game
//By gameloop it just means that this is going to be what happens every frame
package textgamebyquinn;

import textgamebyquinn.Map;
import textgamebyquinn.LevelCheck;
import java.util.*;

//basically just a bunch of general utilies that java put into the language
public class GameLoop{
    //Run this by typing "javac -d bin src/TextGameByQuinn/*.java" into the terminal
        //"javac" will tell vscode to tell java to compile the thing we tell it to
            //compiling something turns it from java into binary so the machine can read it
        //"-d" allows us to tell vs code where the thing is and where to put it once we finish compiling it
        // "bin" is the folder that we are putting the code in once it is compiled
        //"src/TextGameByQuinn/*.java" is where the thing is
            //*.java means we are doing all the things in java
    //after doing that, type "java -cp C:/users/chsrobotics/git/TextGame/bin textgamebyquinn.GameLoop" into the terminal
        //"java" tells vscode we want to use java commands
        //"-cp" tells vscode to tell java that we are going give it a class path to run
        //"C:/users/chsrobotics/git/TextGame/bin textgamebyquinn.GameLoop" is where the cass path for java to run is located
            //textgamebyquinn.GameLoop tells us to run GameLoop from the folder textgamebyquinn
        static int xPosition = 7;
        static int yPosition = 7;
        //this creates two integer values to represent our characters position on the map
        //since I have decided the map will be 14x14, I have set them to 7 to begin so our character is at the center
        //these will be editted later when we move
        
        static boolean[][] beenHere = new boolean[15][15]; 
        //this is an arrray
        //this array is 2d which means it will create a grid with x and y axis of whatever values I tell it
        //in this case those values are from 0-14 for each axis
        //this will create a map of booleans that I can call on later when I am making my map checks
        //you call on one by saying name[x coordinate][y coordinate]
            // in this case we would call the 12 4 coordinate by saying beenHere[12][4]
        
        //these set up booleans for each position so we can tell later whether or not we have been there
        public static int gold = 10000; //TODO: this amount should be 0, I am only setting it this high for testing purposes
        //this will be the amount of gold our character has
        public static int dagger = 1;
        public static int sword = 0;
        public static int shield = 0;
        public static int bow = 0;
        public static int armor = 0;
        //these set up various items our character will be able to acquire
        //0 means our character doesn't have one
        //a higher number will indicate the the power of the item
        //exe a sword saved as a 1 will be weak, but a sword saved as a 5 will be powerful
        //the game will automatically equip the most powerful item a character has
        public static int numberOfArrows = 0;
        public static int numberOfPotions = 0;
        //these will determine the amount of various consumables the player possesses
        public static int experience = 0;
        //the player gains experience after each encounter
        public static int level = 1;
        //once the player reaches different experience thresholds, the level will be moved up
        public static double health = 100;
        //the player starts with 100 health, they can lose it and gain it back by doing various actions

        public static int levelDamageMultiplier;

        public static int trollHealth;
        public static int smallSlimeHealth;
        public static int mediumSlimeHealth;
        public static int largeSlimeHealth;
        public static int doubleSmallSlime1Health;
        public static int doubleSmallSlime2Health;
        public static int goblinHealth;
        public static int goblinHealth1;
        public static int goblinHealth2;
        public static int elementalHealth;

        public static int numberOfBossesDefeated;
        public static Scanner scannyBoi = new Scanner(System.in);
        //"Scanner scannyBoi" brings a scanner into existence and names it scannyBoi
            //scanners can take input from the keyboard (or other places, but for our purposes keyboards)
        //"= new Scanner(System.in)" tells that scanner to get input from the place inside the parenthesis
            //in this case, we are getting it from "System.in" which is just what the keyboard is in java
    public static void main(String[] args) {
        //TestClass.TestMethod();
        //System.out.println(TestClass.TestMethod());
    //public means it's accessible by every part of the program
    //static means one of these will always exist in a program
    //void means it doesn't return anything
    
        //System.out.println("Type start to begin ");
        //This will print the thing in the parenthesis

        //String stringyBoi0 = scannyBoi.nextLine();
        //on the next line when the user is using it, it will take what that user types on the next line and save it as stringyboi
        //"String" tells us what data type we are using (ie: string, double, boolean)
        //"stringBoi" is just what we are calling our new String
        //"= scannyBoi" tells us to set our new string to a value gotten from scannyBoi
            //unlike with out Scanner, we didn't need to put new because "String" is a data type while "Scanner" is a class
        //".nextLine()" tells the scanner we mentioned before to get the value the user inputs on the next line
            //this is a command from the import we imported earlier

        //this will be set to true once certain actions in the game have been taken
        //we will display a different message in the game over section depending on wheather or not we have set this to true

       
        //System.out.println("The game has begun. ");
        //System.out.println("Choose Name. ");
        //String stringyBoi1 = scannyBoi.nextLine();
        System.out.println("Our tale begins one morning as you wake up alone in a large, foggy feild. You have a dagger in your hand and the only concrete memory you have is that you must find and rescue your father. ");

        MapMovement();
        //this will run the method MapMovement()

        //System.out.println(stringyBoi);
            //"System.out. " is how we find our desired command
                //"System. " tell us we are finding a command hardcoded into java
                //"out. " tells we are going to be using a command that has to do with output
            //"print(stringyBoi)" tells us to print whatever is in the parenthesis
                //in this case it is the stringyBoi that the user inputed earlier
        
        //System.out.println("tictac time");
    }
    
    public static void MapMovement(){
        LevelCheck.LevelSet();
        levelDamageMultiplier = level * 2;
        String stringyBoi2 = scannyBoi.nextLine();
        if (stringyBoi2.equals("commit sudoku")){
            Sudoku();
        } else if (stringyBoi2.equals("move forwards")){ 
            yPosition = yPosition + 1;
            Map.CheckPosition();
        } else if (stringyBoi2.equals("move backwards")){
            yPosition = yPosition - 1;
            Map.CheckPosition();
        } else if (stringyBoi2.equals("move right")){ 
            xPosition = xPosition + 1;
            Map.CheckPosition();
        } else if (stringyBoi2.equals("move left")){
            xPosition = xPosition - 1;
            Map.CheckPosition();
        } else {
            System.out.println("That is not a recognized command. ");
            MapMovement();
        }
    }

    public static void Sudoku(){
        System.out.println("You stab yourself ");
        GameOver();
        //this sends us to the game over screen
    }

    public static void GameOver(){
        //this is where we go after the game has ended
        System.out.println("The game is over. ");
        System.out.println("You Lose");
        System.exit(0);
    }
}