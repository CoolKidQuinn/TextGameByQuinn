package textgamebyquinn;

import textgamebyquinn.GameLoop;
//import java.util.*;

public class Treasure4{
    
    public static void Treasure() {
        System.out.println("You see a treasure chest. ");
        String stringyBoi3 = GameLoop.scannyBoi.nextLine();
        switch (stringyBoi3){
            case "open chest" : 
            System.out.println("You open up the treasure chest and find 80 gold ");
            GameLoop.experience = GameLoop.experience + 20;
            GameLoop.gold = GameLoop.gold + 80;
            break;
            case "ignore chest" :
            System.out.println("You decide to ignore the chest and continue searching. ");
            break;
            default :
            System.out.println("That is not a recognized command. ");
            Treasure();
            break;
        }
        GameLoop.MapMovement();
    }
}