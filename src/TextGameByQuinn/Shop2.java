package textgamebyquinn;

public class Shop2{
    public static void Shop2(){
        System.out.print("You see an old building. Upon closer inspection, it appears to be some sort of abandoned shop. Despite the appearance of the shop, all the items seem to be brand new and of decent quality. There is a sword with a price tag of 200 gold, a shield with a price tag of 200, a bow with a price tag of 150 gold, arrows with a price tag of 5 gold each, armor with a price tag of 200 gold, and mysterious potions with a price tag of 10 gold each. There is sign telling you to leave the money on the counter and a sign saying no stealing. ");
        MainShop2();
    }

    public static void MainShop2(){
        System.out.println("You have " + gold + " gold. ");
        String shoppyBoi2 = scannyBoi.nextLine();
        switch (shoppyBoi2) {
        case "buy sword" :
            if (gold >= 200){
                if (sword < 2){
                    gold = gold - 200;
                    sword = 2;
                    System.out.print("You now have a decent sword. You have " + gold + " gold left. ");
                } else {
                    System.out.print("Your current sword is already better than this. There is no need to buy it. ");
                }
            } else {
                System.out.print("You do not have enough gold to buy this. ");
            }
            MainShop2();
        case "buy shield" :
            if (gold >= 200){
                if (shield < 2){
                    gold = gold - 200;
                    shield = 2;
                    System.out.print("You now have a decent shield. You have " + gold + " gold left. ");
                } else {
                    System.out.print("Your current shield is already better than this. There is no need to buy it. ");
                }
            } else {
                System.out.print("You do not have enough gold to buy this. ");
            }
            MainShop2();
        case "buy bow" :
            if (gold >= 150){
                if (bow < 2){
                    gold = gold - 150;
                    bow = 2;
                    System.out.print("You now have a decent bow. You have " + gold + " gold left. ");
                } else {
                    System.out.print("Your current bow is already better than this. There is no need to buy it. ");
                }
            } else {
                System.out.print("You do not have enough gold to buy this. ");
            }
            MainShop2();
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
            MainShop2();
        case "buy armor" :
            if(gold >= 200){
                if (armor < 2){
                    gold = gold - 200;
                    armor = 2;
                    System.out.print("You now have decent armor. You have " + gold + " gold left. ");
                } else {
                    System.out.print("Your current armor is already better than this. There is no need to buy it. ");
                }
            } else {
                System.out.print("You do not have enough gold to buy this. ");
            }
            MainShop2();
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
            MainShop2();
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
            MainShop2();
        }
    }
}