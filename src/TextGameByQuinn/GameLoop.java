//This is going to be where everything happens in your game
//By gameloop it just means that this is going to be what happens every frame

import java.util.Scanner;
//basically just a bunch of general utilies that java put into the language
public class GameLoop{
    //Run this by typing "javac -d bin src/TextGameByQuinn/GameLoop.java" into the terminal
        //"javac" will tell vscode to tell java to compile the thing we tell it to
            //compiling something turns it from java into binary so the machine can read it
        //"-d" allows us to tell vs code where the thing is and where to put it once we finish compiling it
        // "bin" is the folder that we are putting the code in once it is compiled
        //"src/TextGameByQuinn/GameLoop.java" is where the thing is
    //after doing that, type "java -cp C:/users/chsrobotics/git/TextGame/bin GameLoop" into the terminal
        //"java" tells vscode we want to use java commands
        //"-cp" tells vscode to tell java that we are going give it a class path to run
        //"C:/users/chsrobotics/git/TextGame/bin GameLoop" is where the cass path for java to run is located
    public static void main(String[] args) {
    //public means it's accessible by every part of the program
    //static means one of these will always exist in a program
    //void means it doesn't return anything
    
        Scanner scannyBoi = new Scanner(System.in);
        //"Scanner scannyBoi" brings a scanner into existence and names it scannyBoi
            //scanners can take input from the keyboard (or other places, but for our purposes keyboards)
        //"= new Scanner(System.in)" tells that scanner to get input from the place inside the parenthesis
            //in this case, we are getting it from "System.in" which is just what the keyboard is in java
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

        int xPosition = 7;
        int yPosition = 7;
        //this creates two integer values to represent our characters position on the map
        //since I have decided the map will be 14x14, I have set them to 7 to begin so our character is at the center
        //these will be editted later when we move
        boolean beenHere1x1 = false;
        boolean beenHere1x2 = false;
        boolean beenHere1x3 = false;
        boolean beenHere1x4 = false;
        boolean beenHere1x5 = false;
        boolean beenHere1x6 = false;
        boolean beenHere1x7 = false;
        boolean beenHere1x8 = false;
        boolean beenHere1x9 = false;
        boolean beenHere1x10 = false;
        boolean beenHere1x11 = false;
        boolean beenHere1x12 = false;
        boolean beenHere1x13 = false;
        boolean beenHere1x14 = false;
        boolean beenHere2x1 = false;
        boolean beenHere2x2 = false;
        boolean beenHere2x3 = false;
        boolean beenHere2x4 = false;
        boolean beenHere2x5 = false;
        boolean beenHere2x6 = false;
        boolean beenHere2x7 = false;
        boolean beenHere2x8 = false;
        boolean beenHere2x9 = false;
        boolean beenHere2x10 = false;
        boolean beenHere2x11 = false;
        boolean beenHere2x12 = false;
        boolean beenHere2x13 = false;
        boolean beenHere2x14 = false;
        boolean beenHere3x1 = false;
        boolean beenHere3x2 = false;
        boolean beenHere3x3 = false;
        boolean beenHere3x4 = false;
        boolean beenHere3x5 = false;
        boolean beenHere3x6 = false;
        boolean beenHere3x7 = false;
        boolean beenHere3x8 = false;
        boolean beenHere3x9 = false;
        boolean beenHere3x10 = false;
        boolean beenHere3x11 = false;
        boolean beenHere3x12 = false;
        boolean beenHere3x13 = false;
        boolean beenHere3x14 = false;
        boolean beenHere4x1 = false;
        boolean beenHere4x2 = false;
        boolean beenHere4x3 = false;
        boolean beenHere4x4 = false;
        boolean beenHere4x5 = false;
        boolean beenHere4x6 = false;
        boolean beenHere4x7 = false;
        boolean beenHere4x8 = false;
        boolean beenHere4x9 = false;
        boolean beenHere4x10 = false;
        boolean beenHere4x11 = false;
        boolean beenHere4x12 = false;
        boolean beenHere4x13 = false;
        boolean beenHere4x14 = false;
        boolean beenHere5x1 = false;
        boolean beenHere5x2 = false;
        boolean beenHere5x3 = false;
        boolean beenHere5x4 = false;
        boolean beenHere5x5 = false;
        boolean beenHere5x6 = false;
        boolean beenHere5x7 = false;
        boolean beenHere5x8 = false;
        boolean beenHere5x9 = false;
        boolean beenHere5x10 = false;
        boolean beenHere5x11 = false;
        boolean beenHere5x12 = false;
        boolean beenHere5x13 = false;
        boolean beenHere5x14 = false;
        boolean beenHere6x1 = false;
        boolean beenHere6x2 = false;
        boolean beenHere6x3 = false;
        boolean beenHere6x4 = false;
        boolean beenHere6x5 = false;
        boolean beenHere6x6 = false;
        boolean beenHere6x7 = false;
        boolean beenHere6x8 = false;
        boolean beenHere6x9 = false;
        boolean beenHere6x10 = false;
        boolean beenHere6x11 = false;
        boolean beenHere6x12 = false;
        boolean beenHere6x13 = false;
        boolean beenHere6x14 = false;
        boolean beenHere7x1 = false;
        boolean beenHere7x2 = false;
        boolean beenHere7x3 = false;
        boolean beenHere7x4 = false;
        boolean beenHere7x5 = false;
        boolean beenHere7x6 = false;
        boolean beenHere7x7 = false;
        boolean beenHere7x8 = false;
        boolean beenHere7x9 = false;
        boolean beenHere7x10 = false;
        boolean beenHere7x11 = false;
        boolean beenHere7x12 = false;
        boolean beenHere7x13 = false;
        boolean beenHere7x14 = false;
        boolean beenHere8x1 = false;
        boolean beenHere8x2 = false;
        boolean beenHere8x3 = false;
        boolean beenHere8x4 = false;
        boolean beenHere8x5 = false;
        boolean beenHere8x6 = false;
        boolean beenHere8x7 = false;
        boolean beenHere8x8 = false;
        boolean beenHere8x9 = false;
        boolean beenHere8x10 = false;
        boolean beenHere8x11 = false;
        boolean beenHere8x12 = false;
        boolean beenHere8x13 = false;
        boolean beenHere8x14 = false;
        boolean beenHere9x1 = false;
        boolean beenHere9x2 = false;
        boolean beenHere9x3 = false;
        boolean beenHere9x4 = false;
        boolean beenHere9x5 = false;
        boolean beenHere9x6 = false;
        boolean beenHere9x7 = false;
        boolean beenHere9x8 = false;
        boolean beenHere9x9 = false;
        boolean beenHere9x10 = false;
        boolean beenHere9x11 = false;
        boolean beenHere9x12 = false;
        boolean beenHere9x13 = false;
        boolean beenHere9x14 = false;
        boolean beenHere10x1 = false;
        boolean beenHere10x2 = false;
        boolean beenHere10x3 = false;
        boolean beenHere10x4 = false;
        boolean beenHere10x5 = false;
        boolean beenHere10x6 = false;
        boolean beenHere10x7 = false;
        boolean beenHere10x8 = false;
        boolean beenHere10x9 = false;
        boolean beenHere10x10 = false;
        boolean beenHere10x11 = false;
        boolean beenHere10x12 = false;
        boolean beenHere10x13 = false;
        boolean beenHere10x14 = false;
        boolean beenHere11x1 = false;
        boolean beenHere11x2 = false;
        boolean beenHere11x3 = false;
        boolean beenHere11x4 = false;
        boolean beenHere11x5 = false;
        boolean beenHere11x6 = false;
        boolean beenHere11x7 = false;
        boolean beenHere11x8 = false;
        boolean beenHere11x9 = false;
        boolean beenHere11x10 = false;
        boolean beenHere11x11 = false;
        boolean beenHere11x12 = false;
        boolean beenHere11x13 = false;
        boolean beenHere11x14 = false;
        boolean beenHere12x1 = false;
        boolean beenHere12x2 = false;
        boolean beenHere12x3 = false;
        boolean beenHere12x4 = false;
        boolean beenHere12x5 = false;
        boolean beenHere12x6 = false;
        boolean beenHere12x7 = false;
        boolean beenHere12x8 = false;
        boolean beenHere12x9 = false;
        boolean beenHere12x10 = false;
        boolean beenHere12x11 = false;
        boolean beenHere12x12 = false;
        boolean beenHere12x13 = false;
        boolean beenHere12x14 = false;
        boolean beenHere13x1 = false;
        boolean beenHere13x2 = false;
        boolean beenHere13x3 = false;
        boolean beenHere13x4 = false;
        boolean beenHere13x5 = false;
        boolean beenHere13x6 = false;
        boolean beenHere13x7 = false;
        boolean beenHere13x8 = false;
        boolean beenHere13x9 = false;
        boolean beenHere13x10 = false;
        boolean beenHere13x11 = false;
        boolean beenHere13x12 = false;
        boolean beenHere13x13 = false;
        boolean beenHere13x14 = false;
        boolean beenHere14x1 = false;
        boolean beenHere14x2 = false;
        boolean beenHere14x3 = false;
        boolean beenHere14x4 = false;
        boolean beenHere14x5 = false;
        boolean beenHere14x6 = false;
        boolean beenHere14x7 = false;
        boolean beenHere14x8 = false;
        boolean beenHere14x9 = false;
        boolean beenHere14x10 = false;
        boolean beenHere14x11 = false;
        boolean beenHere14x12 = false;
        boolean beenHere14x13 = false;
        boolean beenHere14x14 = false;
        //these set up booleans for each position so we can tell later whether or not we have been there
        double gold = 1000000000; //TODO: this amount should be 0, I am only setting it this high for testing purposes
        //this will be the amount of gold our character has
        int dagger = 1;
        int sword = 0;
        int shield = 0;
        int bow = 0;
        int armor = 0;
        //these set up various items our character will be able to acquire
        //0 means our character doesn't have one
        //a higher number will indicate the the power of the item
            //exe a sword saved as a 1 will be weak, but a sword saved as a 5 will be powerful
            //the game will automatically equip the most powerful item a character has
        int numberOfArrows = 0;
        int numberOfPotions = 0;
        //these will determine the amount of various consumables the player possesses
        int experience = 0;
        //the player gains experience after each encounter
        int level = 1;
        //once the player reaches different experience thresholds, the level will be moved up
        int health = 100;
        //the player starts with 100 health, they can lose it and gain it back by doing various actions
        System.out.print("The game has begun. ");
        System.out.print("Choose Name. ");
        String stringyBoi1 = scannyBoi.nextLine();
        System.out.print("Our tale begins one morning as you wake up alone in a large, foggy feild. You have a dagger in your hand and the only concrete memory you have is that you must find and rescue your father.");

        MapMovement();
        //this will run the method MapMovement()

        //System.out.print(stringyBoi);
            //"System.out." is how we find our desired command
                //"System." tell us we are finding a command hardcoded into java
                //"out." tells we are going to be using a command that has to do with output
            //"print(stringyBoi)" tells us to print whatever is in the parenthesis
                //in this case it is the stringyBoi that the user inputed earlier
        
        //System.out.print("tictac time");
    }
    
