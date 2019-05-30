package textgamebyquinn;

import textgamebyquinn.GameLoop;
import java.util.*;

public class Troll2{
    public static void Troll2Encounter(){
        GameLoop.trollHealth = 25;
        System.out.print("You come across a troll a bit bigger than you. He is armed with a large club and a wooden shield. ");
        AttackTroll2();
    }

    public static void AttackTroll2(){
        String fightyBoi1 = GameLoop.scannyBoi.nextLine();
        switch (fightyBoi1){
        case "use sword" :
            if (GameLoop.sword == 0){
                System.out.print("You don't have a sword. ");
                AttackTroll2();
            } else {
                Random rand = new Random();
                int attackMissChance = rand.nextInt(10);
                int attackHitChance = GameLoop.sword + 8;
                if (attackMissChance >= attackHitChance) {
                    System.out.print("You swing your sword, but the troll raises it's shield just in time. The sword clangs against it, but to no avail. ");
                } else {
                    int damage = GameLoop.sword * GameLoop.level * 2;
                    GameLoop.trollHealth = GameLoop.trollHealth - damage;
                    System.out.print("You slash the troll with your sword. ");
                }
                Troll2Attacks();
            }
        case "use dagger" :
        Random rand = new Random();
        int attackMissChance = rand.nextInt(10);
        int attackHitChance = 8;
        if (attackMissChance >= attackHitChance){
            System.out.print("You attempt to stab the troll, but it raises it's shield and blocks your attack. ");
        } else {
            int damage = GameLoop.level;
            GameLoop.trollHealth = GameLoop.trollHealth - damage;
            System.out.print("You stab the troll with your dagger. ");
        }
        Troll2Attacks();
        case "use bow" :
            if (GameLoop.bow == 0){
                System.out.print("You don't have a bow. ");
                AttackTroll2();
            } else if (GameLoop.numberOfArrows == 0) {
                System.out.print("You don't have any arrows. ");
                AttackTroll2();
            } else {
                int damage = GameLoop.bow * GameLoop.level * 2;
                GameLoop.numberOfArrows = GameLoop.numberOfArrows - 1;
                rand = new Random();
                attackMissChance = rand.nextInt(10);
                attackHitChance = GameLoop.bow + 8;
                if (attackMissChance >= attackHitChance){
                    System.out.print("The troll raises its shield and the arrow flies directly into it. ");
                } else {
                GameLoop.trollHealth = GameLoop.trollHealth - damage;
                System.out.print("Your shoot an arrow at the troll. ");
                }
                Troll2Attacks();
            }
        case "use potion" :
            if (GameLoop.numberOfPotions == 0){
                System.out.print("You don't have any potions. ");
                Troll2Attacks();
            } else {
                GameLoop.health = GameLoop.health + 25;
                System.out.print("You drink the potion and feel reinvigorated. ");
                AttackTroll2();
            }
        case "use shield" :
            if (GameLoop.shield == 0){
                System.out.print("You don't have a shield. ");
                AttackTroll2();
            } else {
                rand = new Random();
                int shieldBlockTest = rand.nextInt(11);
                int shieldStrength = GameLoop.shield + 3;
                if (shieldStrength > shieldBlockTest) {
                    System.out.print("The troll tries to attack you with his club, but you block it with your shield and have an oppurtunity to counterattack. ");
                    CritAttackTroll2();
                } else {
                    System.out.print("You can't quite get your shield up in time. ");
                    Troll2Attacks();
                }
            }
        case "punch" :
            System.out.print("You punch the troll. It barely even registers the attack. ");
            GameLoop.trollHealth = GameLoop.trollHealth - 1;
            Troll2Attacks();
        case "run" :
            System.out.print("You try to run away from the troll, but it is too fast and catches you. ");
            Troll2Attacks();
        default :
            System.out.print("That is not a recognized command. ");
            AttackTroll2();
        }
    }

    public static void CritAttackTroll2(){
        String fightyBoi1 = GameLoop.scannyBoi.nextLine();
        switch (fightyBoi1) {
        case "use sword" :
            if (GameLoop.sword == 0){
                System.out.print("You don't have a sword. ");
                CritAttackTroll2();
            } else {
                int damage = GameLoop.sword * GameLoop.level * 4;
                GameLoop.trollHealth = GameLoop.trollHealth - damage;
                System.out.print("You slash the troll with your sword. The troll isn't ready for the attack and it hits extra hard. ");
                Troll2Attacks();
            }
        case "use dagger" :
            int damage = GameLoop.level;
            GameLoop.trollHealth = GameLoop.trollHealth - damage * 2;
            System.out.print("You stab the troll with your dagger. The troll isn't ready for the attack and it hits extra hard. ");
            Troll2Attacks();
        case "use bow" :
            if (GameLoop.bow == 0){
                System.out.print("You don't have a bow. ");
                CritAttackTroll2();
            } else if (GameLoop.numberOfArrows == 0) {
                System.out.print("You don't have any arrows. ");
                CritAttackTroll2();
            } else {
                damage = GameLoop.bow * GameLoop.level * 2;
                GameLoop.numberOfArrows = GameLoop.numberOfArrows - 1;
                GameLoop.trollHealth = GameLoop.trollHealth - damage;
                System.out.print("Your shoot an arrow at the troll. The troll isn't ready for the attack and it hits extra hard. ");
                Troll2Attacks();
            }
        case "use potion" :
            if (GameLoop.numberOfPotions == 0){
                System.out.print("You don't have any potions. ");
                CritAttackTroll2();
            } else {
                GameLoop.health = GameLoop.health + 25;
                System.out.print("You drink the potion and feel reinvigorated. ");
                CritAttackTroll2();
            }
        case "use shield" :
            System.out.print("There is no point in blocking. The troll is already off guard. ");
            CritAttackTroll2();
        case "punch" :
            System.out.print("You punch the troll. ");
            GameLoop.trollHealth = GameLoop.trollHealth - 2;
            Troll2Attacks();
        case "run" :
            System.out.print("Even when the troll is off guard, it is still able to chase you down when you try to run. ");
            Troll2Attacks();
        default :
            System.out.print("That is not a recognized command. ");
            CritAttackTroll2();
        }
    }

    public static void Troll2Attacks(){
        System.out.print("The troll swings its club at you. ");
        if (GameLoop.armor == 0){
            GameLoop.health = GameLoop.health - 20;
        } else {
            double troll2Damage = 16 / GameLoop.armor;
            GameLoop.health = GameLoop.health - troll2Damage;
        }
        if (GameLoop.health <= 0){
            GameLoop.GameOver();
        }
    }

    public static void DeadTroll2(){
        System.out.print("And with that, the troll fell over with a resounding thud. ");
        GameLoop.experience = GameLoop.experience + 75;
        GameLoop.gold = GameLoop.gold + 150;
        System.out.println("You have gotten some gold and experience. You now have " + GameLoop.gold + " gold and " + GameLoop.experience + "experience ");
        GameLoop.MapMovement();
    }
}