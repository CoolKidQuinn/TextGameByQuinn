package textgamebyquinn;

import textgamebyquinn.GameLoop;
import java.util.*;

public class Goblin5 {
    public static int attackMissChance, attackHitChance;
    public static void Goblin5Encounter() {
        GameLoop.goblinHealth1 = 40;
        GameLoop.goblinHealth2 = 40;
        System.out.println("You see two goblins a bit smaller than you. They are each armed with two daggers. ");
        System.out.println("You have " + GameLoop.health + " health.");
        AttackGoblin5();
    }

    public static void AttackGoblin5() {
        String fightyBoi1 = GameLoop.scannyBoi.nextLine();
        switch (fightyBoi1){
            case "use sword" :
                if (GameLoop.sword == 0) {
                    System.out.println("You don't have a sword. ");
                    AttackGoblin5();
                } else {
                    System.out.println("Would you like to attack goblin 1 or goblin 2. ");
                    fightyBoi1 = GameLoop.scannyBoi.nextLine();
                    if (fightyBoi1.equals("1")) {
                        Random rand = new Random();
                        attackMissChance = rand.nextInt(10);
                        attackHitChance = GameLoop.sword + 6;
                        if (attackMissChance >= attackHitChance) {
                        System.out.println("You swing your sword but the goblin is too quick and leaps out of the way. ");
                        } else {
                        int damage = (GameLoop.sword + GameLoop.levelDamageMultiplier) * 2;
                        GameLoop.goblinHealth1 = GameLoop.goblinHealth1 - damage;
                        System.out.println("You slash at the goblin with your sword. ");
                        }
                        Goblin5Attacks();
                    } else if (fightyBoi1.equals("2")) {
                        Random rand = new Random();
                        attackMissChance = rand.nextInt(10);
                        attackHitChance = GameLoop.sword + 6;
                        if (attackMissChance >= attackHitChance) {
                        System.out.println("You swing your sword but the goblin is too quick and leaps out of the way. ");
                        } else {
                        int damage = (GameLoop.sword + GameLoop.levelDamageMultiplier) * 2;
                        GameLoop.goblinHealth2 = GameLoop.goblinHealth2 - damage;
                        System.out.println("You slash at the goblin with your sword. ");
                        }
                        Goblin5Attacks();
                    } else {
                        System.out.println("That is not a recognized command. ");
                        AttackGoblin5();
                    }
                }
            case "use dagger" :
                System.out.println("Would you like to attack goblin 1 or goblin 2. ");
                fightyBoi1 = GameLoop.scannyBoi.nextLine();
                if (fightyBoi1.equals("1")) {
                    Random rand = new Random();
                    attackMissChance = rand.nextInt(10);
                    attackHitChance = 4;
                    if (attackMissChance >= attackHitChance){
                        System.out.println("You attempt to stab the goblin but it leaps out of the way. ");
                    } else {
                        int damage = GameLoop.level;
                        GameLoop.goblinHealth1 = GameLoop.goblinHealth1 - damage;
                        System.out.println("You stab the goblin with your dagger. ");
                    }
                    Goblin5Attacks();
                } else if (fightyBoi1.equals("2")){
                    Random rand = new Random();
                    attackMissChance = rand.nextInt(10);
                    attackHitChance = 4;
                    if (attackMissChance >= attackHitChance){
                        System.out.println("You attempt to stab the goblin but it leaps out of the way. ");
                    } else {
                        int damage = GameLoop.level;
                        GameLoop.goblinHealth2 = GameLoop.goblinHealth2 - damage;
                        System.out.println("You stab the goblin with your dagger. ");
                    }
                    Goblin5Attacks();
                } else {
                    System.out.println("That is not a recognized command. ");
                    AttackGoblin5();
                }
            case "use bow" :
                if (GameLoop.bow == 0) {
                    System.out.println("You don't have a bow. ");
                    AttackGoblin5();
                } else if (GameLoop.numberOfArrows == 0) {
                    System.out.println("You don't have any arrows. ");
                    AttackGoblin5();
                } else {
                    System.out.println("Would you like to attack goblin 1 or goblin 2. ");
                    fightyBoi1 = GameLoop.scannyBoi.nextLine();
                    if (fightyBoi1.equals("1")) {
                        int damage = (GameLoop.bow + GameLoop.levelDamageMultiplier) *2;
                        GameLoop.numberOfArrows = GameLoop.numberOfArrows - 1;
                        Random rand = new Random();
                        attackMissChance = rand.nextInt(10);
                        attackHitChance = GameLoop.bow + 4;
                        if (attackMissChance >= attackHitChance){
                            System.out.println("You shoot your arrow and the goblin sees it coming and leaps out of the way. ");
                        } else {
                            GameLoop.goblinHealth1 = GameLoop.goblinHealth1 - damage;
                            System.out.println("You shoot an arrow at the goblin. ");
                        }
                        Goblin5Attacks();
                    } else if (fightyBoi1.equals("2")) {
                        int damage = (GameLoop.bow + GameLoop.levelDamageMultiplier) *2;
                        GameLoop.numberOfArrows = GameLoop.numberOfArrows - 1;
                        Random rand = new Random();
                        attackMissChance = rand.nextInt(10);
                        attackHitChance = GameLoop.bow + 4;
                        if (attackMissChance >= attackHitChance){
                            System.out.println("You shoot your arrow and the goblin sees it coming and leaps out of the way. ");
                        } else {
                            GameLoop.goblinHealth2 = GameLoop.goblinHealth2 - damage;
                            System.out.println("You shoot an arrow at the goblin. ");
                        }
                        Goblin5Attacks();
                    } else {
                        System.out.println("That is not a recognized command. ");
                        AttackGoblin5();
                    }
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
                AttackGoblin5();
            case "use shield" :
                if (GameLoop.shield == 0) {
                    System.out.println("You don't have a shield. ");
                    AttackGoblin5();
                } else {
                    Random rand = new Random();
                    int shieldBlockTest = rand.nextInt(11);
                    int shieldStrength = GameLoop.shield + 4;
                    if (shieldStrength > shieldBlockTest) {
                        System.out.println("The goblins run straight into your shield and are knocked over. You now have the chance to counterattack. ");
                        CritAttackGoblin5();
                    } else {
                        System.out.println("You can't quite get your shield up in time. ");
                        AttackGoblin5();
                    }
                }
            case "punch" :
                System.out.println("Would you like to attack goblin 1 or goblin 2. ");
                fightyBoi1 = GameLoop.scannyBoi.nextLine();
                if (fightyBoi1.equals("1")) {
                    System.out.println("You punch the goblin. It barely even registers the attack. ");
                    GameLoop.goblinHealth1 = GameLoop.goblinHealth1 - 1;
                    Goblin5Attacks();
                } else if (fightyBoi1.equals("2")) {
                    System.out.println("You punch the goblin. It barely even registers the attack. ");
                    GameLoop.goblinHealth2 = GameLoop.goblinHealth2 - 1;
                    Goblin5Attacks();
                } else {
                    System.out.println("That is not a recognized command. ");
                    AttackGoblin5();
                }
            case "run" :
                System.out.println("You try to run away, but the goblins are way faster than you and catch you. ");
                Goblin5Attacks();
            case "help" :
                System.out.println("Recognized commands: ");
                System.out.println("use sword");
                System.out.println("use dagger");
                System.out.println("use bow");
                System.out.println("use potion");
                System.out.println("use shield");
                System.out.println("punch");
                System.out.println("run");
                AttackGoblin5();
            default :
                System.out.println("That is not a recognized command. ");
                AttackGoblin5();
        } 
    }

    public static void CritAttackGoblin5() {
        String fightyBoi1 = GameLoop.scannyBoi.nextLine();
        switch (fightyBoi1){
            case "use sword" :
                if (GameLoop.sword == 0) {
                    System.out.println("You don't have a sword. ");
                    CritAttackGoblin5();
                } else {
                    System.out.println("Would you like to attack goblin 1 or goblin 2. ");
                    fightyBoi1 = GameLoop.scannyBoi.nextLine();
                    if (fightyBoi1.equals("1")) {
                        int damage = (GameLoop.sword + GameLoop.levelDamageMultiplier) * 4;
                        GameLoop.goblinHealth1 = GameLoop.goblinHealth1 - damage;
                        System.out.println("You plunge your sword directly into the defenseless goblin's stomach with your sword. ");
                        Goblin5Attacks();
                    } else if (fightyBoi1.equals("2")){
                        int damage = (GameLoop.sword + GameLoop.levelDamageMultiplier) * 4;
                        GameLoop.goblinHealth2 = GameLoop.goblinHealth2 - damage;
                        System.out.println("You plunge your sword directly into the defenseless goblin's stomach with your sword. ");
                        Goblin5Attacks();
                    } else {
                        System.out.println("That is not a recognized command. ");
                        CritAttackGoblin5();
                    }
                }
            case "use dagger" :
                System.out.println("Would you like to attack goblin 1 or goblin 2. ");
                fightyBoi1 = GameLoop.scannyBoi.nextLine();
                if (fightyBoi1.equals("1")) {
                    int damage = GameLoop.level;
                    GameLoop.goblinHealth1 = GameLoop.goblinHealth1 - damage;
                    System.out.println("You stab the defenseless goblin with your dagger. ");
                    Goblin5Attacks();
                } else if (fightyBoi1.equals("2")) {
                    int damage = GameLoop.level;
                    GameLoop.goblinHealth2 = GameLoop.goblinHealth2 - damage;
                    System.out.println("You stab the defenseless goblin with your dagger. ");
                    Goblin5Attacks();
                } else {
                    System.out.println("That is not a recognized command. ");
                    CritAttackGoblin5();
                }
            case "use bow" :
                if (GameLoop.bow == 0) {
                    System.out.println("You don't have a bow. ");
                    CritAttackGoblin5();
                } else if (GameLoop.numberOfArrows == 0) {
                    System.out.println("You don't have any arrows. ");
                    CritAttackGoblin5();
                } else {
                    System.out.println("Would you like to attack goblin 1 or goblin 2. ");
                    fightyBoi1 = GameLoop.scannyBoi.nextLine();
                    if (fightyBoi1.equals("1")) {
                        int damage = (GameLoop.bow + GameLoop.levelDamageMultiplier) * 4;
                        GameLoop.numberOfArrows = GameLoop.numberOfArrows - 1;
                        GameLoop.goblinHealth1 = GameLoop.goblinHealth1 - damage;
                        System.out.println("You shoot an arrow directly at the defenseless goblin's head. ");
                        Goblin5Attacks();
                    } else if (fightyBoi1.equals("2")){
                        int damage = (GameLoop.bow + GameLoop.levelDamageMultiplier) * 4;
                        GameLoop.numberOfArrows = GameLoop.numberOfArrows - 1;
                        GameLoop.goblinHealth2 = GameLoop.goblinHealth2 - damage;
                        System.out.println("You shoot an arrow directly at the defenseless goblin's head. ");
                        Goblin5Attacks();
                    } else {
                        System.out.println("That is not a recognize command. ");
                        CritAttackGoblin5();
                    }
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
                CritAttackGoblin5();
            case "use shield" :
                System.out.println("The goblins are already defenseless. ");
            case "punch" :
                System.out.println("Would you like to attack goblin 1 or goblin 2. ");
                fightyBoi1 = GameLoop.scannyBoi.nextLine();
                if (fightyBoi1.equals("1")) {
                    System.out.println("You punch the goblin. ");
                    GameLoop.goblinHealth1 = GameLoop.goblinHealth1 - 2;
                    Goblin5Attacks();
                } else if (fightyBoi1.equals("2")) {
                    System.out.println("You punch the goblin. ");
                    GameLoop.goblinHealth2 = GameLoop.goblinHealth2 - 2;
                    Goblin5Attacks();
                } else {
                    System.out.println("That is not a recognized command. ");
                    CritAttackGoblin5();
                }
            case "run" :
                System.out.println("You try to run away, but the goblin gets up and is able to chase you down. ");
                Goblin5Attacks();
            case "help" :
                System.out.println("Recognized commands: ");
                System.out.println("use sword");
                System.out.println("use dagger");
                System.out.println("use bow");
                System.out.println("use potion");
                System.out.println("use shield");
                System.out.println("punch");
                System.out.println("run");
                CritAttackGoblin5();
            default :
                System.out.println("That is not a recognized command. ");
                CritAttackGoblin5();
        }
    }

    public static void Goblin5Attacks() {
        if (GameLoop.goblinHealth1 <= 0) {
            DeadGoblin5();
        } else if (GameLoop.goblinHealth2 <= 0) {
            DeadGoblin5();
        } else {
            System.out.println("The goblins run up and stab you twice each. ");
            if (GameLoop.armor == 0) {
                GameLoop.health = GameLoop.health - 20;
                GameLoop.health = GameLoop.health - 20;
                GameLoop.health = GameLoop.health - 20;
                GameLoop.health = GameLoop.health - 20;
            } else {
                double goblin5Damage = 16 / GameLoop.armor;
                GameLoop.health = GameLoop.health - goblin5Damage;
                GameLoop.health = GameLoop.health - goblin5Damage;
                GameLoop.health = GameLoop.health - goblin5Damage;
                GameLoop.health = GameLoop.health - goblin5Damage;
            }
            if (GameLoop.health <= 0) {
                GameLoop.GameOver();
            } else {
                System.out.println("Goblin 1 has " + GameLoop.goblinHealth1 + " health.");
                System.out.println("Goblin 2 has " + GameLoop.goblinHealth2 + " health.");
                System.out.println("You have " + GameLoop.health + " health.");
                AttackGoblin5();
            }
        }
    }

    public static void DeadGoblin5() {
        System.out.println("And with that, the goblin lets out a high pitched shriek and falls to the ground. ");
        GameLoop.experience = GameLoop.experience + 90;
        GameLoop.gold = GameLoop.gold + 150;
        System.out.println("You have gotten some gold and experience. You now have " + GameLoop.gold + " gold and " + GameLoop.experience + " experience. ");
        if (GameLoop.goblinHealth1 <= 0){
            GameLoop.goblinHealth = GameLoop.goblinHealth2;
        } else {
            GameLoop.goblinHealth = GameLoop.goblinHealth1;
        }
        Goblin3.Goblin3Attacks();
    }
}