package textgamebyquinn;

import textgamebyquinn.GameLoop;
//import java.util.*;

public class Shop2{
    public static void Shop() {
        System.out.println("You see an old building. Upon closer inspection, it appears to be some sort of abandoned shop. Despite the appearance of the shop, all the items seem to be brand new and of decent quality. There is a sword with a price tag of 200 gold, a shield with a price tag of 200, a bow with a price tag of 150 gold, arrows with a price tag of 5 gold each, armor with a price tag of 200 gold, and mysterious potions with a price tag of 25 gold each. There is sign telling you to leave the money on the counter and a sign saying no stealing. ");
        MainShop2();
    }

    public static void MainShop2(){
        System.out.println("You have " + GameLoop.gold + " gold. ");
        String shoppyBoi2 = GameLoop.scannyBoi.nextLine();
        switch (shoppyBoi2) {
        case "buy sword" :
            if (GameLoop.gold >= 200){
                if (GameLoop.sword < 2){
                    GameLoop.gold = GameLoop.gold - 200;
                    GameLoop.sword = 2;
                    System.out.println("You now have a decent sword. You have " + GameLoop.gold + " gold left. ");
                } else {
                    System.out.println("Your current sword is already better than this. There is no need to buy it. ");
                }
            } else {
                System.out.println("You do not have enough gold to buy this. ");
            }
            MainShop2();
        case "buy shield" :
            if (GameLoop.gold >= 200){
                if (GameLoop.shield < 2){
                    GameLoop.gold = GameLoop.gold - 200;
                    GameLoop.shield = 2;
                    System.out.println("You now have a decent shield. You have " + GameLoop.gold + " gold left. ");
                } else {
                    System.out.println("Your current shield is already better than this. There is no need to buy it. ");
                }
            } else {
                System.out.println("You do not have enough gold to buy this. ");
            }
            MainShop2();
        case "buy bow" :
            if (GameLoop.gold >= 150){
                if (GameLoop.bow < 2){
                    GameLoop.gold = GameLoop.gold - 150;
                    GameLoop.bow = 2;
                    System.out.println("You now have a decent bow. You have " + GameLoop.gold + " gold left. ");
                } else {
                    System.out.println("Your current bow is already better than this. There is no need to buy it. ");
                }
            } else {
                System.out.println("You do not have enough gold to buy this. ");
            }
            MainShop2();
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
            MainShop2();
        case "buy armor" :
            if(GameLoop.gold >= 200){
                if (GameLoop.armor < 2){
                    GameLoop.gold = GameLoop.gold - 200;
                    GameLoop.armor = 2;
                    System.out.println("You now have decent armor. You have " + GameLoop.gold + " gold left. ");
                } else {
                    System.out.println("Your current armor is already better than this. There is no need to buy it. ");
                }
            } else {
                System.out.println("You do not have enough gold to buy this. ");
            }
            MainShop2();
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
            MainShop2();
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
            MainShop2(); 
        default :
            System.out.println("This is not a recognized command");
            MainShop2();
        }
    }
}