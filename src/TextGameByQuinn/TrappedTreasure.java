package textgamebyquinn;

import textgamebyquinn.GameLoop;
import java.util.*;

public class TrappedTreasure{
    public static void Treasure(){
        System.out.print("You see a treasure chest. ");
        String stringyBoi3 = GameLoop.scannyBoi.nextLine();
        switch (stringyBoi3){
            case "open chest" : 
            System.out.print("You bend down to open the chest, but as soon as you touch it, it explodes, hurting you and knocking you down. ");
            GameLoop.health = GameLoop.health - 10;
            if (GameLoop.health <= 0){
                GameLoop.GameOver();
            }
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