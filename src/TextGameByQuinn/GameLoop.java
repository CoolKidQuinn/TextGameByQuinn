//This is going to be where everything happens in your game
//By gameloop it just means that this is going to be what happens every frame

import java.util.Scanner;
//basically just a bunch of general utilies that java put into the language

public class GameLoop{
    //public means it's accessible by every part of the program
    //static means one of these will always exist in a program
    //void means it doesn't return anything

    //Run this by typing "javac -d bin src/TextGameByQuinn/GameLoop.java" into the terminal
        //"javac" will tell vscode to tell java to compile the thing we tell it to
            //compiling something turns it from java into binary so the machine can read it
        //"-d" allows us to tell vs code where the thing is and where to put it once we finish compiling it
        // "bin" is the folder that we are putting the code in once it is compiled
        //"src/TextGameByQuinn/GameLoop.java" is where the thing is
    //after doing that, type "java -cp C:/users/chrobotics/git/TextGame/bin GameLoop" into the terminal
        //"java" tells vscode we want to use java commands
        //"-cp" tells vscode to tell java that we are going give it a class path to run
        //"C:/users/CHSRobotics/git/TextGame/bin GameLoop" is where the cass path for java to run is located
        //daddy says hi
    public static void main(String[] args) {
        Scanner scannyBoi = new Scanner(System.in);
        //"Scanner scannyBoi" brings a scanner into existence and names it scannyBoi
            //scanners can take input from the keyboard (or other places, but for our purposes keyboards)
        //"= new Scanner(System.in)" tells that scanner to get input from the place inside the parenthesis
            //in this case, we are getting it from "System.in" which is just what the keyboard is in java
        
        String stringyBoi = scannyBoi.nextLine();
        //on the next line when the user is using it, it will take what that user types on the next line and save it as stringyboi
        //"String" tells us what data type we are using (ie: string, double, boolean)
        //"stringBoi" is just what we are calling our new String
        //"= scannyBoi" tells us to set our new string to a value gotten from scannyBoi
            //unlike with out Scanner, we didn't need to put new because "String" is a data type while "Scanner" is a class
        //".nextLine()" tells the scanner we mentioned before to get the value the user inputs on the next line
            //this is a command from the import we imported earlier
        
        System.out.print(stringyBoi);
        //"System.out." is how we find our desired command
            //"System." tell us we are finding a command hardcoded into java
            //"out." tells we are going to be using a command that has to do with output
        //"print(stringyBoi)" tells us to print whatever is in the parenthesis
            //in this case it is the stringyBoi that the user inputed earlier

        //System.out.print("tictac time");
    }
}