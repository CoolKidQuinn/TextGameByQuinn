package textgamebyquinn;

public class Shop3{
    public static void Shop3(){
        System.out.print("You see a building. Upon closer inspection, it appears to be some sort of abandoned shop. Despite the shop being vacant, all the items seem to be good quality and in perfect condition. There is a sword with a price tag of 400 gold, a shield with a price tag of 400, a bow with a price tag of 300 gold, arrows with a price tag of 5 gold each, armor with a price tag of 400 gold, and mysterious potions with a price tag of 10 gold each. There is sign telling you to leave the money on the counter and a sign saying no stealing. ");
        MainShop3();
    }
    public static void MainShop3(){
        System.out.println("You have " + gold + " gold. ");
        String shoppyBoi3 = scannyBoi.nextLine();
        switch (shoppyBoi3) {
        case "buy sword" :
            if (gold >= 400){
                if (sword < 3){
                    gold = gold - 400;
                    sword = 3;
                    System.out.print("You now have a good sword. You have " + gold + " gold left. ");
                } else {
                    System.out.print("Your current sword is already better than this. There is no need to buy it. ");
                }
            } else {
                System.out.print("You do not have enough gold to buy this. ");
            }
            MainShop3();
        case "buy shield" :
            if (gold >= 400){
                if (shield < 3){
                    gold = gold - 400;
                    shield = 3;
                    System.out.print("You now have a good shield. You have " + gold + " gold left. ");
                } else {
                    System.out.print("Your current shield is already better than this. There is no need to buy it. ");
                }
            } else {
                System.out.print("You do not have enough gold to buy this. ");
            }
            MainShop3();
        case "buy bow" :
            if (gold >= 300){
                if (bow < 3){
                    gold = gold - 300;
                    bow = 3;
                    System.out.print("You now have a good bow. You have " + gold + " gold left. ");
                } else {
                    System.out.print("Your current bow is already better than this. There is no need to buy it. ");
                }
            } else {
                System.out.print("You do not have enough gold to buy this. ");
            }
            MainShop3();
        case "buy arrows" :
            System.out.print("How many would you like to buy?");
            int arrowsPurchased = scannyBoi.nextInt();
            int goldSpentOnArrows = arrowsPurchased * 5;
            if (gold >= goldSpentOnArrows){
                gold = gold - goldSpentOnArrows;
                numberOfArrows = numberOfArrows + arrowsPurchased;
                System.out.print("You now have " + numberOfArrows + " arrows. You have " + gold + " gold left. ");
            } else {
                System.out.print("You do not have enough gold to buy this. ");
            }
            MainShop3();
        case "buy armor" :
            if(gold >= 400){
                if (armor < 3){
                    gold = gold - 400;
                    armor = 3;
                    System.out.print("You now have good armor. You have " + gold + " gold left. ");
                } else {
                    System.out.print("Your current armor is already better than this. There is no need to buy it. ");
                }
            } else {
                System.out.print("You do not have enough gold to buy this. ");
            }
            MainShop3();
        case "buy potions" :
            System.out.print("How many would you like to buy?");
            int potionsPurchased = scannyBoi.nextInt();
            int goldSpentOnPotions = potionsPurchased * 10;
            if (gold >= goldSpentOnPotions){
                gold = gold - goldSpentOnPotions;
                System.out.print("You have " + gold + " gold left. ");
            } else {
                System.out.print("You do not have enough gold to buy this. ");
            }
            MainShop3();
        case "steal sword" :
            System.out.print("As you grab the sword you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain. ");
            GameOver();
        case "steal shield" :
            System.out.print("As you grab the shield you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain. ");
            GameOver();
        case "steal bow" :
            System.out.print("As you grab the bow you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain. ");
            GameOver();
        case "steal arrows" :
            System.out.print("As you grab the arrows you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain. ");
            GameOver();
        case "steal armor" :
            System.out.print("As you grab the armor you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain. ");
            GameOver();
        case "steal potions" :
            System.out.print("As you grab the potions you feel a searing pain where you touch it. The pain shoots from your hand throughout your entire body. You collapse in pain. ");
            GameOver();
        case "leave shop" :
            MapMovement();
        default :
            System.out.print("This is not a recognized command");
            MainShop3();
        }
    }
}