    public static void MapMovement(){
        if (health <= 0) {
            GameOver();
        } else {
            if (experience > 50){
                level = 2;
            } 
            if (experience > 125){
                level = 3;
            }
            if (experience > 225){
                level = 4;
            }
            if (experience > 350){
                level = 5;
            }
            if (experience > 500){
                level = 6;
            }
            if (experience > 675){
                level = 7;
            }
            if (experience > 875){
                level = 8;
            }
            if (experience > 1100){
                level = 9;
            }
            if (experience > 1350){
                level = 10;
            }
            String stringyBoi2 = scannyBoi.nextLine();
            if (stringyBoi2.equals("commit sudoku")) {
                Sudoku();
                //this is just a joke that allows the character to stab themselves
            } else if (stringyBoi2.equals("move forwards")){
                xPosition = xPosition + 1;
                //this takes the integer we set to be the xPosition of our character and increases the value by one
                //this represents our character moving one space forwards
                CheckPosition();
                //this sends our code to a command that checks our position and depending on our position, does different things
            } else if (stringyBoi2.equals("move backwards")){
                xPosition = xPosition - 1;
                CheckPosition();
            } else if (stringyBoi2.equals("move left")){
                yPosition = yPosition - 1;
                CheckPosition();
            } else if (stringyBoi2.equals("move right")){
                yPosition = yPosition + 1;
                CheckPosition();
            } else{
                System.out.print(stringyBoi2 + " is not a recognized command.");
                MapMovement();
            }
        }
    }

    public static void Sudoku(){
        System.out.print("You stab yourself");
        GameOver();
        //this sends us to the game over screen
    }

