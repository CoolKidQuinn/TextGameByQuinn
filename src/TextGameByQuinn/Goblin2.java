package textgamebyquinn;

import textgamebyquinn.GameLoop;
import java.util.*;

public class Goblin2 {
    public static int attackMissChance, attackHitChance;
    public static void Goblin2Encounter() {
        GameLoop.goblinHealth = 20;
        System.out.println("You see a goblin a bit more than half your size. He is armed with a dagger. ");
        System.out.println("You have " + GameLoop.health + " health.");
        AttackGoblin2();
    }

    public static void AttackGoblin2() {
        String fightyBoi1 = GameLoop.scannyBoi.nextLine();
        switch (fightyBoi1){
            case "use sword" :
                if (GameLoop.sword == 0) {
                    System.out.println("You don't have a sword. ");
                    AttackGoblin2();
                } else {
                    Random rand = new Random();
                    attackMissChance = rand.nextInt(10);
                    attackHitChance = GameLoop.sword + 7;
                    if (attackMissChance >= attackHitChance) {
                        System.out.println("You swing your sword but the goblin is too quick and leaps out of the way. ");
                    } else {
                        int damage = (GameLoop.sword + GameLoop.levelDamageMultiplier) * 2;
                        GameLoop.goblinHealth = GameLoop.goblinHealth - damage;
                        System.out.println("You slash at the goblin with your sword. ");
                    }
                    Goblin2Attacks();
                }
            case "use dagger" :
                Random rand = new Random();
                attackMissChance = rand.nextInt(10);
                attackHitChance = 7;
                if (attackMissChance >= attackHitChance){
                    System.out.println("You attempt to stab the goblin but it leaps out of the way. ");
                } else {
                    int damage = GameLoop.level;
                    GameLoop.trollHealth = GameLoop.trollHealth - damage;
                    System.out.println("You stab the goblin with your dagger. ");
                }
                Goblin2Attacks();
            case "use bow" :
                if (GameLoop.bow == 0) {
                    System.out.println("You don't have a bow. ");
                    AttackGoblin2();
                } else if (GameLoop.numberOfArrows == 0) {
                    System.out.println("You don't have any arrows. ");
                    AttackGoblin2();
                } else {
                    int damage = (GameLoop.bow + GameLoop.levelDamageMultiplier) *2;
                    GameLoop.numberOfArrows = GameLoop.numberOfArrows - 1;
                    rand = new Random();
                    attackMissChance = rand.nextInt(10);
                    attackHitChance = GameLoop.bow + 7;
                    if (attackMissChance >= attackHitChance){
                        System.out.println("You shoot your arrow and the goblin sees it coming and leaps out of the way. ");
                    } else {
                        GameLoop.goblinHealth = GameLoop.goblinHealth - damage;
                        System.out.println("You shoot an arrow at the goblin. ");
                    }
                    Goblin2Attacks();
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
                AttackGoblin2();
            case "use shield" :
                if (GameLoop.shield == 0) {
                    System.out.println("You don't have a shield. ");
                    AttackGoblin2();
                } else {
                    rand = new Random();
                    int shieldBlockTest = rand.nextInt(11);
                    int shieldStrength = GameLoop.shield + 7;
                    if (shieldStrength > shieldBlockTest) {
                        System.out.println("The goblin runs straight into your shield and is knocked over. You now have the chance to counterattack. ");
                        CritAttackGoblin2();
                    } else {
                        System.out.println("You can't quite get your shield up in time. ");
                        Goblin2Attacks();
                    }
                }
            case "punch" :
                System.out.println("You punch the goblin. It barely even registers the attack. ");
                GameLoop.goblinHealth = GameLoop.goblinHealth - 1;
                Goblin2Attacks();
            case "run" :
                System.out.println("You try to run away, but the goblin is way faster than you and catches you. ");
                Goblin2Attacks();
            case "help" :
                System.out.println("Recognized commands: ");
                System.out.println("use sword");
                System.out.println("use dagger");
                System.out.println("use bow");
                System.out.println("use potion");
                System.out.println("use shield");
                System.out.println("punch");
                System.out.println("run");
                AttackGoblin2();
            default :
                System.out.println("That is not a recognized command. ");
                AttackGoblin2();
        } 
    }

    public static void CritAttackGoblin2() {
        String fightyBoi1 = GameLoop.scannyBoi.nextLine();
        switch (fightyBoi1){
            case "use sword" :
                if (GameLoop.sword == 0) {
                    System.out.println("You don't have a sword. ");
                    CritAttackGoblin2();
                } else {
                        int damage = (GameLoop.sword + GameLoop.levelDamageMultiplier) * 4;
                        GameLoop.goblinHealth = GameLoop.goblinHealth - damage;
                        System.out.println("You plunge your sword directly into the defenseless goblin's stomach with your sword. ");
                    Goblin2Attacks();
                }
            case "use dagger" :
                int damage = GameLoop.level;
                GameLoop.trollHealth = GameLoop.trollHealth - damage;
                System.out.println("You stab the defenseless goblin with your dagger. ");
                Goblin2Attacks();
            case "use bow" :
                if (GameLoop.bow == 0) {
                    System.out.println("You don't have a bow. ");
                    CritAttackGoblin2();
                } else if (GameLoop.numberOfArrows == 0) {
                    System.out.println("You don't have any arrows. ");
                    CritAttackGoblin2();
                } else {
                    damage = (GameLoop.bow + GameLoop.levelDamageMultiplier) * 4;
                    GameLoop.numberOfArrows = GameLoop.numberOfArrows - 1;
                        GameLoop.goblinHealth = GameLoop.goblinHealth - damage;
                        System.out.println("You shoot an arrow directly at the defenseless goblin's head. ");
                    Goblin2Attacks();
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
                CritAttackGoblin2();
            case "use shield" :
                System.out.println("The goblin is already defenseless. ");
            case "punch" :
                System.out.println("You punch the goblin. ");
                GameLoop.goblinHealth = GameLoop.goblinHealth - 2;
                Goblin2Attacks();
            case "run" :
                System.out.println("You try to run away, but the goblin gets up and is able to chase you down. ");
                Goblin2Attacks();
            case "help" :
                System.out.println("Recognized commands: ");
                System.out.println("use sword");
                System.out.println("use dagger");
                System.out.println("use bow");
                System.out.println("use potion");
                System.out.println("use shield");
                System.out.println("punch");
                System.out.println("run");
                CritAttackGoblin2();
            default :
                System.out.println("That is not a recognized command. ");
                CritAttackGoblin2();
        }
    }

    public static void Goblin2Attacks() {
        if (GameLoop.goblinHealth <= 0) {
            DeadGoblin2();
        } else {
            System.out.println("The goblin runs up and stabs you. ");
            if (GameLoop.armor == 0) {
                GameLoop.health = GameLoop.health - 20;
            } else {
                double goblin2Damage = 16 / GameLoop.armor;
                GameLoop.health = GameLoop.health - goblin2Damage;
            }
            if (GameLoop.health <= 0) {
                GameLoop.GameOver();
            } else {
                System.out.println("The goblin has " + GameLoop.goblinHealth + " health.");
                System.out.println("You have " + GameLoop.health + " health.");
                AttackGoblin2();
            }
        }
    }

    public static void DeadGoblin2() {
        System.out.println("And with that, the goblin lets out a high pitched shriek and falls to the ground. ");
        GameLoop.experience = GameLoop.experience + 60;
        GameLoop.gold = GameLoop.gold + 100;
        System.out.println("You have gotten some gold and experience. You now have " + GameLoop.gold + " gold and " + GameLoop.experience + " experience. ");
        GameLoop.MapMovement();
    }
}