package textgamebyquinn;

import textgamebyquinn.GameLoop;
import java.util.*;

public class Treasure5{
    
    public static void Treasure() {
        System.out.println("You see a treasure chest. ");
        String stringyBoi3 = GameLoop.scannyBoi.nextLine();
        switch (stringyBoi3){
            case "open chest" : 
            System.out.println("You open up the treasure chest and find 100 gold ");
            GameLoop.experience = GameLoop.experience + 25;
            GameLoop.gold = GameLoop.gold + 100;
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