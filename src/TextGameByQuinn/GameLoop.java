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
        System.out.print("Type start to begin ");
        //This will print the thing in the parenthesis

        String stringyBoi0 = scannyBoi.nextLine();
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

        if (stringyBoi0.equals("start")) {
        //this will run the thing in it if stringyBoi0 was typed in as start
            int xPosition = 7;
            int yPosition = 7;
            //this creates two integer values to represent our characters position on the map
            //since I have decided the map will be 14x14, I have set them to 7 to begin so our character is at the center
            //these will be editted later when we move
            PrintOutClass();
            //this will run the method printOutClass()
        }
        //System.out.print(stringyBoi);
            //"System.out." is how we find our desired command
                //"System." tell us we are finding a command hardcoded into java
                //"out." tells we are going to be using a command that has to do with output
            //"print(stringyBoi)" tells us to print whatever is in the parenthesis
                //in this case it is the stringyBoi that the user inputed earlier
        
        //System.out.print("tictac time");
    }
    
    public static void PrintOutClass(){
        System.out.print("The game has begun. ");
        System.out.print("Choose Name. ");
        String stringyBoi1 = scannyBoi.nextLine();
        System.out.print("Our tale begins one morning as you wake up alone in a large, foggy feild. You have a dagger in your hand and the only concrete memeroy you have is that you must find and rescue your father.");
        String stringyBoi2 = scannyBoi.nextLine();
        if (stringyBoi2.equals("commit sudoku"){
            Sudoku();
            //this is just a joke that allows the character to stab themselves
        } else if (stringyBoi2.equals("move forward" || "go forward" || "move forwards" || "go forwards")){
            xPosition = xPosition + 1;
            //this takes the integer we set to be the xPosition of our character and increases the value by one
            //this represents our character moving one space forwards
            CheckPosition();
            //this sends our code to a command that checks our position and depending on our position, does different things
        } else if (stringyBoi2.equals("move backward" || "go backward" || "move backwards" || "go backwards")){
            xPosition = xPosition - 1;
            CheckPosition();
        } else if (stringyBoi2.equals("move left" || "go left")){
            yPosition = yPosition - 1;
            CheckPosition();
        } else if (stringyBoi2.equals("move right" || "go right")){
            yPosition = yPosition + 1;
            CheckPosition();
        } else{
            System.out.print(stringyBoi2 + " is not a recognized command.")
            PrintOutClass();
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
                //we will add a check to see if the character has been to this spot before so we don't just get infinite encounters from the same spot
            } else if (yPosition == 2){
                
            } else if (yPosition == 3){
                
            } else if (yPosition == 4){
                
            } else if (yPosition == 5){
                
            } else if (yPosition == 6){
                
            } else if (yPosition == 7){
                
            } else if (yPosition == 8){
                
            } else if (yPosition == 9){
                
            } else if (yPosition == 10){
                
            } else if (yPosition == 11){
                
            } else if (yPosition == 12){
                
            } else if (yPosition == 13){
                
            } else if (yPosition == 14){

            }
        }

        } else if (xPosition == 2){
            if (yPosition == 1){

            } else if (yPosition == 2){
                
            } else if (yPosition == 3){
                
            } else if (yPosition == 4){
                
            } else if (yPosition == 5){
                
            } else if (yPosition == 6){
                
            } else if (yPosition == 7){
                
            } else if (yPosition == 8){
                
            } else if (yPosition == 9){
                
            } else if (yPosition == 10){
                
            } else if (yPosition == 11){
                
            } else if (yPosition == 12){
                
            } else if (yPosition == 13){
                
            } else if (yPosition == 14){
                
            }
            
        } else if (xPosition == 3){
            if (yPosition == 1){

            } else if (yPosition == 2){
                
            } else if (yPosition == 3){
                
            } else if (yPosition == 4){
                
            } else if (yPosition == 5){
                
            } else if (yPosition == 6){
                
            } else if (yPosition == 7){
                
            } else if (yPosition == 8){
                
            } else if (yPosition == 9){
                
            } else if (yPosition == 10){
                
            } else if (yPosition == 11){
                
            } else if (yPosition == 12){
                
            } else if (yPosition == 13){
                
            } else if (yPosition == 14){
                
            }
            
        } else if (xPosition == 4){
            if (yPosition == 1){

            } else if (yPosition == 2){
                
            } else if (yPosition == 3){
                
            } else if (yPosition == 4){
                
            } else if (yPosition == 5){
                
            } else if (yPosition == 6){
                
            } else if (yPosition == 7){
                
            } else if (yPosition == 8){
                
            } else if (yPosition == 9){
                
            } else if (yPosition == 10){
                
            } else if (yPosition == 11){
                
            } else if (yPosition == 12){
                
            } else if (yPosition == 13){
                
            } else if (yPosition == 14){
                
            }
            
        } else if (xPosition == 5){
            if (yPosition == 1){

            } else if (yPosition == 2){
                
            } else if (yPosition == 3){
                
            } else if (yPosition == 4){
                
            } else if (yPosition == 5){
                
            } else if (yPosition == 6){
                
            } else if (yPosition == 7){
                
            } else if (yPosition == 8){
                
            } else if (yPosition == 9){
                
            } else if (yPosition == 10){
                
            } else if (yPosition == 11){
                
            } else if (yPosition == 12){
                
            } else if (yPosition == 13){
                
            } else if (yPosition == 14){
                
            }
            
        } else if (xPosition == 6){
            if (yPosition == 1){

            } else if (yPosition == 2){
                
            } else if (yPosition == 3){
                
            } else if (yPosition == 4){
                
            } else if (yPosition == 5){
                
            } else if (yPosition == 6){
                
            } else if (yPosition == 7){
                
            } else if (yPosition == 8){
                
            } else if (yPosition == 9){
                
            } else if (yPosition == 10){
                
            } else if (yPosition == 11){
                
            } else if (yPosition == 12){
                
            } else if (yPosition == 13){
                
            } else if (yPosition == 14){
                
            }
            
        } else if (xPosition == 7){
            if (yPosition == 1){

            } else if (yPosition == 2){
                
            } else if (yPosition == 3){
                
            } else if (yPosition == 4){
                
            } else if (yPosition == 5){
                
            } else if (yPosition == 6){
                
            } else if (yPosition == 7){
                
            } else if (yPosition == 8){
                
            } else if (yPosition == 9){
                
            } else if (yPosition == 10){
                
            } else if (yPosition == 11){
                
            } else if (yPosition == 12){
                
            } else if (yPosition == 13){
                
            } else if (yPosition == 14){
                
            }
            
        } else if (xPosition == 8){
            if (yPosition == 1){

            } else if (yPosition == 2){
                
            } else if (yPosition == 3){
                
            } else if (yPosition == 4){
                
            } else if (yPosition == 5){
                
            } else if (yPosition == 6){
                
            } else if (yPosition == 7){
                
            } else if (yPosition == 8){
                
            } else if (yPosition == 9){
                
            } else if (yPosition == 10){
                
            } else if (yPosition == 11){
                
            } else if (yPosition == 12){
                
            } else if (yPosition == 13){
                
            } else if (yPosition == 14){
                
            }
            
        } else if (xPosition == 9){
            if (yPosition == 1){

            } else if (yPosition == 2){
                
            } else if (yPosition == 3){
                
            } else if (yPosition == 4){
                
            } else if (yPosition == 5){
                
            } else if (yPosition == 6){
                
            } else if (yPosition == 7){
                
            } else if (yPosition == 8){
                
            } else if (yPosition == 9){
                
            } else if (yPosition == 10){
                
            } else if (yPosition == 11){
                
            } else if (yPosition == 12){
                
            } else if (yPosition == 13){
                
            } else if (yPosition == 14){
                
            }
            
        } else if (xPosition == 10){
            if (yPosition == 1){

            } else if (yPosition == 2){
                
            } else if (yPosition == 3){
                
            } else if (yPosition == 4){
                
            } else if (yPosition == 5){
                
            } else if (yPosition == 6){
                
            } else if (yPosition == 7){
                
            } else if (yPosition == 8){
                
            } else if (yPosition == 9){
                
            } else if (yPosition == 10){
                
            } else if (yPosition == 11){
                
            } else if (yPosition == 12){
                
            } else if (yPosition == 13){
                
            } else if (yPosition == 14){
                
            }
            
        } else if (xPosition == 11){
            if (yPosition == 1){

            } else if (yPosition == 2){
                
            } else if (yPosition == 3){
                
            } else if (yPosition == 4){
                
            } else if (yPosition == 5){
                
            } else if (yPosition == 6){
                
            } else if (yPosition == 7){
                
            } else if (yPosition == 8){
                
            } else if (yPosition == 9){
                
            } else if (yPosition == 10){
                
            } else if (yPosition == 11){
                
            } else if (yPosition == 12){
                
            } else if (yPosition == 13){
                
            } else if (yPosition == 14){
                
            }
            
        } else if (xPosition == 12){
            if (yPosition == 1){

            } else if (yPosition == 2){
                
            } else if (yPosition == 3){
                
            } else if (yPosition == 4){
                
            } else if (yPosition == 5){
                
            } else if (yPosition == 6){
                
            } else if (yPosition == 7){
                
            } else if (yPosition == 8){
                
            } else if (yPosition == 9){
                
            } else if (yPosition == 10){
                
            } else if (yPosition == 11){
                
            } else if (yPosition == 12){
                
            } else if (yPosition == 13){
                
            } else if (yPosition == 14){
                
            }
            
        } else if (xPosition == 13){
            if (yPosition == 1){

            } else if (yPosition == 2){
                
            } else if (yPosition == 3){
                
            } else if (yPosition == 4){
                
            } else if (yPosition == 5){
                
            } else if (yPosition == 6){
                
            } else if (yPosition == 7){
                
            } else if (yPosition == 8){
                
            } else if (yPosition == 9){
                
            } else if (yPosition == 10){
                
            } else if (yPosition == 11){
                
            } else if (yPosition == 12){
                
            } else if (yPosition == 13){
                
            } else if (yPosition == 14){
                
            }
        } else if (xPosition == 14){
            if (yPosition == 1){

            } else if (yPosition == 2){
                
            } else if (yPosition == 3){
                
            } else if (yPosition == 4){
                
            } else if (yPosition == 5){
                
            } else if (yPosition == 6){
                
            } else if (yPosition == 7){
                
            } else if (yPosition == 8){
                
            } else if (yPosition == 9){
                
            } else if (yPosition == 10){
                
            } else if (yPosition == 11){
                
            } else if (yPosition == 12){
                
            } else if (yPosition == 13){
                
            } else if (yPosition == 14){
                
            }
        }
    }

    //we will program our various encounters to be called on from each position here
    public static void Treasure{
        System.out.print("You see a treasure chest.")
        String stringyBoi3 = scannyBoi.nextLine();
        if (stringyBoi3.equals("open")){

        } else if (stringyBoi3.equals("ignore")){

        } else {
            System.out.print("That is not a recognized command.")
            Treasure();
        }
    }

    public static void TrappedTreasure{
        System.out.print("You see a treasure chest.")
        String stringyBoi4 = scannyBoi.nextLine();
        if (stringyBoi4.equals("open")){

        } else if (stringyBoi4.equals("ignore")){

        } else {
            System.out.print("That is not a recognized command.")
            TrappedTreasure();
        }
    }
    
    public static void Troll{

    }

    public static void Slime{

    }

    public static void Sword{

    }

    public static void Dragon{

    }

    public static void Potion{

    }

    public static void GameOver(){
        //this is where we go after the game has ended
        System.out.print("The game is over.")
        //this tells the player that the game has ended
        if (win == false){
            System.out.print("You Lose")
        } else {
            System.out.print("Congratulations! You win!")
        }
        //this if statement determines whether or not the player won
        //the boolean "win" will be set to true once certain conditions are met in the game
    }
}