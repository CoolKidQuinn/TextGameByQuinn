package textgamebyquinn;

import textgamebyquinn.GameLoop;
import java.util.*;

public class Shop3{
    public static void main(String[] args) {
        System.out.print("You see a building. Upon closer inspection, it appears to be some sort of abandoned shop. Despite the shop being vacant, all the items seem to be good quality and in perfect condition. There is a sword with a price tag of 400 gold, a shield with a price tag of 400, a bow with a price tag of 300 gold, arrows with a price tag of 5 gold each, armor with a price tag of 400 gold, and mysterious potions with a price tag of 10 gold each. There is sign telling you to leave the money on the counter and a sign saying no stealing. ");
        MainShop3();
    }
    public static void MainShop3(){
        System.out.println("You have " + GameLoop.gold + " gold. ");
        String shoppyBoi3 = GameLoop.scannyBoi.nextLine();
        switch (shoppyBoi3) {
        case "buy sword" :
            if (GameLoop.gold >= 400){
                if (GameLoop.sword < 3){
                    GameLoop.gold = GameLoop.gold - 400;
                    GameLoop.sword = 3;
                    System.out.print("You now have a good sword. You have " + GameLoop.gold + " gold left. ");
                } else {
                    System.out.print("Your current sword is already better than this. There is no need to buy it. ");
                }
            } else {
                System.out.print("You do not have enough gold to buy this. ");
            }
            MainShop3();
        case "buy shield" :
            if (GameLoop.gold >= 400){
                if (GameLoop.shield < 3){
                    GameLoop.gold = GameLoop.gold - 400;
                    GameLoop.shield = 3;
                    System.out.print("You now have a good shield. You have " + GameLoop.gold + " gold left. ");
                } else {
                    System.out.print("Your current shield is already better than this. There is no need to buy it. ");
                }
            } else {
                System.out.print("You do not have enough gold to buy this. ");
            }
            MainShop3();
        case "buy bow" :
            if (GameLoop.gold >= 300){
                if (GameLoop.bow < 3){
                    GameLoop.gold = GameLoop.gold - 300;
                    GameLoop.bow = 3;
                    System.out.print("You now have a good bow. You have " + GameLoop.gold + " gold left. ");
                } else {
                    System.out.print("Your current bow is already better than this. There is no need to buy it. ");
                }
            } else {
                System.out.print("You do not have enough gold to buy this. ");
            }
            MainShop3();
        case "buy arrows" :
            System.out.print("How many would you like to buy?");
            int arrowsPurchased = GameLoop.scannyBoi.nextInt();
            int goldSpentOnArrows = arrowsPurchased * 5;
            if (GameLoop.gold >= goldSpentOnArrows){
                GameLoop.gold = GameLoop.gold - goldSpentOnArrows;
                GameLoop.numberOfArrows = GameLoop.numberOfArrows + arrowsPurchased;
                System.out.print("You now have " + GameLoop.numberOfArrows + " arrows. You have " + GameLoop.gold + " gold left. ");
            } else {
                System.out.print("You do not have enough gold to buy this. ");
            }
            MainShop3();
        case "buy armor" :
            if(GameLoop.gold >= 400){
                if (GameLoop.armor < 3){
                    GameLoop.gold = GameLoop.gold - 400;
                    GameLoop.armor = 3;
                    System.out.print("You now have good armor. You have " + GameLoop.gold + " gold left. ");
                } else {
                    System.out.print("Your current armor is already better than this. There is no need to buy it. ");
                }
            } else {
                System.out.print("You do not have enough gold to buy this. ");
            }
            MainShop3();
        case "buy potions" :
            System.out.print("How many would you like to buy?");
            int potionsPurchased = GameLoop.scannyBoi.nextInt();
            int goldSpentOnPotions = potionsPurchased * 10;
            if (GameLoop.gold >= goldSpentOnPotions){
                GameLoop.gold = GameLoop.gold - goldSpentOnPotions;
                System.out.print("You have " + GameLoop.gold + " gold left. ");
            } else {
                System.out.print("You do not have enough gold to buy this. ");
            }
            MainShop3();
        case "steal sword" :
            System.out.print("As you grab the sword you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain. ");
            GameLoop.GameOver();
        case "steal shield" :
            System.out.print("As you grab the shield you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain. ");
            GameLoop.GameOver();
        case "steal bow" :
            System.out.print("As you grab the bow you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain. ");
            GameLoop.GameOver();
        case "steal arrows" :
            System.out.print("As you grab the arrows you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain. ");
            GameLoop.GameOver();
        case "steal armor" :
            System.out.print("As you grab the armor you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain. ");
            GameLoop.GameOver();
        case "steal potions" :
            System.out.print("As you grab the potions you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain. ");
            GameLoop.GameOver();
        case "leave shop" :
        GameLoop.MapMovement();
        default :
            System.out.print("This is not a recognized command");
            MainShop3();
        }
    }
}