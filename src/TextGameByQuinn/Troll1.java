package textgamebyquinn;

import textgamebyquinn.GameLoop;
import java.util.*;

public class Troll1{
    public static void Troll1Encounter(){
        GameLoop.trollHealth = 25;
        System.out.println("You come across a troll about your size. He is armed with a club. ");
        System.out.println("You have " + GameLoop.health + " health.");
        AttackTroll1();
    }

    public static void AttackTroll1(){
        String fightyBoi1 = GameLoop.scannyBoi.nextLine();
        switch (fightyBoi1){
        case "use sword" :
            if (GameLoop.sword == 0){
                System.out.println("You don't have a sword. ");
                AttackTroll1();
            } else {
                int damage = (GameLoop.sword + GameLoop.levelDamageMultiplier) * 2;
                GameLoop.trollHealth = GameLoop.trollHealth - damage;
                System.out.println("You slash the troll with your sword. ");
                Troll1Attacks();
            }
        case "use dagger" :
            int damage = GameLoop.level;
            GameLoop.trollHealth = GameLoop.trollHealth - damage;
            System.out.println("You stab the troll with your dagger. ");
            Troll1Attacks();
        case "use bow" :
            if (GameLoop.bow == 0){
                System.out.println("You don't have a bow. ");
                AttackTroll1();
            } else if (GameLoop.numberOfArrows == 0) {
                System.out.println("You don't have any arrows. ");
                AttackTroll1();
            } else {
                damage = (GameLoop.bow + GameLoop.levelDamageMultiplier) * 2;
                GameLoop.numberOfArrows = GameLoop.numberOfArrows - 1;
                GameLoop.trollHealth = GameLoop.trollHealth - damage;
                System.out.println("Your shoot an arrow at the troll. ");
                Troll1Attacks();
            }
        case "use potion" :
            if (GameLoop.numberOfPotions == 0){
                System.out.println("You don't have any potions. ");
            } else if (GameLoop.health == 100) {
                System.out.println("You are already at full health. ");
            } else if (GameLoop.health >= 75) {
                GameLoop.health = 100;
                System.out.println("You drink the potion and feel reinvigorated. ");
            } else {
                GameLoop.health = GameLoop.health + 25;
                System.out.println("You drink the potion and feel reinvigorated. ");
            }
            System.out.println("You have " + GameLoop.health + " health.");
            AttackTroll1();
        case "use shield" :
            if (GameLoop.shield == 0){
                System.out.println("You don't have a shield. ");
                AttackTroll1();
            } else {
                Random rand = new Random();
                int shieldBlockTest = rand.nextInt(10);
                int shieldStrength = GameLoop.shield + 5;
                if (shieldStrength > shieldBlockTest) {
                    System.out.println("The troll tries to attack you with his club, but you block it with your shield and have an oppurtunity to counterattack. ");
                    CritAttackTroll1();
                } else {
                    System.out.println("You can't quite get your shield up in time. ");
                    Troll1Attacks();
                }
            }
        case "punch" :
            System.out.println("You punch the troll. It barely even registers the attack. ");
            GameLoop.trollHealth = GameLoop.trollHealth - 1;
            Troll1Attacks();
        case "run" :
            System.out.println("You try to run away from the troll, but it is too fast and catches you. ");
            Troll1Attacks();
        case "help" :
            System.out.println("Recognized commands: ");
            System.out.println("use sword");
            System.out.println("use dagger");
            System.out.println("use bow");
            System.out.println("use potion");
            System.out.println("use shield");
            System.out.println("punch");
            System.out.println("run"); 
            AttackTroll1();   
        default :
            System.out.println("That is not a recognized command. ");
            AttackTroll1();
        }
    }

