package textgamebyquinn;

import textgamebyquinn.GameLoop;
import java.util.*;

public class Goblin1 {
    public static void Goblin1Encounter() {
        GameLoop.goblinHealth = 10;
        System.out.print("You see a goblin a bit more than half your size. He is armed with a dagger. ");
        AttackGoblin1();
    }

    public static void AttackGoblin1() {
        String fightyBoi1 = GameLoop.scannyBoi.nextLine();
        switch (fightyBoi1){
            case "use sword" :
                if (GameLoop.sword == 0) {
                    System.out.print("You don't have a sword. ");
                    AttackGoblin1();
                } else {
                    Random rand = new Random();
                    int attackMissChance = rand.nextInt(10);
                    int attackHitChance = GameLoop.sword + 8;
                    if (attackMissChance >= attackHitChance) {
                        System.out.print("You swing your sword but the goblin is too quick and leaps out of the way. ");
                    } else {
                        int damage = GameLoop.sword * GameLoop.level * 2;
                        GameLoop.goblinHealth = GameLoop.goblinHealth - damage;
                        System.out.print("You slash at the goblin with your sword. ");
                    }
                    //Goblin1Attacks();
                }
        } 
    }
}