package textgamebyquinn;

import textgamebyquinn.GameLoop;
//import java.util.*;

public class Shop1{
    //this is the first shop
    //it will be the closest to spawn
    //it has power level 1 items
    //it will be an encounter you can have multiple times
    //the items here will be cheap
    public static void Shop() {
        System.out.println("You see a rickety building. Upon closer inspection, it appears to be some sort of abandoned shop. Despite the appearance of the shop, all the items seem to be in relatively good condition, although they aren't very high quality. There is a sword with a price tag of 100 gold, a shield with a price tag of 100, a bow with a price tag of 75 gold, arrows with a price tag of 5 gold each, armor with a price tag of 100 gold, and mysterious potions with a price tag of 25 gold each. There is sign telling you to leave the money on the counter and a sign saying no stealing. ");
        MainShop1();
    }

    public static void MainShop1(){
        System.out.println("You have " + GameLoop.gold + " gold. ");
        String shoppyBoi1 = GameLoop.scannyBoi.nextLine();
        switch (shoppyBoi1) {
        case "buy sword" : 
            if (GameLoop.gold >= 100){
                if (GameLoop.sword < 1){
                    GameLoop.gold = GameLoop.gold - 100;
                    GameLoop.sword = 1;
                    System.out.println("You now have a sword. You have " + GameLoop.gold + " gold left. ");
                } else {
                    System.out.println("Your current sword is already better than this. There is no need to buy it. ");
                }
            } else {
                System.out.println("You do not have enough gold to buy this. ");
            }
            MainShop1();
        case "buy shield" :
            if (GameLoop.gold >= 100){
                if (GameLoop.shield < 1){
                    GameLoop.gold = GameLoop.gold - 100;
                    GameLoop.shield = 1;
                    System.out.println("You now have a shield. You have " + GameLoop.gold + " gold left. ");
                } else {
                    System.out.println("Your current shield is already better than this. There is no need to buy it. ");
                }
            } else {
                System.out.println("You do not have enough gold to buy this. ");
            }
            MainShop1();
        case "buy bow" :
            if (GameLoop.gold >= 75){
                if (GameLoop.bow < 1){
                    GameLoop.gold = GameLoop.gold - 75;
                    GameLoop.bow = 1;
                    System.out.println("You now have a bow. You have " + GameLoop.gold + " gold left. ");
                } else {
                    System.out.println("Your current bow is already better than this. There is no need to buy it. ");
                }
            } else {
                System.out.println("You do not have enough gold to buy this. ");
            }
            MainShop1();
        case "buy arrows" :
            System.out.println("How many would you like to buy?");
            int arrowsPurchased = GameLoop.intyBoi.nextInt();
            int goldSpentOnArrows = arrowsPurchased * 5;
            if (GameLoop.gold >= goldSpentOnArrows){
                GameLoop.gold = GameLoop.gold - goldSpentOnArrows;
                GameLoop.numberOfArrows = GameLoop.numberOfArrows + arrowsPurchased;
                System.out.println("You now have " + GameLoop.numberOfArrows + " arrows. ");
            } else {
                System.out.println("You do not have enough gold to buy this. ");
            }
            MainShop1();
        case "buy armor" :
            if(GameLoop.gold >= 100){
                if (GameLoop.armor < 1){
                    GameLoop.gold = GameLoop.gold - 100;
                    GameLoop.armor = 1;
                    System.out.println("You now have armor. You have " + GameLoop.gold + " gold left. ");
                } else {
                    System.out.println("Your current armor is already better than this. There is no need to buy it. ");
                }
            } else {
                System.out.println("You do not have enough gold to buy this. ");
            }
            MainShop1();
        case "buy potions" :
            System.out.println("How many would you like to buy?");
            int potionsPurchased = GameLoop.intyBoi.nextInt();
            int goldSpentOnPotions = potionsPurchased * 25;
            if (GameLoop.gold >= goldSpentOnPotions){
                GameLoop.gold = GameLoop.gold - goldSpentOnPotions;
                GameLoop.numberOfPotions = GameLoop.numberOfPotions + potionsPurchased;
                System.out.println("You now have " + GameLoop.numberOfPotions + " potions. ");
            } else {
                System.out.println("You do not have enough gold to buy this. ");
            }
            MainShop1();
        case "steal sword" :
            System.out.println("As you grab the sword you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain. ");
            GameLoop.GameOver();
        case "steal shield" :
            System.out.println("As you grab the shield you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain. ");
            GameLoop.GameOver();
        case "steal bow" :
            System.out.println("As you grab the bow you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain. ");
            GameLoop.GameOver();
            case "steal arrows" :
            System.out.println("As you grab the arrows you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain. ");
            GameLoop.GameOver();
        case "steal armor" :
            System.out.println("As you grab the armor you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain. ");
            GameLoop.GameOver();
        case "steal potions" :
            System.out.println("As you grab the potions you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain. ");
            GameLoop.GameOver();
        case "leave shop" :
            GameLoop.MapMovement();
        case "help" :
            System.out.println("Recognized commands: ");
            System.out.println("Recognized commands: ");
            System.out.println("buy sword");
            System.out.println("buy shield");
            System.out.println("buy bow");
            System.out.println("buy arrows");
            System.out.println("buy armor");
            System.out.println("buy potions");
            System.out.println("leave shop");  
            MainShop1();  
        default :
            System.out.println("This is not a recognized command");
            MainShop1();
        }
    }
}