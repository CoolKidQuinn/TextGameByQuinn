package textgamebyquinn;

import java.util.*;
import textgamebyquinn.*;

public class Map {
    static Random rand = new Random();
    public static void CheckPosition(){
        //this will check the position of our character after moving
        //each possible position will have a different encounter
            //these encounters can be treasure, enemies, weapons, etc.
        if ((GameLoop.xPosition > 14) || (GameLoop.xPosition < 0) || (GameLoop.yPosition > 14) || (GameLoop.yPosition < 0)){
            System.out.println("There is a wall there. ");
            if (GameLoop.xPosition > 14){
                GameLoop.xPosition = 14;
            } else if (GameLoop.xPosition < 0){
                GameLoop.xPosition = 0;
            } else if (GameLoop.yPosition > 14){
                GameLoop.yPosition = 14;
            } else {
                GameLoop.yPosition = 0;
            }
            GameLoop.MapMovement();
            //this stops our character from leaving the map we have programmed
        } else if (GameLoop.xPosition == 1){
            switch (GameLoop.yPosition){
                case 0 : 
                    if (GameLoop.beenHere[0][0] == false){
                        GameLoop.beenHere[0][0] = true;
                        WaterElemental.Encounter();
                    } else {
                        RepeatedArea();
                    };
                case 1 :  
                    if (GameLoop.beenHere[0][1] == false){
                    //this checks to see if we have already been here
                        GameLoop.beenHere[0][1] = true;
                        //this is where we put the encounter that happens in this location
                        Level13Area();
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (GameLoop.beenHere[0][2] == false){
                        GameLoop.beenHere[0][2] = true;
                        Level12Area();
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (GameLoop.beenHere[0][3] == false){
                        GameLoop.beenHere[0][3] = true;
                        Level11Area();
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (GameLoop.beenHere[0][4] == false){
                        GameLoop.beenHere[0][4] = true;
                        Level10Area();
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (GameLoop.beenHere[0][5] == false){
                        GameLoop.beenHere[0][5] = true;
                        Level9Area();
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (GameLoop.beenHere[0][6] == false){
                        GameLoop.beenHere[0][6] = true;
                        Level8Area();
                    } else {
                       RepeatedArea();
                    };
                case 7 : 
                    if (GameLoop.beenHere[0][7] == false){
                        GameLoop.beenHere[0][7] = true;
                        Level7Area();
                    } else {
                       RepeatedArea();
                    };
                case 8 : 
                    if (GameLoop.beenHere[0][8] == false){
                        GameLoop.beenHere[0][8] = true;
                        Level8Area();
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (GameLoop.beenHere[0][9] == false){
                        GameLoop.beenHere[0][9] = true;
                        Level9Area();
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (GameLoop.beenHere[0][10] == false){
                        GameLoop.beenHere[0][10] = true;
                        Level10Area();
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (GameLoop.beenHere[0][11] == false){
                        GameLoop.beenHere[0][11] = true;
                        Level11Area();
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (GameLoop.beenHere[0][12] == false){
                        GameLoop.beenHere[0][12] = true;
                        Level12Area();
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (GameLoop.beenHere[0][13] == false){
                        GameLoop.beenHere[0][13] = true;
                        Level13Area();
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (GameLoop.beenHere[0][14] == false){
                        GameLoop.beenHere[0][14] = true;
                        FireElemental.Encounter();
                    } else {
                       RepeatedArea();
                    };
            }
        } else if (GameLoop.xPosition == 1){
            switch (GameLoop.yPosition){
                case 0 : 
                    if (GameLoop.beenHere[1][0] == false){
                        GameLoop.beenHere[1][0] = true;
                        Level13Area();
                    } else {
                        RepeatedArea();
                    };
                case 1 :  
                    if (GameLoop.beenHere[1][1] == false){
                    //this checks to see if we have already been here
                        GameLoop.beenHere[1][1] = true;
                        //this is where we put the encounter that happens in this location
                        Level12Area();
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (GameLoop.beenHere[1][2] == false){
                        GameLoop.beenHere[1][2] = true;
                        Level11Area();
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (GameLoop.beenHere[1][3] == false){
                        GameLoop.beenHere[1][3] = true;
                        Level10Area();
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (GameLoop.beenHere[1][4] == false){
                        GameLoop.beenHere[1][4] = true;
                        Level9Area();
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (GameLoop.beenHere[1][5] == false){
                        GameLoop.beenHere[1][5] = true;
                        Level8Area();
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (GameLoop.beenHere[1][6] == false){
                        GameLoop.beenHere[1][6] = true;
                        Level7Area();
                    } else {
                       RepeatedArea();
                    };
                case 7 : 
                    if (GameLoop.beenHere[1][7] == false){
                        GameLoop.beenHere[1][7] = true;
                        Level6Area();
                    } else {
                       RepeatedArea();
                    };
                case 8 : 
                    if (GameLoop.beenHere[1][8] == false){
                        GameLoop.beenHere[1][8] = true;
                        Level7Area();
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (GameLoop.beenHere[1][9] == false){
                        GameLoop.beenHere[1][9] = true;
                        Level8Area();
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (GameLoop.beenHere[1][10] == false){
                        GameLoop.beenHere[1][10] = true;
                        Level9Area();
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (GameLoop.beenHere[1][11] == false){
                        GameLoop.beenHere[1][11] = true;
                        Level10Area();
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (GameLoop.beenHere[1][12] == false){
                        GameLoop.beenHere[1][12] = true;
                        Level11Area();
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (GameLoop.beenHere[1][13] == false){
                        GameLoop.beenHere[1][13] = true;
                        Level12Area();
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (GameLoop.beenHere[1][14] == false){
                        GameLoop.beenHere[1][14] = true;
                        Level13Area();
                    } else {
                       RepeatedArea();
                    };
            } 
        } else if (GameLoop.xPosition == 2){
            switch (GameLoop.yPosition){
                case 0 : 
                    if (GameLoop.beenHere[2][0] == false){
                        GameLoop.beenHere[2][0] = true;
                        Level12Area();
                    } else {
                        RepeatedArea();
                    };
                case 1 :  
                    if (GameLoop.beenHere[2][1] == false){
                    //this checks to see if we have already been here
                        GameLoop.beenHere[2][1] = true;
                        //this is where we put the encounter that happens in this location
                        Level11Area();
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (GameLoop.beenHere[2][2] == false){
                        GameLoop.beenHere[2][2] = true;
                        Level10Area();
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (GameLoop.beenHere[2][3] == false){
                        GameLoop.beenHere[2][3] = true;
                        Level9Area();
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (GameLoop.beenHere[2][4] == false){
                        GameLoop.beenHere[2][4] = true;
                        Level8Area();
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (GameLoop.beenHere[2][5] == false){
                        GameLoop.beenHere[2][5] = true;
                        Level7Area();
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (GameLoop.beenHere[2][6] == false){
                        GameLoop.beenHere[2][6] = true;
                        Level6Area();
                    } else {
                       RepeatedArea();
                    };
                case 7 : 
                    if (GameLoop.beenHere[2][7] == false){
                        GameLoop.beenHere[2][7] = true;
                        Level5Area();
                    } else {
                       RepeatedArea();
                    };
                case 8 : 
                    if (GameLoop.beenHere[2][8] == false){
                        GameLoop.beenHere[2][8] = true;
                        Level6Area();
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (GameLoop.beenHere[2][9] == false){
                        GameLoop.beenHere[2][9] = true;
                        Level7Area();
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (GameLoop.beenHere[2][10] == false){
                        GameLoop.beenHere[2][10] = true;
                        Level8Area();
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (GameLoop.beenHere[2][11] == false){
                        GameLoop.beenHere[2][11] = true;
                        Level9Area();
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (GameLoop.beenHere[2][12] == false){
                        GameLoop.beenHere[2][12] = true;
                        Level10Area();
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (GameLoop.beenHere[2][13] == false){
                        GameLoop.beenHere[2][13] = true;
                        Level11Area();
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (GameLoop.beenHere[2][14] == false){
                        GameLoop.beenHere[2][14] = true;
                        Level12Area();
                    } else {
                       RepeatedArea();
                    };
            }
            
        } else if (GameLoop.xPosition == 3){
            switch (GameLoop.yPosition){
                case 0 : 
                    if (GameLoop.beenHere[3][0] == false){
                        GameLoop.beenHere[3][0] = true;
                        Level11Area();
                    } else {
                        RepeatedArea();
                    };
                case 1 :  
                    if (GameLoop.beenHere[3][1] == false){
                    //this checks to see if we have already been here
                        GameLoop.beenHere[3][1] = true;
                        //this is where we put the encounter that happens in this location
                        Level10Area();
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (GameLoop.beenHere[3][2] == false){
                        GameLoop.beenHere[3][2] = true;
                        Level9Area();
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (GameLoop.beenHere[3][3] == false){
                        GameLoop.beenHere[3][3] = true;
                        Level8Area();
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (GameLoop.beenHere[3][4] == false){
                        GameLoop.beenHere[3][4] = true;
                        Level7Area();
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (GameLoop.beenHere[3][5] == false){
                        GameLoop.beenHere[3][5] = true;
                        Level6Area();
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (GameLoop.beenHere[3][6] == false){
                        GameLoop.beenHere[3][6] = true;
                        Level5Area();
                    } else {
                       RepeatedArea();
                    };
                case 7 : 
                    if (GameLoop.beenHere[3][7] == false){
                        GameLoop.beenHere[3][7] = true;
                        Level4Area();
                    } else {
                       RepeatedArea();
                    };
                case 8 : 
                    if (GameLoop.beenHere[3][8] == false){
                        GameLoop.beenHere[3][8] = true;
                        Level5Area();
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (GameLoop.beenHere[3][9] == false){
                        GameLoop.beenHere[3][9] = true;
                        Level6Area();
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (GameLoop.beenHere[3][10] == false){
                        GameLoop.beenHere[3][10] = true;
                        Level7Area();
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (GameLoop.beenHere[3][11] == false){
                        GameLoop.beenHere[3][11] = true;
                        Level8Area();
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (GameLoop.beenHere[3][12] == false){
                        GameLoop.beenHere[3][12] = true;
                        Level9Area();
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (GameLoop.beenHere[3][13] == false){
                        GameLoop.beenHere[3][13] = true;
                        Level10Area();
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (GameLoop.beenHere[3][14] == false){
                        GameLoop.beenHere[3][14] = true;
                        Level11Area();
                    } else {
                       RepeatedArea();
                    };
            } 
        } else if (GameLoop.xPosition == 4){
            switch (GameLoop.yPosition){
                case 0 : 
                    if (GameLoop.beenHere[4][0] == false){
                        GameLoop.beenHere[4][0] = true;
                        Level10Area();
                    } else {
                        RepeatedArea();
                    };
                case 1 :  
                    if (GameLoop.beenHere[4][1] == false){
                    //this checks to see if we have already been here
                        GameLoop.beenHere[4][1] = true;
                        //this is where we put the encounter that happens in this location
                        Level9Area();
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (GameLoop.beenHere[4][2] == false){
                        GameLoop.beenHere[4][2] = true;
                        Level8Area();
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (GameLoop.beenHere[4][3] == false){
                        GameLoop.beenHere[4][3] = true;
                        Level7Area();
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (GameLoop.beenHere[4][4] == false){
                        GameLoop.beenHere[4][4] = true;
                        Level6Area();
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (GameLoop.beenHere[4][5] == false){
                        GameLoop.beenHere[4][5] = true;
                        Level5Area();
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (GameLoop.beenHere[4][6] == false){
                        GameLoop.beenHere[4][6] = true;
                        Level4Area();
                    } else {
                       RepeatedArea();
                    };
                case 7 : 
                    if (GameLoop.beenHere[4][7] == false){
                        GameLoop.beenHere[4][7] = true;
                        Level3Area();
                    } else {
                       RepeatedArea();
                    };
                case 8 : 
                    if (GameLoop.beenHere[4][8] == false){
                        GameLoop.beenHere[4][8] = true;
                        Level4Area();
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (GameLoop.beenHere[4][9] == false){
                        GameLoop.beenHere[4][9] = true;
                        Level5Area();
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (GameLoop.beenHere[4][10] == false){
                        GameLoop.beenHere[4][10] = true;
                        Level6Area();
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (GameLoop.beenHere[4][11] == false){
                        GameLoop.beenHere[4][11] = true;
                        Level7Area();
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (GameLoop.beenHere[4][12] == false){
                        GameLoop.beenHere[4][12] = true;
                        Level8Area();
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (GameLoop.beenHere[4][13] == false){
                        GameLoop.beenHere[4][13] = true;
                        Level9Area();
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (GameLoop.beenHere[4][14] == false){
                        GameLoop.beenHere[4][14] = true;
                        Level10Area();
                    } else {
                       RepeatedArea();
                    };
            }
        } else if (GameLoop.xPosition == 5){
            switch (GameLoop.yPosition){
                case 0 : 
                    if (GameLoop.beenHere[5][0] == false){
                        GameLoop.beenHere[5][0] = true;
                        Level9Area();
                    } else {
                        RepeatedArea();
                    };
                case 1 :  
                    if (GameLoop.beenHere[5][1] == false){
                    //this checks to see if we have already been here
                        GameLoop.beenHere[5][1] = true;
                        //this is where we put the encounter that happens in this location
                        Level8Area();
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (GameLoop.beenHere[5][2] == false){
                        GameLoop.beenHere[5][2] = true;
                        Level7Area();
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (GameLoop.beenHere[5][3] == false){
                        GameLoop.beenHere[5][3] = true;
                        Level6Area();
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (GameLoop.beenHere[5][4] == false){
                        GameLoop.beenHere[5][4] = true;
                        Level5Area();
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (GameLoop.beenHere[5][5] == false){
                        GameLoop.beenHere[5][5] = true;
                        Level4Area();
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (GameLoop.beenHere[5][6] == false){
                        GameLoop.beenHere[5][6] = true;
                        Level3Area();
                    } else {
                       RepeatedArea();
                    };
                case 7 : 
                    if (GameLoop.beenHere[5][7] == false){
                        GameLoop.beenHere[5][7] = true;
                        Level2Area();
                    } else {
                       RepeatedArea();
                    };
                case 8 : 
                    if (GameLoop.beenHere[5][8] == false){
                        GameLoop.beenHere[5][8] = true;
                        Level3Area();
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (GameLoop.beenHere[5][9] == false){
                        GameLoop.beenHere[5][9] = true;
                        Level4Area();
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (GameLoop.beenHere[5][10] == false){
                        GameLoop.beenHere[5][10] = true;
                        Level5Area();
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (GameLoop.beenHere[5][11] == false){
                        GameLoop.beenHere[5][11] = true;
                        Level6Area();
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (GameLoop.beenHere[5][12] == false){
                        GameLoop.beenHere[5][12] = true;
                        Level7Area();
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (GameLoop.beenHere[5][13] == false){
                        GameLoop.beenHere[5][13] = true;
                        Level8Area();
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (GameLoop.beenHere[5][14] == false){
                        GameLoop.beenHere[5][14] = true;
                        Level9Area();
                    } else {
                       RepeatedArea();
                    };
            }
        } else if (GameLoop.xPosition == 6){
            switch (GameLoop.yPosition){
                case 0 : 
                    if (GameLoop.beenHere[6][0] == false){
                        GameLoop.beenHere[6][0] = true;
                        Level8Area();
                    } else {
                        RepeatedArea();
                    };
                case 1 :  
                    if (GameLoop.beenHere[6][1] == false){
                    //this checks to see if we have already been here
                        GameLoop.beenHere[6][1] = true;
                        //this is where we put the encounter that happens in this location
                        Level7Area();
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (GameLoop.beenHere[6][2] == false){
                        GameLoop.beenHere[6][2] = true;
                        Level6Area();
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (GameLoop.beenHere[6][3] == false){
                        GameLoop.beenHere[6][3] = true;
                        Level5Area();
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (GameLoop.beenHere[6][4] == false){
                        GameLoop.beenHere[6][4] = true;
                        Level4Area();
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (GameLoop.beenHere[6][5] == false){
                        GameLoop.beenHere[6][5] = true;
                        Level3Area();
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (GameLoop.beenHere[6][6] == false){
                        GameLoop.beenHere[6][6] = true;
                        Level2Area();
                    } else {
                       RepeatedArea();
                    };
                case 7 : 
                    if (GameLoop.beenHere[6][7] == false){
                        GameLoop.beenHere[6][7] = true;
                        Level1Area();
                    } else {
                       RepeatedArea();
                    };
                case 8 : 
                    if (GameLoop.beenHere[6][8] == false){
                        GameLoop.beenHere[6][8] = true;
                        Level2Area();
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (GameLoop.beenHere[6][9] == false){
                        GameLoop.beenHere[6][9] = true;
                        Level3Area();
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (GameLoop.beenHere[6][10] == false){
                        GameLoop.beenHere[6][10] = true;
                        Level4Area();
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (GameLoop.beenHere[6][11] == false){
                        GameLoop.beenHere[6][11] = true;
                        Level5Area();
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (GameLoop.beenHere[6][12] == false){
                        GameLoop.beenHere[6][12] = true;
                        Level6Area();
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (GameLoop.beenHere[6][13] == false){
                        GameLoop.beenHere[6][13] = true;
                        Level7Area();
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (GameLoop.beenHere[6][14] == false){
                        GameLoop.beenHere[6][14] = true;
                        Level8Area();
                    } else {
                       RepeatedArea();
                    };
            }
        } else if (GameLoop.xPosition == 7){
            switch (GameLoop.yPosition){
                case 0 : 
                    if (GameLoop.beenHere[7][0] == false){
                        GameLoop.beenHere[7][0] = true;
                        Level7Area();
                    } else {
                        RepeatedArea();
                    };
                case 1 :  
                    if (GameLoop.beenHere[7][1] == false){
                        Shop5.Shop();
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (GameLoop.beenHere[7][2] == false){
                        Shop4.Shop();
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (GameLoop.beenHere[7][3] == false){
                        Shop3.Shop();
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (GameLoop.beenHere[7][4] == false){
                        Shop2.Shop();
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (GameLoop.beenHere[7][5] == false){
                        Shop1.Shop();
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (GameLoop.beenHere[7][6] == false){
                        GameLoop.beenHere[7][6] = true;
                        Level1Area();
                    } else {
                       RepeatedArea();
                    };
                case 7 :
                        System.out.println("You recognize this as the place your journey began. You feel revitilized by returning here. ");
                        GameLoop.health = 100;
                        if (GameLoop.numberOfBossesDefeated == 1) {
                            System.out.println("You notice that where there was nothing but grass before, there is now a pedestal. You hear a booming voice echo across the area. ");
                            System.out.println("You have defeated one of the four elemental guardians of this plane. Defeat the other three and I will give you the chance to win your freedom by facing me in battle. ");
                        }
                        if (GameLoop.numberOfBossesDefeated == 2) {
                            System.out.println("You notice that where there was nothing but grass before, there are now two pedestals. You hear a booming voice echo across the area. ");
                            System.out.println("You have defeated two of the four elemental guardians of this plane. Defeat the other two and I will give you the chance to win your freedom by facing me in battle. ");
                        }
                        if (GameLoop.numberOfBossesDefeated == 3) {
                            System.out.println("You notice that where there was nothing but grass before, there are now three pedestals. You hear a booming voice echo across the area. ");
                            System.out.println("You have defeated three of the four elemental guardians of this plane. Defeat the other one and I will give you the chance to win your freedom by facing me in battle. ");
                        }
                        if (GameLoop.numberOfBossesDefeated == 4) {
                            System.out.println("You notice that where there was nothing but grass before, there are now four pedestals. You hear a booming voice echo across the area. ");
                            System.out.println("You have defeated all of the elemental guardians of this plane. You have proven yourself worthy and now I will give you a chance to face me in a fight to the death to earn your freedom. ");
                            FinalBoss.FinalBossEncounter();
                        }
                        GameLoop.MapMovement();
                case 8 : 
                    if (GameLoop.beenHere[7][8] == false){
                        GameLoop.beenHere[7][8] = true;
                        Level1Area();
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (GameLoop.beenHere[7][9] == false){
                        Shop1.Shop();
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (GameLoop.beenHere[7][10] == false){
                        Shop2.Shop();
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (GameLoop.beenHere[7][11] == false){
                        Shop3.Shop();
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (GameLoop.beenHere[7][12] == false){
                        Shop4.Shop();
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (GameLoop.beenHere[7][13] == false){
                        Shop5.Shop();
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (GameLoop.beenHere[7][14] == false){
                        GameLoop.beenHere[7][14] = true;
                        Level7Area();
                    } else {
                       RepeatedArea();
                    };
            }
        } else if (GameLoop.xPosition == 8){
            switch (GameLoop.yPosition){
                case 0 : 
                    if (GameLoop.beenHere[8][0] == false){
                        GameLoop.beenHere[8][0] = true;
                        Level8Area();
                    } else {
                        RepeatedArea();
                    };
                case 1 :  
                    if (GameLoop.beenHere[8][1] == false){
                    //this checks to see if we have already been here
                        GameLoop.beenHere[8][1] = true;
                        //this is where we put the encounter that happens in this location
                        Level7Area();
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (GameLoop.beenHere[8][2] == false){
                        GameLoop.beenHere[8][2] = true;
                        Level6Area();
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (GameLoop.beenHere[8][3] == false){
                        GameLoop.beenHere[8][3] = true;
                        Level5Area();
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (GameLoop.beenHere[8][4] == false){
                        GameLoop.beenHere[8][4] = true;
                        Level4Area();
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (GameLoop.beenHere[8][5] == false){
                        GameLoop.beenHere[8][5] = true;
                        Level3Area();
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (GameLoop.beenHere[8][6] == false){
                        GameLoop.beenHere[8][6] = true;
                        Level2Area();
                    } else {
                       RepeatedArea();
                    };
                case 7 : 
                    if (GameLoop.beenHere[8][7] == false){
                        GameLoop.beenHere[8][7] = true;
                        Level1Area();
                    } else {
                       RepeatedArea();
                    };
                case 8 : 
                    if (GameLoop.beenHere[8][8] == false){
                        GameLoop.beenHere[8][8] = true;
                        Level2Area();
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (GameLoop.beenHere[8][9] == false){
                        GameLoop.beenHere[8][9] = true;
                        Level3Area();
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (GameLoop.beenHere[8][10] == false){
                        GameLoop.beenHere[8][10] = true;
                        Level4Area();
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (GameLoop.beenHere[8][11] == false){
                        GameLoop.beenHere[8][11] = true;
                        Level5Area();
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (GameLoop.beenHere[8][12] == false){
                        GameLoop.beenHere[8][12] = true;
                        Level6Area();
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (GameLoop.beenHere[8][13] == false){
                        GameLoop.beenHere[8][13] = true;
                        Level7Area();
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (GameLoop.beenHere[8][14] == false){
                        GameLoop.beenHere[8][14] = true;
                        Level8Area();
                    } else {
                       RepeatedArea();
                    };
            }
        } else if (GameLoop.xPosition == 9){
            switch (GameLoop.yPosition){
                case 0 : 
                    if (GameLoop.beenHere[9][0] == false){
                        GameLoop.beenHere[9][0] = true;
                        Level9Area();
                    } else {
                        RepeatedArea();
                    };
                case 1 :  
                    if (GameLoop.beenHere[9][1] == false){
                    //this checks to see if we have already been here
                        GameLoop.beenHere[9][1] = true;
                        //this is where we put the encounter that happens in this location
                        Level8Area();
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (GameLoop.beenHere[9][2] == false){
                        GameLoop.beenHere[9][2] = true;
                        Level7Area();
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (GameLoop.beenHere[9][3] == false){
                        GameLoop.beenHere[9][3] = true;
                        Level6Area();
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (GameLoop.beenHere[9][4] == false){
                        GameLoop.beenHere[9][4] = true;
                        Level5Area();
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (GameLoop.beenHere[9][5] == false){
                        GameLoop.beenHere[9][5] = true;
                        Level4Area();
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (GameLoop.beenHere[9][6] == false){
                        GameLoop.beenHere[9][6] = true;
                        Level3Area();
                    } else {
                       RepeatedArea();
                    };
                case 7 : 
                    if (GameLoop.beenHere[9][7] == false){
                        GameLoop.beenHere[9][7] = true;
                        Level2Area();
                    } else {
                       RepeatedArea();
                    };
                case 8 : 
                    if (GameLoop.beenHere[9][8] == false){
                        GameLoop.beenHere[9][8] = true;
                        Level3Area();
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (GameLoop.beenHere[9][9] == false){
                        GameLoop.beenHere[9][9] = true;
                        Level4Area();
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (GameLoop.beenHere[9][10] == false){
                        GameLoop.beenHere[9][10] = true;
                        Level5Area();
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (GameLoop.beenHere[9][11] == false){
                        GameLoop.beenHere[9][11] = true;
                        Level6Area();
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (GameLoop.beenHere[9][12] == false){
                        GameLoop.beenHere[9][12] = true;
                        Level7Area();
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (GameLoop.beenHere[9][13] == false){
                        GameLoop.beenHere[9][13] = true;
                        Level8Area();
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (GameLoop.beenHere[9][14] == false){
                        GameLoop.beenHere[9][14] = true;
                        Level9Area();
                    } else {
                       RepeatedArea();
                    };
            }
        } else if (GameLoop.xPosition == 10){
            switch (GameLoop.yPosition){
                case 0 : 
                    if (GameLoop.beenHere[10][0] == false){
                        GameLoop.beenHere[10][0] = true;
                        Level10Area();
                    } else {
                        RepeatedArea();
                    };
                case 1 :  
                    if (GameLoop.beenHere[10][1] == false){
                    //this checks to see if we have already been here
                        GameLoop.beenHere[10][1] = true;
                        //this is where we put the encounter that happens in this location
                        Level9Area();
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (GameLoop.beenHere[10][2] == false){
                        GameLoop.beenHere[10][2] = true;
                        Level8Area();
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (GameLoop.beenHere[10][3] == false){
                        GameLoop.beenHere[10][3] = true;
                        Level7Area();
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (GameLoop.beenHere[10][4] == false){
                        GameLoop.beenHere[10][4] = true;
                        Level6Area();
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (GameLoop.beenHere[10][5] == false){
                        GameLoop.beenHere[10][5] = true;
                        Level5Area();
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (GameLoop.beenHere[10][6] == false){
                        GameLoop.beenHere[10][6] = true;
                        Level4Area();
                    } else {
                       RepeatedArea();
                    };
                case 7 : 
                    if (GameLoop.beenHere[10][7] == false){
                        GameLoop.beenHere[10][7] = true;
                        Level3Area();
                    } else {
                       RepeatedArea();
                    };
                case 8 : 
                    if (GameLoop.beenHere[10][8] == false){
                        GameLoop.beenHere[10][8] = true;
                        Level4Area();
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (GameLoop.beenHere[10][9] == false){
                        GameLoop.beenHere[10][9] = true;
                        Level5Area();
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (GameLoop.beenHere[10][10] == false){
                        GameLoop.beenHere[10][10] = true;
                        Level6Area();
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (GameLoop.beenHere[10][11] == false){
                        GameLoop.beenHere[10][11] = true;
                        Level7Area();
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (GameLoop.beenHere[10][12] == false){
                        GameLoop.beenHere[10][12] = true;
                        Level8Area();
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (GameLoop.beenHere[10][13] == false){
                        GameLoop.beenHere[10][13] = true;
                        Level9Area();
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (GameLoop.beenHere[10][14] == false){
                        GameLoop.beenHere[10][14] = true;
                        Level10Area();
                    } else {
                       RepeatedArea();
                    };
            }
        } else if (GameLoop.xPosition == 11){
            switch (GameLoop.yPosition){
                case 0 : 
                    if (GameLoop.beenHere[11][0] == false){
                        GameLoop.beenHere[11][0] = true;
                        Level11Area();
                    } else {
                        RepeatedArea();
                    };
                case 1 :  
                    if (GameLoop.beenHere[11][1] == false){
                    //this checks to see if we have already been here
                        GameLoop.beenHere[11][1] = true;
                        //this is where we put the encounter that happens in this location
                        Level10Area();
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (GameLoop.beenHere[11][2] == false){
                        GameLoop.beenHere[11][2] = true;
                        Level9Area();
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (GameLoop.beenHere[11][3] == false){
                        GameLoop.beenHere[11][3] = true;
                        Level8Area();
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (GameLoop.beenHere[11][4] == false){
                        GameLoop.beenHere[11][4] = true;
                        Level7Area();
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (GameLoop.beenHere[11][5] == false){
                        GameLoop.beenHere[11][5] = true;
                        Level6Area();
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (GameLoop.beenHere[11][6] == false){
                        GameLoop.beenHere[11][6] = true;
                        Level5Area();
                    } else {
                       RepeatedArea();
                    };
                case 7 : 
                    if (GameLoop.beenHere[11][7] == false){
                        GameLoop.beenHere[11][7] = true;
                        Level4Area();
                    } else {
                       RepeatedArea();
                    };
                case 8 : 
                    if (GameLoop.beenHere[11][8] == false){
                        GameLoop.beenHere[11][8] = true;
                        Level5Area();
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (GameLoop.beenHere[11][9] == false){
                        GameLoop.beenHere[11][9] = true;
                        Level6Area();
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (GameLoop.beenHere[11][10] == false){
                        GameLoop.beenHere[11][10] = true;
                        Level7Area();
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (GameLoop.beenHere[11][11] == false){
                        GameLoop.beenHere[11][11] = true;
                        Level8Area();
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (GameLoop.beenHere[11][12] == false){
                        GameLoop.beenHere[11][12] = true;
                        Level9Area();
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (GameLoop.beenHere[11][13] == false){
                        GameLoop.beenHere[11][13] = true;
                        Level10Area();
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (GameLoop.beenHere[11][14] == false){
                        GameLoop.beenHere[11][14] = true;
                        Level11Area();
                    } else {
                       RepeatedArea();
                    };
            }
        } else if (GameLoop.xPosition == 12){
            switch (GameLoop.yPosition){
                case 0 : 
                    if (GameLoop.beenHere[12][0] == false){
                        GameLoop.beenHere[12][0] = true;
                        Level12Area();
                    } else {
                        RepeatedArea();
                    };
                case 1 :  
                    if (GameLoop.beenHere[12][1] == false){
                    //this checks to see if we have already been here
                        GameLoop.beenHere[12][1] = true;
                        //this is where we put the encounter that happens in this location
                        Level11Area();
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (GameLoop.beenHere[12][2] == false){
                        GameLoop.beenHere[12][2] = true;
                        Level10Area();
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (GameLoop.beenHere[12][3] == false){
                        GameLoop.beenHere[12][3] = true;
                        Level9Area();
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (GameLoop.beenHere[12][4] == false){
                        GameLoop.beenHere[12][4] = true;
                        Level8Area();
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (GameLoop.beenHere[12][5] == false){
                        GameLoop.beenHere[12][5] = true;
                        Level7Area();
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (GameLoop.beenHere[12][6] == false){
                        GameLoop.beenHere[12][6] = true;
                        Level6Area();
                    } else {
                       RepeatedArea();
                    };
                case 7 : 
                    if (GameLoop.beenHere[12][7] == false){
                        GameLoop.beenHere[12][7] = true;
                        Level5Area();
                    } else {
                       RepeatedArea();
                    };
                case 8 : 
                    if (GameLoop.beenHere[12][8] == false){
                        GameLoop.beenHere[12][8] = true;
                        Level6Area();
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (GameLoop.beenHere[12][9] == false){
                        GameLoop.beenHere[12][9] = true;
                        Level7Area();
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (GameLoop.beenHere[12][10] == false){
                        GameLoop.beenHere[12][10] = true;
                        Level8Area();
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (GameLoop.beenHere[12][11] == false){
                        GameLoop.beenHere[12][11] = true;
                        Level9Area();
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (GameLoop.beenHere[12][12] == false){
                        GameLoop.beenHere[12][12] = true;
                        Level10Area();
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (GameLoop.beenHere[12][13] == false){
                        GameLoop.beenHere[12][13] = true;
                        Level11Area();
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (GameLoop.beenHere[12][14] == false){
                        GameLoop.beenHere[12][14] = true;
                        Level12Area();
                    } else {
                       RepeatedArea();
                    };
            }
        } else if (GameLoop.xPosition == 13){
            switch (GameLoop.yPosition){
                case 0 : 
                    if (GameLoop.beenHere[13][0] == false){
                        GameLoop.beenHere[13][0] = true;
                        Level13Area();
                    } else {
                        RepeatedArea();
                    };
                case 1 :  
                    if (GameLoop.beenHere[13][1] == false){
                    //this checks to see if we have already been here
                        GameLoop.beenHere[13][1] = true;
                        //this is where we put the encounter that happens in this location
                        Level12Area();
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (GameLoop.beenHere[13][2] == false){
                        GameLoop.beenHere[13][2] = true;
                        Level11Area();
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (GameLoop.beenHere[13][3] == false){
                        GameLoop.beenHere[13][3] = true;
                        Level10Area();
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (GameLoop.beenHere[13][4] == false){
                        GameLoop.beenHere[13][4] = true;
                        Level9Area();
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (GameLoop.beenHere[13][5] == false){
                        GameLoop.beenHere[13][5] = true;
                        Level8Area();
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (GameLoop.beenHere[13][6] == false){
                        GameLoop.beenHere[13][6] = true;
                        Level7Area();
                    } else {
                       RepeatedArea();
                    };
                case 7 : 
                    if (GameLoop.beenHere[13][7] == false){
                        GameLoop.beenHere[13][7] = true;
                        Level6Area();
                    } else {
                       RepeatedArea();
                    };
                case 8 : 
                    if (GameLoop.beenHere[13][8] == false){
                        GameLoop.beenHere[13][8] = true;
                        Level7Area();
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (GameLoop.beenHere[13][9] == false){
                        GameLoop.beenHere[13][9] = true;
                        Level8Area();
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (GameLoop.beenHere[13][10] == false){
                        GameLoop.beenHere[13][10] = true;
                        Level9Area();
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (GameLoop.beenHere[13][11] == false){
                        GameLoop.beenHere[13][11] = true;
                        Level10Area();
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (GameLoop.beenHere[13][12] == false){
                        GameLoop.beenHere[13][12] = true;
                        Level11Area();
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (GameLoop.beenHere[13][13] == false){
                        GameLoop.beenHere[13][13] = true;
                        Level12Area();
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (GameLoop.beenHere[13][14] == false){
                        GameLoop.beenHere[13][14] = true;
                        Level13Area();
                    } else {
                       RepeatedArea();
                    };
                }
        } else if (GameLoop.xPosition == 14){
            switch (GameLoop.yPosition){
                case 0 : 
                    if (GameLoop.beenHere[14][0] == false){
                        GameLoop.beenHere[14][0] = true;
                        EarthElemental.Encounter();
                    } else {
                        RepeatedArea();
                    };
                case 1 :  
                    if (GameLoop.beenHere[14][1] == false){
                    //this checks to see if we have already been here
                        GameLoop.beenHere[14][1] = true;
                        //this is where we put the encounter that happens in this location
                        Level13Area();
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (GameLoop.beenHere[14][2] == false){
                        GameLoop.beenHere[14][2] = true;
                        Level12Area();
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (GameLoop.beenHere[14][3] == false){
                        GameLoop.beenHere[14][3] = true;
                        Level11Area();
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (GameLoop.beenHere[14][4] == false){
                        GameLoop.beenHere[14][4] = true;
                        Level10Area();
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (GameLoop.beenHere[14][5] == false){
                        GameLoop.beenHere[14][5] = true;
                        Level9Area();
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (GameLoop.beenHere[14][6] == false){
                        GameLoop.beenHere[14][6] = true;
                        Level8Area();
                    } else {
                       RepeatedArea();
                    };
                case 7 : 
                    if (GameLoop.beenHere[14][7] == false){
                        GameLoop.beenHere[14][7] = true;
                        Level7Area();
                    } else {
                       RepeatedArea();
                    };
                case 8 : 
                    if (GameLoop.beenHere[14][8] == false){
                        GameLoop.beenHere[14][8] = true;
                        Level8Area();
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (GameLoop.beenHere[14][9] == false){
                        GameLoop.beenHere[14][9] = true;
                        Level9Area();
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (GameLoop.beenHere[14][10] == false){
                        GameLoop.beenHere[14][10] = true;
                        Level10Area();
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (GameLoop.beenHere[14][11] == false){
                        GameLoop.beenHere[14][11] = true;
                        Level11Area();
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (GameLoop.beenHere[14][12] == false){
                        GameLoop.beenHere[14][12] = true;
                        Level12Area();
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (GameLoop.beenHere[14][13] == false){
                        GameLoop.beenHere[14][13] = true;
                        Level13Area();
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (GameLoop.beenHere[14][14] == false){
                        GameLoop.beenHere[14][14] = true;
                        AirElemental.Encounter();
                    } else {
                       RepeatedArea();
                    };
                
            }
        }
    }

    public static void Level1Area(){
        int encounterNumber = rand.nextInt(100);
        if (encounterNumber < 60) {
            SmallSlime.SmallSlimeEncounter();
        } else {
            Treasure1.Treasure();
        }
    }

    public static void Level2Area(){
        int encounterNumber = rand.nextInt(100);
        if (encounterNumber < 60) {
            Goblin1.Goblin1Encounter();
        } else if (encounterNumber < 90) {
            SmallSlime.SmallSlimeEncounter();
        } else {
            Treasure1.Treasure();
        }
    }

    public static void Level3Area(){
        int encounterNumber = rand.nextInt(100);
        if (encounterNumber < 40) {
            Goblin1.Goblin1Encounter();
        } else if (encounterNumber < 70) {
            Goblin2.Goblin2Encounter();
        } else if (encounterNumber < 80) {
            Treasure2.Treasure();
        } else if (encounterNumber < 90) {
            MediumSlime.MediumSlimeEncounter();
        } else {
            Troll1.Troll1Encounter();
        }
    }

    public static void Level4Area(){
        int encounterNumber = rand.nextInt(100);
        if (encounterNumber < 50) {
            Goblin2.Goblin2Encounter();
        } else if (encounterNumber < 72) {
            MediumSlime.MediumSlimeEncounter();
        } else if (encounterNumber < 95) {
            Troll1.Troll1Encounter();
        } else {
            Treasure2.Treasure();
        }
    }

    public static void Level5Area(){
        int encounterNumber = rand.nextInt(100);
        if (encounterNumber < 40) {
            Troll1.Troll1Encounter();
        } else if (encounterNumber < 70) {
            Goblin2.Goblin2Encounter();
        } else if (encounterNumber < 80) {
            MediumSlime.MediumSlimeEncounter();
        } else if (encounterNumber < 90) {
            Treasure2.Treasure();
        } else {
            TrappedTreasure.Treasure();
        }
    }

    public static void Level6Area(){
        int encounterNumber = rand.nextInt(100);
        if (encounterNumber < 35) {
            Troll1.Troll1Encounter();
        } else if (encounterNumber < 60) {
            Goblin3.Goblin3Encounter();
        } else if (encounterNumber < 80) {
            Troll2.Troll2Encounter(); 
        } else if (encounterNumber < 95) {
            TrappedTreasure.Treasure();
        } else {
            Treasure2.Treasure();
        }
    }

    public static void Level7Area(){
        int encounterNumber = rand.nextInt(100);
        if (encounterNumber < 55) {
            Troll2.Troll2Encounter();
        } else if (encounterNumber < 90) {
            Goblin3.Goblin3Encounter();
        } else {
            Treasure3.Treasure();
        }
    }

    public static void Level8Area(){
        int encounterNumber = rand.nextInt(100);
        if (encounterNumber < 55) {
            Goblin3.Goblin3Encounter();
        } else if (encounterNumber < 90) {
            Troll2.Troll2Encounter();
        } else {
            Treasure3.Treasure();
        }
    }

    public static void Level9Area(){
        int encounterNumber = rand.nextInt(100);
        if (encounterNumber < 55) {
            Troll3.Troll3Encounter();
        } else if (encounterNumber < 90) {
            Goblin4.Goblin4Encounter();
        } else {
            Treasure4.Treasure();
        }
    }

    public static void Level10Area(){
        int encounterNumber = rand.nextInt(100);
        if (encounterNumber < 55) {
            Goblin4.Goblin4Encounter();
        } else if (encounterNumber < 90) {
            Troll3.Troll3Encounter();
        } else {
            Treasure4.Treasure();
        }
    }

    public static void Level11Area(){
        int encounterNumber = rand.nextInt(100);
        if (encounterNumber < 55) {
            Goblin4.Goblin4Encounter();
        } else if (encounterNumber < 90) {
            Troll4.Troll4Encounter();
        } else {
            Treasure5.Treasure();
        }
    }

    public static void Level12Area(){
        int encounterNumber = rand.nextInt(100);
        if (encounterNumber < 70){
            Goblin5.Goblin5Encounter();
        } else {
            Troll5.Troll5Encounter();
        }
    }

    public static void Level13Area(){
        int encounterNumber = rand.nextInt(100); 
        if (encounterNumber < 70){
            Troll5.Troll5Encounter();
        } else {
            Goblin5.Goblin5Encounter();
        }
    }

    public static void RepeatedArea(){
        System.out.println("You recognize this area. There isn't anything left to do here. ");
        GameLoop.MapMovement();
    }
}