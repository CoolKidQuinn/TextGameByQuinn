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
                        int damage = (GameLoop.sword + GameLoop.levelDamageMultiplier) * 2;
                        System.out.println("You swing your sword at the elemental and hit something solid at the center. ");
                        GameLoop.elementalHealth = GameLoop.elementalHealth - damage;
                        destroyChance = rand.nextInt(10);
                        if (destroyChance == 9) {
                            GameLoop.sword = GameLoop.sword - 1;
                            if (GameLoop.sword == 0) {
                                System.out.println("The flames light your sword ablaze and it burns up completely, leaving nothing but ash in it's place. ");
                            } else {
                                System.out.println("The flames burn your sword and damage it. ");
                            }
                        }
                    } else {
                        System.out.println("You swing your sword at the elemental and it passes straight through the flames. ");
                    }
                    FireElementalAttacks();
                }
            case "use dagger" :
                int attackHitChance = 6;
                int attackMissChance = rand.nextInt(10);
                if (attackHitChance >= attackMissChance) {
                    int damage = GameLoop.level;
                    System.out.println("You stab your dagger into the elemental and hit something solid at the center. ");
                    GameLoop.elementalHealth = GameLoop.elementalHealth - damage;    
                } else {
                    System.out.println("You stab at the elemental, but your dagger goes straight through it's flames and has no affect. ");
                } 
                FireElementalAttacks();
            case "use bow" :
                if (GameLoop.bow == 0) {
                    System.out.println("You don't have a bow. ");
                    AttackFireElemental();
                } else if (GameLoop.numberOfArrows == 0) {
                    System.out.println("You don't have any arrows. ");
                    AttackFireElemental();
                } else {
                    int damage = (GameLoop.bow + GameLoop.levelDamageMultiplier) * 2;
                    GameLoop.numberOfArrows = GameLoop.numberOfArrows - 1;
                    rand = new Random();
                    attackMissChance = rand.nextInt(10);
                    attackHitChance = GameLoop.bow + 6;
                    if (attackMissChance >= attackHitChance){
                        System.out.println("You shoot an arrow at the elemental but it passes right through it. ");
                    } else {
                        GameLoop.goblinHealth = GameLoop.goblinHealth - damage;
                        System.out.println("You shoot an arrow at the elemental and it hits something in the center. ");
                    }
                    FireElementalAttacks();
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
                AttackFireElemental();
            case "use shield" :
                if (GameLoop.shield == 0) {
                    System.out.println("You don't have a shield. ");
                } else {
                    int attackBlockChance = GameLoop.shield + 5;
                    attackHitChance = rand.nextInt(11);
                    if (attackBlockChance > attackHitChance) {
                        System.out.println("The elemental shoots flames at you but you are able to block them with your shield. ");
                        destroyChance = rand.nextInt(10);
                        if (destroyChance == 9) {
                            if (GameLoop.shield == 1) {
                                System.out.println("The flames ignite your shield and it burns up, leaving a pile of ash behind. ");
                            } else {
                                System.out.println("The flames damage your shield. ");
                            }
                            GameLoop.shield = GameLoop.shield - 1;
                        }
                        CritAttackFireElemental();
                    } else {
                        System.out.println("You can't get your shield up in time. ");
                        FireElementalAttacks();
                    }
                }
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
                    int damage = (GameLoop.sword + GameLoop.levelDamageMultiplier) * 4;
                    System.out.println("You swing your sword at the elemental and hit something solid at the center. ");
                    GameLoop.elementalHealth = GameLoop.elementalHealth - damage;    
                    FireElementalAttacks();
                }
            case "use dagger" :
                int damage = GameLoop.level;
                System.out.println("You stab your dagger into the elemental and hit something solid at the center. ");
                GameLoop.elementalHealth = GameLoop.elementalHealth - damage;    
                FireElementalAttacks();
            case "use bow" :
                if (GameLoop.bow == 0) {
                    System.out.println("You don't have a bow. ");
                    CritAttackFireElemental();
                } else if (GameLoop.numberOfArrows == 0) {
                    System.out.println("You don't have any arrows. ");
                    CritAttackFireElemental();
                } else {
                    damage = (GameLoop.bow + GameLoop.levelDamageMultiplier) * 4;
                    GameLoop.numberOfArrows = GameLoop.numberOfArrows - 1;
                    GameLoop.goblinHealth = GameLoop.goblinHealth - damage;
                    System.out.println("You shoot an arrow at the elemental. ");
                    FireElementalAttacks();
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
                CritAttackFireElemental();
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