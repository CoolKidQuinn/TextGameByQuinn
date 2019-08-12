package textgamebyquinn;

import textgamebyquinn.GameLoop;
import java.util.*;

public class Goblin4 {
    public static int attackMissChance, attackHitChance;
    public static void Goblin4Encounter() {
        GameLoop.goblinHealth1 = 20;
        GameLoop.goblinHealth2 = 20;
        System.out.println("You see two goblins a bit more than half your size. They are each armed with a dagger. ");
        AttackGoblin4();
    }

    public static void AttackGoblin4() {
        String fightyBoi1 = GameLoop.scannyBoi.nextLine();
        switch (fightyBoi1){
            case "use sword" :
                if (GameLoop.sword == 0) {
                    System.out.println("You don't have a sword. ");
                    AttackGoblin4();
                } else {
                    System.out.println("Would you like to attack goblin 1 or goblin 2. ");
                    fightyBoi1 = GameLoop.scannyBoi.nextLine();
                    if (fightyBoi1.equals("1")) {
                        Random rand = new Random();
                        attackMissChance = rand.nextInt(10);
                        attackHitChance = GameLoop.sword + 7;
                        if (attackMissChance >= attackHitChance) {
                        System.out.println("You swing your sword but the goblin is too quick and leaps out of the way. ");
                        } else {
                        int damage = (GameLoop.sword + GameLoop.levelDamageMultiplier) * 2;
                        GameLoop.goblinHealth1 = GameLoop.goblinHealth1 - damage;
                        System.out.println("You slash at the goblin with your sword. ");
                        }
                        Goblin4Attacks();
                    } else if (fightyBoi1.equals("2")) {
                        Random rand = new Random();
                        attackMissChance = rand.nextInt(10);
                        attackHitChance = GameLoop.sword + 7;
                        if (attackMissChance >= attackHitChance) {
                        System.out.println("You swing your sword but the goblin is too quick and leaps out of the way. ");
                        } else {
                        int damage = (GameLoop.sword + GameLoop.levelDamageMultiplier) * 2;
                        GameLoop.goblinHealth2 = GameLoop.goblinHealth2 - damage;
                        System.out.println("You slash at the goblin with your sword. ");
                        }
                        Goblin4Attacks();
                    } else {
                        System.out.println("That is not a recognized command. ");
                        AttackGoblin4();
                    }
                }
            case "use dagger" :
                System.out.println("Would you like to attack goblin 1 or goblin 2. ");
                fightyBoi1 = GameLoop.scannyBoi.nextLine();
                if (fightyBoi1.equals("1")) {
                    Random rand = new Random();
                    attackMissChance = rand.nextInt(10);
                    attackHitChance = 5;
                    if (attackMissChance >= attackHitChance){
                        System.out.println("You attempt to stab the goblin but it leaps out of the way. ");
                    } else {
                        int damage = GameLoop.level;
                        GameLoop.goblinHealth1 = GameLoop.goblinHealth1 - damage;
                        System.out.println("You stab the goblin with your dagger. ");
                    }
                    Goblin4Attacks();
                } else if (fightyBoi1.equals("2")){
                    Random rand = new Random();
                    attackMissChance = rand.nextInt(10);
                    attackHitChance = 5;
                    if (attackMissChance >= attackHitChance){
                        System.out.println("You attempt to stab the goblin but it leaps out of the way. ");
                    } else {
                        int damage = GameLoop.level;
                        GameLoop.goblinHealth2 = GameLoop.goblinHealth2 - damage;
                        System.out.println("You stab the goblin with your dagger. ");
                    }
                    Goblin4Attacks();
                } else {
                    System.out.println("That is not a recognized command. ");
                    AttackGoblin4();
                }
            case "use bow" :
                if (GameLoop.bow == 0) {
                    System.out.println("You don't have a bow. ");
                    AttackGoblin4();
                } else if (GameLoop.numberOfArrows == 0) {
                    System.out.println("You don't have any arrows. ");
                    AttackGoblin4();
                } else {
                    System.out.println("Would you like to attack goblin 1 or goblin 2. ");
                    fightyBoi1 = GameLoop.scannyBoi.nextLine();
                    if (fightyBoi1.equals("1")) {
                        int damage = (GameLoop.bow + GameLoop.levelDamageMultiplier) *2;
                        GameLoop.numberOfArrows = GameLoop.numberOfArrows - 1;
                        Random rand = new Random();
                        attackMissChance = rand.nextInt(10);
                        attackHitChance = GameLoop.bow + 5;
                        if (attackMissChance >= attackHitChance){
                            System.out.println("You shoot your arrow and the goblin sees it coming and leaps out of the way. ");
                        } else {
                            GameLoop.goblinHealth1 = GameLoop.goblinHealth1 - damage;
                            System.out.println("You shoot an arrow at the goblin. ");
                        }
                        Goblin4Attacks();
                    } else if (fightyBoi1.equals("2")) {
                        int damage = (GameLoop.bow + GameLoop.levelDamageMultiplier) *2;
                        GameLoop.numberOfArrows = GameLoop.numberOfArrows - 1;
                        Random rand = new Random();
                        attackMissChance = rand.nextInt(10);
                        attackHitChance = GameLoop.bow + 5;
                        if (attackMissChance >= attackHitChance){
                            System.out.println("You shoot your arrow and the goblin sees it coming and leaps out of the way. ");
                        } else {
                            GameLoop.goblinHealth2 = GameLoop.goblinHealth2 - damage;
                            System.out.println("You shoot an arrow at the goblin. ");
                        }
                        Goblin4Attacks();
                    } else {
                        System.out.println("That is not a recognized command. ");
                        AttackGoblin4();
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
            AttackGoblin4();
            case "use shield" :
                if (GameLoop.shield == 0) {
                    System.out.println("You don't have a shield. ");
                    AttackGoblin4();
                } else {
                    Random rand = new Random();
                    int shieldBlockTest = rand.nextInt(11);
                    int shieldStrength = GameLoop.shield + 5;
                    if (shieldStrength > shieldBlockTest) {
                        System.out.println("The goblins run straight into your shield and are knocked over. You now have the chance to counterattack. ");
                        CritAttackGoblin4();
                    } else {
                        System.out.println("You can't quite get your shield up in time. ");
                        AttackGoblin4();
                    }
                }
            case "punch" :
                System.out.println("Would you like to attack goblin 1 or goblin 2. ");
                fightyBoi1 = GameLoop.scannyBoi.nextLine();
                if (fightyBoi1.equals("1")) {
                    System.out.println("You punch the goblin. It barely even registers the attack. ");
                    GameLoop.goblinHealth1 = GameLoop.goblinHealth1 - 1;
                    Goblin4Attacks();
                } else if (fightyBoi1.equals("2")) {
                    System.out.println("You punch the goblin. It barely even registers the attack. ");
                    GameLoop.goblinHealth2 = GameLoop.goblinHealth2 - 1;
                    Goblin4Attacks();
                } else {
                    System.out.println("That is not a recognized command. ");
                    AttackGoblin4();
                }
            case "run" :
                System.out.println("You try to run away, but the goblins are way faster than you and catch you. ");
                Goblin4Attacks();
            case "help" :
                System.out.println("Recognized commands: ");
                System.out.println("use sword");
                System.out.println("use dagger");
                System.out.println("use bow");
                System.out.println("use potion");
                System.out.println("use shield");
                System.out.println("punch");
                System.out.println("run");
                AttackGoblin4();
            default :
                System.out.println("That is not a recognized command. ");
                AttackGoblin4();
        } 
    }

    public static void CritAttackGoblin4() {
        String fightyBoi1 = GameLoop.scannyBoi.nextLine();
        switch (fightyBoi1){
            case "use sword" :
                if (GameLoop.sword == 0) {
                    System.out.println("You don't have a sword. ");
                    CritAttackGoblin4();
                } else {
                    System.out.println("Would you like to attack goblin 1 or goblin 2. ");
                    fightyBoi1 = GameLoop.scannyBoi.nextLine();
                    if (fightyBoi1.equals("1")) {
                        int damage = (GameLoop.sword + GameLoop.levelDamageMultiplier) * 4;
                        GameLoop.goblinHealth1 = GameLoop.goblinHealth1 - damage;
                        System.out.println("You plunge your sword directly into the defenseless goblin's stomach with your sword. ");
                        Goblin4Attacks();
                    } else if (fightyBoi1.equals("2")){
                        int damage = (GameLoop.sword + GameLoop.levelDamageMultiplier) * 4;
                        GameLoop.goblinHealth2 = GameLoop.goblinHealth2 - damage;
                        System.out.println("You plunge your sword directly into the defenseless goblin's stomach with your sword. ");
                        Goblin4Attacks();
                    } else {
                        System.out.println("That is not a recognized command. ");
                        CritAttackGoblin4();
                    }
                }
            case "use dagger" :
                System.out.println("Would you like to attack goblin 1 or goblin 2. ");
                fightyBoi1 = GameLoop.scannyBoi.nextLine();
                if (fightyBoi1.equals("1")) {
                    int damage = GameLoop.level;
                    GameLoop.goblinHealth1 = GameLoop.goblinHealth1 - damage;
                    System.out.println("You stab the defenseless goblin with your dagger. ");
                    Goblin4Attacks();
                } else if (fightyBoi1.equals("2")) {
                    int damage = GameLoop.level;
                    GameLoop.goblinHealth2 = GameLoop.goblinHealth2 - damage;
                    System.out.println("You stab the defenseless goblin with your dagger. ");
                    Goblin4Attacks();
                } else {
                    System.out.println("That is not a recognized command. ");
                    CritAttackGoblin4();
                }
            case "use bow" :
                if (GameLoop.bow == 0) {
                    System.out.println("You don't have a bow. ");
                    CritAttackGoblin4();
                } else if (GameLoop.numberOfArrows == 0) {
                    System.out.println("You don't have any arrows. ");
                    CritAttackGoblin4();
                } else {
                    System.out.println("Would you like to attack goblin 1 or goblin 2. ");
                    fightyBoi1 = GameLoop.scannyBoi.nextLine();
                    if (fightyBoi1.equals("1")) {
                        int damage = (GameLoop.bow + GameLoop.levelDamageMultiplier) * 4;
                        GameLoop.numberOfArrows = GameLoop.numberOfArrows - 1;
                        GameLoop.goblinHealth1 = GameLoop.goblinHealth1 - damage;
                        System.out.println("You shoot an arrow directly at the defenseless goblin's head. ");
                        Goblin4Attacks();
                    } else if (fightyBoi1.equals("2")){
                        int damage = (GameLoop.bow + GameLoop.levelDamageMultiplier) * 4;
                        GameLoop.numberOfArrows = GameLoop.numberOfArrows - 1;
                        GameLoop.goblinHealth2 = GameLoop.goblinHealth2 - damage;
                        System.out.println("You shoot an arrow directly at the defenseless goblin's head. ");
                        Goblin4Attacks();
                    } else {
                        System.out.println("That is not a recognize command. ");
                        CritAttackGoblin4();
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
                CritAttackGoblin4();
            case "use shield" :
                System.out.println("The goblins are already defenseless. ");
            case "punch" :
                System.out.println("Would you like to attack goblin 1 or goblin 2. ");
                fightyBoi1 = GameLoop.scannyBoi.nextLine();
                if (fightyBoi1.equals("1")) {
                    System.out.println("You punch the goblin. ");
                    GameLoop.goblinHealth1 = GameLoop.goblinHealth1 - 2;
                    Goblin4Attacks();
                } else if (fightyBoi1.equals("2")) {
                    System.out.println("You punch the goblin. ");
                    GameLoop.goblinHealth2 = GameLoop.goblinHealth2 - 2;
                    Goblin4Attacks();
                } else {
                    System.out.println("That is not a recognized command. ");
                    CritAttackGoblin4();
                }
            case "run" :
                System.out.println("You try to run away, but the goblin gets up and is able to chase you down. ");
                Goblin4Attacks();
            case "help" :
                System.out.println("Recognized commands: ");
                System.out.println("use sword");
                System.out.println("use dagger");
                System.out.println("use bow");
                System.out.println("use potion");
                System.out.println("use shield");
                System.out.println("punch");
                System.out.println("run");
                CritAttackGoblin4();
            default :
                System.out.println("That is not a recognized command. ");
                CritAttackGoblin4();
        }
    }

    public static void Goblin4Attacks() {
        if (GameLoop.goblinHealth1 <= 0) {
            DeadGoblin4();
        } else if (GameLoop.goblinHealth2 <= 0) {
            DeadGoblin4();
        } else {
            System.out.println("The goblins run up and stab you. ");
            if (GameLoop.armor == 0) {
                GameLoop.health = GameLoop.health - 20;
                GameLoop.health = GameLoop.health - 20;
            } else {
                double goblin4Damage = 16 / GameLoop.armor;
                GameLoop.health = GameLoop.health - goblin4Damage;
                GameLoop.health = GameLoop.health - goblin4Damage;
            }
            if (GameLoop.health <= 0) {
                GameLoop.GameOver();
            }
            AttackGoblin4();
        }
    }

    public static void DeadGoblin4() {
        System.out.println("And with that, the goblin lets out a high pitched shriek and falls to the ground. ");
        GameLoop.experience = GameLoop.experience + 60;
        GameLoop.gold = GameLoop.gold + 100;
        System.out.println("You have gotten some gold and experience. You now have " + GameLoop.gold + " gold and " + GameLoop.experience + " experience. ");
        if (GameLoop.goblinHealth1 <= 0){
            GameLoop.goblinHealth = GameLoop.goblinHealth2;
        } else {
            GameLoop.goblinHealth = GameLoop.goblinHealth1;
        }
        Goblin2.Goblin2Attacks();
    }
}