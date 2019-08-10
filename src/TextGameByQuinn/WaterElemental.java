package textgamebyquinn;

import textgamebyquinn.GameLoop;
import java.util.*;

public class WaterElemental{
    static Random rand = new Random();
    static int air;

    public static void Encounter() {
        air = 10;
        GameLoop.elementalHealth = 200;
        System.out.println("As you approach, you see a pedestal surrounded by a pool of water. As you get closer, the water starts to shift. The closer you get, the more the water moves around. Finally, the water starts moving up the side of the pedestal and forms into an elemental being of pure water. ");
        AttackWaterElemental();
    }
    public static void AttackWaterElemental(){
        String fightyBoi1 = GameLoop.scannyBoi.nextLine();
        switch (fightyBoi1) {
        case "use sword" :
                if (GameLoop.sword == 0) {
                    System.out.println("You don't have a sword");
                    AttackWaterElemental();
                } else {
                    int attackHitChance = GameLoop.sword + 6;
                    int attackMissChance = rand.nextInt(10);
                    if (attackHitChance >= attackMissChance) {
                        int damage = (GameLoop.sword + GameLoop.levelDamageMultiplier) * 2;
                        System.out.println("You swing your sword at the elemental and hit something solid at the center. ");
                        GameLoop.elementalHealth = GameLoop.elementalHealth - damage;
                    } else {
                        System.out.println("You swing your sword at the elemental and it passes straight through the water. ");
                    }
                    WaterElementalAttacks();
                }
            case "use dagger" :
                int attackHitChance = 6;
                int attackMissChance = rand.nextInt(10);
                if (attackHitChance >= attackMissChance) {
                    int damage = GameLoop.level;
                    System.out.println("You stab your dagger into the elemental and hit something solid at the center. ");
                    GameLoop.elementalHealth = GameLoop.elementalHealth - damage;    
                } else {
                    System.out.println("You stab at the elemental, but your dagger goes straight through the water and has no affect. ");
                } 
                WaterElementalAttacks();
            case "use bow" :
                if (GameLoop.bow == 0) {
                    System.out.println("You don't have a bow. ");
                    AttackWaterElemental();
                } else if (GameLoop.numberOfArrows == 0) {
                    System.out.println("You don't have any arrows. ");
                    AttackWaterElemental();
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
                    WaterElementalAttacks();
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
                AttackWaterElemental();
            case "use shield" :
                if (GameLoop.shield == 0) {
                    System.out.println("You don't have a shield. ");
                } else {
                    int attackBlockChance = GameLoop.shield + 5;
                    attackHitChance = rand.nextInt(11);
                    if (attackBlockChance > attackHitChance) {
                        System.out.println("The elemental shoots water at you but you are able to block it with your shield. ");
                        if (air <= 0) {
                            System.out.println("You are able to get a tiny breath of air. ");
                        }
                        CritAttackWaterElemental();
                    } else {
                        System.out.println("You can't get your shield up in time. ");
                        WaterElementalAttacks();
                    }
                }
            case "punch" :
                System.out.println("You punch the water elemental. The elemental doesn't even notice the attack. ");
                WaterElementalAttacks();
            case "run" :
                System.out.println("You try to run away, but a pillar of water shoots up and blocks your path. ");
                WaterElementalAttacks();
            default :
                System.out.println("That is not a recognized command. ");
                AttackWaterElemental();
        }
    }

    public static void CritAttackWaterElemental() {
        String fightyBoi1 = GameLoop.scannyBoi.nextLine();
        switch (fightyBoi1) {
        case "use sword" :
                if (GameLoop.sword == 0) {
                    System.out.println("You don't have a sword");
                    CritAttackWaterElemental();
                } else {
                    int damage = (GameLoop.sword + GameLoop.levelDamageMultiplier) * 4;
                    System.out.println("You swing your sword at the elemental and hit something solid at the center. ");
                    GameLoop.elementalHealth = GameLoop.elementalHealth - damage;
                    WaterElementalAttacks();
                }
            case "use dagger" :
                int damage = GameLoop.level * 2;
                System.out.println("You stab your dagger into the elemental and hit something solid at the center. ");
                GameLoop.elementalHealth = GameLoop.elementalHealth - damage; 
                WaterElementalAttacks();
            case "use bow" :
                if (GameLoop.bow == 0) {
                    System.out.println("You don't have a bow. ");
                    CritAttackWaterElemental();
                } else if (GameLoop.numberOfArrows == 0) {
                    System.out.println("You don't have any arrows. ");
                    CritAttackWaterElemental();
                } else {
                    damage = (GameLoop.bow + GameLoop.levelDamageMultiplier) * 4;
                    GameLoop.numberOfArrows = GameLoop.numberOfArrows - 1;
                    GameLoop.elementalHealth = GameLoop.elementalHealth - damage;
                    System.out.println("You shoot an arrow at the elemental and it hits something in the center. ");
                    }
                    WaterElementalAttacks();
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
                CritAttackWaterElemental();
            case "use shield" :
                System.out.println("The elemental is already off guard. ");
            case "punch" :
                System.out.println("You punch the water elemental. The elemental doesn't even notice the attack. ");
                WaterElementalAttacks();
            case "run" :
                System.out.println("You try to run away, but a pillar of water shoots up and blocks your path. ");
                WaterElementalAttacks();
            default :
                System.out.println("That is not a recognized command. ");
                CritAttackWaterElemental();
        }
    }

    public static void WaterElementalAttacks() {
        if (GameLoop.elementalHealth <= 0){
            DeadWaterElemental();
        } else {
            if (air == 10) {
                System.out.println("The elemental shoots a pillar of water at you. The water surrounds your head and fills your lungs. You begin to suffocate. ");
            } else {
                System.out.println("The elemental shoots a pillar of water at you. The water continues to fill your lungs as you struggle to grasp for air. ");
            } 
            air = air - 10;
            GameLoop.health = GameLoop.health + air;
            if (GameLoop.armor == 0){
                GameLoop.health = GameLoop.health - 50;
            } else {
                double elementalDamage = 40 / GameLoop.armor;
                GameLoop.health = GameLoop.health - elementalDamage;
            }
            if (GameLoop.health <= 0){
                GameLoop.GameOver();
            }
        }
    }

    public static void DeadWaterElemental() {
        System.out.println("The water making up the elemental falls away and the pedestal drops to the ground. The pedestal starts glowing before shattering into a thousand pieces. The pieces disintegrate and the surrounding area looks completely unaffected by the fight. ");
        GameLoop.gold = GameLoop.gold + 1000;
        GameLoop.experience = GameLoop.experience + 500;
        GameLoop.numberOfBossesDefeated = GameLoop.numberOfBossesDefeated + 1;
        System.out.println("You get some gold and experience. You now have " + GameLoop.gold + " gold and " + GameLoop.experience + " experience. ");
    }
}