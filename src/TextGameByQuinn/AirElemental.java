package textgamebyquinn;

import textgamebyquinn.GameLoop;
import java.util.*;

public class AirElemental{
    public static void Encounter(){
        GameLoop.elementalHealth = 100;
        System.out.println("As you approach, you see a pedestal suspended in midair. As you get closer, the wind starts blowing. The closer you get, the harder the wind blows. Finally, the air surrounding the pedastal condenses into a being of pure air with the pedestal at the center. ");
        AttackAirElemental();
    }

    public static void AttackAirElemental() {

    }

    public static void CritAttackAirElemental() {

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