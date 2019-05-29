package textgamebyquinn;

import textgamebyquinn.GameLoop;
import textgamebyquinn.SmallSlime;
import java.util.*;

public class MediumSlime{
    public static void MediumSlimeEncounter(){
        GameLoop.mediumSlimeHealth = 15;
        System.out.print("A medium slime appears. ");
        AttackMediumSlime();
    }
    
    public static void AttackMediumSlime(){
        String fightyBoi2 = GameLoop.scannyBoi.nextLine();
        switch (fightyBoi2) {
        case "use sword" :
            if (GameLoop.sword == 0){
                System.out.print("You don't have a sword. ");
            } else {
                int damage = GameLoop.sword * GameLoop.level * 2;
                GameLoop.mediumSlimeHealth = GameLoop.mediumSlimeHealth - damage;
                System.out.print("You slash the slime with your sword. ");
            }
        case "use dagger" :
            int damage = GameLoop.level;
            GameLoop.mediumSlimeHealth = GameLoop.mediumSlimeHealth - damage;
            System.out.print("You stab the slime with your dagger. ");
        case "use bow" :
            if (GameLoop.bow == 0){
                System.out.print("You don't have a bow. ");
            } else if (GameLoop.numberOfArrows == 0) {
                System.out.print("You don't have any arrows. ");
            } else {
                damage = GameLoop.bow * GameLoop.level * 2;
                GameLoop.numberOfArrows = GameLoop.numberOfArrows - 1;
                GameLoop.mediumSlimeHealth = GameLoop.mediumSlimeHealth - damage;
                System.out.print("Your shoot an arrow at the slime. ");
            }
        case "use potion" :
            if (GameLoop.numberOfPotions == 0){
                System.out.print("You don't have any potions. ");
            } else if (GameLoop.health == 100) {
                System.out.print("You are already at full health. ");
            } else if (GameLoop.health >= 75) {
                GameLoop.health = 100;
                System.out.print("You drink the potion and feel reinvigorated. ");
            } else {
                GameLoop.health = GameLoop.health + 25;
                System.out.print("You drink the potion and feel reinvigorated. ");
            }
            AttackMediumSlime();
        case "use shield" :
            if (GameLoop.shield == 0){
                System.out.print("You don't have a shield. ");
            } else {
                Random rand = new Random();
                int shieldBlockTest = rand.nextInt(10);
                int shieldStrength = GameLoop.shield + 5;
                if (shieldStrength > shieldBlockTest) {
                    System.out.print("The slime tries to leap at you, but you knock it down with your shield and have an oppurtunity to counterattack. ");
                    CritAttackMediumSlime();
                } else {
                    System.out.print("You can't quite get your shield up in time. ");
                }
            }
        case "punch" :
            System.out.print("You punch the slime. ");
            GameLoop.mediumSlimeHealth = GameLoop.mediumSlimeHealth - 1;
        case "run" :
            System.out.print("You try to run away from the slime, but it is able to leap at you and prevent your escape. ");
        default :
            System.out.print("That is not a recognized command. ");
            AttackMediumSlime();
        }
        if (GameLoop.mediumSlimeHealth <= 0) {
            DeadMediumSlime();
        } else {
            MediumSlimeAttack();
        }
    }

    public static void CritAttackMediumSlime(){
        String fightyBoi2 = GameLoop.scannyBoi.nextLine();
        switch (fightyBoi2) {
        case "use sword" :
            if (GameLoop.sword == 0){
                System.out.print("You don't have a sword. ");
            } else {
                int damage = GameLoop.sword * GameLoop.level * 4;
                GameLoop.mediumSlimeHealth = GameLoop.mediumSlimeHealth - damage;
                System.out.print("You slash the slime with your sword. The slime wasn't anticipating the attack and is hit especially hard. ");
            }
        case "use dagger" :
            int damage = GameLoop.level * 2;
            GameLoop.mediumSlimeHealth = GameLoop.mediumSlimeHealth - damage;
            System.out.print("You stab the slime with your dagger. The slime wasn't anticipating the attack and is hit especially hard. ");
        case "use bow" :
            if (GameLoop.bow == 0){
                System.out.print("You don't have a bow. ");
            } else if (GameLoop.numberOfArrows == 0) {
                System.out.print("You don't have any arrows. ");
            } else {
                damage = GameLoop.bow * GameLoop.level * 4;
                GameLoop.numberOfArrows = GameLoop.numberOfArrows - 1;
                GameLoop.mediumSlimeHealth = GameLoop.mediumSlimeHealth - damage;
                System.out.print("Your shoot an arrow at the slime. The slime wasn't anticipating the attack and is hit especially hard. ");
            }
        case "use potion" :
            if (GameLoop.numberOfPotions == 0){
                System.out.print("You don't have any potions. ");
            } else if (GameLoop.health == 100) {
                System.out.print("You are already at full health. ");
            } else if (GameLoop.health >= 75) {
                GameLoop.health = 100;
                System.out.print("You drink the potion and feel reinvigorated. ");
            } else {
                GameLoop.health = GameLoop.health + 25;
                System.out.print("You drink the potion and feel reinvigorated. ");
            }
            CritAttackMediumSlime();
        case "use shield" :
            System.out.print("The slime is already lying helpless on the ground. ");
            CritAttackMediumSlime();
        case "punch" :
            System.out.print("You punch the slime. ");
            GameLoop.mediumSlimeHealth = GameLoop.mediumSlimeHealth - 2;
        case "run" :
            System.out.print("You are able to succesfully escape the slime. ");
        default :
            System.out.print("That is not a recognized command. ");
            AttackMediumSlime();
        }
        if (GameLoop.mediumSlimeHealth <= 0) {
            DeadMediumSlime();
        } else {
            MediumSlimeAttack();
        }
    }

