package textgamebyquinn;

public class Victory {
    public static void Success(){
        if (GameLoop.continues > 0){
            System.out.println("You won, but you cheated, so is it really a true victory. ");
        } else{
            System.out.println("You won without dying. Congratulations. ");
        }
        System.out.println("Credits: ");
        System.out.println("Coding: Quinn Reynolds. ");
        System.exit(0);
    }
}