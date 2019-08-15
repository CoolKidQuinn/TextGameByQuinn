package textgamebyquinn;

import textgamebyquinn.GameLoop;
import java.util.*;

public class Troll3{
    public static void Troll3Encounter(){
        GameLoop.trollHealth = 100;
        System.out.println("You come across a troll about twice your size. He is armed with a huge club and a wooden shield reinforced with metal pieces. ");
        AttackTroll3();
    }

    public static void AttackTroll3(){
        String fightyBoi1 = GameLoop.scannyBoi.nextLine();
        switch (fightyBoi1){
        case "use sword" :
            if (GameLoop.sword == 0){
                System.out.println("You don't have a sword. ");
                AttackTroll3();
            } else {
                Random rand = new Random();
                int attackMissChance = rand.nextInt(10);
                int attackHitChance = GameLoop.sword + 7;
                if (attackMissChance >= attackHitChance) {
                    System.out.println("You swing your sword, but the troll raises it's shield just in time. The sword clangs against it, but to no avail. ");
                } else {
                    int damage = (GameLoop.sword + GameLoop.levelDamageMultiplier) * 2;
                    GameLoop.trollHealth = GameLoop.trollHealth - damage;
                    System.out.println("You slash the troll with your sword. ");
                }
                Troll3Attacks();
            }
        case "use dagger" :
        Random rand = new Random();
        int attackMissChance = rand.nextInt(10);
        int attackHitChance = 7;
        if (attackMissChance >= attackHitChance){
            System.out.println("You attempt to stab the troll, but it raises it's shield and blocks your attack. ");
        } else {
            int damage = GameLoop.level;
            GameLoop.trollHealth = GameLoop.trollHealth - damage;
            System.out.println("You stab the troll with your dagger. ");
        }
        Troll3Attacks();
        case "use bow" :
            if (GameLoop.bow == 0){
                System.out.println("You don't have a bow. ");
                AttackTroll3();
            } else if (GameLoop.numberOfArrows == 0) {
                System.out.println("You don't have any arrows. ");
                AttackTroll3();
            } else {
                int damage = (GameLoop.bow + GameLoop.levelDamageMultiplier) * 2;
                GameLoop.numberOfArrows = GameLoop.numberOfArrows - 1;
                rand = new Random();
                attackMissChance = rand.nextInt(10);
                attackHitChance = GameLoop.bow + 7;
                if (attackMissChance >= attackHitChance){
                    System.out.println("The troll raises its shield and the arrow flies directly into it. ");
                } else {
                GameLoop.trollHealth = GameLoop.trollHealth - damage;
                System.out.println("Your shoot an arrow at the troll. ");
                }
                Troll3Attacks();
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
            AttackTroll3();
        case "use shield" :
            if (GameLoop.shield == 0){
                System.out.println("You don't have a shield. ");
                AttackTroll3();
            } else {
                rand = new Random();
                int shieldBlockTest = rand.nextInt(12);
                int shieldStrength = GameLoop.shield + 5;
                if (shieldStrength > shieldBlockTest) {
                    System.out.println("The troll tries to attack you with his club, but you block it with your shield and have an oppurtunity to counterattack. ");
                    CritAttackTroll3();
                } else {
                    System.out.println("You can't quite get your shield up in time. ");
                    Troll3Attacks();
                }
            }
        case "punch" :
            System.out.println("You punch the troll. It barely even registers the attack. ");
            GameLoop.trollHealth = GameLoop.trollHealth - 1;
            Troll3Attacks();
        case "run" :
            System.out.println("You try to run away from the troll, but it is too fast and catches you. ");
            Troll3Attacks();
        case "help" :
            System.out.println("Recognized commands: ");
            System.out.println("use sword");
            System.out.println("use dagger");
            System.out.println("use bow");
            System.out.println("use potion");
            System.out.println("use shield");
            System.out.println("punch");
            System.out.println("run");   
            AttackTroll3(); 
        default :
            System.out.println("That is not a recognized command. ");
            AttackTroll3();
        }
    }

    public static void CritAttackTroll3(){
        String fightyBoi1 = GameLoop.scannyBoi.nextLine();
        switch (fightyBoi1) {
        case "use sword" :
            if (GameLoop.sword == 0){
                System.out.println("You don't have a sword. ");
                CritAttackTroll3();
            } else {
                int damage = (GameLoop.sword + GameLoop.levelDamageMultiplier) * 4;
                GameLoop.trollHealth = GameLoop.trollHealth - damage;
                System.out.println("You slash the troll with your sword. The troll isn't ready for the attack and it hits extra hard. ");
                Troll3Attacks();
            }
        case "use dagger" :
            int damage = GameLoop.level;
            GameLoop.trollHealth = GameLoop.trollHealth - damage * 2;
            System.out.println("You stab the troll with your dagger. The troll isn't ready for the attack and it hits extra hard. ");
            Troll3Attacks();
        case "use bow" :
            if (GameLoop.bow == 0){
                System.out.println("You don't have a bow. ");
                CritAttackTroll3();
            } else if (GameLoop.numberOfArrows == 0) {
                System.out.println("You don't have any arrows. ");
                CritAttackTroll3();
            } else {
                damage = (GameLoop.bow + GameLoop.levelDamageMultiplier) * 2;
                GameLoop.numberOfArrows = GameLoop.numberOfArrows - 1;
                GameLoop.trollHealth = GameLoop.trollHealth - damage;
                System.out.println("Your shoot an arrow at the troll. The troll isn't ready for the attack and it hits extra hard. ");
                Troll3Attacks();
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
            CritAttackTroll3();
        case "use shield" :
            System.out.println("There is no point in blocking. The troll is already off guard. ");
            CritAttackTroll3();
        case "punch" :
            System.out.println("You punch the troll. ");
            GameLoop.trollHealth = GameLoop.trollHealth - 2;
            Troll3Attacks();
        case "run" :
            System.out.println("Even when the troll is off guard, it is still able to chase you down when you try to run. ");
            Troll3Attacks();
        case "help" :
            System.out.println("Recognized commands: ");
            System.out.println("use sword");
            System.out.println("use dagger");
            System.out.println("use bow");
            System.out.println("use potion");
            System.out.println("use shield");
            System.out.println("punch");
            System.out.println("run");  
            CritAttackTroll3();  
        default :
            System.out.println("That is not a recognized command. ");
            CritAttackTroll3();
        }
    }

    public static void Troll3Attacks(){
        if (GameLoop.trollHealth <= 0){
            DeadTroll3();
        } else {
            System.out.println("The troll swings its club at you. ");
            if (GameLoop.armor == 0){
                GameLoop.health = GameLoop.health - 30;
            } else {
                double troll2Damage = 24 / GameLoop.armor;
                GameLoop.health = GameLoop.health - troll2Damage;
            }
            if (GameLoop.health <= 0){
                GameLoop.GameOver();
            } else {
                System.out.println("The troll has " + GameLoop.trollHealth  + " health.");
                System.out.println("You have " + GameLoop.health + " health.");
                AttackTroll3();
            }
        }
    }

    public static void DeadTroll3(){
        System.out.println("And with that, the troll fell over with a resounding thud. ");
        GameLoop.experience = GameLoop.experience + 100;
        GameLoop.gold = GameLoop.gold + 200;
        System.out.println("You have gotten some gold and experience. You now have " + GameLoop.gold + " gold and " + GameLoop.experience + " experience ");
        GameLoop.MapMovement();
    }
}