    public static void MediumSlimeAttack(){
        System.out.print("The medium slime leaps at you. ");
        if (GameLoop.armor == 0){
            GameLoop.health = GameLoop.health - 8;
        } else {
            double mediumSlimeDamage = 6 / GameLoop.armor;
            GameLoop.health = GameLoop.health - mediumSlimeDamage;
        }
        if (GameLoop.health <= 0){
            GameLoop.GameOver();
        }
        AttackMediumSlime();
    }

    public static void DeadMediumSlime(){
        System.out.print("And with that, the slime bursts open and its remains scatter everywhere. Just as you think it is over, the remains begin to move together and reform into 2 smaller slimes.");
        GameLoop.doubleSmallSlime1Health = 5;
        GameLoop.doubleSmallSlime2Health = 5;
        GameLoop.gold = GameLoop.gold + 70;
        GameLoop.experience = GameLoop.experience + 40;
        AttackDoubleSmallSlime();
    }

    public static void AttackDoubleSmallSlime(){
        String fightyBoi2 = GameLoop.scannyBoi.nextLine();
        switch (fightyBoi2) {
        case "use sword" :
            if (GameLoop.sword == 0){
                System.out.print("You don't have a sword. ");
            } else {
                System.out.print("Would you like to attack slime 1 or slime 2? ");
                fightyBoi2 = GameLoop.scannyBoi.nextLine();
                if (fightyBoi2.equals("1")){
                    int damage = GameLoop.sword * GameLoop.level * 2;
                    GameLoop.doubleSmallSlime1Health = GameLoop.doubleSmallSlime1Health - damage;
                    System.out.print("You slash the slime with your sword. ");
                } else if (fightyBoi2.equals("2")){
                    int damage = GameLoop.sword * GameLoop.level * 2;
                    GameLoop.doubleSmallSlime2Health = GameLoop.doubleSmallSlime2Health - damage;
                    System.out.print("You slash the slime with your sword. ");
                } else {
                    System.out.print("That is not a recognized command. ");
                    AttackDoubleSmallSlime();
                }
            }
        case "use dagger" :
            System.out.print("Would you like to attack slime 1 or slime 2? ");
                fightyBoi2 = GameLoop.scannyBoi.nextLine();
                if (fightyBoi2.equals("1")){
                    int damage = GameLoop.level;
                    GameLoop.doubleSmallSlime1Health = GameLoop.doubleSmallSlime1Health - damage;
                    System.out.print("You stab the slime with your dagger. ");
                } else if (fightyBoi2.equals("2")){
                    int damage = GameLoop.level;
                    GameLoop.doubleSmallSlime2Health = GameLoop.doubleSmallSlime2Health - damage;
                    System.out.print("You stab the slime with your dagger. ");
                } else {
                    System.out.print("That is not a recognized command. ");
                    AttackDoubleSmallSlime();
                }
        case "use bow" :
            if (GameLoop.bow == 0){
                System.out.print("You don't have a bow. ");
            } else if (GameLoop.numberOfArrows == 0) {
                System.out.print("You don't have any arrows. ");
            } else {
                System.out.print("Would you like to attack slime 1 or slime 2? ");
                fightyBoi2 = GameLoop.scannyBoi.nextLine();
                if (fightyBoi2.equals("1")){
                    int damage = GameLoop.bow * GameLoop.level * 2;
                    GameLoop.numberOfArrows = GameLoop.numberOfArrows - 1;
                    GameLoop.doubleSmallSlime1Health = GameLoop.doubleSmallSlime1Health - damage;
                    System.out.print("Your shoot an arrow at the slime. ");
                } else if (fightyBoi2.equals("1")){
                    int damage = GameLoop.bow * GameLoop.level * 2;
                    GameLoop.numberOfArrows = GameLoop.numberOfArrows - 1;
                    GameLoop.doubleSmallSlime2Health = GameLoop.doubleSmallSlime2Health - damage;
                    System.out.print("Your shoot an arrow at the slime. ");
                } else {
                    System.out.print("That is not a recognized command. ");
                    AttackDoubleSmallSlime();
                }
            }
        case "use potion" :
            if (GameLoop.numberOfPotions == 0){
                System.out.print("You don't have any potions. ");
            } else if (GameLoop.health == 100) {
                System.out.print("You are already at full health. ");
            } else if (GameLoop.health >= 75) {
                GameLoop.health = 100;
                System.out.print("You drink the potion and feel reinvigorated. ");
            } else {
                GameLoop.health = GameLoop.health + 25;
                System.out.print("You drink the potion and feel reinvigorated. ");
            }
            AttackDoubleSmallSlime();
        case "use shield" :
            if (GameLoop.shield == 0){
                System.out.print("You don't have a shield. ");
            } else {
                Random rand = new Random();
                int shieldBlockTest = rand.nextInt(10);
                int shieldStrength = GameLoop.shield + 5;
                if (shieldStrength > shieldBlockTest) {
                    System.out.print("The slimes try to leap at you, but you knock them down with your shield and you have an oppurtunity to counterattack. ");
                    CritAttackDoubleSmallSlime();
                } else {
                    System.out.print("You can't quite get your shield up in time. ");
                }
            }
        case "punch" :
            System.out.print("Would you like to attack slime 1 or slime 2? ");
                fightyBoi2 = GameLoop.scannyBoi.nextLine();
                if (fightyBoi2.equals("1")){
                    System.out.print("You punch the slime. ");
                    GameLoop.doubleSmallSlime1Health = GameLoop.doubleSmallSlime1Health - 1;
                } else if (fightyBoi2.equals("2")){
                    System.out.print("You punch the slime. ");
                    GameLoop.doubleSmallSlime2Health = GameLoop.doubleSmallSlime2Health - 1;
                } else {
                    System.out.print("That is not a recognized command. ");
                    AttackDoubleSmallSlime();
                }
        case "run" :
            System.out.print("You try to run away from the slimes, but they are able to leap at you and prevent your escape. ");
        default :
            System.out.print("That is not a recognized command. ");
            AttackDoubleSmallSlime();
        }
        if (GameLoop.doubleSmallSlime1Health <= 0 || GameLoop.doubleSmallSlime2Health <= 0) {
            DeadDoubleSmallSlime();
        } else {
            DoubleSmallSlimeAttack();
            AttackDoubleSmallSlime();
        }
    }

