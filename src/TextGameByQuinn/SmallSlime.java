package textgamebyquinn;

import textgamebyquinn.GameLoop;
import java.util.*;

public class SmallSlime{
    public static void SmallSlimeEncounter(){
        GameLoop.smallSlimeHealth = 5;
        System.out.println("A small slime appears. ");
        System.out.println("You have " + GameLoop.health + " health.");
        AttackSmallSlime();
    }
    
    public static void AttackSmallSlime(){
        String fightyBoi2 = GameLoop.scannyBoi.nextLine();
        switch (fightyBoi2) {
        case "use sword" :
            if (GameLoop.sword == 0){
                System.out.println("You don't have a sword. ");
                AttackSmallSlime();
            } else {
                int damage = (GameLoop.sword + GameLoop.levelDamageMultiplier) * 2;
                GameLoop.smallSlimeHealth = GameLoop.smallSlimeHealth - damage;
                System.out.println("You slash the slime with your sword. ");
                SmallSlimeAttack();
            }
        case "use dagger" :
            int damage = GameLoop.level;
            GameLoop.smallSlimeHealth = GameLoop.smallSlimeHealth - damage;
            System.out.println("You stab the slime with your dagger. ");
            SmallSlimeAttack();
        case "use bow" :
            if (GameLoop.bow == 0){
                System.out.println("You don't have a bow. ");
                AttackSmallSlime();
            } else if (GameLoop.numberOfArrows == 0) {
                System.out.println("You don't have any arrows. ");
                AttackSmallSlime();
            } else {
                damage = (GameLoop.bow + GameLoop.levelDamageMultiplier) * 2;
                GameLoop.numberOfArrows = GameLoop.numberOfArrows - 1;
                GameLoop.smallSlimeHealth = GameLoop.smallSlimeHealth - damage;
                System.out.println("Your shoot an arrow at the slime. ");
                SmallSlimeAttack();
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
            AttackSmallSlime();
        case "use shield" :
            if (GameLoop.shield == 0){
                System.out.println("You don't have a shield. ");
                AttackSmallSlime();
            } else {
                Random rand = new Random();
                int shieldBlockTest = rand.nextInt(10);
                int shieldStrength = GameLoop.shield + 5;
                if (shieldStrength > shieldBlockTest) {
                    System.out.println("The slime tries to leap at you, but you knock it down with your shield and have an oppurtunity to counterattack. ");
                    CritAttackSmallSlime();
                } else {
                    System.out.println("You can't quite get your shield up in time. ");
                    SmallSlimeAttack();
                }
            }
        case "punch" :
            System.out.println("You punch the slime. ");
            GameLoop.smallSlimeHealth = GameLoop.smallSlimeHealth - 1;
            SmallSlimeAttack();
        case "run" :
            System.out.println("You try to run away from the slime, but it is able to leap at you and prevent your escape. ");
            SmallSlimeAttack();
        case "help" :
            System.out.println("Recognized commands: ");
            System.out.println("use sword");
            System.out.println("use dagger");
            System.out.println("use bow");
            System.out.println("use potion");
            System.out.println("use shield");
            System.out.println("punch");
            System.out.println("run");   
            AttackSmallSlime(); 
        default :
            System.out.println("That is not a recognized command. ");
            AttackSmallSlime();
        }
    }

    public static void CritAttackSmallSlime(){
        String fightyBoi2 = GameLoop.scannyBoi.nextLine();
        switch (fightyBoi2) {
        case "use sword" :
            if (GameLoop.sword == 0){
                System.out.println("You don't have a sword. ");
                CritAttackSmallSlime();
            } else {
                int damage = (GameLoop.sword + GameLoop.levelDamageMultiplier) * 4;
                GameLoop.smallSlimeHealth = GameLoop.smallSlimeHealth - damage;
                System.out.println("You slash the slime with your sword. The slime wasn't anticipating the attack and is hit especially hard. ");
                SmallSlimeAttack();
            }
        case "use dagger" :
            int damage = GameLoop.level;
            GameLoop.smallSlimeHealth = GameLoop.smallSlimeHealth - damage;
            System.out.println("You stab the slime with your dagger. The slime wasn't anticipating the attack and is hit especially hard. ");
            SmallSlimeAttack();
        case "use bow" :
            if (GameLoop.bow == 0){
                System.out.println("You don't have a bow. ");
                CritAttackSmallSlime();
            } else if (GameLoop.numberOfArrows == 0) {
                System.out.println("You don't have any arrows. ");
                CritAttackSmallSlime();
            } else {
                damage = (GameLoop.bow + GameLoop.levelDamageMultiplier) * 4;
                GameLoop.numberOfArrows = GameLoop.numberOfArrows - 1;
                GameLoop.smallSlimeHealth = GameLoop.smallSlimeHealth - damage;
                System.out.println("Your shoot an arrow at the slime. The slime wasn't anticipating the attack and is hit especially hard. ");
                SmallSlimeAttack();
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
            CritAttackSmallSlime();
        case "use shield" :
            System.out.println("The slime is already lying helpless on the ground. ");
            CritAttackSmallSlime();
        case "punch" :
            System.out.println("You punch the slime. ");
            GameLoop.smallSlimeHealth = GameLoop.smallSlimeHealth - 2;
            SmallSlimeAttack();
        case "run" :
            System.out.println("You are able to succesfully escape the slime. ");
            GameLoop.MapMovement();
        case "help" :
            System.out.println("Recognized commands: ");
            CritAttackSmallSlime();
        default :
            System.out.println("That is not a recognized command. ");
            CritAttackSmallSlime();
        }
    }

    public static void SmallSlimeAttack(){
        if (GameLoop.smallSlimeHealth <= 0) {
            DeadSmallSlime();
        } else {
            System.out.println("The small slime leaps at you. ");
            if (GameLoop.armor == 0){
                GameLoop.health = GameLoop.health - 4;
            } else {
                double smallSlimeDamage = 3 / GameLoop.armor;
                GameLoop.health = GameLoop.health - smallSlimeDamage;
            }
            if (GameLoop.health <= 0){
                GameLoop.GameOver();
            } else {
                System.out.println("The slime has " + GameLoop.smallSlimeHealth + " health.");
                System.out.println("You have " + GameLoop.health + " health.");
                AttackSmallSlime();
            }
        }
    }

    public static void DeadSmallSlime(){
        System.out.println("And with that, the slime bursts open and its remains dissolved into the earth. ");
        GameLoop.experience = GameLoop.experience + 20;
        GameLoop.gold = GameLoop.gold + 30;
        System.out.println("You have gotten some gold and experience. You now have " + GameLoop.gold + " gold and " + GameLoop.experience + " experience ");
        GameLoop.MapMovement();
    }
}