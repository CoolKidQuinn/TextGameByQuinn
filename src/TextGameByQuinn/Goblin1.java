package textgamebyquinn;

import textgamebyquinn.GameLoop;
import java.util.*;

public class Goblin1 {
    public static int attackMissChance, attackHitChance;
    public static void Goblin1Encounter() {
        GameLoop.goblinHealth = 10;
        System.out.print("You see a goblin a bit more than half your size. He is armed with a dagger. ");
        AttackGoblin1();
    }

    public static void AttackGoblin1() {
        String fightyBoi1 = GameLoop.scannyBoi.nextLine();
        switch (fightyBoi1){
            case "use sword" :
                if (GameLoop.sword == 0) {
                    System.out.print("You don't have a sword. ");
                    AttackGoblin1();
                } else {
                    Random rand = new Random();
                    attackMissChance = rand.nextInt(10);
                    attackHitChance = GameLoop.sword + 8;
                    if (attackMissChance >= attackHitChance) {
                        System.out.print("You swing your sword but the goblin is too quick and leaps out of the way. ");
                    } else {
                        int damage = GameLoop.sword * GameLoop.level * 2;
                        GameLoop.goblinHealth = GameLoop.goblinHealth - damage;
                        System.out.print("You slash at the goblin with your sword. ");
                    }
                    Goblin1Attacks();
                }
            case "use dagger" :
                Random rand = new Random();
                attackMissChance = rand.nextInt(10);
                attackHitChance = 8;
                if (attackMissChance >= attackHitChance){
                    System.out.print("You attempt to stab the goblin but it leaps out of the way. ");
                } else {
                    int damage = GameLoop.level;
                    GameLoop.trollHealth = GameLoop.trollHealth - damage;
                    System.out.print("You stab the goblin with your dagger. ");
                }
                Goblin1Attacks();
            case "use bow" :
                if (GameLoop.bow == 0) {
                    System.out.print("You don't have a bow. ");
                    AttackGoblin1();
                } else if (GameLoop.numberOfArrows == 0) {
                    System.out.print("You don't have any arrows. ");
                    AttackGoblin1();
                } else {
                    int damage = GameLoop.bow * GameLoop.level *2;
                    GameLoop.numberOfArrows = GameLoop.numberOfArrows - 1;
                    rand = new Random();
                    attackMissChance = rand.nextInt(10);
                    attackHitChance = GameLoop.bow + 8;
                    if (attackMissChance >= attackHitChance){
                        System.out.print("You shoot your arrow and the goblin sees it coming and leaps out of the way. ");
                    } else {
                        GameLoop.goblinHealth = GameLoop.goblinHealth - damage;
                        System.out.print("You shoot an arrow at the goblin. ");
                    }
                    Goblin1Attacks();
                }
            case "use potion" :
                if (GameLoop.numberOfPotions == 0){
                    System.out.print("You don't have any potions. ");
                    AttackGoblin1();
                } else {
                    GameLoop.health = GameLoop.health + 25;
                    System.out.print("You drink the potion and feel reinvigorated. ");
                    AttackGoblin1();
                }
            case "use shield" :
                if (GameLoop.shield == 0) {
                    System.out.print("You don't have a shield. ");
                    AttackGoblin1();
                } else {
                    rand = new Random();
                    int shieldBlockTest = rand.nextInt(11);
                    int shieldStrength = GameLoop.shield + 8;
                    if (shieldStrength > shieldBlockTest) {
                        System.out.print("The goblin runs straight into your shield and is knocked over. You now have the chance to counterattack. ");
                        CritAttackGoblin1();
                    } else {
                        System.out.print("You can't quite get your shield up in time. ");
                        Goblin1Attacks();
                    }
                }
            case "punch" :
                System.out.print("You punch the goblin. It barely even registers the attack. ");
                GameLoop.goblinHealth = GameLoop.goblinHealth - 1;
                Goblin1Attacks();
            case "run" :
                System.out.print("You try to run away, but the goblin is way faster than you and catches you. ");
                Goblin1Attacks();
            default :
                System.out.print("That is not a recognized command. ");
                AttackGoblin1();
        } 
    }

    public static void CritAttackGoblin1() {
        String fightyBoi1 = GameLoop.scannyBoi.nextLine();
        switch (fightyBoi1){
            case "use sword" :
                if (GameLoop.sword == 0) {
                    System.out.print("You don't have a sword. ");
                    CritAttackGoblin1();
                } else {
                        int damage = GameLoop.sword * GameLoop.level * 4;
                        GameLoop.goblinHealth = GameLoop.goblinHealth - damage;
                        System.out.print("You plunge your sword directly into the defenseless goblin's stomach with your sword. ");
                    Goblin1Attacks();
                }
            case "use dagger" :
                int damage = GameLoop.level;
                GameLoop.trollHealth = GameLoop.trollHealth - damage;
                System.out.print("You stab the defenseless goblin with your dagger. ");
                Goblin1Attacks();
            case "use bow" :
                if (GameLoop.bow == 0) {
                    System.out.print("You don't have a bow. ");
                    CritAttackGoblin1();
                } else if (GameLoop.numberOfArrows == 0) {
                    System.out.print("You don't have any arrows. ");
                    CritAttackGoblin1();
                } else {
                    damage = GameLoop.bow * GameLoop.level * 4;
                    GameLoop.numberOfArrows = GameLoop.numberOfArrows - 1;
                        GameLoop.goblinHealth = GameLoop.goblinHealth - damage;
                        System.out.print("You shoot an arrow directly at the defenseless goblin's head. ");
                    Goblin1Attacks();
                }
            case "use potion" :
                if (GameLoop.numberOfPotions == 0){
                    System.out.print("You don't have any potions. ");
                    CritAttackGoblin1();
                } else {
                    GameLoop.health = GameLoop.health + 25;
                    System.out.print("You drink the potion and feel reinvigorated. ");
                    CritAttackGoblin1();
                }
            case "use shield" :
                System.out.print("The goblin is already defenseless. ");
            case "punch" :
                System.out.print("You punch the goblin. ");
                GameLoop.goblinHealth = GameLoop.goblinHealth - 2;
                Goblin1Attacks();
            case "run" :
                System.out.print("You try to run away, but the goblin gets up and is able to chase you down. ");
                Goblin1Attacks();
            default :
                System.out.print("That is not a recognized command. ");
                CritAttackGoblin1();
        }
    }

    public static void Goblin1Attacks() {
        if (GameLoop.goblinHealth <= 0) {
            DeadGoblin1();
        } else {
            System.out.print("The goblin runs up and stabs you. ");
            if (GameLoop.armor == 0) {
                GameLoop.health = GameLoop.health - 10;
            } else {
                double goblin1Damage = 8 / GameLoop.armor;
                GameLoop.health = GameLoop.health - goblin1Damage;
            }
            if (GameLoop.health <= 0) {
                GameLoop.GameOver();
            }
        }
    }

    public static void DeadGoblin1() {
        System.out.print("And with that, the goblin let out a high pitched shriek and fell to the ground. ");
        GameLoop.experience = GameLoop.experience + 30;
        GameLoop.gold = GameLoop.gold + 75;
        System.out.println("You have gotten some gold and experience. You now have " + GameLoop.gold + " gold and " + GameLoop.experience + " experience. ");
        GameLoop.MapMovement();
    }
}