    public static void CheckPosition(){
        //this will check the position of our character after moving
        //each possible position will have a different encounter
            //these encounters can be treasure, enemies, weapons, etc.
        if (xPosition > 14 || xPosition < 1 || yPosition > 14 || yPosition < 1){
            System.out.print("You start to " + stringyBoi2 + " but are hurled back the way you came by a mysterious force.");
            //this stops our character from leaving the map we have programmed
            if (xPosition > 14){
                xPosition = 14;
            } else if (xPosition < 1){
                xPosition = 1;
            } else if (yPosition > 14){
                yPosition = 14;
            } else if (yPosition < 1){
                yPosition = 1;
        } else if (xPosition == 1){
        //this checks if the x position of our character is 1, if it is, it then checks the y position
        //if it isn't, it then checks 2, then 3... until it finds the x position
            if (yPosition == 1){
            //this checks the y position, these checks are after each x check so we can find the exact position after each move
                //we can put encounters into each one of these different positions
                if (beenHere1X1 == false){
                //this checks to see if we have already been here
                    beenHere1x1 = true;
                    //this will tell the code that we have now been here

                    //this is where we put the encounter that happens in this location
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 2){
                if (beenHere1x2 == false){
                    beenHere1x2 = true;
                } else {
                    RepeatedArea();
                }   
            } else if (yPosition == 3){
                if (beenHere1x3 == false){
                    beenHere1x3 = true;
                } else {
                    RepeatedArea();
                }  
            } else if (yPosition == 4){
                if (beenHere1x4 == false){
                    beenHere1x4 = true;
                } else {
                    RepeatedArea();
                }  
            } else if (yPosition == 5){
                if (beenHere1x5 == false){
                    beenHere1x5 = true;
                } else {
                    RepeatedArea();
                }  
            } else if (yPosition == 6){
                if (beenHere1x6 == false){
                    beenHere1x6 = true;
                } else {
                    RepeatedArea();
                }  
            } else if (yPosition == 7){
                if (beenHere1x7 == false){
                    beenHere1x7 = true;
                } else {
                    RepeatedArea();
                }  
            } else if (yPosition == 8){
                if (beenHere1x8 == false){
                    beenHere1x8 = true;
                } else {
                    RepeatedArea();
                }  
            } else if (yPosition == 9){
                if (beenHere1x9 == false){
                    beenHere1x9 = true;
                } else {
                    RepeatedArea();
                }  
            } else if (yPosition == 10){
                if (beenHere1x10 == false){
                    beenHere1x10 = true;
                } else {
                    RepeatedArea();
                }  
            } else if (yPosition == 11){
                if (beenHere1x11 == false){
                    beenHere1x11 = true;
                } else {
                    RepeatedArea();
                }  
            } else if (yPosition == 12){
                if (beenHere1x12 == false){
                    beenHere1x12 = true;
                } else {
                    RepeatedArea();
                }  
            } else if (yPosition == 13){
                if (beenHere1x13 == false){
                    beenHere1x13 = true;
                } else {
                    RepeatedArea();
                }  
            } else if (yPosition == 14){
                if (beenHere1x14 == false){
                    beenHere1x14 = true;
                } else {
                    RepeatedArea();
                }  
            }
        }

        } else if (xPosition == 2){
            if (yPosition == 1){
                if (beenHere2x1 == false){
                    beenHere2x1 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 2){
                if (beenHere2x2 == false){
                    beenHere2x2 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 3){
                if (beenHere2x3 == false){
                    beenHere2x3 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 4){
                if (beenHere2x4 == false){
                    beenHere2x4 = true; 
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 5){
                if (beenHere2x5 == false){
                    beenHere2x5 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 6){
                if (beenHere2x6 == false){
                    beenHere2x6 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 7){
                if (beenHere2x7 == false){
                    beenHere2x7 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 8){
                if (beenHere2x8 == false){
                    beenHere2x8 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 9){
                if (beenHere2x9 == false){
                    beenHere2x9 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 10){
                if (beenHere2x10 == false){
                    beenHere2x10 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 11){
                if (beenHere2x11 == false){
                    beenHere2x11 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 12){
                if (beenHere2x12 == false){
                    beenHere2x12 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 13){
                if (beenHere2x13 == false){
                    beenHere2x13 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 14){
                if (beenHere2x14 == false){
                    beenHere2x14 = true;
                } else {
                    RepeatedArea();
                }
            }
            
        } else if (xPosition == 3){
            if (yPosition == 1){
                if (beenHere3x1 == false){
                    beenHere3x1 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 2){
                if (beenHere3x2 == false){
                    beenHere3x2 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 3){
                if (beenHere3x3 == false){
                    beenHere3x3 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 4){
                if (beenHere3x4 == false){
                    beenHere3x4 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 5){
                if (beenHere3x5 == false){
                    beenHere3x5 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 6){
                if (beenHere3x6 == false){
                    beenHere3x6 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 7){
                if (beenHere3x7 == false){
                    beenHere3x7 = true; 
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 8){
                if (beenHere3x8 == false){
                    beenHere3x8 = true;  
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 9){
                if (beenHere3x9 == false){
                    beenHere3x9 = true;  
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 10){
                if (beenHere3x10 == false){
                    beenHere3x10 = true;  
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 11){
                if (beenHere3x11 == false){
                    beenHere3x11 = true; 
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 12){
                if (beenHere3x12 == false){
                    beenHere3x12 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 13){
                if (beenHere3x13 == false){
                    beenHere3x13 = true; 
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 14){
                if (beenHere3x14 == false){
                    beenHere3x14 = true; 
                } else {
                    RepeatedArea();
                }
            }
            
        } else if (xPosition == 4){
            if (yPosition == 1){
                if (beenHere4x1 == false){
                    beenHere4x1 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 2){
                if (beenHere4x2 == false){
                    beenHere4x2 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 3){
                if (beenHere4x3 == false){
                    beenHere4x3 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 4){
                if (beenHere4x4 == false){
                    beenHere4x4 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 5){
                if (beenHere4x5 == false){
                    beenHere4x5 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 6){
                if (beenHere4x6 == false){
                    beenHere4x6 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 7){
                if (beenHere4x7 == false){
                    beenHere4x7 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 8){
                if (beenHere4x8 == false){
                    beenHere4x8 = true; 
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 9){
                if (beenHere4x9 == false){
                    beenHere4x9 = true; 
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 10){
                if (beenHere4x10 == false){
                    beenHere4x10 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 11){
                if (beenHere4x11 == false){
                    beenHere4x11 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 12){
                if (beenHere4x12 == false){
                    beenHere4x12 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 13){
                if (beenHere4x13 == false){
                    beenHere4x13 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 14){
                if (beenHere4x14 == false){
                    beenHere4x14 = true; 
                } else {
                    RepeatedArea();
                }
            }
            
        } else if (xPosition == 5){
            if (yPosition == 1){
                if (beenHere5x1 == false){
                    beenHere5x1 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 2){
                if (beenHere5x2 == false){
                    beenHere5x2 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 3){
                if (beenHere5x3 == false){
                    beenHere5x3 = true;  
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 4){
                if (beenHere5x4 == false){
                    beenHere5x4 = true; 
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 5){
                if (beenHere5x5 == false){
                    beenHere5x5 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 6){
                if (beenHere5x6 == false){
                    beenHere5x6 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 7){
                if (beenHere5x7 == false){
                    beenHere5x7 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 8){
                if (beenHere5x8 == false){
                    beenHere5x8 = true; 
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 9){
                if (beenHere5x9 == false){
                    beenHere5x9 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 10){
                if (beenHere5x10 == false){
                    beenHere5x10 = true; 
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 11){
                if (beenHere5x11 == false){
                    beenHere5x11 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 12){
                if (beenHere5x12 == false){
                    beenHere5x12 = true; 
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 13){
                if (beenHere5x13 == false){
                    beenHere5x13 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 14){
                if (beenHere5x14 == false){
                    beenHere5x14 = true;
                } else {
                    RepeatedArea();
                }
            }
            
        } else if (xPosition == 6){
            if (yPosition == 1){
                if (beenHere6x1 == false){
                    beenHere6x1 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 2){
                if (beenHere6x2 == false){
                    beenHere6x2 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 3){
                if (beenHere6x3 == false){
                    beenHere6x3 = true; 
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 4){
                if (beenHere6x4 == false){
                    beenHere6x4 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 5){
                if (beenHere6x5 == false){
                    beenHere6x5 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 6){
                if (beenHere6x6 == false){
                    beenHere6x6 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 7){
                if (beenHere6x7 == false){
                    beenHere6x7 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 8){
                if (beenHere6x8 == false){
                    beenHere6x8 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 9){
                if (beenHere6x9 == false){
                    beenHere6x9 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 10){
                if (beenHere6x10 == false){
                    beenHere6x10 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 11){
                if (beenHere6x11 == false){
                    beenHere6x11 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 12){
                if (beenHere6x12 == false){
                    beenHere6x12 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 13){
                if (beenHere6x13 == false){
                    beenHere6x13 = true; 
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 14){
                if (beenHere6x14 == false){
                    beenHere6x14 = true;
                } else {
                    RepeatedArea();
                }
            }
            
        } else if (xPosition == 7){
            //TODO: I am currently using pretty much this whole section for testing purposes, I will need to undo these encounters
            if (yPosition == 1){
                if (beenHere7x1 == false){
                    beenHere7x1 = true;
                    TrappedTreasure();
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 2){
                if (beenHere7x2 == false){
                    beenHere7x2 = true;
                    Treasure1();
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 3){
                if (beenHere7x3 == false){
                    beenHere7x3 = true;
                    Treasure2();
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 4){
                if (beenHere7x4 == false){
                    beenHere7x4 = true;
                    Treasure3();
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 5){
                if (beenHere7x5 == false){
                    beenHere7x5 = true;
                    Treasure2();
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 6){
                if (beenHere7x6 == false){
                    beenHere7x6 = true;
                    Treasure1();
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 7){
                if (beenHere7x7 == false){
                    beenHere7x7 = true; 
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 8){
                if (beenHere7x8 == false){
                    beenHere7x8 = true; 
                    Shop1();
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 9){
                if (beenHere7x9 == false){
                    beenHere7x9 = true;
                    Shop2();
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 10){
                if (beenHere7x10 == false){
                    Shop3(); //TODO: this order should make this encounterable multiple times, I need to check
                    beenHere7x10 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 11){
                if (beenHere7x11 == false){
                    beenHere7x11 = true;
                    Shop4();
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 12){
                if (beenHere7x12 == false){
                    beenHere7x12 = true;
                    Shop5();
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 13){
                if (beenHere7x13 == false){
                    beenHere7x13 = true; 
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 14){
                if (beenHere7x14 == false){
                    beenHere7x14 = true;
                } else {
                    RepeatedArea();
                }
            }
            
        } else if (xPosition == 8){
            if (yPosition == 1){
                if (beenHere8x1 == false){
                    beenHere8x1 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 2){
                if (beenHere8x2 == false){
                    beenHere8x2 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 3){
                if (beenHere8x3 == false){
                    beenHere8x3 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 4){
                if (beenHere8x4 == false){
                    beenHere8x4 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 5){
                if (beenHere8x5 == false){
                    beenHere8x5 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 6){
                if (beenHere8x6 == false){
                    beenHere8x6 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 7){
                if (beenHere8x7 == false){
                    beenHere8x7 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 8){
                if (beenHere8x8 == false){
                    beenHere8x8 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 9){
                if (beenHere8x9 == false){
                    beenHere8x9 = true; 
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 10){
                if (beenHere8x10 == false){
                    beenHere8x10 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 11){
                if (beenHere8x11 == false){
                    beenHere8x11 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 12){
                if (beenHere8x12 == false){
                    beenHere8x12 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 13){
                if (beenHere8x13 == false){
                    beenHere8x13 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 14){
                if (beenHere8x14 == false){
                    beenHere8x14 = true;
                } else {
                    RepeatedArea();
                }
            }
            
        } else if (xPosition == 9){
            if (yPosition == 1){
                if (beenHere9x1 == false){
                    beenHere9x1 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 2){
                if (beenHere9x2 == false){
                    beenHere9x2 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 3){
                if (beenHere9x3 == false){
                    beenHere9x3 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 4){
                if (beenHere9x4 == false){
                    beenHere9x4 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 5){
                if (beenHere9x5 == false){
                    beenHere9x5 = true; 
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 6){
                if (beenHere9x6 == false){
                    beenHere9x6 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 7){
                if (beenHere9x7 == false){
                    beenHere9x7 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 8){
                if (beenHere9x8 == false){
                    beenHere9x8 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 9){
                if (beenHere9x9 == false){
                    beenHere9x9 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 10){
                if (beenHere9x10 == false){
                    beenHere9x10 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 11){
                if (beenHere9x11 == false){
                    beenHere9x11 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 12){
                if (beenHere9x12 == false){
                    beenHere9x12 = true; 
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 13){
                if (beenHere9x13 == false){
                    beenHere9x13 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 14){
                if (beenHere9x14 == false){
                    beenHere9x14 = true;
                } else {
                    RepeatedArea();
                }
            }
            
        } else if (xPosition == 10){
            if (yPosition == 1){
                if (beenHere10x1 == false){
                    beenHere10x1 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 2){
                if (beenHere10x2 == false){
                    beenHere10x2 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 3){
                if (beenHere10x3 == false){
                    beenHere10x3 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 4){
                if (beenHere10x4 == false){
                    beenHere10x4 = true; 
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 5){
                if (beenHere10x5 == false){
                    beenHere10x5 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 6){
                if (beenHere10x6 == false){
                    beenHere10x6 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 7){
                if (beenHere10x7 == false){
                    beenHere10x7 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 8){
                if (beenHere10x8 == false){
                    beenHere10x8 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 9){
                if (beenHere10x9 == false){
                    beenHere10x9 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 10){
                if (beenHere10x10 == false){
                    beenHere10x10 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 11){
                if (beenHere10x11 == false){
                    beenHere10x11 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 12){
                if (beenHere10x12 == false){
                    beenHere10x12 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 13){
                if (beenHere10x13 == false){
                    beenHere10x13 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 14){
                if (beenHere10x14 == false){
                    beenHere10x14 = true;
                } else {
                    RepeatedArea();
                }
            }
            
        } else if (xPosition == 11){
            if (yPosition == 1){
                if (beenHere11x1 == false){
                    beenHere11x1 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 2){
                if (beenHere11x2 == false){
                    beenHere11x2 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 3){
                if (beenHere11x3 == false){
                    beenHere11x3 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 4){
                if (beenHere11x4 == false){
                    beenHere11x4 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 5){
                if (beenHere11x5 == false){
                    beenHere11x5 = true; 
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 6){
                if (beenHere11x6 == false){
                    beenHere11x6 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 7){
                if (beenHere11x7 == false){
                    beenHere11x7 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 8){
                if (beenHere11x8 == false){
                    beenHere11x8 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 9){
                if (beenHere11x9 == false){
                    beenHere11x9 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 10){
                if (beenHere11x10 == false){
                    beenHere11x10 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 11){
                if (beenHere11x11 == false){
                    beenHere11x11 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 12){
                if (beenHere11x12 == false){
                    beenHere11x12 = true; 
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 13){
                if (beenHere11x13 == false){
                    beenHere11x13 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 14){
                if (beenHere11x14 == false){
                    beenHere11x14 = true;
                } else {
                    RepeatedArea();
                }
            }
            
        } else if (xPosition == 12){
            if (yPosition == 1){
                if (beenHere12x1 == false){
                    beenHere12x1 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 2){
                if (beenHere12x2 == false){
                    beenHere12x2 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 3){
                if (beenHere12x3 == false){
                    beenHere12x3 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 4){
                if (beenHere12x4 == false){
                    beenHere12x4 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 5){
                if (beenHere12x5 == false){
                    beenHere12x5 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 6){
                if (beenHere12x6 == false){
                    beenHere12x6 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 7){
                if (beenHere12x7 == false){
                    beenHere12x7 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 8){
                if (beenHere12x8 == false){
                    beenHere12x8 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 9){
                if (beenHere12x9 == false){
                    beenHere12x9 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 10){
                if (beenHere12x10 == false){
                    beenHere12x10 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 11){
                if (beenHere12x11 == false){
                    beenHere12x11 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 12){
                if (beenHere12x12 == false){
                    beenHere12x12 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 13){
                if (beenHere12x13 == false){
                    beenHere12x13 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 14){
                if (beenHere12x14 == false){
                    beenHere12x14 = true;
                } else {
                    RepeatedArea();
                }
            }
            
        } else if (xPosition == 13){
            if (yPosition == 1){
                if (beenHere13x1 == false){
                    beenHere13x1 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 2){
                if (beenHere13x2 == false){
                    beenHere13x2 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 3){
                if (beenHere13x3 == false){
                    beenHere13x3 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 4){
                if (beenHere13x4 == false){
                    beenHere13x4 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 5){
                if (beenHere13x5 == false){
                    beenHere13x5 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 6){
                if (beenHere13x6 == false){
                    beenHere13x6 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 7){
                if (beenHere13x7 == false){
                    beenHere13x7 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 8){
                if (beenHere13x8 == false){
                    beenHere13x8 = true; 
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 9){
                if (beenHere13x9 == false){
                    beenHere13x9 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 10){
                if (beenHere13x10 == false){
                    beenHere13x10 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 11){
                if (beenHere13x11 == false){
                    beenHere13x11 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 12){
                if (beenHere13x12 == false){
                    beenHere13x12 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 13){
                if (beenHere13x13 == false){
                    beenHere13x13 = true; 
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 14){
                if (beenHere13x14 == false){
                    beenHere13x14 = true; 
                } else {
                    RepeatedArea();
                }
            }
        } else if (xPosition == 14){
            if (yPosition == 1){
                if (beenHere14x1 == false){
                    beenHere14x1 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 2){
                if (beenHere14x2 == false){
                    beenHere14x2 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 3){
                if (beenHere14x3 == false){
                    beenHere14x3 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 4){
                if (beenHere14x4 == false){
                    beenHere14x4 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 5){
                if (beenHere14x5 == false){
                    beenHere14x5 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 6){
                if (beenHere14x6 == false){
                    beenHere14x6 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 7){
                if (beenHere14x7 == false){
                    beenHere14x7 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 8){
                if (beenHere14x8 == false){
                    beenHere14x8 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 9){
                if (beenHere14x9 == false){
                    beenHere14x9 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 10){
                if (beenHere14x10 == false){
                    beenHere14x10 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 11){
                if (beenHere14x11 == false){
                    beenHere14x11 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 12){
                if (beenHere14x12 == false){
                    beenHere14x = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 13){
                if (beenHere14x13 == false){
                    beenHere14x13 = true;
                } else {
                    RepeatedArea();
                }
            } else if (yPosition == 14){
                if (beenHere14x14 == false){
                    beenHere14x14 = true;
                } else {
                    RepeatedArea();
                }
            }
        }
    }

    //we will program our various encounters to be called on from each position here
    public static void Treasure1(){
        System.out.print("You see a treasure chest.");
        String stringyBoi3 = scannyBoi.nextLine();
        if (stringyBoi3.equals("open" || "open chest")){
            System.out.print("You open up the treasure chest and find 20");
            experience = experience + 5;
            gold = gold + 20;
        } else if (stringyBoi3.equals("ignore" || "ignore chest")){
            System.out.print("You decide to ignore the chest and continue searching.");
        } else {
            System.out.print("That is not a recognized command.");
            Treasure1();
        }
        MapMovement();
    }

    public static void Treasure2(){
        System.out.print("You see a treasure chest.");
        String stringyBoi3 = scannyBoi.nextLine();
        if (stringyBoi3.equals("open" || "open chest")){
            System.out.print("You open up the treasure chest and find 40 gold");
            experience = experience + 10;
            gold = gold + 40;
        } else if (stringyBoi3.equals("ignore" || "ignore chest")){
            System.out.print("You decide to ignore the chest and continue searching.");
        } else {
            System.out.print("That is not a recognized command.");
            Treasure2();
        }
        MapMovement();
    }

    public static void Treasure3(){
        System.out.print("You see a treasure chest.");
        String stringyBoi3 = scannyBoi.nextLine();
        if (stringyBoi3.equals("open" || "open chest")){
            System.out.print("You open up the treasure chest and find 60 gold");
            experience = experience + 15;
            gold = gold + 60;
        } else if (stringyBoi3.equals("ignore" || "ignore chest")){
            System.out.print("You decide to ignore the chest and continue searching.");
        } else {
            System.out.print("That is not a recognized command.");
            Treasure3();
        }
        MapMovement();
    }

    public static void Treasure4(){
        System.out.print("You see a treasure chest.");
        String stringyBoi3 = scannyBoi.nextLine();
        if (stringyBoi3.equals("open" || "open chest")){
            System.out.print("You open up the treasure chest and find 80 gold");
            experience = experience + 20;
            gold = gold + 80;
        } else if (stringyBoi3.equals("ignore" || "ignore chest")){
            System.out.print("You decide to ignore the chest and continue searching.");
        } else {
            System.out.print("That is not a recognized command.");
            Treasure4();
        }
        MapMovement();
    }

    public static void Treasure5(){
        System.out.print("You see a treasure chest.");
        String stringyBoi3 = scannyBoi.nextLine();
        if (stringyBoi3.equals("open" || "open chest")){
            System.out.print("You open up the treasure chest and find 100 gold");
            experience = experience + 25;
            gold = gold + 100;
        } else if (stringyBoi3.equals("ignore" || "ignore chest")){
            System.out.print("You decide to ignore the chest and continue searching.");
        } else {
            System.out.print("That is not a recognized command.");
            Treasure5();
        }
        MapMovement();
    }

    public static void TrappedTreasure(){
        System.out.print("You see a treasure chest.");
        String stringyBoi4 = scannyBoi.nextLine();
        if (stringyBoi4.equals("open" || "open chest")){
            System.out.print("You bend down to open the chest, but as soon as you touch it, it explodes, hurting you and knocking you down.");
            health = health - 10;
        } else if (stringyBoi4.equals("ignore" || "ignore chest")){
            System.out.print("You decide to ignore the chest and continue searching.");
            experience = experience + 5;
        } else {
            System.out.print("That is not a recognized command.");
            TrappedTreasure();
        }
        MapMovement();
    }
    
    public static void Troll(){

    }

    public static void Slime(){

    }

    public static void Dragon(){

    }

    /*public static void Potion(){
        System.out.print("You find a bottle with a mysterious liquid in it.");
        String stringyBoi5 = scannyBoi.nextLine();
        if (strinyBoi5.equals("pick up bottle" || "get bottle")){
            System.out.print("You pick up the bottle and put it in your bag for later use.");
            numberOfPotions = numberOfPotions + 1;
        } else if (stringyBoi5.equals("ignore" || "ignore bottle")){
            System.out.print("You choose to ignore the bottle.");
        } else {
            System.out.print("That is not a recognized command.");
            Potion();
        }
    }*/

    //this is the first shop
    //it will be the closest to spawn
    //it has power level 1 items
    //it will be an encounter you can have multiple times
    //the items here will be cheap
    public static void Shop1(){
        System.out.print("You see a rickety building. Upon closer inspection, it appears to be some sort of abandoned shop. Despite the appearance of the shop, all the items seem to be in relatively good condition, although they aren't very high quality. There is a sword with a price tag of 100 gold, a shield with a price tag of 75, a bow with a price tag of 100 gold, arrows with a price tag of 1 gold each, armor with a price tag of 100 gold, and mysterious potions with a price tag of 10 gold each. There is sign telling you to leave the money on the counter and a sign saying no stealing.");
        System.out.println("You have " + gold + " gold.");
        String shoppyBoi1 = scannyBoi.nextLine();
        if (shoppyBoi1.equals("buy sword")){
            if (gold >= 100){
                if (sword < 1){
                    gold = gold - 100;
                    sword = 1;
                    System.out.print("You now have a sword. You have " + gold + " gold left.");
                } else {
                    System.out.print("Your current sword is already better than this. There is no need to buy it.");
                }
            } else {
                System.out.print("You do not have enough gold to buy this.");
            }
        } else if (shoppyBoi1.equals("buy shield")){
            if (gold >= 75){
                if (shield < 1){
                    gold = gold - 75;
                    shield = 1;
                    System.out.print("You now have a shield. You have " + gold + " gold left.");
                } else {
                    System.out.print("Your current shield is already better than this. There is no need to buy it.");
                }
            } else {
                System.out.print("You do not have enough gold to buy this.");
            }
        } else if (shoppyBoi1.equals("buy bow")){
            if (gold >= 100){
                if (bow < 1){
                    gold = gold - 100;
                    bow = 1;
                    System.out.print("You now have a bow. You have " + gold + " gold left.");
                } else {
                    System.out.print("Your current bow is already better than this. There is no need to buy it.");
                }
            } else {
                System.out.print("You do not have enough gold to buy this.");
            }
        } else if (shoppyBoi1.equals("buy arrows" || "buy arrow")){
            System.out.print("How many would you like to buy?");
            int arrowsPurchased = scannyBoi.nextLine();
            if (gold >= arrowsPurchased){
                gold = gold - arrowsPurchased;
                numberOfArrows = numberOfArrows + arrowsPurchased;
                System.out.print("You now have " + numberOfArrows + " arrows. You have " + gold + " gold left.");
            } else {
                System.out.print("You do not have enough gold to buy this.");
            }
        } else if (shoppyBoi1.equals("buy armor")){
            if(gold >= 100){
                if (armor < 1){
                    gold = gold - 100;
                    armor = 1;
                    System.out.print("You now have armor. You have " + gold + " gold left.");
                } else {
                    System.out.print("Your current armor is already better than this. There is no need to buy it.");
                }
            } else {
                System.out.print("You do not have enough gold to buy this.");
            }
        } else if (shoppyBoi1.equals("buy potions" || "buy potion")){
            System.out.print("How many would you like to buy?");
            int potionsPurchased = scannyBoi.nextLine();
            int goldSpentOnPotions = potionsPurchased * 10;
            if (gold >= goldSpentOnPotions){
                gold = gold - goldSpentOnPotions;
                System.out.print("You have " + gold + " gold left.");
            } else {
                System.out.print("You do not have enough gold to buy this.");
            }
        } else if (shoppyBoi1.equals("steal sword")){
            System.out.print("As you grab the sword you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain.");
            GameOver();
        } else if (shoppyBoi1.equals("steal shield")){
            System.out.print("As you grab the shield you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain.");
            GameOver();
        } else if (shoppyBoi1.equals("steal bow")){
            System.out.print("As you grab the bow you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain.");
            GameOver();
        } else if (shoppyBoi1.equals("steal arrows" || "steal arrow")){
            System.out.print("As you grab the arrows you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain.");
            GameOver();
        } else if (shoppyBoi1.equals("steal armor")){
            System.out.print("As you grab the armor you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain.");
            GameOver();
        } else if (shoppyBoi1.equals("steal potions" || "steal potion")){
            System.out.print("As you grab the potions you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain.");
            GameOver();
        } else if (shoppyBoi2.equals("leave shop")){
            MapMovement();
        } else {
            System.out.print("This is not a recognized command");
            Shop1();
        }
    }

    public static void Shop2(){
        System.out.print("You see an old building. Upon closer inspection, it appears to be some sort of abandoned shop. Despite the appearance of the shop, all the items seem to be brand new and of decent quality. There is a sword with a price tag of 200 gold, a shield with a price tag of 150, a bow with a price tag of 200 gold, arrows with a price tag of 1 gold each, armor with a price tag of 200 gold, and mysterious potions with a price tag of 10 gold each. There is sign telling you to leave the money on the counter and a sign saying no stealing.");
        System.out.println("You have " + gold + " gold.");
        String shoppyBoi2 = scannyBoi.nextLine();
        if (shoppyBoi2.equals("buy sword")){
            if (gold >= 200){
                if (sword < 2){
                    gold = gold - 200;
                    sword = 2;
                    System.out.print("You now have a decent sword. You have " + gold + " gold left.");
                } else {
                    System.out.print("Your current sword is already better than this. There is no need to buy it.");
                }
            } else {
                System.out.print("You do not have enough gold to buy this.");
            }
        } else if (shoppyBoi2.equals("buy shield")){
            if (gold >= 150){
                if (shield < 2){
                    gold = gold - 150;
                    shield = 2;
                    System.out.print("You now have a decent shield. You have " + gold + " gold left.");
                } else {
                    System.out.print("Your current shield is already better than this. There is no need to buy it.");
                }
            } else {
                System.out.print("You do not have enough gold to buy this.");
            }
        } else if (shoppyBoi2.equals("buy bow")){
            if (gold >= 200){
                if (bow < 2){
                    gold = gold - 200;
                    bow = 2;
                    System.out.print("You now have a decent bow. You have " + gold + " gold left.");
                } else {
                    System.out.print("Your current bow is already better than this. There is no need to buy it.");
                }
            } else {
                System.out.print("You do not have enough gold to buy this.");
            }
        } else if (shoppyBoi2.equals("buy arrows" || "buy arrow")){
            System.out.print("How many would you like to buy?");
            int arrowsPurchased = scannyBoi.nextLine();
            if (gold >= arrowsPurchased){
                gold = gold - arrowsPurchased;
                numberOfArrows = numberOfArrows + arrowsPurchased;
                System.out.print("You now have " + numberOfArrows + " arrows. You have " + gold + " gold left.");
            } else {
                System.out.print("You do not have enough gold to buy this.");
            }
        } else if (shoppyBoi2.equals("buy armor")){
            if(gold >= 200){
                if (armor < 2){
                    gold = gold - 200;
                    armor = 2;
                    System.out.print("You now have decent armor. You have " + gold + " gold left.");
                } else {
                    System.out.print("Your current armor is already better than this. There is no need to buy it.");
                }
            } else {
                System.out.print("You do not have enough gold to buy this.");
            }
        } else if (shoppyBoi2.equals("buy potions" || "buy potion")){
            System.out.print("How many would you like to buy?");
            int potionsPurchased = scannyBoi.nextLine();
            int goldSpentOnPotions = potionsPurchased * 10;
            if (gold >= goldSpentOnPotions){
                gold = gold - goldSpentOnPotions;
                System.out.print("You have " + gold + " gold left.");
            } else {
                System.out.print("You do not have enough gold to buy this.");
            }
        } else if (shoppyBoi2.equals("steal sword")){
            System.out.print("As you grab the sword you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain.");
            GameOver();
        } else if (shoppyBoi2.equals("steal shield")){
            System.out.print("As you grab the shield you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain.");
            GameOver();
        } else if (shoppyBoi2.equals("steal bow")){
            System.out.print("As you grab the bow you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain.");
            GameOver();
        } else if (shoppyBoi2.equals("steal arrows" || "steal arrow")){
            System.out.print("As you grab the arrows you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain.");
            GameOver();
        } else if (shoppyBoi2.equals("steal armor")){
            System.out.print("As you grab the armor you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain.");
            GameOver();
        } else if (shoppyBoi2.equals("steal potions" || "steal potion")){
            System.out.print("As you grab the potions you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain.");
            GameOver();
        } else if (shoppyBoi2.equals("leave shop")){
            MapMovement();
        } else {
            System.out.print("This is not a recognized command");
            Shop2();
        }
    }

    public static void Shop3(){
        System.out.print("You see a building. Upon closer inspection, it appears to be some sort of abandoned shop. Despite the shop being vacant, all the items seem to be good quality and in perfect condition. There is a sword with a price tag of 400 gold, a shield with a price tag of 300, a bow with a price tag of 400 gold, arrows with a price tag of 1 gold each, armor with a price tag of 400 gold, and mysterious potions with a price tag of 10 gold each. There is sign telling you to leave the money on the counter and a sign saying no stealing.");
        System.out.println("You have " + gold + " gold.");
        String shoppyBoi3 = scannyBoi.nextLine();
        if (shoppyBoi3.equals("buy sword")){
            if (gold >= 400){
                if (sword < 3){
                    gold = gold - 400;
                    sword = 3;
                    System.out.print("You now have a good sword. You have " + gold + " gold left.");
                } else {
                    System.out.print("Your current sword is already better than this. There is no need to buy it.");
                }
            } else {
                System.out.print("You do not have enough gold to buy this.");
            }
            Shop3();
        } else if (shoppyBoi3.equals("buy shield")){
            if (gold >= 300){
                if (shield < 3){
                    gold = gold - 300;
                    shield = 3;
                    System.out.print("You now have a good shield. You have " + gold + " gold left.");
                } else {
                    System.out.print("Your current shield is already better than this. There is no need to buy it.");
                }
            } else {
                System.out.print("You do not have enough gold to buy this.");
            }
            Shop3();
        } else if (shoppyBoi3.equals("buy bow")){
            if (gold >= 400){
                if (bow < 3){
                    gold = gold - 400;
                    bow = 3;
                    System.out.print("You now have a good bow. You have " + gold + " gold left.");
                } else {
                    System.out.print("Your current bow is already better than this. There is no need to buy it.");
                }
            } else {
                System.out.print("You do not have enough gold to buy this.");
            }
            Shop3();
        } else if (shoppyBoi3.equals("buy arrows" || "buy arrow")){
            System.out.print("How many would you like to buy?");
            int arrowsPurchased = scannyBoi.nextLine();
            if (gold >= arrowsPurchased){
                gold = gold - arrowsPurchased;
                numberOfArrows = numberOfArrows + arrowsPurchased;
                System.out.print("You now have " + numberOfArrows + " arrows. You have " + gold + " gold left.");
            } else {
                System.out.print("You do not have enough gold to buy this.");
            }
            Shop3();
        } else if (shoppyBoi3.equals("buy armor")){
            if(gold >= 400){
                if (armor < 3){
                    gold = gold - 400;
                    armor = 3;
                    System.out.print("You now have good armor. You have " + gold + " gold left.");
                } else {
                    System.out.print("Your current armor is already better than this. There is no need to buy it.");
                }
            } else {
                System.out.print("You do not have enough gold to buy this.");
            }
            Shop3();
        } else if (shoppyBoi3.equals("buy potions" || "buy potion")){
            System.out.print("How many would you like to buy?");
            int potionsPurchased = scannyBoi.nextLine();
            int goldSpentOnPotions = potionsPurchased * 10;
            if (gold >= goldSpentOnPotions){
                gold = gold - goldSpentOnPotions;
                System.out.print("You have " + gold + " gold left.");
            } else {
                System.out.print("You do not have enough gold to buy this.");
            }
            Shop3();
        } else if (shoppyBoi3.equals("steal sword")){
            System.out.print("As you grab the sword you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain.");
            GameOver();
        } else if (shoppyBoi3.equals("steal shield")){
            System.out.print("As you grab the shield you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain.");
            GameOver();
        } else if (shoppyBoi3.equals("steal bow")){
            System.out.print("As you grab the bow you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain.");
            GameOver();
        } else if (shoppyBoi3.equals("steal arrows" || "steal arrow")){
            System.out.print("As you grab the arrows you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain.");
            GameOver();
        } else if (shoppyBoi3.equals("steal armor")){
            System.out.print("As you grab the armor you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain.");
            GameOver();
        } else if (shoppyBoi3.equals("steal potions" || "steal potion")){
            System.out.print("As you grab the potions you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain.");
            GameOver();
        } else if (shoppyBoi3.equals("leave shop")){
            MapMovement();
        } else {
            System.out.print("This is not a recognized command");
            Shop3();
        }
    }

    public static void Shop4(){
        System.out.print("You see a nice building. Upon closer inspection, it appears to be some sort of abandoned shop. Despite the shop being vacant, all the items seem to be amazing quality and in mint condition. There is a sword with a price tag of 800 gold, a shield with a price tag of 600, a bow with a price tag of 800 gold, arrows with a price tag of 1 gold each, armor with a price tag of 800 gold, and mysterious potions with a price tag of 10 gold each. There is sign telling you to leave the money on the counter and a sign saying no stealing.");
        System.out.println("You have " + gold + " gold.");
        String shoppyBoi4 = scannyBoi.nextLine();
        if (shoppyBoi4.equals("buy sword")){
            if (gold >= 800){
                if (sword < 4){
                    gold = gold - 800;
                    sword = 4;
                    System.out.print("You now have an amazing sword. You have " + gold + " gold left.");
                } else {
                    System.out.print("Your current sword is already better than this. There is no need to buy it.");
                }
            } else {
                System.out.print("You do not have enough gold to buy this.");
            }
            Shop4();
        } else if (shoppyBoi4.equals("buy shield")){
            if (gold >= 600){
                if (shield < 4){
                    gold = gold - 600;
                    shield = 4;
                    System.out.print("You now have an amazing shield. You have " + gold + " gold left.");
                } else {
                    System.out.print("Your current shield is already better than this. There is no need to buy it.");
                }
            } else {
                System.out.print("You do not have enough gold to buy this.");
            }
            Shop4();
        } else if (shoppyBoi4.equals("buy bow")){
            if (gold >= 800){
                if (bow < 4){
                    gold = gold - 800;
                    bow = 4;
                    System.out.print("You now have an amazing bow. You have " + gold + " gold left.");
                } else {
                    System.out.print("Your current bow is already better than this. There is no need to buy it.");
                }
            } else {
                System.out.print("You do not have enough gold to buy this.");
            }
            Shop4();
        } else if (shoppyBoi4.equals("buy arrows" || "buy arrow")){
            System.out.print("How many would you like to buy?");
            int arrowsPurchased = scannyBoi.nextLine();
            if (gold >= arrowsPurchased){
                gold = gold - arrowsPurchased;
                numberOfArrows = numberOfArrows + arrowsPurchased;
                System.out.print("You now have " + numberOfArrows + " arrows. You have " + gold + " gold left.");
            } else {
                System.out.print("You do not have enough gold to buy this.");
            }
            Shop4();
        } else if (shoppyBoi4.equals("buy armor")){
            if(gold >= 800){
                if (armor < 4){
                    gold = gold - 800;
                    armor = 4;
                    System.out.print("You now have amazing armor. You have " + gold + " gold left.");
                } else {
                    System.out.print("Your current armor is already better than this. There is no need to buy it.");
                }
            } else {
                System.out.print("You do not have enough gold to buy this.");
            }
            Shop4();
        } else if (shoppyBoi4.equals("buy potions" || "buy potion")){
            System.out.print("How many would you like to buy?");
            int potionsPurchased = scannyBoi.nextLine();
            int goldSpentOnPotions = potionsPurchased * 10;
            if (gold >= goldSpentOnPotions){
                gold = gold - goldSpentOnPotions;
                System.out.print("You have " + gold + " gold left.");
            } else {
                System.out.print("You do not have enough gold to buy this.");
            }
            Shop4();
        } else if (shoppyBoi4.equals("steal sword")){
            System.out.print("As you grab the sword you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain.");
            GameOver();
        } else if (shoppyBoi4.equals("steal shield")){
            System.out.print("As you grab the shield you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain.");
            GameOver();
        } else if (shoppyBoi4.equals("steal bow")){
            System.out.print("As you grab the bow you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain.");
            GameOver();
        } else if (shoppyBoi4.equals("steal arrows" || "steal arrow")){
            System.out.print("As you grab the arrows you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain.");
            GameOver();
        } else if (shoppyBoi4.equals("steal armor")){
            System.out.print("As you grab the armor you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain.");
            GameOver();
        } else if (shoppyBoi4.equals("steal potions" || "steal potion")){
            System.out.print("As you grab the potions you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain.");
            GameOver();
        } else if (shoppyBoi4.equals("leave shop")){
            MapMovement();
        } else {
            System.out.print("This is not a recognized command");
            Shop4();
        }
    }

    public static void Shop5(){
        System.out.print("You see a magnificent building. Upon closer inspection, it appears to be some sort of abandoned shop. Despite the shop being vacant, all the items are the best quality you have ever seen. You can practically feel the energy radiating off of them. There is a sword with a price tag of 1600 gold, a shield with a price tag of 1200, a bow with a price tag of 1600 gold, arrows with a price tag of 1 gold each, armor with a price tag of 1600 gold, and mysterious potions with a price tag of 10 gold each. There is sign telling you to leave the money on the counter and a sign saying no stealing.");
        System.out.println("You have " + gold + " gold.");
        String shoppyBoi5 = scannyBoi.nextLine();
        if (shoppyBoi5.equals("buy sword")){
            if (gold >= 1600){
                if (sword < 5){
                    gold = gold - 1600;
                    sword = 5;
                    System.out.print("You now have a good sword. You have " + gold + " gold left.");
                } else {
                    System.out.print("Your current sword is already better than this. There is no need to buy it.");
                }
            } else {
                System.out.print("You do not have enough gold to buy this.");
            }
            Shop5();
        } else if (shoppyBoi5.equals("buy shield")){
            if (gold >= 1200){
                if (shield < 5){
                    gold = gold - 1200;
                    shield = 5;
                    System.out.print("You now have a good shield. You have " + gold + " gold left.");
                } else {
                    System.out.print("Your current shield is already better than this. There is no need to buy it.");
                }
            } else {
                System.out.print("You do not have enough gold to buy this.");
            }
            Shop5();
        } else if (shoppyBoi5.equals("buy bow")){
            if (gold >= 1600){
                if (bow < 5){
                    gold = gold - 1600;
                    bow = 5;
                    System.out.print("You now have a good bow. You have " + gold + " gold left.");
                } else {
                    System.out.print("Your current bow is already better than this. There is no need to buy it.");
                }
            } else {
                System.out.print("You do not have enough gold to buy this.");
            }
            Shop5();
        } else if (shoppyBoi5.equals("buy arrows" || "buy arrow")){
            System.out.print("How many would you like to buy?");
            int arrowsPurchased = scannyBoi.nextLine();
            if (gold >= arrowsPurchased){
                gold = gold - arrowsPurchased;
                numberOfArrows = numberOfArrows + arrowsPurchased;
                System.out.print("You now have " + numberOfArrows + " arrows. You have " + gold + " gold left.");
            } else {
                System.out.print("You do not have enough gold to buy this.");
            }
            Shop5();
        } else if (shoppyBoi5.equals("buy armor")){
            if(gold >= 1600){
                if (armor < 5){
                    gold = gold - 1600;
                    armor = 5;
                    System.out.print("You now have good armor. You have " + gold + " gold left.");
                } else {
                    System.out.print("Your current armor is already better than this. There is no need to buy it.");
                }
            } else {
                System.out.print("You do not have enough gold to buy this.");
            }
            Shop5();
        } else if (shoppyBoi5.equals("buy potions" || "buy potion")){
            System.out.print("How many would you like to buy?");
            int potionsPurchased = scannyBoi.nextLine();
            int goldSpentOnPotions = potionsPurchased * 10;
            if (gold >= goldSpentOnPotions){
                gold = gold - goldSpentOnPotions;
                System.out.print("You have " + gold + " gold left.");
            } else {
                System.out.print("You do not have enough gold to buy this.");
            }
            Shop5();
        } else if (shoppyBoi5.equals("steal sword")){
            System.out.print("As you grab the sword you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain.");
            GameOver();
        } else if (shoppyBoi5.equals("steal shield")){
            System.out.print("As you grab the shield you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain.");
            GameOver();
        } else if (shoppyBoi5.equals("steal bow")){
            System.out.print("As you grab the bow you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain.");
            GameOver();
        } else if (shoppyBoi5.equals("steal arrows" || "steal arrow")){
            System.out.print("As you grab the arrows you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain.");
            GameOver();
        } else if (shoppyBoi5.equals("steal armor")){
            System.out.print("As you grab the armor you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain.");
            GameOver();
        } else if (shoppyBoi5.equals("steal potions" || "steal potion")){
            System.out.print("As you grab the potions you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain.");
            GameOver();
        } else if (shoppyBoi5.equals("leave shop")){
            MapMovement();
        } else {
            System.out.print("This is not a recognized command");
            Shop5();
        }
    }

    public static void RepeatedArea(){
        System.out.print("You recognize this area. There isn't anything left to do here.");
        MapMovement();
    }

    public static void GameOver(){
        //this is where we go after the game has ended
        System.out.print("The game is over.");
        //this tells the player that the game has ended
        if (win == false){
            System.out.print("You Lose");
        } else {
            System.out.print("Congratulations! You win!");
        }
        //this if statement determines whether or not the player won
        //the boolean "win" will be set to true once certain conditions are met in the game
    }
}