    public static void CritAttackDoubleSmallSlime(){
        String fightyBoi2 = GameLoop.scannyBoi.nextLine();
        switch (fightyBoi2) {
        case "use sword" :
            if (GameLoop.sword == 0){
                System.out.print("You don't have a sword. ");
            } else {
                System.out.print("Would you like to attack slime 1 or slime 2? ");
                fightyBoi2 = GameLoop.scannyBoi.nextLine();
                if (fightyBoi2.equals("1")){
                    int damage = GameLoop.sword * GameLoop.level * 4;
                    GameLoop.doubleSmallSlime1Health = GameLoop.doubleSmallSlime1Health - damage;
                    System.out.print("You slash the slime with your sword. ");
                } else if (fightyBoi2.equals("2")){
                    int damage = GameLoop.sword * GameLoop.level * 4;
                    GameLoop.doubleSmallSlime2Health = GameLoop.doubleSmallSlime2Health - damage;
                    System.out.print("You slash the slime with your sword. ");
                } else {
                    System.out.print("That is not a recognized command. ");
                    CritAttackDoubleSmallSlime();
                }
            }
        case "use dagger" :
            System.out.print("Would you like to attack slime 1 or slime 2? ");
                fightyBoi2 = GameLoop.scannyBoi.nextLine();
                if (fightyBoi2.equals("1")){
                    int damage = GameLoop.level * 2;
                    GameLoop.doubleSmallSlime1Health = GameLoop.doubleSmallSlime1Health - damage;
                    System.out.print("You stab the slime with your dagger. ");
                } else if (fightyBoi2.equals("2")){
                    int damage = GameLoop.level * 2;
                    GameLoop.doubleSmallSlime2Health = GameLoop.doubleSmallSlime2Health - damage;
                    System.out.print("You stab the slime with your dagger. ");
                } else {
                    System.out.print("That is not a recognized command. ");
                    CritAttackDoubleSmallSlime();
                }
        case "use bow" :
            if (GameLoop.bow == 0){
                System.out.print("You don't have a bow. ");
            } else if (GameLoop.numberOfArrows == 0) {
                System.out.print("You don't have any arrows. ");
            } else {
                System.out.print("Would you like to attack slime 1 or slime 2? ");
                fightyBoi2 = GameLoop.scannyBoi.nextLine();
                if (fightyBoi2.equals("1")){
                    int damage = GameLoop.bow * GameLoop.level * 4;
                    GameLoop.numberOfArrows = GameLoop.numberOfArrows - 1;
                    GameLoop.doubleSmallSlime1Health = GameLoop.doubleSmallSlime1Health - damage;
                    System.out.print("Your shoot an arrow at the slime. ");
                } else if (fightyBoi2.equals("1")){
                    int damage = GameLoop.bow * GameLoop.level * 4;
                    GameLoop.numberOfArrows = GameLoop.numberOfArrows - 1;
                    GameLoop.doubleSmallSlime2Health = GameLoop.doubleSmallSlime2Health - damage;
                    System.out.print("Your shoot an arrow at the slime. ");
                } else {
                    System.out.print("That is not a recognized command. ");
                    CritAttackDoubleSmallSlime();
                }
            }
        case "use potion" :
            if (GameLoop.numberOfPotions == 0){
                System.out.print("You don't have any potions. ");
            } else if (GameLoop.health == 100) {
                System.out.print("You are already at full health. ");
            } else if (GameLoop.health >= 75) {
                GameLoop.health = 100;
                System.out.print("You drink the potion and feel reinvigorated. ");
            } else {
                GameLoop.health = GameLoop.health + 25;
                System.out.print("You drink the potion and feel reinvigorated. ");
            }
            CritAttackDoubleSmallSlime();
        case "use shield" :
            System.out.print("The slimes are already lying helpless");
            CritAttackDoubleSmallSlime();
        case "punch" :
            System.out.print("Would you like to attack slime 1 or slime 2? ");
                fightyBoi2 = GameLoop.scannyBoi.nextLine();
                if (fightyBoi2.equals("1")){
                    System.out.print("You punch the slime. ");
                    GameLoop.doubleSmallSlime1Health = GameLoop.doubleSmallSlime1Health - 2;
                } else if (fightyBoi2.equals("2")){
                    System.out.print("You punch the slime. ");
                    GameLoop.doubleSmallSlime2Health = GameLoop.doubleSmallSlime2Health - 2;
                } else {
                    System.out.print("That is not a recognized command. ");
                    CritAttackDoubleSmallSlime();
                }
        case "run" :
            System.out.print("You try to run away from the slimes, but they are able to leap at you and prevent your escape. ");
        default :
            System.out.print("That is not a recognized command. ");
            CritAttackDoubleSmallSlime();
        }
        if (GameLoop.doubleSmallSlime1Health <= 0 || GameLoop.doubleSmallSlime2Health <= 0) {
            DeadDoubleSmallSlime();
        } else {
            DoubleSmallSlimeAttack();
            AttackDoubleSmallSlime();
        }
    }

    public static void DoubleSmallSlimeAttack(){
        SmallSlime.SmallSlimeAttack();
        SmallSlime.SmallSlimeAttack();
    }

    public static void DeadDoubleSmallSlime(){
        System.out.print("One of the slimes bursts open and dissolves into the ground. The other slime leaps on you. ");
        if (GameLoop.armor == 0){
            GameLoop.health = GameLoop.health - 4;
        } else {
            double smallSlimeDamage = 3 / GameLoop.armor;
            GameLoop.health = GameLoop.health - smallSlimeDamage;
        }
        if (GameLoop.health <= 0){
            GameLoop.GameOver();
        }
        System.out.print("The other slime leaps at you. ");
        if (GameLoop.armor == 0){
            GameLoop.health = GameLoop.health - 4;
        } else {
            double smallSlimeDamage = 3 / GameLoop.armor;
            GameLoop.health = GameLoop.health - smallSlimeDamage;
        }
        if (GameLoop.health <= 0){
            GameLoop.GameOver();
        }
        SmallSlime.AttackSmallSlime();
    }
}