package textgamebyquinn;

import textgamebyquinn.GameLoop;
//import java.util.*;

public class Treasure1{
    
    public static void Treasure() {
        System.out.println("You see a treasure chest. ");
        String stringyBoi3 = GameLoop.scannyBoi.nextLine();
        switch (stringyBoi3){
            case "open chest" : 
            System.out.println("You open up the treasure chest and find 25 gold ");
            GameLoop.experience = GameLoop.experience + 5;
            GameLoop.gold = GameLoop.gold + 25;
            case "ignore chest" :
            System.out.println("You decide to ignore the chest and continue searching. ");
            case "help" :
                System.out.println("Recognized commands: ");
                System.out.println("open chest");
                System.out.println("ignore chest");
                Treasure();
            default :
            System.out.println("That is not a recognized command. ");
            Treasure();
        }
        GameLoop.MapMovement();
    }
}