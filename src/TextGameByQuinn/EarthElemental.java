package textgamebyquinn;

import textgamebyquinn.GameLoop;
import java.util.*;

public class EarthElemental{
    public static void Encounter() {
        GameLoop.elementalHealth = 100;
        System.out.println("As you approach, you see a pedestal partially covered with a pile of rocks. As you get closer, the ground starts to shake. The closer you get the harder it shakes. Finally, the rocks surrounding the pedestal all form around the pedestal to create an elemental being of pure rock. ");
        AttackEarthElemental();
    }

    public static void AttackEarthElemental() {

    }

    public static void CritAttackEarthElemental() {

    }

    public static void EarthElementalAttacks() {

    }

    public static void DeadEarthElemental() {
        System.out.println("The earth making up the elemental crumbles away and the pedestal drops to the ground. The pedestal starts glowing before shattering into a thousand pieces. The pieces disintegrate and the surrounding area looks completely unaffected by the fight. ");
        GameLoop.gold = GameLoop.gold + 1000;
        GameLoop.experience = GameLoop.experience + 500;
        GameLoop.numberOfBossesDefeated = GameLoop.numberOfBossesDefeated + 1;
        System.out.println("You get some gold and experience. You now have " + GameLoop.gold + " gold and " + GameLoop.experience + " experience. ");
    }
}