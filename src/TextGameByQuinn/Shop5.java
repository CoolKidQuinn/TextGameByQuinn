package textgamebyquinn;

import textgamebyquinn.GameLoop.java;
import java.util.*;

public class Shop5{
    public static void main(String[] args) {
        System.out.print("You see a magnificent building. Upon closer inspection, it appears to be some sort of abandoned shop. Despite the shop being vacant, all the items are the best quality you have ever seen. You can practically feel the power radiating off of them. There is a sword with a price tag of 1800 gold, a shield with a price tag of 1800, a bow with a price tag of 1200 gold, arrows with a price tag of 5 gold each, armor with a price tag of 1800 gold, and mysterious potions with a price tag of 10 gold each. There is sign telling you to leave the money on the counter and a sign saying no stealing. ");
        MainShop5();
    }

    public static void MainShop5(){
        System.out.println("You have " + GameLoop.gold + " gold. ");
        String shoppyBoi5 = GameLoop.scannyBoi.nextLine();
        switch (shoppyBoi5) {
        case "buy sword" :
            if (GameLoop.gold >= 1800){
                if (sword < 5){
                    GameLoop.gold = GameLoop.gold - 1800;
                    GameLoop.sword = 5;
                    System.out.print("You now have a good sword. You have " + gold + " gold left. ");
                } else {
                    System.out.print("Your current sword is already better than this. There is no need to buy it. ");
                }
            } else {
                System.out.print("You do not have enough gold to buy this. ");
            }
            MainShop5();
        case "buy shield" :
            if (GameLoop.gold >= 1800){
                if (GameLoop.shield < 5){
                    GameLoop.gold = GameLoop.gold - 1800;
                    GameLoop.shield = 5;
                    System.out.print("You now have a good shield. You have " + gold + " gold left. ");
                } else {
                    System.out.print("Your current shield is already better than this. There is no need to buy it. ");
                }
            } else {
                System.out.print("You do not have enough gold to buy this. ");
            }
            MainShop5();
        case "buy bow" :
            if (GameLoop.gold >= 1200){
                if (GameLoop.bow < 5){
                    GameLoop.gold = GameLoop.gold - 1200;
                    GameLoop.bow = 5;
                    System.out.print("You now have a good bow. You have " + gold + " gold left. ");
                } else {
                    System.out.print("Your current bow is already better than this. There is no need to buy it. ");
                }
            } else {
                System.out.print("You do not have enough gold to buy this. ");
            }
            MainShop5();
        case "buy arrows" :
            System.out.print("How many would you like to buy?");
            int arrowsPurchased = GameLoop.scannyBoi.nextInt();
            int goldSpentOnArrows = arrowsPurchased * 5;
            if (GameLoop.gold >= goldSpentOnArrows){
                GameLoop.gold = GameLoop.gold - goldSpentOnArrows;
                numberOfArrows = numberOfArrows + arrowsPurchased;
                System.out.print("You now have " + numberOfArrows + " arrows. You have " + GameLoop.gold + " gold left. ");
            } else {
                System.out.print("You do not have enough gold to buy this. ");
            }
            MainShop5();
        case "buy armor" :
            if(GameLoop.gold >= 1800){
                if (GameLoop.armor < 5){
                    GameLoop.gold = GameLoop.gold - 1800;
                    GameLoop.armor = 5;
                    System.out.print("You now have good armor. You have " + GameLoop.gold + " gold left. ");
                } else {
                    System.out.print("Your current armor is already better than this. There is no need to buy it. ");
                }
            } else {
                System.out.print("You do not have enough gold to buy this. ");
            }
            MainShop5();
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
            MainShop5();
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
            MainShop5();
        }
    }
}