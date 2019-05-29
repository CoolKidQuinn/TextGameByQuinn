package textgamebyquinn;

import textgamebyquinn.GameLoop.java;
import java.util.*;

public class Shop4{
    public static void main(String[] args) {
        System.out.print("You see a nice building. Upon closer inspection, it appears to be some sort of abandoned shop. Despite the shop being vacant, all the items seem to be amazing quality and in mint condition. There is a sword with a price tag of 800 GameLoop.gold, a shield with a price tag of 800, a bow with a price tag of 600 GameLoop.gold, arrows with a price tag of 5 GameLoop.gold each, armor with a price tag of 800 GameLoop.gold, and mysterious potions with a price tag of 10 GameLoop.gold each. There is sign telling you to leave the money on the counter and a sign saying no stealing. ");
        MainShop4();
    }

    public static void MainShop4(){
        System.out.println("You have " + GameLoop.gold + " GameLoop.gold. ");
        String shoppyBoi4 = scannyBoi.nextLine();
        switch (shoppyBoi4){
        case "buy sword" :
            if (GameLoop.gold >= 800){
                if (sword < 4){
                    GameLoop.gold = GameLoop.gold - 800;
                    GameLoop.sword = 4;
                    System.out.print("You now have an amazing sword. You have " + GameLoop.gold + " gold left. ");
                } else {
                    System.out.print("Your current sword is already better than this. There is no need to buy it. ");
                }
            } else {
                System.out.print("You do not have enough gold to buy this. ");
            }
            MainShop4();
        case "buy shield" :
            if (GameLoop.gold >= 800){
                if (shield < 4){
                    GameLoop.gold = GameLoop.gold - 800;
                    GameLoop.shield = 4;
                    System.out.print("You now have an amazing shield. You have " + GameLoop.gold + " gold left. ");
                } else {
                    System.out.print("Your current shield is already better than this. There is no need to buy it. ");
                }
            } else {
                System.out.print("You do not have enough gold to buy this. ");
            }
            MainShop4();
        case "buy bow" :
            if (GameLoop.gold >= 600){
                if (bow < 4){
                    GameLoop.gold = GameLoop.gold - 600;
                    GameLoop.bow = 4;
                    System.out.print("You now have an amazing bow. You have " + GameLoop.gold + " gold left. ");
                } else {
                    System.out.print("Your current bow is already better than this. There is no need to buy it. ");
                }
            } else {
                System.out.print("You do not have enough gold to buy this. ");
            }
            MainShop4();
        case "buy arrows" :
            System.out.print("How many would you like to buy?");
            int arrowsPurchased = scannyBoi.nextInt();
            int goldSpentOnArrows = arrowsPurchased * 5;
            if (GameLoop.gold >= goldSpentOnArrows){
                GameLoop.gold = GameLoop.gold - goldSpentOnArrows;
                numberOfArrows = numberOfArrows + arrowsPurchased;
                System.out.print("You now have " + numberOfArrows + " arrows. You have " + GameLoop.gold + " gold left. ");
            } else {
                System.out.print("You do not have enough gold to buy this. ");
            }
            MainShop4();
        case "buy armor" :
            if(GameLoop.gold >= 800){
                if (armor < 4){
                    GameLoop.gold = GameLoop.gold - 800;
                    GameLoop.armor = 4;
                    System.out.print("You now have amazing armor. You have " + GameLoop.gold + " gold left. ");
                } else {
                    System.out.print("Your current armor is already better than this. There is no need to buy it. ");
                }
            } else {
                System.out.print("You do not have enough gold to buy this. ");
            }
            MainShop4();
        case "buy potions" :
            System.out.print("How many would you like to buy?");
            int potionsPurchased = scannyBoi.nextInt();
            int goldSpentOnPotions = potionsPurchased * 10;
            if (GameLoop.gold >= goldSpentOnPotions){
                GameLoop.gold = GameLoop.gold - goldSpentOnPotions;
                System.out.print("You have " + GameLoop.gold + " gold left. ");
            } else {
                System.out.print("You do not have enough gold to buy this. ");
            }
            MainShop4();
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
            MapMovement();
        default :
            System.out.print("This is not a recognized command");
            MainShop4();
        }
    }
}