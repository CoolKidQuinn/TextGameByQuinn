package textgamebyquinn;

import textgamebyquinn.GameLoop;

public class LevelCheck{
    public static void LevelSet(){
        if (GameLoop.experience >= 0 && GameLoop.level < 1){
            GameLoop.level = 1;
        }
        if (GameLoop.experience >= 50 && GameLoop.level < 2){
            GameLoop.level = 2;
            System.out.println("You have leveled up. You are now level 2. ");
        } 
        if (GameLoop.experience >= 150 && GameLoop.level < 3){
            GameLoop.level = 3;
            System.out.println("You have leveled up. You are now level 3. ");
        }
        if (GameLoop.experience >= 350 && GameLoop.level < 4){
            GameLoop.level = 4;
            System.out.println("You have leveled up. You are now level 4. ");
        }
        if (GameLoop.experience >= 650 && GameLoop.level < 5){
            GameLoop.level = 5;
            System.out.println("You have leveled up. You are now level 5. ");
        }
        if (GameLoop.experience >= 1050 && GameLoop.level < 6){
            GameLoop.level = 6;
            System.out.println("You have leveled up. You are now level 6. ");
        }
        if (GameLoop.experience >= 1550 && GameLoop.level < 7){
            GameLoop.level = 7;
            System.out.println("You have leveled up. You are now level 7. ");
        }
        if (GameLoop.experience >= 2150 && GameLoop.level < 8){
            GameLoop.level = 8;
            System.out.println("You have leveled up. You are now level 8. ");
        }
        if (GameLoop.experience >= 2850 && GameLoop.level < 9){
            GameLoop.level = 9;
            System.out.println("You have leveled up. You are now level 9. ");
        }
        if (GameLoop.experience >= 3650 && GameLoop.level < 10){
            GameLoop.level = 10;
            System.out.println("You have leveled up. You are now level 10. ");
        }
    }
}