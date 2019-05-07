package textgamebyquinn;

public class Shop5{
    public static void Shop5(){
        System.out.print("You see a magnificent building. Upon closer inspection, it appears to be some sort of abandoned shop. Despite the shop being vacant, all the items are the best quality you have ever seen. You can practically feel the power radiating off of them. There is a sword with a price tag of 1800 gold, a shield with a price tag of 1800, a bow with a price tag of 1200 gold, arrows with a price tag of 5 gold each, armor with a price tag of 1800 gold, and mysterious potions with a price tag of 10 gold each. There is sign telling you to leave the money on the counter and a sign saying no stealing. ");
        MainShop5();
    }

    public static void MainShop5(){
        System.out.println("You have " + gold + " gold. ");
        String shoppyBoi5 = scannyBoi.nextLine();
        switch (shoppyBoi5) {
        case "buy sword" :
            if (gold >= 1800){
                if (sword < 5){
                    gold = gold - 1800;
                    sword = 5;
                    System.out.print("You now have a good sword. You have " + gold + " gold left. ");
                } else {
                    System.out.print("Your current sword is already better than this. There is no need to buy it. ");
                }
            } else {
                System.out.print("You do not have enough gold to buy this. ");
            }
            MainShop5();
        case "buy shield" :
            if (gold >= 1800){
                if (shield < 5){
                    gold = gold - 1800;
                    shield = 5;
                    System.out.print("You now have a good shield. You have " + gold + " gold left. ");
                } else {
                    System.out.print("Your current shield is already better than this. There is no need to buy it. ");
                }
            } else {
                System.out.print("You do not have enough gold to buy this. ");
            }
            MainShop5();
        case "buy bow" :
            if (gold >= 1200){
                if (bow < 5){
                    gold = gold - 1200;
                    bow = 5;
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
            int arrowsPurchased = scannyBoi.nextInt();
            int goldSpentOnArrows = arrowsPurchased * 5;
            if (gold >= goldSpentOnArrows){
                gold = gold - goldSpentOnArrows;
                numberOfArrows = numberOfArrows + arrowsPurchased;
                System.out.print("You now have " + numberOfArrows + " arrows. You have " + gold + " gold left. ");
            } else {
                System.out.print("You do not have enough gold to buy this. ");
            }
            MainShop5();
        case "buy armor" :
            if(gold >= 1800){
                if (armor < 5){
                    gold = gold - 1800;
                    armor = 5;
                    System.out.print("You now have good armor. You have " + gold + " gold left. ");
                } else {
                    System.out.print("Your current armor is already better than this. There is no need to buy it. ");
                }
            } else {
                System.out.print("You do not have enough gold to buy this. ");
            }
            MainShop5();
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
            MainShop5();
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
            MainShop5();
        }
    }
}