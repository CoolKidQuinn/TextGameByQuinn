package textgamebyquinn;

import textgamebyquinn.GameLoop;
import java.util.*;

public class FireElemental{
    public static void Encounter() {
        GameLoop.elementalHealth = 100;
        System.out.println("As you approach, you see a pedestal surrounded by flames. As you get closer, the fire starts blazing. The closer you get, the brighter and hotter it burns. Finally, the pedestal itself is lit ablaze and the flames form into an elemental being of pure fire. ");
        AttackFireElemental();
    }

    public static void AttackFireElemental() {
        String fightyBoi1 = GameLoop.scannyBoi.nextLine();
        switch (fightyBoi1) {
            case "use sword" :
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

    }

    public static void FireElementalAttacks() {

    }

    public static void DeadFireElemental() {
        System.out.println("The fire making up the elemental begins to disappate and the pedestal drops to the ground. The pedestal starts glowing before shattering into a thousand pieces. The pieces disintegrate and the surrounding area looks completely unaffected by the fight. ");
        GameLoop.gold = GameLoop.gold + 1000;
        GameLoop.experience = GameLoop.experience + 500;
        GameLoop.numberOfBossesDefeated = GameLoop.numberOfBossesDefeated + 1;
        System.out.println("You get some gold and experience. You now have " + GameLoop.gold + " gold and " + GameLoop.experience + " experience. ");
    }
}