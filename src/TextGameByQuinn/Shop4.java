package textgamebyquinn;

public class Shop4{
    public static void main(String[] args) {
        System.out.print("You see a nice building. Upon closer inspection, it appears to be some sort of abandoned shop. Despite the shop being vacant, all the items seem to be amazing quality and in mint condition. There is a sword with a price tag of 800 gold, a shield with a price tag of 800, a bow with a price tag of 600 gold, arrows with a price tag of 5 gold each, armor with a price tag of 800 gold, and mysterious potions with a price tag of 10 gold each. There is sign telling you to leave the money on the counter and a sign saying no stealing. ");
        MainShop4();
    }

    public static void MainShop4(){
        System.out.println("You have " + gold + " gold. ");
        String shoppyBoi4 = scannyBoi.nextLine();
        switch (shoppyBoi4){
        case "buy sword" :
            if (gold >= 800){
                if (sword < 4){
                    gold = gold - 800;
                    sword = 4;
                    System.out.print("You now have an amazing sword. You have " + gold + " gold left. ");
                } else {
                    System.out.print("Your current sword is already better than this. There is no need to buy it. ");
                }
            } else {
                System.out.print("You do not have enough gold to buy this. ");
            }
            MainShop4();
        case "buy shield" :
            if (gold >= 800){
                if (shield < 4){
                    gold = gold - 800;
                    shield = 4;
                    System.out.print("You now have an amazing shield. You have " + gold + " gold left. ");
                } else {
                    System.out.print("Your current shield is already better than this. There is no need to buy it. ");
                }
            } else {
                System.out.print("You do not have enough gold to buy this. ");
            }
            MainShop4();
        case "buy bow" :
            if (gold >= 600){
                if (bow < 4){
                    gold = gold - 600;
                    bow = 4;
                    System.out.print("You now have an amazing bow. You have " + gold + " gold left. ");
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
            if (gold >= goldSpentOnArrows){
                gold = gold - goldSpentOnArrows;
                numberOfArrows = numberOfArrows + arrowsPurchased;
                System.out.print("You now have " + numberOfArrows + " arrows. You have " + gold + " gold left. ");
            } else {
                System.out.print("You do not have enough gold to buy this. ");
            }
            MainShop4();
        case "buy armor" :
            if(gold >= 800){
                if (armor < 4){
                    gold = gold - 800;
                    armor = 4;
                    System.out.print("You now have amazing armor. You have " + gold + " gold left. ");
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
            if (gold >= goldSpentOnPotions){
                gold = gold - goldSpentOnPotions;
                System.out.print("You have " + gold + " gold left. ");
            } else {
                System.out.print("You do not have enough gold to buy this. ");
            }
            MainShop4();
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
            MainShop4();
        }
    }
}