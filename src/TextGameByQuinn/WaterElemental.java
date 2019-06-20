package textgamebyquinn;

import textgamebyquinn.GameLoop;
import java.util.*;

public class WaterElemental{
    public static void Encounter() {
        GameLoop.elementalHealth = 100;
        System.out.println("As you approach, you see a pedestal surrounded by a pool of water. As you get closer, the water starts to shift. The closer you get, the more the water moves around. Finally, the water starts moving up the side of the pedestal and forms into an elemental being of pure water. ");
        AttackWaterElemental();
    }

    public static void AttackWaterElemental() {

    }

    public static void CritAttackWaterElemental() {

    }

    public static void WaterElementalAttacks() {

    }

    public static void DeadWaterElemental() {
        System.out.println("The water making up the elemental falls away and the pedestal drops to the ground. The pedestal starts glowing before shattering into a thousand pieces. The pieces disintegrate and the surrounding area looks completely unaffected by the fight. ");
        GameLoop.gold = GameLoop.gold + 1000;
        GameLoop.experience = GameLoop.experience + 500;
        GameLoop.numberOfBossesDefeated = GameLoop.numberOfBossesDefeated + 1;
        System.out.println("You get some gold and experience. You now have " + GameLoop.gold + " gold and " + GameLoop.experience + " experience. ");
    }
}