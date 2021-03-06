package textgamebyquinn;

import textgamebyquinn.GameLoop;
//import java.util.*;

public class TrappedTreasure{
    public static void Treasure(){
        System.out.println("You see a treasure chest. ");
        String stringyBoi3 = GameLoop.scannyBoi.nextLine();
        switch (stringyBoi3){
            case "open chest" : 
            System.out.println("You bend down to open the chest, but as soon as you touch it, it explodes, hurting you and knocking you down. ");
            GameLoop.health = GameLoop.health - 10;
            if (GameLoop.health <= 0){
                GameLoop.GameOver();
            } else {
                System.out.println("You have " + GameLoop.health + " health.");
            }
            GameLoop.MapMovement();
            case "ignore chest" :
            System.out.println("You decide to ignore the chest and continue searching. ");
            GameLoop.MapMovement();
            case "help" :
                System.out.println("Recognized commands: ");
                System.out.println("open chest");
                System.out.println("ignore chest");
                Treasure();
            default :
            System.out.println("That is not a recognized command. ");
            Treasure();
        }
    }
}