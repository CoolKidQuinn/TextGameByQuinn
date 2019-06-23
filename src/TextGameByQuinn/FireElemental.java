package textgamebyquinn;

import textgamebyquinn.GameLoop;
import java.util.*;

public class FireElemental{
    static int destroyChance;
    static Random rand = new Random();

    public static void Encounter() {
        GameLoop.elementalHealth = 100;
        System.out.println("As you approach, you see a pedestal surrounded by flames. As you get closer, the fire starts blazing. The closer you get, the brighter and hotter it burns. Finally, the pedestal itself is lit ablaze and the flames form into an elemental being of pure fire. ");
        AttackFireElemental();
    }

    public static void AttackFireElemental() {
        String fightyBoi1 = GameLoop.scannyBoi.nextLine();
        switch (fightyBoi1) {
            case "use sword" :
                if (GameLoop.sword == 0) {
                    System.out.println("You don't have a sword");
                    AttackFireElemental();
                } else {
                    int attackHitChance = GameLoop.sword + 6;
                    int attackMissChance = rand.nextInt(10);
                    if (attackHitChance >= attackMissChance) {
                        int damage = GameLoop.sword * GameLoop.level * 2;
                        System.out.println("You swing your sword at the elemental and hit something solid at the center. ");
                        GameLoop.elementalHealth = GameLoop.elementalHealth - damage;
                        destroyChance = rand.nextInt(10);
                        if (destroyChance == 9) {
                            GameLoop.sword = GameLoop.sword - 1;
                            System.out.println("The flames burn your sword and damage it. ");
                        }
                    } else {
                        System.out.println("You swing your sword at the elemental and it passes straight through the flames. ");
                    }
                    FireElementalAttacks();
                }
            case "use dagger" :
            case "use bow" :
            case "use potion" :
            case "use shield" :
            case "punch" :
                System.out.println("You punch the fire elemental. The elemental doesn't even notice the attack and you burn your fist. ");
                GameLoop.health = GameLoop.health - 5;
                FireElementalAttacks();
            case "run" :
                System.out.println("You try to run away, but a wall of fire shoots up and blocks your path. ");
                FireElementalAttacks();
            default :
                System.out.println("That is not a recognized command. ");
                AttackFireElemental();
        }
    }

    public static void CritAttackFireElemental() {
        String fightyBoi1 = GameLoop.scannyBoi.nextLine();
        switch (fightyBoi1) {
            case "use sword" :
                if (GameLoop.sword == 0) {
                    System.out.println("You don't have a sword");
                    CritAttackFireElemental();
                } else {
                    int damage = GameLoop.sword * GameLoop.level * 4;
                    System.out.println("You swing your sword at the elemental and hit something solid at the center. ");
                    GameLoop.elementalHealth = GameLoop.elementalHealth - damage;    
                    FireElementalAttacks();
                }
            case "use dagger" :
                int damage = GameLoop.level * 2;
                System.out.println("You stab your dagger into the elemental and hit something solid at the center. ");
                GameLoop.elementalHealth = GameLoop.elementalHealth - damage;    
                FireElementalAttacks();
            case "use bow" :
            case "use potion" :
            case "use shield" :
                System.out.println("The elemental is already vulnerable. ");
                CritAttackFireElemental();
            case "punch" :
                System.out.println("You punch the fire elemental. The elemental doesn't even notice the attack and you burn your fist. ");
                GameLoop.health = GameLoop.health - 2.5;
                FireElementalAttacks();
            case "run" :
                System.out.println("You try to run away, but a wall of fire shoots up and blocks your path. ");
                FireElementalAttacks();
            default :
                System.out.println("That is not a recognized command. ");
                CritAttackFireElemental();
        }
    }

    public static void FireElementalAttacks() {
        if (GameLoop.elementalHealth <= 0){
            DeadFireElemental();
        } else {
            System.out.println("The elemental shoots flames at you. ");
            if (GameLoop.armor == 0){
                GameLoop.health = GameLoop.health - 50;
            } else {
                double elementalDamage = 40 / GameLoop.armor;
                GameLoop.health = GameLoop.health - elementalDamage;
                destroyChance = rand.nextInt(10);
                if (destroyChance == 9) {
                    System.out.println("The flames burn your armor and damage it. ");
                    GameLoop.armor = GameLoop.armor - 1;
                }
            }
            if (GameLoop.health <= 0){
                GameLoop.GameOver();
            }
        }
    }

    public static void DeadFireElemental() {
        System.out.println("The fire making up the elemental disappate and the pedestal drops to the ground. The pedestal starts glowing before shattering into a thousand pieces. The pieces disintegrate and the surrounding area looks completely unaffected by the fight. ");
        GameLoop.gold = GameLoop.gold + 1000;
        GameLoop.experience = GameLoop.experience + 500;
        GameLoop.numberOfBossesDefeated = GameLoop.numberOfBossesDefeated + 1;
        System.out.println("You get some gold and experience. You now have " + GameLoop.gold + " gold and " + GameLoop.experience + " experience. ");
    }
}