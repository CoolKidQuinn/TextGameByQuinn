package textgamebyquinn;

import textgamebyquinn.GameLoop;
import java.util.*;

public class EarthElemental{

    static Random rand = new Random();

    public static void Encounter() {
        GameLoop.elementalHealth = 200;
        System.out.println("As you approach, you see a pedestal partially covered with a pile of rocks. As you get closer, the ground starts to shake. The closer you get the harder it shakes. Finally, the rocks surrounding the pedestal all form around the pedestal to create an elemental being of pure rock. ");
        AttackEarthElemental();
    }

    public static void AttackEarthElemental(){
        String fightyBoi1 = GameLoop.scannyBoi.nextLine();
        switch (fightyBoi1) {
        case "use sword" :
                if (GameLoop.sword == 0) {
                    System.out.println("You don't have a sword");
                    AttackEarthElemental();
                } else {
                    int attackHitChance = GameLoop.sword + 6;
                    int attackMissChance = rand.nextInt(10);
                    if (attackHitChance >= attackMissChance) {
                        int damage = (GameLoop.sword + GameLoop.levelDamageMultiplier) * 2;
                        System.out.println("You swing your sword at the elemental and it cuts straight through the rocks and hits something solid at the center. ");
                        GameLoop.elementalHealth = GameLoop.elementalHealth - damage;
                    } else {
                        System.out.println("You swing your sword at the elemental but it pings harmlessly off the side. ");
                    }
                    EarthElementalAttacks();
                }
            case "use dagger" :
                int attackHitChance = 6;
                int attackMissChance = rand.nextInt(10);
                if (attackHitChance >= attackMissChance) {
                    int damage = GameLoop.level;
                    System.out.println("You stab your dagger into the elemental and stab straight throught the rocks and hit something solid at the center. ");
                    GameLoop.elementalHealth = GameLoop.elementalHealth - damage;    
                } else {
                    System.out.println("You stab at the elemental, but your dagger just hits the rocks and bounces off. ");
                } 
                EarthElementalAttacks();
            case "use bow" :
                if (GameLoop.bow == 0) {
                    System.out.println("You don't have a bow. ");
                    AttackEarthElemental();
                } else if (GameLoop.numberOfArrows == 0) {
                    System.out.println("You don't have any arrows. ");
                    AttackEarthElemental();
                } else {
                    int damage = (GameLoop.bow + GameLoop.levelDamageMultiplier) * 2;
                    GameLoop.numberOfArrows = GameLoop.numberOfArrows - 1;
                    rand = new Random();
                    attackMissChance = rand.nextInt(10);
                    attackHitChance = GameLoop.bow + 6;
                    if (attackMissChance >= attackHitChance){
                        System.out.println("You shoot an arrow at the elemental but it bounces right off of it. ");
                    } else {
                        GameLoop.elementalHealth = GameLoop.elementalHealth - damage;
                        System.out.println("You shoot an arrow at the elemental and it plunges itself into the elemental and hits something in the center. ");
                    }
                    EarthElementalAttacks();
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
                AttackEarthElemental();
            case "use shield" :
                if (GameLoop.shield == 0) {
                    System.out.println("You don't have a shield. ");
                } else {
                    int attackBlockChance = GameLoop.shield + 5;
                    attackHitChance = rand.nextInt(11);
                    if (attackBlockChance > attackHitChance) {
                        System.out.println("The elemental shoots rocks at you but you are able to block it with your shield. ");
                        CritAttackEarthElemental();
                    } else {
                        System.out.println("You can't get your shield up in time. ");
                        EarthElementalAttacks();
                    }
                }
            case "punch" :
                System.out.println("You punch the earth elemental. The elemental doesn't even notice the attack. ");
                EarthElementalAttacks();
            case "run" :
                System.out.println("You try to run away, but a pillar of rocks shoots up and blocks your path. ");
                EarthElementalAttacks();
            default :
                System.out.println("That is not a recognized command. ");
                AttackEarthElemental();
        }
    }

    public static void CritAttackEarthElemental() {
        String fightyBoi1 = GameLoop.scannyBoi.nextLine();
        switch (fightyBoi1) {
        case "use sword" :
                if (GameLoop.sword == 0) {
                    System.out.println("You don't have a sword");
                    CritAttackEarthElemental();
                } else {
                    int damage = (GameLoop.sword + GameLoop.levelDamageMultiplier) * 4;
                    System.out.println("You swing your sword at the elemental and cut straight throught the rocks until you hit something solid at the center. ");
                    GameLoop.elementalHealth = GameLoop.elementalHealth - damage;
                    EarthElementalAttacks();
                }
            case "use dagger" :
                int damage = GameLoop.level * 2;
                System.out.println("You stab your dagger into the elemental and go straight through the rocks until you hit something solid at the center. ");
                GameLoop.elementalHealth = GameLoop.elementalHealth - damage; 
                EarthElementalAttacks();
            case "use bow" :
                if (GameLoop.bow == 0) {
                    System.out.println("You don't have a bow. ");
                    CritAttackEarthElemental();
                } else if (GameLoop.numberOfArrows == 0) {
                    System.out.println("You don't have any arrows. ");
                    CritAttackEarthElemental();
                } else {
                    damage = (GameLoop.bow + GameLoop.levelDamageMultiplier) * 4;
                    GameLoop.numberOfArrows = GameLoop.numberOfArrows - 1;
                    GameLoop.elementalHealth = GameLoop.elementalHealth - damage;
                    System.out.println("You shoot an arrow at the elemental and it penetrates straight through the rocks and hits something in the center. ");
                    }
                    EarthElementalAttacks();
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
                CritAttackEarthElemental();
            case "use shield" :
                System.out.println("The elemental is already off guard. ");
            case "punch" :
                System.out.println("You punch the earth elemental. The elemental doesn't even notice the attack. ");
                EarthElementalAttacks();
            case "run" :
                System.out.println("You try to run away, but a pillar of rocks shoots up and blocks your path. ");
                EarthElementalAttacks();
            default :
                System.out.println("That is not a recognized command. ");
                CritAttackEarthElemental();
        }
    }


    public static void EarthElementalAttacks() {
        if (GameLoop.elementalHealth <= 0){
            DeadEarthElemental();
        } else {
            System.out.println("The elemental shoots a pile of rocks at you. ");
            if (GameLoop.armor == 0){
                GameLoop.health = GameLoop.health - 50;
            } else {
                double elementalDamage = 40 / GameLoop.armor;
                GameLoop.health = GameLoop.health - elementalDamage;
            }
            if (GameLoop.health <= 0){
                GameLoop.GameOver();
            }
            int stunChance = rand.nextInt(11);
            if (stunChance >= 9) {
                System.out.println("You are knocked down and while you are getting back up the elemental attacks again. ");
                EarthElementalAttacks();
            }
        }
    }

    public static void DeadEarthElemental() {
        System.out.println("The earth making up the elemental crumbles away and the pedestal drops to the ground. The pedestal starts glowing before shattering into a thousand pieces. The pieces disintegrate and the surrounding area looks completely unaffected by the fight. ");
        GameLoop.gold = GameLoop.gold + 1000;
        GameLoop.experience = GameLoop.experience + 500;
        GameLoop.numberOfBossesDefeated = GameLoop.numberOfBossesDefeated + 1;
        System.out.println("You get some gold and experience. You now have " + GameLoop.gold + " gold and " + GameLoop.experience + " experience. ");
    }
}