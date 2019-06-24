package textgamebyquinn;

import textgamebyquinn.GameLoop;

public class LevelCheck{
    public static void LevelSet(){
        if (GameLoop.experience >= 0 && GameLoop.levelDamageMultiplier < 1){
            GameLoop.levelDamageMultiplier = 1;
        }
        if (GameLoop.experience >= 50 && GameLoop.levelDamageMultiplier < 2){
            GameLoop.levelDamageMultiplier = 2;
            System.out.println("You have leveled up. You are now level 2. ");
        } 
        if (GameLoop.experience >= 150 && GameLoop.levelDamageMultiplier < 3){
            GameLoop.levelDamageMultiplier = 3;
            System.out.println("You have leveled up. You are now level 3. ");
        }
        if (GameLoop.experience >= 350 && GameLoop.levelDamageMultiplier < 4){
            GameLoop.levelDamageMultiplier = 4;
            System.out.println("You have leveled up. You are now level 4. ");
        }
        if (GameLoop.experience >= 650 && GameLoop.levelDamageMultiplier < 5){
            GameLoop.levelDamageMultiplier = 5;
            System.out.println("You have leveled up. You are now level 5. ");
        }
        if (GameLoop.experience >= 1050 && GameLoop.levelDamageMultiplier < 6){
            GameLoop.levelDamageMultiplier = 6;
            System.out.println("You have leveled up. You are now level 6. ");
        }
        if (GameLoop.experience >= 1550 && GameLoop.levelDamageMultiplier < 7){
            GameLoop.levelDamageMultiplier = 7;
            System.out.println("You have leveled up. You are now level 7. ");
        }
        if (GameLoop.experience >= 2150 && GameLoop.levelDamageMultiplier < 8){
            GameLoop.levelDamageMultiplier = 8;
            System.out.println("You have leveled up. You are now level 8. ");
        }
        if (GameLoop.experience >= 2850 && GameLoop.levelDamageMultiplier < 9){
            GameLoop.levelDamageMultiplier = 9;
            System.out.println("You have leveled up. You are now level 9. ");
        }
        if (GameLoop.experience >= 3650 && GameLoop.levelDamageMultiplier < 10){
            GameLoop.levelDamageMultiplier = 10;
            System.out.println("You have leveled up. You are now level 10. ");
        }
    }
}