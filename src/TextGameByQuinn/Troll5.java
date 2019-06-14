package textgamebyquinn;

import textgamebyquinn.GameLoop;
import java.util.*;

public class Troll5{
    public static void Troll5Encounter(){
        GameLoop.trollHealth = 200;
        System.out.print("You come across a truly gargantuan troll. Each of his legs individually are bigger than you. He is armed with a massive spiked club and a metal shield nearly as big as you. ");
        AttackTroll5();
    }

    public static void AttackTroll5(){
        String fightyBoi1 = GameLoop.scannyBoi.nextLine();
        switch (fightyBoi1){
        case "use sword" :
            if (GameLoop.sword == 0){
                System.out.print("You don't have a sword. ");
                AttackTroll5();
            } else {
                Random rand = new Random();
                int attackMissChance = rand.nextInt(10);
                int attackHitChance = GameLoop.sword + 5;
                if (attackMissChance >= attackHitChance) {
                    System.out.print("You swing your sword, but the troll raises it's shield just in time. The sword clangs against it, but to no avail. ");
                } else {
                    int damage = GameLoop.sword * GameLoop.level * 2;
                    GameLoop.trollHealth = GameLoop.trollHealth - damage;
                    System.out.print("You slash the troll with your sword. ");
                }
                Troll5Attacks();
            }
        case "use dagger" :
        Random rand = new Random();
        int attackMissChance = rand.nextInt(10);
        int attackHitChance = 5;
        if (attackMissChance >= attackHitChance){
            System.out.print("You attempt to stab the troll, but it raises it's shield and blocks your attack. ");
        } else {
            int damage = GameLoop.level;
            GameLoop.trollHealth = GameLoop.trollHealth - damage;
            System.out.print("You stab the troll with your dagger. ");
        }
        Troll5Attacks();
        case "use bow" :
            if (GameLoop.bow == 0){
                System.out.print("You don't have a bow. ");
                AttackTroll5();
            } else if (GameLoop.numberOfArrows == 0) {
                System.out.print("You don't have any arrows. ");
                AttackTroll5();
            } else {
                int damage = GameLoop.bow * GameLoop.level * 2;
                GameLoop.numberOfArrows = GameLoop.numberOfArrows - 1;
                rand = new Random();
                attackMissChance = rand.nextInt(10);
                attackHitChance = GameLoop.bow + 5;
                if (attackMissChance >= attackHitChance){
                    System.out.print("The troll raises its shield and the arrow flies directly into it. ");
                } else {
                GameLoop.trollHealth = GameLoop.trollHealth - damage;
                System.out.print("Your shoot an arrow at the troll. ");
                }
                Troll5Attacks();
            }
        case "use potion" :
            if (GameLoop.numberOfPotions == 0){
                System.out.print("You don't have any potions. ");
                Troll5Attacks();
            } else {
                GameLoop.health = GameLoop.health + 25;
                System.out.print("You drink the potion and feel reinvigorated. ");
                AttackTroll5();
            }
        case "use shield" :
            if (GameLoop.shield == 0){
                System.out.print("You don't have a shield. ");
                AttackTroll5();
            } else {
                rand = new Random();
                int shieldBlockTest = rand.nextInt(11);
                int shieldStrength = GameLoop.shield + 3;
                if (shieldStrength > shieldBlockTest) {
                    System.out.print("The troll tries to attack you with his club, but you block it with your shield and have an oppurtunity to counterattack. ");
                    CritAttackTroll5();
                } else {
                    System.out.print("You can't quite get your shield up in time. ");
                    Troll5Attacks();
                }
            }
        case "punch" :
            System.out.print("You punch the troll. It barely even registers the attack. ");
            GameLoop.trollHealth = GameLoop.trollHealth - 1;
            Troll5Attacks();
        case "run" :
            System.out.print("You try to run away from the troll, but it is too fast and catches you. ");
            Troll5Attacks();
        default :
            System.out.print("That is not a recognized command. ");
            AttackTroll5();
        }
    }

    public static void CritAttackTroll5(){
        String fightyBoi1 = GameLoop.scannyBoi.nextLine();
        switch (fightyBoi1) {
        case "use sword" :
            if (GameLoop.sword == 0){
                System.out.print("You don't have a sword. ");
                CritAttackTroll5();
            } else {
                int damage = GameLoop.sword * GameLoop.level * 4;
                GameLoop.trollHealth = GameLoop.trollHealth - damage;
                System.out.print("You slash the troll with your sword. The troll isn't ready for the attack and it hits extra hard. ");
                Troll5Attacks();
            }
        case "use dagger" :
            int damage = GameLoop.level;
            GameLoop.trollHealth = GameLoop.trollHealth - damage * 2;
            System.out.print("You stab the troll with your dagger. The troll isn't ready for the attack and it hits extra hard. ");
            Troll5Attacks();
        case "use bow" :
            if (GameLoop.bow == 0){
                System.out.print("You don't have a bow. ");
                CritAttackTroll5();
            } else if (GameLoop.numberOfArrows == 0) {
                System.out.print("You don't have any arrows. ");
                CritAttackTroll5();
            } else {
                damage = GameLoop.bow * GameLoop.level * 2;
                GameLoop.numberOfArrows = GameLoop.numberOfArrows - 1;
                GameLoop.trollHealth = GameLoop.trollHealth - damage;
                System.out.print("Your shoot an arrow at the troll. The troll isn't ready for the attack and it hits extra hard. ");
                Troll5Attacks();
            }
        case "use potion" :
            if (GameLoop.numberOfPotions == 0){
                System.out.print("You don't have any potions. ");
                CritAttackTroll5();
            } else {
                GameLoop.health = GameLoop.health + 25;
                System.out.print("You drink the potion and feel reinvigorated. ");
                CritAttackTroll5();
            }
        case "use shield" :
            System.out.print("There is no point in blocking. The troll is already off guard. ");
            CritAttackTroll5();
        case "punch" :
            System.out.print("You punch the troll. ");
            GameLoop.trollHealth = GameLoop.trollHealth - 2;
            Troll5Attacks();
        case "run" :
            System.out.print("Even when the troll is off guard, it is still able to chase you down when you try to run. ");
            Troll5Attacks();
        default :
            System.out.print("That is not a recognized command. ");
            CritAttackTroll5();
        }
    }

    public static void Troll5Attacks(){
        System.out.print("The troll swings its club at you. ");
        if (GameLoop.armor == 0){
            GameLoop.health = GameLoop.health - 50;
        } else {
            double troll5Damage = 40 / GameLoop.armor;
            GameLoop.health = GameLoop.health - troll5Damage;
        }
        if (GameLoop.health <= 0){
            GameLoop.GameOver();
        }
    }

    public static void DeadTroll5(){
        System.out.print("And with that, the troll fell over with a resounding thud. ");
        GameLoop.experience = GameLoop.experience + 150;
        GameLoop.gold = GameLoop.gold + 300;
        System.out.println("You have gotten some gold and experience. You now have " + GameLoop.gold + " gold and " + GameLoop.experience + "experience ");
        GameLoop.MapMovement();
    }
}