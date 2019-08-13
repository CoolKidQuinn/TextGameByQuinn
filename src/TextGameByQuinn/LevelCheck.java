package textgamebyquinn;

import textgamebyquinn.GameLoop;

public class LevelCheck{
    static boolean level2, level3, level4, level5, level6, level7, level8, level9, level10 = false;
    public static void LevelSet(){
        if (GameLoop.experience >= 0 && GameLoop.levelDamageMultiplier < 1){
            GameLoop.levelDamageMultiplier = 1;
        }
        if (GameLoop.experience >= 50 && GameLoop.levelDamageMultiplier < 2){
            GameLoop.levelDamageMultiplier = 2;
            if (level2 == false) {
                System.out.println("You have leveled up. You are now level 2. ");
                level2 = true;
            }
        } 
        if (GameLoop.experience >= 150 && GameLoop.levelDamageMultiplier < 3){
            GameLoop.levelDamageMultiplier = 3;
            if (level3 == false) {
                System.out.println("You have leveled up. You are now level 3. ");
                level3 = true;
            }
        }
        if (GameLoop.experience >= 350 && GameLoop.levelDamageMultiplier < 4){
            GameLoop.levelDamageMultiplier = 4;
            if (level4 == false) {
                System.out.println("You have leveled up. You are now level 4. ");
                level4 = true;
            }
        }
        if (GameLoop.experience >= 650 && GameLoop.levelDamageMultiplier < 5){
            GameLoop.levelDamageMultiplier = 5;
            if (level5 == false) {
                System.out.println("You have leveled up. You are now level 5. ");
                level5 = true;
            }
        }
        if (GameLoop.experience >= 1050 && GameLoop.levelDamageMultiplier < 6){
            GameLoop.levelDamageMultiplier = 6;
            if (level6 == false) {
                System.out.println("You have leveled up. You are now level 6. ");
                level6 = true;
            }
        }
        if (GameLoop.experience >= 1550 && GameLoop.levelDamageMultiplier < 7){
            GameLoop.levelDamageMultiplier = 7;
            if (level7 == false) {
                System.out.println("You have leveled up. You are now level 7. ");
                level7 = true;
            }
        }
        if (GameLoop.experience >= 2150 && GameLoop.levelDamageMultiplier < 8){
            GameLoop.levelDamageMultiplier = 8;
            if (level8 == false) {
                System.out.println("You have leveled up. You are now level 8. ");
                level8 = true;
            }
        }
        if (GameLoop.experience >= 2850 && GameLoop.levelDamageMultiplier < 9){
            GameLoop.levelDamageMultiplier = 9;
            if (level9 == false) {
                System.out.println("You have leveled up. You are now level 9. ");
                level9 = true;
            }
        }
        if (GameLoop.experience >= 3650 && GameLoop.levelDamageMultiplier < 10){
            GameLoop.levelDamageMultiplier = 10;
            if (level10 == false) {
                System.out.println("You have leveled up. You are now level 10. ");
                level10 = true;
            }
        }
    }
}