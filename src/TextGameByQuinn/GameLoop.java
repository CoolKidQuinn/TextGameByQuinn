//This is going to be where everything happens in your game
//By gameloop it just means that this is going to be what happens every frame
package textgamebyquinn;

import textgamebyquinn.AirElemental;
import textgamebyquinn.EarthElemental;
import textgamebyquinn.FireElemental;
import textgamebyquinn.WaterElemental;
import textgamebyquinn.Troll1;
import textgamebyquinn.MediumSlime;
import textgamebyquinn.SmallSlime;
import textgamebyquinn.TrappedTreasure;
import textgamebyquinn.Treasure1;
import textgamebyquinn.Treasure2;
import textgamebyquinn.Treasure3;
import textgamebyquinn.Treasure4;
import textgamebyquinn.Treasure5;
import textgamebyquinn.Shop1;
import textgamebyquinn.Shop2;
import textgamebyquinn.Shop3;
import textgamebyquinn.Shop4;
import textgamebyquinn.Shop5;
import textgamebyquinn.TestClass;
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
        //in this case those values are from 0-13 for each axis
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

        public static int trollHealth;
        public static int smallSlimeHealth;
        public static int mediumSlimeHealth;
        public static int largeSlimeHealth;
        public static int doubleSmallSlime1Health;
        public static int doubleSmallSlime2Health;

        public static Scanner scannyBoi = new Scanner(System.in);
        //"Scanner scannyBoi" brings a scanner into existence and names it scannyBoi
            //scanners can take input from the keyboard (or other places, but for our purposes keyboards)
        //"= new Scanner(System.in)" tells that scanner to get input from the place inside the parenthesis
            //in this case, we are getting it from "System.in" which is just what the keyboard is in java
    public static void main(String[] args) {
        TestClass.TestMethod();
        System.out.println(TestClass.TestMethod());
    //public means it's accessible by every part of the program
    //static means one of these will always exist in a program
    //void means it doesn't return anything
    
        //System.out.print("Type start to begin ");
        //This will print the thing in the parenthesis

        //String stringyBoi0 = scannyBoi.nextLine();
        //on the next line when the user is using it, it will take what that user types on the next line and save it as stringyboi
        //"String" tells us what data type we are using (ie: string, double, boolean)
        //"stringBoi" is just what we are calling our new String
        //"= scannyBoi" tells us to set our new string to a value gotten from scannyBoi
            //unlike with out Scanner, we didn't need to put new because "String" is a data type while "Scanner" is a class
        //".nextLine()" tells the scanner we mentioned before to get the value the user inputs on the next line
            //this is a command from the import we imported earlier

        boolean win = false;
        //creates a boolean for wheather or not we win
        //this will be set to true once certain actions in the game have been taken
        //we will display a different message in the game over section depending on wheather or not we have set this to true

       
        System.out.print("The game has begun. ");
        System.out.print("Choose Name. ");
        String stringyBoi1 = scannyBoi.nextLine();
        System.out.print("Our tale begins one morning as you wake up alone in a large, foggy feild. You have a dagger in your hand and the only concrete memory you have is that you must find and rescue your father. ");

        MapMovement();
        //this will run the method MapMovement()

        //System.out.print(stringyBoi);
            //"System.out. " is how we find our desired command
                //"System. " tell us we are finding a command hardcoded into java
                //"out. " tells we are going to be using a command that has to do with output
            //"print(stringyBoi)" tells us to print whatever is in the parenthesis
                //in this case it is the stringyBoi that the user inputed earlier
        
        //System.out.print("tictac time");
    }
    
    public static void MapMovement(){
        if (health <= 0) {
            GameOver();
        } else {
            if (experience >= 50){
                level = 2;
            } 
            if (experience >= 150){
                level = 3;
            }
            if (experience >= 350){
                level = 4;
            }
            if (experience >= 650){
                level = 5;
            }
            if (experience >= 1050){
                level = 6;
            }
            if (experience >= 1550){
                level = 7;
            }
            if (experience >= 2150){
                level = 8;
            }
            if (experience >= 2850){
                level = 9;
            }
            if (experience >= 3650){
                level = 10;
            }
            String stringyBoi2 = scannyBoi.nextLine();
            if (stringyBoi2.equals("commit sudoku")){
                Sudoku();
            } else if (stringyBoi2.equals("move forwards")){ 
                yPosition = yPosition + 1;
                CheckPosition();
            } else if (stringyBoi2.equals("move backwards")){
                yPosition = yPosition - 1;
                CheckPosition();
            } else if (stringyBoi2.equals("move right")){ 
                xPosition = xPosition + 1;
                CheckPosition();
            } else if (stringyBoi2.equals("move left")){
                xPosition = xPosition - 1;
                CheckPosition();
            } else {
                System.out.print("That is not a recognized command. ");
                MapMovement();
            }
        }
    }

    public static void Sudoku(){
        System.out.print("You stab yourself ");
        GameOver();
        //this sends us to the game over screen
    }

    public static void CheckPosition(){
        //System.out.print("hmmm");
        //this will check the position of our character after moving
        //each possible position will have a different encounter
            //these encounters can be treasure, enemies, weapons, etc.
        if ((xPosition > 14) || (xPosition < 1) || (yPosition > 14) || (yPosition < 1)){
            System.out.print("There is a wall there. ");
            MapMovement();
            if (xPosition > 14){
                xPosition = 14;
            } else if (xPosition < 1){
                xPosition = 1;
            } else if (yPosition > 14){
                yPosition = 14;
            } else {
                yPosition = 1;
            }
            //this stops our character from leaving the map we have programmed
        } else if (xPosition == 1){
            switch (yPosition){
                case 1 :  
                    if (beenHere[1][1] == false){
                    //this checks to see if we have already been here
                        beenHere[1][1] = true;
                        //this will tell the code that we have now been here
    
                        //this is where we put the encounter that happens in this location
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (beenHere[1][2] == false){
                        beenHere[1][2] = true;
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (beenHere[1][3] == false){
                        beenHere[1][3] = true;
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (beenHere[1][4] == false){
                        beenHere[1][4] = true;
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (beenHere[1][5] == false){
                        beenHere[1][5] = true;
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (beenHere[1][6] == false){
                        beenHere[1][6] = true;
                    } else {
                       RepeatedArea();
                    };
                case 7 : 
                    if (beenHere[1][7] == false){
                        beenHere[1][7] = true;
                    } else {
                       RepeatedArea();
                    };
                case 8 : 
                    if (beenHere[1][8] == false){
                        beenHere[1][8] = true;
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (beenHere[1][9] == false){
                        beenHere[1][9] = true;
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (beenHere[1][10] == false){
                        beenHere[1][10] = true;
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (beenHere[1][11] == false){
                        beenHere[1][11] = true;
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (beenHere[1][12] == false){
                        beenHere[1][12] = true;
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (beenHere[1][13] == false){
                        beenHere[1][13] = true;
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (beenHere[1][14] == false){
                        beenHere[1][14] = true;
                    } else {
                       RepeatedArea();
                    };
            } 

        } else if (xPosition == 2){
            switch (yPosition){
                case 1 :  
                    if (beenHere[2][1] == false){
                    //this checks to see if we have already been here
                        beenHere[2][1] = true;
                        //this will tell the code that we have now been here
    
                        //this is where we put the encounter that happens in this location
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (beenHere[2][2] == false){
                        beenHere[2][2] = true;
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (beenHere[2][3] == false){
                        beenHere[2][3] = true;
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (beenHere[2][4] == false){
                        beenHere[2][4] = true;
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (beenHere[2][5] == false){
                        beenHere[2][5] = true;
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (beenHere[2][6] == false){
                        beenHere[2][6] = true;
                    } else {
                       RepeatedArea();
                    };
                case 7 : 
                    if (beenHere[2][7] == false){
                        beenHere[2][7] = true;
                    } else {
                       RepeatedArea();
                    };
                case 8 : 
                    if (beenHere[2][8] == false){
                        beenHere[2][8] = true;
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (beenHere[2][9] == false){
                        beenHere[2][9] = true;
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (beenHere[2][10] == false){
                        beenHere[2][10] = true;
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (beenHere[2][11] == false){
                        beenHere[2][11] = true;
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (beenHere[2][12] == false){
                        beenHere[2][12] = true;
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (beenHere[2][13] == false){
                        beenHere[2][13] = true;
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (beenHere[2][14] == false){
                        beenHere[2][14] = true;
                    } else {
                       RepeatedArea();
                    };
            }
            
        } else if (xPosition == 3){
            switch (yPosition){
                case 1 :  
                    if (beenHere[3][1] == false){
                    //this checks to see if we have already been here
                        beenHere[3][1] = true;
                        //this will tell the code that we have now been here
    
                        //this is where we put the encounter that happens in this location
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (beenHere[3][2] == false){
                        beenHere[3][2] = true;
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (beenHere[3][3] == false){
                        beenHere[3][3] = true;
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (beenHere[3][4] == false){
                        beenHere[3][4] = true;
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (beenHere[3][5] == false){
                        beenHere[3][5] = true;
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (beenHere[3][6] == false){
                        beenHere[3][6] = true;
                    } else {
                       RepeatedArea();
                    };
                case 7 : 
                    if (beenHere[3][7] == false){
                        beenHere[3][7] = true;
                    } else {
                       RepeatedArea();
                    };
                case 8 : 
                    if (beenHere[3][8] == false){
                        beenHere[3][8] = true;
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (beenHere[3][9] == false){
                        beenHere[3][9] = true;
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (beenHere[3][10] == false){
                        beenHere[3][10] = true;
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (beenHere[3][11] == false){
                        beenHere[3][11] = true;
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (beenHere[3][12] == false){
                        beenHere[3][12] = true;
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (beenHere[3][13] == false){
                        beenHere[3][13] = true;
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (beenHere[3][14] == false){
                        beenHere[3][14] = true;
                    } else {
                       RepeatedArea();
                    };
            } 
        } else if (xPosition == 4){
            switch (yPosition){
                case 1 :  
                    if (beenHere[4][1] == false){
                    //this checks to see if we have already been here
                        beenHere[4][1] = true;
                        //this will tell the code that we have now been here
    
                        //this is where we put the encounter that happens in this location
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (beenHere[4][2] == false){
                        beenHere[4][2] = true;
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (beenHere[4][3] == false){
                        beenHere[4][3] = true;
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (beenHere[4][4] == false){
                        beenHere[4][4] = true;
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (beenHere[4][5] == false){
                        beenHere[4][5] = true;
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (beenHere[4][6] == false){
                        beenHere[4][6] = true;
                    } else {
                       RepeatedArea();
                    };
                case 7 : 
                    if (beenHere[4][7] == false){
                        beenHere[4][7] = true;
                    } else {
                       RepeatedArea();
                    };
                case 8 : 
                    if (beenHere[4][8] == false){
                        beenHere[4][8] = true;
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (beenHere[4][9] == false){
                        beenHere[4][9] = true;
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (beenHere[4][10] == false){
                        beenHere[4][10] = true;
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (beenHere[4][11] == false){
                        beenHere[4][11] = true;
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (beenHere[4][12] == false){
                        beenHere[4][12] = true;
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (beenHere[4][13] == false){
                        beenHere[4][13] = true;
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (beenHere[4][14] == false){
                        beenHere[4][14] = true;
                    } else {
                       RepeatedArea();
                    };
            }
        } else if (xPosition == 5){
            switch (yPosition){
                case 1 :  
                    if (beenHere[5][1] == false){
                    //this checks to see if we have already been here
                        beenHere[5][1] = true;
                        //this will tell the code that we have now been here
    
                        //this is where we put the encounter that happens in this location
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (beenHere[5][2] == false){
                        beenHere[5][2] = true;
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (beenHere[5][3] == false){
                        beenHere[5][3] = true;
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (beenHere[5][4] == false){
                        beenHere[5][4] = true;
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (beenHere[5][5] == false){
                        beenHere[5][5] = true;
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (beenHere[5][6] == false){
                        beenHere[5][6] = true;
                    } else {
                       RepeatedArea();
                    };
                case 7 : 
                    if (beenHere[5][7] == false){
                        beenHere[5][7] = true;
                    } else {
                       RepeatedArea();
                    };
                case 8 : 
                    if (beenHere[5][8] == false){
                        beenHere[5][8] = true;
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (beenHere[5][9] == false){
                        beenHere[5][9] = true;
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (beenHere[5][10] == false){
                        beenHere[5][10] = true;
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (beenHere[5][11] == false){
                        beenHere[5][11] = true;
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (beenHere[5][12] == false){
                        beenHere[5][12] = true;
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (beenHere[5][13] == false){
                        beenHere[5][13] = true;
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (beenHere[5][14] == false){
                        beenHere[5][14] = true;
                    } else {
                       RepeatedArea();
                    };
            }
        } else if (xPosition == 6){
            switch (yPosition){
                case 1 :  
                    if (beenHere[6][1] == false){
                    //this checks to see if we have already been here
                        beenHere[6][1] = true;
                        //this will tell the code that we have now been here
    
                        //this is where we put the encounter that happens in this location
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (beenHere[6][2] == false){
                        beenHere[6][2] = true;
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (beenHere[6][3] == false){
                        beenHere[6][3] = true;
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (beenHere[6][4] == false){
                        beenHere[6][4] = true;
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (beenHere[6][5] == false){
                        beenHere[6][5] = true;
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (beenHere[6][6] == false){
                        beenHere[6][6] = true;
                    } else {
                       RepeatedArea();
                    };
                case 7 : 
                    if (beenHere[6][7] == false){
                        beenHere[6][7] = true;
                    } else {
                       RepeatedArea();
                    };
                case 8 : 
                    if (beenHere[6][8] == false){
                        beenHere[6][8] = true;
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (beenHere[6][9] == false){
                        beenHere[6][9] = true;
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (beenHere[6][10] == false){
                        beenHere[6][10] = true;
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (beenHere[6][11] == false){
                        beenHere[6][11] = true;
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (beenHere[6][12] == false){
                        beenHere[6][12] = true;
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (beenHere[6][13] == false){
                        beenHere[6][13] = true;
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (beenHere[6][14] == false){
                        beenHere[6][14] = true;
                    } else {
                       RepeatedArea();
                    };
            }
        } else if (xPosition == 7){
            switch (yPosition){
                case 1 :  
                    if (beenHere[7][1] == false){
                    //this checks to see if we have already been here
                        beenHere[7][1] = true;
                        //this will tell the code that we have now been here
                        MediumSlime.MediumSlimeEncounter();
                        //this is where we put the encounter that happens in this location
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (beenHere[7][2] == false){
                        beenHere[7][2] = true;
                        SmallSlime.SmallSlimeEncounter();
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (beenHere[7][3] == false){
                        beenHere[7][3] = true;
                        Troll1.Troll1Encounter();
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (beenHere[7][4] == false){
                        beenHere[7][4] = true;
                        Treasure1.Treasure();
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (beenHere[7][5] == false){
                        beenHere[7][5] = true;
                        Treasure2.Treasure();
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (beenHere[7][6] == false){
                        beenHere[7][6] = true;
                        Treasure3.Treasure();
                    } else {
                       RepeatedArea();
                    };
                case 7 : 
                    if (beenHere[7][7] == false){
                        beenHere[7][7] = true;
                        Treasure4.Treasure();
                    } else {
                       RepeatedArea();
                    };
                case 8 : 
                    if (beenHere[7][8] == false){
                        beenHere[7][8] = true;
                        Treasure5.Treasure();
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (beenHere[7][9] == false){
                        Shop1.Shop();
                        beenHere[7][9] = true;
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (beenHere[7][10] == false){
                        Shop2.Shop();
                        beenHere[7][10] = true;
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (beenHere[7][11] == false){
                        Shop3.Shop();
                        beenHere[7][11] = true;
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (beenHere[7][12] == false){
                        Shop4.Shop();
                        beenHere[7][12] = true;
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (beenHere[7][13] == false){
                        Shop5.Shop();
                        beenHere[7][13] = true;
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (beenHere[7][14] == false){
                        TrappedTreasure.Treasure();
                        beenHere[7][14] = true;
                    } else {
                       RepeatedArea();
                    };
            }
        } else if (xPosition == 8){
            switch (yPosition){
                case 1 :  
                    if (beenHere[8][1] == false){
                    //this checks to see if we have already been here
                        beenHere[8][1] = true;
                        //this will tell the code that we have now been here
    
                        //this is where we put the encounter that happens in this location
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (beenHere[8][2] == false){
                        beenHere[8][2] = true;
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (beenHere[8][3] == false){
                        beenHere[8][3] = true;
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (beenHere[8][4] == false){
                        beenHere[8][4] = true;
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (beenHere[8][5] == false){
                        beenHere[8][5] = true;
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (beenHere[8][6] == false){
                        beenHere[8][6] = true;
                    } else {
                       RepeatedArea();
                    };
                case 7 : 
                    if (beenHere[8][7] == false){
                        beenHere[8][7] = true;
                    } else {
                       RepeatedArea();
                    };
                case 8 : 
                    if (beenHere[8][8] == false){
                        beenHere[8][8] = true;
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (beenHere[8][9] == false){
                        beenHere[8][9] = true;
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (beenHere[8][10] == false){
                        beenHere[8][10] = true;
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (beenHere[8][11] == false){
                        beenHere[8][11] = true;
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (beenHere[8][12] == false){
                        beenHere[8][12] = true;
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (beenHere[8][13] == false){
                        beenHere[8][13] = true;
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (beenHere[8][14] == false){
                        beenHere[8][14] = true;
                    } else {
                       RepeatedArea();
                    };
            }
        } else if (xPosition == 9){
            switch (yPosition){
                case 1 :  
                    if (beenHere[9][1] == false){
                    //this checks to see if we have already been here
                        beenHere[9][1] = true;
                        //this will tell the code that we have now been here
    
                        //this is where we put the encounter that happens in this location
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (beenHere[9][2] == false){
                        beenHere[9][2] = true;
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (beenHere[9][3] == false){
                        beenHere[9][3] = true;
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (beenHere[9][4] == false){
                        beenHere[9][4] = true;
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (beenHere[9][5] == false){
                        beenHere[9][5] = true;
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (beenHere[9][6] == false){
                        beenHere[9][6] = true;
                    } else {
                       RepeatedArea();
                    };
                case 7 : 
                    if (beenHere[9][7] == false){
                        beenHere[9][7] = true;
                    } else {
                       RepeatedArea();
                    };
                case 8 : 
                    if (beenHere[9][8] == false){
                        beenHere[9][8] = true;
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (beenHere[9][9] == false){
                        beenHere[9][9] = true;
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (beenHere[9][10] == false){
                        beenHere[9][10] = true;
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (beenHere[9][11] == false){
                        beenHere[9][11] = true;
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (beenHere[9][12] == false){
                        beenHere[9][12] = true;
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (beenHere[9][13] == false){
                        beenHere[9][13] = true;
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (beenHere[9][14] == false){
                        beenHere[9][14] = true;
                    } else {
                       RepeatedArea();
                    };
            }
        } else if (xPosition == 10){
            switch (yPosition){
                case 1 :  
                    if (beenHere[10][1] == false){
                    //this checks to see if we have already been here
                        beenHere[10][1] = true;
                        //this will tell the code that we have now been here
    
                        //this is where we put the encounter that happens in this location
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (beenHere[10][2] == false){
                        beenHere[10][2] = true;
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (beenHere[10][3] == false){
                        beenHere[10][3] = true;
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (beenHere[10][4] == false){
                        beenHere[10][4] = true;
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (beenHere[10][5] == false){
                        beenHere[10][5] = true;
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (beenHere[10][6] == false){
                        beenHere[10][6] = true;
                    } else {
                       RepeatedArea();
                    };
                case 7 : 
                    if (beenHere[10][7] == false){
                        beenHere[10][7] = true;
                    } else {
                       RepeatedArea();
                    };
                case 8 : 
                    if (beenHere[10][8] == false){
                        beenHere[10][8] = true;
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (beenHere[10][9] == false){
                        beenHere[10][9] = true;
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (beenHere[10][10] == false){
                        beenHere[10][10] = true;
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (beenHere[10][11] == false){
                        beenHere[10][11] = true;
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (beenHere[10][12] == false){
                        beenHere[10][12] = true;
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (beenHere[10][13] == false){
                        beenHere[10][13] = true;
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (beenHere[10][14] == false){
                        beenHere[10][14] = true;
                    } else {
                       RepeatedArea();
                    };
            }
        } else if (xPosition == 11){
            switch (yPosition){
                case 1 :  
                    if (beenHere[11][1] == false){
                    //this checks to see if we have already been here
                        beenHere[11][1] = true;
                        //this will tell the code that we have now been here
    
                        //this is where we put the encounter that happens in this location
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (beenHere[11][2] == false){
                        beenHere[11][2] = true;
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (beenHere[11][3] == false){
                        beenHere[11][3] = true;
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (beenHere[11][4] == false){
                        beenHere[11][4] = true;
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (beenHere[11][5] == false){
                        beenHere[11][5] = true;
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (beenHere[11][6] == false){
                        beenHere[11][6] = true;
                    } else {
                       RepeatedArea();
                    };
                case 7 : 
                    if (beenHere[11][7] == false){
                        beenHere[11][7] = true;
                    } else {
                       RepeatedArea();
                    };
                case 8 : 
                    if (beenHere[11][8] == false){
                        beenHere[11][8] = true;
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (beenHere[11][9] == false){
                        beenHere[11][9] = true;
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (beenHere[11][10] == false){
                        beenHere[11][10] = true;
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (beenHere[11][11] == false){
                        beenHere[11][11] = true;
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (beenHere[11][12] == false){
                        beenHere[11][12] = true;
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (beenHere[11][13] == false){
                        beenHere[11][13] = true;
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (beenHere[11][14] == false){
                        beenHere[11][14] = true;
                    } else {
                       RepeatedArea();
                    };
            }
        } else if (xPosition == 12){
            switch (yPosition){
                case 1 :  
                    if (beenHere[12][1] == false){
                    //this checks to see if we have already been here
                        beenHere[12][1] = true;
                        //this will tell the code that we have now been here
    
                        //this is where we put the encounter that happens in this location
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (beenHere[12][2] == false){
                        beenHere[12][2] = true;
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (beenHere[12][3] == false){
                        beenHere[12][3] = true;
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (beenHere[12][4] == false){
                        beenHere[12][4] = true;
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (beenHere[12][5] == false){
                        beenHere[12][5] = true;
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (beenHere[12][6] == false){
                        beenHere[12][6] = true;
                    } else {
                       RepeatedArea();
                    };
                case 7 : 
                    if (beenHere[12][7] == false){
                        beenHere[12][7] = true;
                    } else {
                       RepeatedArea();
                    };
                case 8 : 
                    if (beenHere[12][8] == false){
                        beenHere[12][8] = true;
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (beenHere[12][9] == false){
                        beenHere[12][9] = true;
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (beenHere[12][10] == false){
                        beenHere[12][10] = true;
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (beenHere[12][11] == false){
                        beenHere[12][11] = true;
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (beenHere[12][12] == false){
                        beenHere[12][12] = true;
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (beenHere[12][13] == false){
                        beenHere[12][13] = true;
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (beenHere[12][14] == false){
                        beenHere[12][14] = true;
                    } else {
                       RepeatedArea();
                    };
            }
        } else if (xPosition == 13){
            switch (yPosition){
                case 1 :  
                    if (beenHere[13][1] == false){
                    //this checks to see if we have already been here
                        beenHere[13][1] = true;
                        //this will tell the code that we have now been here
    
                        //this is where we put the encounter that happens in this location
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (beenHere[13][2] == false){
                        beenHere[13][2] = true;
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (beenHere[13][3] == false){
                        beenHere[13][3] = true;
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (beenHere[13][4] == false){
                        beenHere[13][4] = true;
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (beenHere[13][5] == false){
                        beenHere[13][5] = true;
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (beenHere[13][6] == false){
                        beenHere[13][6] = true;
                    } else {
                       RepeatedArea();
                    };
                case 7 : 
                    if (beenHere[13][7] == false){
                        beenHere[13][7] = true;
                    } else {
                       RepeatedArea();
                    };
                case 8 : 
                    if (beenHere[13][8] == false){
                        beenHere[13][8] = true;
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (beenHere[13][9] == false){
                        beenHere[13][9] = true;
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (beenHere[13][10] == false){
                        beenHere[13][10] = true;
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (beenHere[13][11] == false){
                        beenHere[13][11] = true;
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (beenHere[13][12] == false){
                        beenHere[13][12] = true;
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (beenHere[13][13] == false){
                        beenHere[13][13] = true;
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (beenHere[13][14] == false){
                        beenHere[13][14] = true;
                        System.out.print("hmmm but its the second one");
                    } else {
                       RepeatedArea();
                    };
                }
        } else if (xPosition == 14){
            switch (yPosition){
                case 1 :  
                    if (beenHere[14][1] == false){
                    //this checks to see if we have already been here
                        beenHere[14][1] = true;
                        //this will tell the code that we have now been here
    
                        //this is where we put the encounter that happens in this location
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (beenHere[14][2] == false){
                        beenHere[14][2] = true;
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (beenHere[14][3] == false){
                        beenHere[14][3] = true;
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (beenHere[14][4] == false){
                        beenHere[14][4] = true;
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (beenHere[14][5] == false){
                        beenHere[14][5] = true;
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (beenHere[14][6] == false){
                        beenHere[14][6] = true;
                    } else {
                       RepeatedArea();
                    };
                case 7 : 
                    if (beenHere[14][7] == false){
                        beenHere[14][7] = true;
                    } else {
                       RepeatedArea();
                    };
                case 8 : 
                    if (beenHere[14][8] == false){
                        beenHere[14][8] = true;
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (beenHere[14][9] == false){
                        beenHere[14][9] = true;
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (beenHere[14][10] == false){
                        beenHere[14][10] = true;
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (beenHere[14][11] == false){
                        beenHere[14][11] = true;
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (beenHere[14][12] == false){
                        beenHere[14][12] = true;
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (beenHere[14][13] == false){
                        beenHere[14][13] = true;
                        System.out.print("hmmm");
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (beenHere[14][14] == false){
                        beenHere[14][14] = true;
                    } else {
                       RepeatedArea();
                    };
                
            }
        }
    }

    public static void RepeatedArea(){
        System.out.print("You recognize this area. There isn't anything left to do here. ");
        MapMovement();
    }

    public static void GameOver(){
        //this is where we go after the game has ended
        System.out.print("The game is over. ");
        System.out.print("You Lose");
        System.exit(0);
    }
}