    public static void CritAttackTroll1(){
        String fightyBoi1 = GameLoop.scannyBoi.nextLine();
        switch (fightyBoi1) {
        case "use sword" :
            if (GameLoop.sword == 0){
                System.out.println("You don't have a sword. ");
                CritAttackTroll1();
            } else {
                int damage = (GameLoop.sword + GameLoop.levelDamageMultiplier) * 4;
                GameLoop.trollHealth = GameLoop.trollHealth - damage;
                System.out.println("You slash the troll with your sword. The troll isn't ready for the attack and it hits extra hard. ");
                Troll1Attacks();
            }
        case "use dagger" :
            int damage = GameLoop.level;
            GameLoop.trollHealth = GameLoop.trollHealth - damage * 2;
            System.out.println("You stab the troll with your dagger. The troll isn't ready for the attack and it hits extra hard. ");
            Troll1Attacks();
        case "use bow" :
            if (GameLoop.bow == 0){
                System.out.println("You don't have a bow. ");
                CritAttackTroll1();
            } else if (GameLoop.numberOfArrows == 0) {
                System.out.println("You don't have any arrows. ");
                CritAttackTroll1();
            } else {
                damage = (GameLoop.bow + GameLoop.levelDamageMultiplier) * 2;
                GameLoop.numberOfArrows = GameLoop.numberOfArrows - 1;
                GameLoop.trollHealth = GameLoop.trollHealth - damage;
                System.out.println("Your shoot an arrow at the troll. The troll isn't ready for the attack and it hits extra hard. ");
                Troll1Attacks();
            }
        case "use potion" :
            if (GameLoop.numberOfPotions == 0){
                System.out.println("You don't have any potions. ");
            } else if (GameLoop.health == 100) {
                System.out.println("You are already at full health. ");
            } else if (GameLoop.health >= 75) {
                GameLoop.health = 100;
                System.out.println("You drink the potion and feel reinvigorated. ");
            } else {
                GameLoop.health = GameLoop.health + 25;
                System.out.println("You drink the potion and feel reinvigorated. ");
            }
            System.out.println("You have " + GameLoop.health + " health.");
            CritAttackTroll1();
        case "use shield" :
            System.out.println("There is no point in blocking. The troll is already off guard. ");
            CritAttackTroll1();
        case "punch" :
            System.out.println("You punch the troll. ");
            GameLoop.trollHealth = GameLoop.trollHealth - 2;
            Troll1Attacks();
        case "run" :
            System.out.println("Even when the troll is off guard, it is still able to chase you down when you try to run. ");
            Troll1Attacks();
        case "help" :
            System.out.println("Recognized commands: ");
            System.out.println("use sword");
            System.out.println("use dagger");
            System.out.println("use bow");
            System.out.println("use potion");
            System.out.println("use shield");
            System.out.println("punch");
            System.out.println("run");  
            CritAttackTroll1();  
        default :
            System.out.println("That is not a recognized command. ");
            CritAttackTroll1();
        }
    }

    public static void Troll1Attacks(){
        if (GameLoop.trollHealth <= 0){
            DeadTroll1();
        } else {
            System.out.println("The troll swings its club at you. ");
            if (GameLoop.armor == 0){
                GameLoop.health = GameLoop.health - 16;
            } else {
                double troll1Damage = 12 / GameLoop.armor;
                GameLoop.health = GameLoop.health - troll1Damage;
            }
            if (GameLoop.health <= 0){
                GameLoop.GameOver();
            } else {
                System.out.println("The troll has " + GameLoop.trollHealth  + " health.");
                System.out.println("You have " + GameLoop.health + " health.");
                AttackTroll1();
            }
        }
    }

    public static void DeadTroll1(){
        System.out.println("And with that, the troll fell over with a resounding thud. ");
        GameLoop.experience = GameLoop.experience + 30;
        GameLoop.gold = GameLoop.gold + 75;
        System.out.println("You have gotten some gold and experience. You now have " + GameLoop.gold + " gold and " + GameLoop.experience + " experience ");
        GameLoop.MapMovement();
    }
}