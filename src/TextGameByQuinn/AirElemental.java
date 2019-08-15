package textgamebyquinn;

import textgamebyquinn.GameLoop;
import java.util.*;

public class AirElemental{

    static Random rand = new Random();

    public static void Encounter(){
        GameLoop.elementalHealth = 200;
        System.out.println("As you approach, you see a pedestal suspended in midair. As you get closer, the wind starts blowing. The closer you get, the harder the wind blows. Finally, the air surrounding the pedastal condenses into a being of pure air with the pedestal at the center. ");
        System.out.println("You have " + GameLoop.health + " health.");
        AttackAirElemental();
    }

    public static void AttackAirElemental() {
        String fightyBoi1 = GameLoop.scannyBoi.nextLine();
        switch (fightyBoi1) {
            case "use sword" :
                if (GameLoop.sword == 0) {
                    System.out.println("You don't have a sword");
                    AttackAirElemental();
                } else {
                    int attackHitChance = GameLoop.sword + 6;
                    int attackMissChance = rand.nextInt(10);
                    if (attackHitChance >= attackMissChance) {
                        int damage = (GameLoop.sword + GameLoop.levelDamageMultiplier) * 2;
                        System.out.println("You swing your sword at the elemental and hit something solid at the center. ");
                        GameLoop.elementalHealth = GameLoop.elementalHealth - damage;
                    } else {
                        System.out.println("You swing your sword at the elemental and it passes straight through the air comprising it. ");
                    }
                    AirElementalAttacks();
                }
            case "use dagger" :
                int attackHitChance = 6;
                int attackMissChance = rand.nextInt(10);
                if (attackHitChance >= attackMissChance) {
                    int damage = GameLoop.level;
                    System.out.println("You stab your dagger into the elemental and hit something solid at the center. ");
                    GameLoop.elementalHealth = GameLoop.elementalHealth - damage;    
                } else {
                    System.out.println("You stab at the elemental, but your dagger goes straight through the air and has no effect. ");
                } 
                AirElementalAttacks();
            case "use bow" :
                if (GameLoop.bow == 0) {
                    System.out.println("You don't have a bow. ");
                    AttackAirElemental();
                } else if (GameLoop.numberOfArrows == 0) {
                    System.out.println("You don't have any arrows. ");
                    AttackAirElemental();
                } else {
                    int damage = (GameLoop.bow + GameLoop.levelDamageMultiplier) * 2;
                    GameLoop.numberOfArrows = GameLoop.numberOfArrows - 1;
                    rand = new Random();
                    attackMissChance = rand.nextInt(10);
                    attackHitChance = GameLoop.bow + 6;
                    if (attackMissChance >= attackHitChance){
                        System.out.println("You shoot an arrow at the elemental but it passes right through it. ");
                    } else {
                        GameLoop.elementalHealth = GameLoop.elementalHealth - damage;
                        System.out.println("You shoot an arrow at the elemental and it hits something in the center. ");
                    }
                    AirElementalAttacks();
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
                AttackAirElemental();
            case "use shield" :
                if (GameLoop.shield == 0) {
                    System.out.println("You don't have a shield. ");
                } else {
                    int attackBlockChance = GameLoop.shield + 5;
                    attackHitChance = rand.nextInt(11);
                    if (attackBlockChance > attackHitChance) {
                        System.out.println("The elemental shoots a blast of air at you but you are able to block it with your shield. ");
                        CritAttackAirElemental();
                    } else {
                        System.out.println("You can't get your shield up in time. ");
                        AirElementalAttacks();
                    }
                }
            case "punch" :
                System.out.println("You punch the air elemental. The elemental doesn't even notice the attack. ");
                AirElementalAttacks();
            case "run" :
                System.out.println("You try to run away, but a pillar of air shoots up and blocks your path. ");
                AirElementalAttacks();
            case "help" :
                System.out.println("Recognized commands: ");
                System.out.println("use sword");
                System.out.println("use dagger");
                System.out.println("use bow");
                System.out.println("use potion");
                System.out.println("use shield");
                System.out.println("punch");
                System.out.println("run");
                AttackAirElemental();
            default :
                System.out.println("That is not a recognized command. ");
                AttackAirElemental();
        }
    }

    public static void CritAttackAirElemental() {
        String fightyBoi1 = GameLoop.scannyBoi.nextLine();
        switch (fightyBoi1) {
            case "use sword" :
                if (GameLoop.sword == 0) {
                    System.out.println("You don't have a sword");
                    CritAttackAirElemental();
                } else {
                    int damage = (GameLoop.sword + GameLoop.levelDamageMultiplier) * 4;
                    System.out.println("You swing your sword at the elemental and hit something solid at the center. ");
                    GameLoop.elementalHealth = GameLoop.elementalHealth - damage;
                    AirElementalAttacks();
                }
            case "use dagger" :
                int damage = GameLoop.level * 2;
                System.out.println("You stab your dagger into the elemental and hit something solid at the center. ");
                GameLoop.elementalHealth = GameLoop.elementalHealth - damage;
                AirElementalAttacks();
            case "use bow" :
                if (GameLoop.bow == 0) {
                    System.out.println("You don't have a bow. ");
                    CritAttackAirElemental();
                } else if (GameLoop.numberOfArrows == 0) {
                    System.out.println("You don't have any arrows. ");
                    CritAttackAirElemental();
                } else {
                    damage = (GameLoop.bow + GameLoop.levelDamageMultiplier) * 4;
                    GameLoop.numberOfArrows = GameLoop.numberOfArrows - 1;
                    rand = new Random();
                    GameLoop.elementalHealth = GameLoop.elementalHealth - damage;
                    System.out.println("You shoot an arrow at the elemental and it hits something in the center. ");
                    AirElementalAttacks();
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
                CritAttackAirElemental();
            case "use shield" :
                System.out.println("The elemental is already off guard. ");
                CritAttackAirElemental();
            case "punch" :
                System.out.println("You punch the air elemental. The elemental doesn't even notice the attack. ");
                AirElementalAttacks();
            case "run" :
                System.out.println("You try to run away, but a pillar of air shoots up and knocks you back. ");
                AirElementalAttacks();            
            case "help" :
                System.out.println("Recognized commands: ");
                System.out.println("use sword");
                System.out.println("use dagger");
                System.out.println("use bow");
                System.out.println("use potion");
                System.out.println("use shield");
                System.out.println("punch");
                System.out.println("run");
                CritAttackAirElemental();
            default :
                System.out.println("That is not a recognized command. ");
                CritAttackAirElemental();
        }
    }

    public static void AirElementalAttacks() {
        if (GameLoop.elementalHealth <= 0){
            DeadAirElemental();
        } else {
            System.out.println("The elemental shoots a gust of wind at you. ");
            if (GameLoop.armor == 0){
                GameLoop.health = GameLoop.health - 30;
            } else {
                System.out.println("Your armor does nothing against the attack. ");
                GameLoop.health = GameLoop.health - 30;
            }
            if (GameLoop.health <= 0){
                GameLoop.GameOver();
            } else {
                System.out.println("The elemental has " + GameLoop.elementalHealth + " health.");
                System.out.println("You have " + GameLoop.health + " health.");
                AttackAirElemental();
            }
        }
    }

    public static void DeadAirElemental() {
        System.out.println("The air making up the elemental blows away and the pedestal drops to the ground. The pedestal starts glowing before shattering into a thousand pieces. The pieces disintegrate and the surrounding area looks completely unaffected by the fight. ");
        GameLoop.gold = GameLoop.gold + 1000;
        GameLoop.experience = GameLoop.experience + 500;
        GameLoop.numberOfBossesDefeated = GameLoop.numberOfBossesDefeated + 1;
        System.out.println("You get some gold and experience. You now have " + GameLoop.gold + " gold and " + GameLoop.experience + " experience. ");
    }
}