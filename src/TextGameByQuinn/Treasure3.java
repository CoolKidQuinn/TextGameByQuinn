package textgamebyquinn;

import textgamebyquinn.GameLoop;
import java.util.*;

public class Treasure3{
    
    public static void Treasure() {
        System.out.print("You see a treasure chest. ");
        String stringyBoi3 = GameLoop.scannyBoi.nextLine();
        switch (stringyBoi3){
            case "open chest" : 
            System.out.print("You open up the treasure chest and find 60 gold ");
            GameLoop.experience = GameLoop.experience + 15;
            GameLoop.gold = GameLoop.gold + 60;
            break;
            case "ignore chest" :
            System.out.print("You decide to ignore the chest and continue searching. ");
            break;
            default :
            System.out.print("That is not a recognized command. ");
            Treasure();
            break;
        }
        GameLoop.MapMovement();
    }
}