package textgamebyquinn;

import textgamebyquinn.GameLoop;
import textgamebyquinn.SmallSlime;
import java.util.*;

public class MediumSlime{
    public static void MediumSlimeEncounter(){
        GameLoop.mediumSlimeHealth = 25;
        System.out.println("A medium slime appears. ");
        AttackMediumSlime();
    }
    
    public static void AttackMediumSlime(){
        String fightyBoi2 = GameLoop.scannyBoi.nextLine();
        switch (fightyBoi2) {
        case "use sword" :
            if (GameLoop.sword == 0){
                System.out.println("You don't have a sword. ");
                AttackMediumSlime();
            } else {
                int damage = GameLoop.sword * GameLoop.level * 2;
                GameLoop.mediumSlimeHealth = GameLoop.mediumSlimeHealth - damage;
                System.out.println("You slash the slime with your sword. ");
                MediumSlimeAttack();
            }
        case "use dagger" :
            int damage = GameLoop.level;
            GameLoop.mediumSlimeHealth = GameLoop.mediumSlimeHealth - damage;
            System.out.println("You stab the slime with your dagger. ");
            MediumSlimeAttack();
        case "use bow" :
            if (GameLoop.bow == 0){
                System.out.println("You don't have a bow. ");
                AttackMediumSlime();
            } else if (GameLoop.numberOfArrows == 0) {
                System.out.println("You don't have any arrows. ");
                AttackMediumSlime();
            } else {
                damage = GameLoop.bow * GameLoop.level * 2;
                GameLoop.numberOfArrows = GameLoop.numberOfArrows - 1;
                GameLoop.mediumSlimeHealth = GameLoop.mediumSlimeHealth - damage;
                System.out.println("Your shoot an arrow at the slime. ");
                MediumSlimeAttack();
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
            AttackMediumSlime();
        case "use shield" :
            if (GameLoop.shield == 0){
                System.out.println("You don't have a shield. ");
                AttackMediumSlime();
            } else {
                Random rand = new Random();
                int shieldBlockTest = rand.nextInt(10);
                int shieldStrength = GameLoop.shield + 5;
                if (shieldStrength > shieldBlockTest) {
                    System.out.println("The slime tries to leap at you, but you knock it down with your shield and have an oppurtunity to counterattack. ");
                    CritAttackMediumSlime();
                } else {
                    System.out.println("You can't quite get your shield up in time. ");
                    MediumSlimeAttack();
                }
            }
        case "punch" :
            System.out.println("You punch the slime. ");
            GameLoop.mediumSlimeHealth = GameLoop.mediumSlimeHealth - 1;
            MediumSlimeAttack();
        case "run" :
            System.out.println("You try to run away from the slime, but it is able to leap at you and prevent your escape. ");
            MediumSlimeAttack();
        default :
            System.out.println("That is not a recognized command. ");
            AttackMediumSlime();
        }
    }

    public static void CritAttackMediumSlime(){
        String fightyBoi2 = GameLoop.scannyBoi.nextLine();
        switch (fightyBoi2) {
        case "use sword" :
            if (GameLoop.sword == 0){
                System.out.println("You don't have a sword. ");
                CritAttackMediumSlime();
            } else {
                int damage = GameLoop.sword * GameLoop.level * 4;
                GameLoop.mediumSlimeHealth = GameLoop.mediumSlimeHealth - damage;
                System.out.println("You slash the slime with your sword. The slime wasn't anticipating the attack and is hit especially hard. ");
                MediumSlimeAttack();
            }
        case "use dagger" :
            int damage = GameLoop.level * 2;
            GameLoop.mediumSlimeHealth = GameLoop.mediumSlimeHealth - damage;
            System.out.println("You stab the slime with your dagger. The slime wasn't anticipating the attack and is hit especially hard. ");
            MediumSlimeAttack();
        case "use bow" :
            if (GameLoop.bow == 0){
                System.out.println("You don't have a bow. ");
                CritAttackMediumSlime();
            } else if (GameLoop.numberOfArrows == 0) {
                System.out.println("You don't have any arrows. ");
                CritAttackMediumSlime();
            } else {
                damage = GameLoop.bow * GameLoop.level * 4;
                GameLoop.numberOfArrows = GameLoop.numberOfArrows - 1;
                GameLoop.mediumSlimeHealth = GameLoop.mediumSlimeHealth - damage;
                System.out.println("Your shoot an arrow at the slime. The slime wasn't anticipating the attack and is hit especially hard. ");
                MediumSlimeAttack();
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
            CritAttackMediumSlime();
        case "use shield" :
            System.out.println("The slime is already lying helpless on the ground. ");
            CritAttackMediumSlime();
        case "punch" :
            System.out.println("You punch the slime. ");
            GameLoop.mediumSlimeHealth = GameLoop.mediumSlimeHealth - 2;
            MediumSlimeAttack();
        case "run" :
            System.out.println("You are able to succesfully escape the slime. ");
            GameLoop.MapMovement();
        default :
            System.out.println("That is not a recognized command. ");
            CritAttackMediumSlime();
        }
    }

    public static void MediumSlimeAttack(){
        if (GameLoop.mediumSlimeHealth <= 0) {
            DeadMediumSlime();
        } else {
            System.out.println("The medium slime leaps at you. ");
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
    }

    public static void DeadMediumSlime(){
        System.out.println("And with that, the slime bursts open and its remains scatter everywhere. Just as you think it is over, the remains begin to move together and reform into 2 smaller slimes.");
        GameLoop.doubleSmallSlime1Health = 10;
        GameLoop.doubleSmallSlime2Health = 10;
        GameLoop.gold = GameLoop.gold + 70;
        GameLoop.experience = GameLoop.experience + 40;
        AttackDoubleSmallSlime();
    }

    public static void AttackDoubleSmallSlime(){
        String fightyBoi2 = GameLoop.scannyBoi.nextLine();
        switch (fightyBoi2) {
        case "use sword" :
            if (GameLoop.sword == 0){
                System.out.println("You don't have a sword. ");
                AttackDoubleSmallSlime();
            } else {
                System.out.println("Would you like to attack slime 1 or slime 2? ");
                fightyBoi2 = GameLoop.scannyBoi.nextLine();
                if (fightyBoi2.equals("1")){
                    int damage = GameLoop.sword * GameLoop.level * 2;
                    GameLoop.doubleSmallSlime1Health = GameLoop.doubleSmallSlime1Health - damage;
                    System.out.println("You slash the slime with your sword. ");
                    DoubleSmallSlimeAttack();
                } else if (fightyBoi2.equals("2")){
                    int damage = GameLoop.sword * GameLoop.level * 2;
                    GameLoop.doubleSmallSlime2Health = GameLoop.doubleSmallSlime2Health - damage;
                    System.out.println("You slash the slime with your sword. ");
                    DoubleSmallSlimeAttack();
                } else {
                    System.out.println("That is not a recognized command. ");
                    AttackDoubleSmallSlime();
                }
            }
        case "use dagger" :
            System.out.println("Would you like to attack slime 1 or slime 2? ");
                fightyBoi2 = GameLoop.scannyBoi.nextLine();
                if (fightyBoi2.equals("1")){
                    int damage = GameLoop.level;
                    GameLoop.doubleSmallSlime1Health = GameLoop.doubleSmallSlime1Health - damage;
                    System.out.println("You stab the slime with your dagger. ");
                    DoubleSmallSlimeAttack();
                } else if (fightyBoi2.equals("2")){
                    int damage = GameLoop.level;
                    GameLoop.doubleSmallSlime2Health = GameLoop.doubleSmallSlime2Health - damage;
                    System.out.println("You stab the slime with your dagger. ");
                    DoubleSmallSlimeAttack();
                } else {
                    System.out.println("That is not a recognized command. ");
                    AttackDoubleSmallSlime();
                }
        case "use bow" :
            if (GameLoop.bow == 0){
                System.out.println("You don't have a bow. ");
                AttackDoubleSmallSlime();
            } else if (GameLoop.numberOfArrows == 0) {
                System.out.println("You don't have any arrows. ");
                AttackDoubleSmallSlime();
            } else {
                System.out.println("Would you like to attack slime 1 or slime 2? ");
                fightyBoi2 = GameLoop.scannyBoi.nextLine();
                if (fightyBoi2.equals("1")){
                    int damage = GameLoop.bow * GameLoop.level * 2;
                    GameLoop.numberOfArrows = GameLoop.numberOfArrows - 1;
                    GameLoop.doubleSmallSlime1Health = GameLoop.doubleSmallSlime1Health - damage;
                    System.out.println("Your shoot an arrow at the slime. ");
                    DoubleSmallSlimeAttack();
                } else if (fightyBoi2.equals("1")){
                    int damage = GameLoop.bow * GameLoop.level * 2;
                    GameLoop.numberOfArrows = GameLoop.numberOfArrows - 1;
                    GameLoop.doubleSmallSlime2Health = GameLoop.doubleSmallSlime2Health - damage;
                    System.out.println("Your shoot an arrow at the slime. ");
                    DoubleSmallSlimeAttack();
                } else {
                    System.out.println("That is not a recognized command. ");
                    AttackDoubleSmallSlime();
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
            AttackDoubleSmallSlime();
        case "use shield" :
            if (GameLoop.shield == 0){
                System.out.println("You don't have a shield. ");
                AttackDoubleSmallSlime();
            } else {
                Random rand = new Random();
                int shieldBlockTest = rand.nextInt(10);
                int shieldStrength = GameLoop.shield + 5;
                if (shieldStrength > shieldBlockTest) {
                    System.out.println("The slimes try to leap at you, but you knock them down with your shield and you have an oppurtunity to counterattack. ");
                    CritAttackDoubleSmallSlime();
                } else {
                    System.out.println("You can't quite get your shield up in time. ");
                    DoubleSmallSlimeAttack();
                }
            }
        case "punch" :
            System.out.println("Would you like to attack slime 1 or slime 2? ");
                fightyBoi2 = GameLoop.scannyBoi.nextLine();
                if (fightyBoi2.equals("1")){
                    System.out.println("You punch the slime. ");
                    GameLoop.doubleSmallSlime1Health = GameLoop.doubleSmallSlime1Health - 1;
                    DoubleSmallSlimeAttack();
                } else if (fightyBoi2.equals("2")){
                    System.out.println("You punch the slime. ");
                    GameLoop.doubleSmallSlime2Health = GameLoop.doubleSmallSlime2Health - 1;
                    DoubleSmallSlimeAttack();
                } else {
                    System.out.println("That is not a recognized command. ");
                    AttackDoubleSmallSlime();
                }
        case "run" :
            System.out.println("You try to run away from the slimes, but they are able to leap at you and prevent your escape. ");
            DoubleSmallSlimeAttack();
        default :
            System.out.println("That is not a recognized command. ");
            AttackDoubleSmallSlime();
        }
    }

    public static void CritAttackDoubleSmallSlime(){
        String fightyBoi2 = GameLoop.scannyBoi.nextLine();
        switch (fightyBoi2) {
        case "use sword" :
            if (GameLoop.sword == 0){
                System.out.println("You don't have a sword. ");
                CritAttackDoubleSmallSlime();
            } else {
                System.out.println("Would you like to attack slime 1 or slime 2? ");
                fightyBoi2 = GameLoop.scannyBoi.nextLine();
                if (fightyBoi2.equals("1")){
                    int damage = GameLoop.sword * GameLoop.level * 4;
                    GameLoop.doubleSmallSlime1Health = GameLoop.doubleSmallSlime1Health - damage;
                    System.out.println("You slash the slime with your sword. ");
                    DoubleSmallSlimeAttack();
                } else if (fightyBoi2.equals("2")){
                    int damage = GameLoop.sword * GameLoop.level * 4;
                    GameLoop.doubleSmallSlime2Health = GameLoop.doubleSmallSlime2Health - damage;
                    System.out.println("You slash the slime with your sword. ");
                    DoubleSmallSlimeAttack();
                } else {
                    System.out.println("That is not a recognized command. ");
                    CritAttackDoubleSmallSlime();
                }
            }
        case "use dagger" :
            System.out.println("Would you like to attack slime 1 or slime 2? ");
                fightyBoi2 = GameLoop.scannyBoi.nextLine();
                if (fightyBoi2.equals("1")){
                    int damage = GameLoop.level * 2;
                    GameLoop.doubleSmallSlime1Health = GameLoop.doubleSmallSlime1Health - damage;
                    System.out.println("You stab the slime with your dagger. ");
                    DoubleSmallSlimeAttack();
                } else if (fightyBoi2.equals("2")){
                    int damage = GameLoop.level * 2;
                    GameLoop.doubleSmallSlime2Health = GameLoop.doubleSmallSlime2Health - damage;
                    System.out.println("You stab the slime with your dagger. ");
                    DoubleSmallSlimeAttack();
                } else {
                    System.out.println("That is not a recognized command. ");
                    CritAttackDoubleSmallSlime();
                }
        case "use bow" :
            if (GameLoop.bow == 0){
                System.out.println("You don't have a bow. ");
                CritAttackDoubleSmallSlime();
            } else if (GameLoop.numberOfArrows == 0) {
                System.out.println("You don't have any arrows. ");
                CritAttackDoubleSmallSlime();
            } else {
                System.out.println("Would you like to attack slime 1 or slime 2? ");
                fightyBoi2 = GameLoop.scannyBoi.nextLine();
                if (fightyBoi2.equals("1")){
                    int damage = GameLoop.bow * GameLoop.level * 4;
                    GameLoop.numberOfArrows = GameLoop.numberOfArrows - 1;
                    GameLoop.doubleSmallSlime1Health = GameLoop.doubleSmallSlime1Health - damage;
                    System.out.println("Your shoot an arrow at the slime. ");
                    DoubleSmallSlimeAttack();
                } else if (fightyBoi2.equals("1")){
                    int damage = GameLoop.bow * GameLoop.level * 4;
                    GameLoop.numberOfArrows = GameLoop.numberOfArrows - 1;
                    GameLoop.doubleSmallSlime2Health = GameLoop.doubleSmallSlime2Health - damage;
                    System.out.println("Your shoot an arrow at the slime. ");
                    DoubleSmallSlimeAttack();
                } else {
                    System.out.println("That is not a recognized command. ");
                    CritAttackDoubleSmallSlime();
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
            CritAttackDoubleSmallSlime();
        case "use shield" :
            System.out.println("The slimes are already lying helpless");
            CritAttackDoubleSmallSlime();
        case "punch" :
            System.out.println("Would you like to attack slime 1 or slime 2? ");
                fightyBoi2 = GameLoop.scannyBoi.nextLine();
                if (fightyBoi2.equals("1")){
                    System.out.println("You punch the slime. ");
                    GameLoop.doubleSmallSlime1Health = GameLoop.doubleSmallSlime1Health - 2;
                    DoubleSmallSlimeAttack();
                } else if (fightyBoi2.equals("2")){
                    System.out.println("You punch the slime. ");
                    GameLoop.doubleSmallSlime2Health = GameLoop.doubleSmallSlime2Health - 2;
                    DoubleSmallSlimeAttack();
                } else {
                    System.out.println("That is not a recognized command. ");
                    CritAttackDoubleSmallSlime();
                }
        case "run" :
            System.out.println("You try to run away from the slimes, but they are able to leap at you and prevent your escape. ");
            DoubleSmallSlimeAttack();
        default :
            System.out.println("That is not a recognized command. ");
            CritAttackDoubleSmallSlime();
        }
    }

    public static void DoubleSmallSlimeAttack(){
        if (GameLoop.doubleSmallSlime1Health <= 0 || GameLoop.doubleSmallSlime2Health <= 0) {
            DeadDoubleSmallSlime();
        } else {
            System.out.println("The small slimes leap at you. ");
            if (GameLoop.armor == 0){
                GameLoop.health = GameLoop.health - 8;
            } else {
                double smallSlimeDamage = 6 / GameLoop.armor;
                GameLoop.health = GameLoop.health - smallSlimeDamage;
            }
            if (GameLoop.health <= 0){
                GameLoop.GameOver();
            }
            AttackDoubleSmallSlime();
        }
    }

    public static void DeadDoubleSmallSlime(){
        System.out.println("One of the slimes bursts open and dissolves into the ground. The other slime leaps on you. ");
        if (GameLoop.armor == 0){
            GameLoop.health = GameLoop.health - 4;
        } else {
            double smallSlimeDamage = 3 / GameLoop.armor;
            GameLoop.health = GameLoop.health - smallSlimeDamage;
        }
        if (GameLoop.health <= 0){
            GameLoop.GameOver();
        }
        if (GameLoop.doubleSmallSlime1Health <= 0) {
            GameLoop.smallSlimeHealth = GameLoop.doubleSmallSlime2Health;
            SmallSlime.AttackSmallSlime();
        } else {
            GameLoop.smallSlimeHealth = GameLoop.doubleSmallSlime1Health;
            SmallSlime.AttackSmallSlime();
        }
    }
}