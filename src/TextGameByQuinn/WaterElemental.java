package textgamebyquinn;

import textgamebyquinn.GameLoop;
import java.util.*;

public class WaterElemental{

    static int air;

    public static void Encounter() {
        air = 10;
        GameLoop.elementalHealth = 100;
        System.out.println("As you approach, you see a pedestal surrounded by a pool of water. As you get closer, the water starts to shift. The closer you get, the more the water moves around. Finally, the water starts moving up the side of the pedestal and forms into an elemental being of pure water. ");
        AttackWaterElemental();
    }

    public static void AttackWaterElemental() {

    }

    public static void CritAttackWaterElemental() {

    }

    public static void FireElementalAttacks() {
        if (GameLoop.elementalHealth <= 0){
            DeadWaterElemental();
        } else {
            if (air == 10) {
                System.out.println("The elemental shoots a pillar of water at you. The water hits your mouth and fills your lungs. You begin to suffocate. ");
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