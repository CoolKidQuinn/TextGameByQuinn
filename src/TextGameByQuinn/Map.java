package textgamebyquinn;


import textgamebyquinn.AirElemental;
import textgamebyquinn.EarthElemental;
import textgamebyquinn.FireElemental;
import textgamebyquinn.WaterElemental;
import textgamebyquinn.Troll1;
import textgamebyquinn.Troll2;
import textgamebyquinn.Troll3;
import textgamebyquinn.Troll4;
import textgamebyquinn.Troll5;
import textgamebyquinn.MediumSlime;
import textgamebyquinn.SmallSlime;
import textgamebyquinn.TrappedTreasure;
import textgamebyquinn.Treasure1;
import textgamebyquinn.Treasure2;
import textgamebyquinn.Treasure3;
import textgamebyquinn.Treasure4;
import textgamebyquinn.Treasure5;
import textgamebyquinn.Shop1;
import textgamebyquinn.Shop2;
import textgamebyquinn.Shop3;
import textgamebyquinn.Shop4;
import textgamebyquinn.Shop5;
import textgamebyquinn.Goblin1;
import textgamebyquinn.Goblin2;
import textgamebyquinn.Goblin3;
import textgamebyquinn.Goblin4;
import textgamebyquinn.Goblin5;
import textgamebyquinn.GameLoop;

public class Map {
    public static void CheckPosition(){
        //this will check the position of our character after moving
        //each possible position will have a different encounter
            //these encounters can be treasure, enemies, weapons, etc.
        if ((GameLoop.xPosition > 14) || (GameLoop.xPosition < 1) || (GameLoop.yPosition > 14) || (GameLoop.yPosition < 1)){
            System.out.println("There is a wall there. ");
            GameLoop.MapMovement();
            if (GameLoop.xPosition > 14){
                GameLoop.xPosition = 14;
            } else if (GameLoop.xPosition < 1){
                GameLoop.xPosition = 1;
            } else if (GameLoop.yPosition > 14){
                GameLoop.yPosition = 14;
            } else {
                GameLoop.yPosition = 1;
            }
            //this stops our character from leaving the map we have programmed
        } else if (GameLoop.xPosition == 1){
            switch (GameLoop.yPosition){
                case 1 :  
                    if (GameLoop.beenHere[1][1] == false){
                    //this checks to see if we have already been here
                        GameLoop.beenHere[1][1] = true;
                        //this will tell the code that we have now been here
    
                        //this is where we put the encounter that happens in this location
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (GameLoop.beenHere[1][2] == false){
                        GameLoop.beenHere[1][2] = true;
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (GameLoop.beenHere[1][3] == false){
                        GameLoop.beenHere[1][3] = true;
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (GameLoop.beenHere[1][4] == false){
                        GameLoop.beenHere[1][4] = true;
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (GameLoop.beenHere[1][5] == false){
                        GameLoop.beenHere[1][5] = true;
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (GameLoop.beenHere[1][6] == false){
                        GameLoop.beenHere[1][6] = true;
                    } else {
                       RepeatedArea();
                    };
                case 7 : 
                    if (GameLoop.beenHere[1][7] == false){
                        GameLoop.beenHere[1][7] = true;
                    } else {
                       RepeatedArea();
                    };
                case 8 : 
                    if (GameLoop.beenHere[1][8] == false){
                        GameLoop.beenHere[1][8] = true;
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (GameLoop.beenHere[1][9] == false){
                        GameLoop.beenHere[1][9] = true;
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (GameLoop.beenHere[1][10] == false){
                        GameLoop.beenHere[1][10] = true;
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (GameLoop.beenHere[1][11] == false){
                        GameLoop.beenHere[1][11] = true;
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (GameLoop.beenHere[1][12] == false){
                        GameLoop.beenHere[1][12] = true;
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (GameLoop.beenHere[1][13] == false){
                        GameLoop.beenHere[1][13] = true;
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (GameLoop.beenHere[1][14] == false){
                        GameLoop.beenHere[1][14] = true;
                    } else {
                       RepeatedArea();
                    };
            } 

        } else if (GameLoop.xPosition == 2){
            switch (GameLoop.yPosition){
                case 1 :  
                    if (GameLoop.beenHere[2][1] == false){
                    //this checks to see if we have already been here
                        GameLoop.beenHere[2][1] = true;
                        //this will tell the code that we have now been here
    
                        //this is where we put the encounter that happens in this location
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (GameLoop.beenHere[2][2] == false){
                        GameLoop.beenHere[2][2] = true;
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (GameLoop.beenHere[2][3] == false){
                        GameLoop.beenHere[2][3] = true;
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (GameLoop.beenHere[2][4] == false){
                        GameLoop.beenHere[2][4] = true;
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (GameLoop.beenHere[2][5] == false){
                        GameLoop.beenHere[2][5] = true;
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (GameLoop.beenHere[2][6] == false){
                        GameLoop.beenHere[2][6] = true;
                    } else {
                       RepeatedArea();
                    };
                case 7 : 
                    if (GameLoop.beenHere[2][7] == false){
                        GameLoop.beenHere[2][7] = true;
                    } else {
                       RepeatedArea();
                    };
                case 8 : 
                    if (GameLoop.beenHere[2][8] == false){
                        GameLoop.beenHere[2][8] = true;
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (GameLoop.beenHere[2][9] == false){
                        GameLoop.beenHere[2][9] = true;
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (GameLoop.beenHere[2][10] == false){
                        GameLoop.beenHere[2][10] = true;
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (GameLoop.beenHere[2][11] == false){
                        GameLoop.beenHere[2][11] = true;
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (GameLoop.beenHere[2][12] == false){
                        GameLoop.beenHere[2][12] = true;
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (GameLoop.beenHere[2][13] == false){
                        GameLoop.beenHere[2][13] = true;
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (GameLoop.beenHere[2][14] == false){
                        GameLoop.beenHere[2][14] = true;
                    } else {
                       RepeatedArea();
                    };
            }
            
        } else if (GameLoop.xPosition == 3){
            switch (GameLoop.yPosition){
                case 1 :  
                    if (GameLoop.beenHere[3][1] == false){
                    //this checks to see if we have already been here
                        GameLoop.beenHere[3][1] = true;
                        //this will tell the code that we have now been here
    
                        //this is where we put the encounter that happens in this location
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (GameLoop.beenHere[3][2] == false){
                        GameLoop.beenHere[3][2] = true;
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (GameLoop.beenHere[3][3] == false){
                        GameLoop.beenHere[3][3] = true;
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (GameLoop.beenHere[3][4] == false){
                        GameLoop.beenHere[3][4] = true;
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (GameLoop.beenHere[3][5] == false){
                        GameLoop.beenHere[3][5] = true;
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (GameLoop.beenHere[3][6] == false){
                        GameLoop.beenHere[3][6] = true;
                    } else {
                       RepeatedArea();
                    };
                case 7 : 
                    if (GameLoop.beenHere[3][7] == false){
                        GameLoop.beenHere[3][7] = true;
                    } else {
                       RepeatedArea();
                    };
                case 8 : 
                    if (GameLoop.beenHere[3][8] == false){
                        GameLoop.beenHere[3][8] = true;
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (GameLoop.beenHere[3][9] == false){
                        GameLoop.beenHere[3][9] = true;
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (GameLoop.beenHere[3][10] == false){
                        GameLoop.beenHere[3][10] = true;
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (GameLoop.beenHere[3][11] == false){
                        GameLoop.beenHere[3][11] = true;
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (GameLoop.beenHere[3][12] == false){
                        GameLoop.beenHere[3][12] = true;
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (GameLoop.beenHere[3][13] == false){
                        GameLoop.beenHere[3][13] = true;
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (GameLoop.beenHere[3][14] == false){
                        GameLoop.beenHere[3][14] = true;
                    } else {
                       RepeatedArea();
                    };
            } 
        } else if (GameLoop.xPosition == 4){
            switch (GameLoop.yPosition){
                case 1 :  
                    if (GameLoop.beenHere[4][1] == false){
                    //this checks to see if we have already been here
                        GameLoop.beenHere[4][1] = true;
                        //this will tell the code that we have now been here
    
                        //this is where we put the encounter that happens in this location
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (GameLoop.beenHere[4][2] == false){
                        GameLoop.beenHere[4][2] = true;
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (GameLoop.beenHere[4][3] == false){
                        GameLoop.beenHere[4][3] = true;
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (GameLoop.beenHere[4][4] == false){
                        GameLoop.beenHere[4][4] = true;
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (GameLoop.beenHere[4][5] == false){
                        GameLoop.beenHere[4][5] = true;
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (GameLoop.beenHere[4][6] == false){
                        GameLoop.beenHere[4][6] = true;
                    } else {
                       RepeatedArea();
                    };
                case 7 : 
                    if (GameLoop.beenHere[4][7] == false){
                        GameLoop.beenHere[4][7] = true;
                    } else {
                       RepeatedArea();
                    };
                case 8 : 
                    if (GameLoop.beenHere[4][8] == false){
                        GameLoop.beenHere[4][8] = true;
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (GameLoop.beenHere[4][9] == false){
                        GameLoop.beenHere[4][9] = true;
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (GameLoop.beenHere[4][10] == false){
                        GameLoop.beenHere[4][10] = true;
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (GameLoop.beenHere[4][11] == false){
                        GameLoop.beenHere[4][11] = true;
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (GameLoop.beenHere[4][12] == false){
                        GameLoop.beenHere[4][12] = true;
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (GameLoop.beenHere[4][13] == false){
                        GameLoop.beenHere[4][13] = true;
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (GameLoop.beenHere[4][14] == false){
                        GameLoop.beenHere[4][14] = true;
                    } else {
                       RepeatedArea();
                    };
            }
        } else if (GameLoop.xPosition == 5){
            switch (GameLoop.yPosition){
                case 1 :  
                    if (GameLoop.beenHere[5][1] == false){
                    //this checks to see if we have already been here
                        GameLoop.beenHere[5][1] = true;
                        //this will tell the code that we have now been here
    
                        //this is where we put the encounter that happens in this location
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (GameLoop.beenHere[5][2] == false){
                        GameLoop.beenHere[5][2] = true;
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (GameLoop.beenHere[5][3] == false){
                        GameLoop.beenHere[5][3] = true;
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (GameLoop.beenHere[5][4] == false){
                        GameLoop.beenHere[5][4] = true;
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (GameLoop.beenHere[5][5] == false){
                        GameLoop.beenHere[5][5] = true;
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (GameLoop.beenHere[5][6] == false){
                        GameLoop.beenHere[5][6] = true;
                    } else {
                       RepeatedArea();
                    };
                case 7 : 
                    if (GameLoop.beenHere[5][7] == false){
                        GameLoop.beenHere[5][7] = true;
                    } else {
                       RepeatedArea();
                    };
                case 8 : 
                    if (GameLoop.beenHere[5][8] == false){
                        GameLoop.beenHere[5][8] = true;
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (GameLoop.beenHere[5][9] == false){
                        GameLoop.beenHere[5][9] = true;
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (GameLoop.beenHere[5][10] == false){
                        GameLoop.beenHere[5][10] = true;
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (GameLoop.beenHere[5][11] == false){
                        GameLoop.beenHere[5][11] = true;
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (GameLoop.beenHere[5][12] == false){
                        GameLoop.beenHere[5][12] = true;
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (GameLoop.beenHere[5][13] == false){
                        GameLoop.beenHere[5][13] = true;
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (GameLoop.beenHere[5][14] == false){
                        GameLoop.beenHere[5][14] = true;
                    } else {
                       RepeatedArea();
                    };
            }
        } else if (GameLoop.xPosition == 6){
            switch (GameLoop.yPosition){
                case 1 :  
                    if (GameLoop.beenHere[6][1] == false){
                    //this checks to see if we have already been here
                        GameLoop.beenHere[6][1] = true;
                        //this will tell the code that we have now been here
    
                        //this is where we put the encounter that happens in this location
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (GameLoop.beenHere[6][2] == false){
                        GameLoop.beenHere[6][2] = true;
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (GameLoop.beenHere[6][3] == false){
                        GameLoop.beenHere[6][3] = true;
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (GameLoop.beenHere[6][4] == false){
                        GameLoop.beenHere[6][4] = true;
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (GameLoop.beenHere[6][5] == false){
                        GameLoop.beenHere[6][5] = true;
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (GameLoop.beenHere[6][6] == false){
                        GameLoop.beenHere[6][6] = true;
                    } else {
                       RepeatedArea();
                    };
                case 7 : 
                    if (GameLoop.beenHere[6][7] == false){
                        GameLoop.beenHere[6][7] = true;
                    } else {
                       RepeatedArea();
                    };
                case 8 : 
                    if (GameLoop.beenHere[6][8] == false){
                        GameLoop.beenHere[6][8] = true;
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (GameLoop.beenHere[6][9] == false){
                        GameLoop.beenHere[6][9] = true;
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (GameLoop.beenHere[6][10] == false){
                        GameLoop.beenHere[6][10] = true;
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (GameLoop.beenHere[6][11] == false){
                        GameLoop.beenHere[6][11] = true;
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (GameLoop.beenHere[6][12] == false){
                        GameLoop.beenHere[6][12] = true;
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (GameLoop.beenHere[6][13] == false){
                        GameLoop.beenHere[6][13] = true;
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (GameLoop.beenHere[6][14] == false){
                        GameLoop.beenHere[6][14] = true;
                    } else {
                       RepeatedArea();
                    };
            }
        } else if (GameLoop.xPosition == 7){
            switch (GameLoop.yPosition){
                case 1 :  
                    if (GameLoop.beenHere[7][1] == false){
                    //this checks to see if we have already been here
                        GameLoop.beenHere[7][1] = true;
                        //this will tell the code that we have now been here
                        MediumSlime.MediumSlimeEncounter();
                        //this is where we put the encounter that happens in this location
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (GameLoop.beenHere[7][2] == false){
                        GameLoop.beenHere[7][2] = true;
                        SmallSlime.SmallSlimeEncounter();
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (GameLoop.beenHere[7][3] == false){
                        GameLoop.beenHere[7][3] = true;
                        Troll1.Troll1Encounter();
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (GameLoop.beenHere[7][4] == false){
                        GameLoop.beenHere[7][4] = true;
                        Treasure1.Treasure();
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (GameLoop.beenHere[7][5] == false){
                        GameLoop.beenHere[7][5] = true;
                        Treasure2.Treasure();
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (GameLoop.beenHere[7][6] == false){
                        GameLoop.beenHere[7][6] = true;
                        Treasure3.Treasure();
                    } else {
                       RepeatedArea();
                    };
                case 7 : 
                    if (GameLoop.beenHere[7][7] == false){
                        GameLoop.beenHere[7][7] = true;
                        Treasure4.Treasure();
                    } else {
                       RepeatedArea();
                    };
                case 8 : 
                    if (GameLoop.beenHere[7][8] == false){
                        GameLoop.beenHere[7][8] = true;
                        Treasure5.Treasure();
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (GameLoop.beenHere[7][9] == false){
                        Shop1.Shop();
                        GameLoop.beenHere[7][9] = true;
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (GameLoop.beenHere[7][10] == false){
                        Shop2.Shop();
                        GameLoop.beenHere[7][10] = true;
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (GameLoop.beenHere[7][11] == false){
                        Shop3.Shop();
                        GameLoop.beenHere[7][11] = true;
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (GameLoop.beenHere[7][12] == false){
                        Shop4.Shop();
                        GameLoop.beenHere[7][12] = true;
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (GameLoop.beenHere[7][13] == false){
                        Shop5.Shop();
                        GameLoop.beenHere[7][13] = true;
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (GameLoop.beenHere[7][14] == false){
                        TrappedTreasure.Treasure();
                        GameLoop.beenHere[7][14] = true;
                    } else {
                       RepeatedArea();
                    };
            }
        } else if (GameLoop.xPosition == 8){
            switch (GameLoop.yPosition){
                case 1 :  
                    if (GameLoop.beenHere[8][1] == false){
                    //this checks to see if we have already been here
                        GameLoop.beenHere[8][1] = true;
                        //this will tell the code that we have now been here
    
                        //this is where we put the encounter that happens in this location
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (GameLoop.beenHere[8][2] == false){
                        GameLoop.beenHere[8][2] = true;
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (GameLoop.beenHere[8][3] == false){
                        GameLoop.beenHere[8][3] = true;
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (GameLoop.beenHere[8][4] == false){
                        GameLoop.beenHere[8][4] = true;
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (GameLoop.beenHere[8][5] == false){
                        GameLoop.beenHere[8][5] = true;
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (GameLoop.beenHere[8][6] == false){
                        GameLoop.beenHere[8][6] = true;
                    } else {
                       RepeatedArea();
                    };
                case 7 : 
                    if (GameLoop.beenHere[8][7] == false){
                        GameLoop.beenHere[8][7] = true;
                    } else {
                       RepeatedArea();
                    };
                case 8 : 
                    if (GameLoop.beenHere[8][8] == false){
                        GameLoop.beenHere[8][8] = true;
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (GameLoop.beenHere[8][9] == false){
                        GameLoop.beenHere[8][9] = true;
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (GameLoop.beenHere[8][10] == false){
                        GameLoop.beenHere[8][10] = true;
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (GameLoop.beenHere[8][11] == false){
                        GameLoop.beenHere[8][11] = true;
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (GameLoop.beenHere[8][12] == false){
                        GameLoop.beenHere[8][12] = true;
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (GameLoop.beenHere[8][13] == false){
                        GameLoop.beenHere[8][13] = true;
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (GameLoop.beenHere[8][14] == false){
                        GameLoop.beenHere[8][14] = true;
                    } else {
                       RepeatedArea();
                    };
            }
        } else if (GameLoop.xPosition == 9){
            switch (GameLoop.yPosition){
                case 1 :  
                    if (GameLoop.beenHere[9][1] == false){
                    //this checks to see if we have already been here
                        GameLoop.beenHere[9][1] = true;
                        //this will tell the code that we have now been here
    
                        //this is where we put the encounter that happens in this location
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (GameLoop.beenHere[9][2] == false){
                        GameLoop.beenHere[9][2] = true;
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (GameLoop.beenHere[9][3] == false){
                        GameLoop.beenHere[9][3] = true;
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (GameLoop.beenHere[9][4] == false){
                        GameLoop.beenHere[9][4] = true;
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (GameLoop.beenHere[9][5] == false){
                        GameLoop.beenHere[9][5] = true;
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (GameLoop.beenHere[9][6] == false){
                        GameLoop.beenHere[9][6] = true;
                    } else {
                       RepeatedArea();
                    };
                case 7 : 
                    if (GameLoop.beenHere[9][7] == false){
                        GameLoop.beenHere[9][7] = true;
                    } else {
                       RepeatedArea();
                    };
                case 8 : 
                    if (GameLoop.beenHere[9][8] == false){
                        GameLoop.beenHere[9][8] = true;
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (GameLoop.beenHere[9][9] == false){
                        GameLoop.beenHere[9][9] = true;
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (GameLoop.beenHere[9][10] == false){
                        GameLoop.beenHere[9][10] = true;
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (GameLoop.beenHere[9][11] == false){
                        GameLoop.beenHere[9][11] = true;
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (GameLoop.beenHere[9][12] == false){
                        GameLoop.beenHere[9][12] = true;
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (GameLoop.beenHere[9][13] == false){
                        GameLoop.beenHere[9][13] = true;
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (GameLoop.beenHere[9][14] == false){
                        GameLoop.beenHere[9][14] = true;
                    } else {
                       RepeatedArea();
                    };
            }
        } else if (GameLoop.xPosition == 10){
            switch (GameLoop.yPosition){
                case 1 :  
                    if (GameLoop.beenHere[10][1] == false){
                    //this checks to see if we have already been here
                        GameLoop.beenHere[10][1] = true;
                        //this will tell the code that we have now been here
    
                        //this is where we put the encounter that happens in this location
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (GameLoop.beenHere[10][2] == false){
                        GameLoop.beenHere[10][2] = true;
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (GameLoop.beenHere[10][3] == false){
                        GameLoop.beenHere[10][3] = true;
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (GameLoop.beenHere[10][4] == false){
                        GameLoop.beenHere[10][4] = true;
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (GameLoop.beenHere[10][5] == false){
                        GameLoop.beenHere[10][5] = true;
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (GameLoop.beenHere[10][6] == false){
                        GameLoop.beenHere[10][6] = true;
                    } else {
                       RepeatedArea();
                    };
                case 7 : 
                    if (GameLoop.beenHere[10][7] == false){
                        GameLoop.beenHere[10][7] = true;
                    } else {
                       RepeatedArea();
                    };
                case 8 : 
                    if (GameLoop.beenHere[10][8] == false){
                        GameLoop.beenHere[10][8] = true;
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (GameLoop.beenHere[10][9] == false){
                        GameLoop.beenHere[10][9] = true;
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (GameLoop.beenHere[10][10] == false){
                        GameLoop.beenHere[10][10] = true;
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (GameLoop.beenHere[10][11] == false){
                        GameLoop.beenHere[10][11] = true;
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (GameLoop.beenHere[10][12] == false){
                        GameLoop.beenHere[10][12] = true;
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (GameLoop.beenHere[10][13] == false){
                        GameLoop.beenHere[10][13] = true;
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (GameLoop.beenHere[10][14] == false){
                        GameLoop.beenHere[10][14] = true;
                    } else {
                       RepeatedArea();
                    };
            }
        } else if (GameLoop.xPosition == 11){
            switch (GameLoop.yPosition){
                case 1 :  
                    if (GameLoop.beenHere[11][1] == false){
                    //this checks to see if we have already been here
                        GameLoop.beenHere[11][1] = true;
                        //this will tell the code that we have now been here
    
                        //this is where we put the encounter that happens in this location
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (GameLoop.beenHere[11][2] == false){
                        GameLoop.beenHere[11][2] = true;
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (GameLoop.beenHere[11][3] == false){
                        GameLoop.beenHere[11][3] = true;
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (GameLoop.beenHere[11][4] == false){
                        GameLoop.beenHere[11][4] = true;
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (GameLoop.beenHere[11][5] == false){
                        GameLoop.beenHere[11][5] = true;
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (GameLoop.beenHere[11][6] == false){
                        GameLoop.beenHere[11][6] = true;
                    } else {
                       RepeatedArea();
                    };
                case 7 : 
                    if (GameLoop.beenHere[11][7] == false){
                        GameLoop.beenHere[11][7] = true;
                    } else {
                       RepeatedArea();
                    };
                case 8 : 
                    if (GameLoop.beenHere[11][8] == false){
                        GameLoop.beenHere[11][8] = true;
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (GameLoop.beenHere[11][9] == false){
                        GameLoop.beenHere[11][9] = true;
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (GameLoop.beenHere[11][10] == false){
                        GameLoop.beenHere[11][10] = true;
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (GameLoop.beenHere[11][11] == false){
                        GameLoop.beenHere[11][11] = true;
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (GameLoop.beenHere[11][12] == false){
                        GameLoop.beenHere[11][12] = true;
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (GameLoop.beenHere[11][13] == false){
                        GameLoop.beenHere[11][13] = true;
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (GameLoop.beenHere[11][14] == false){
                        GameLoop.beenHere[11][14] = true;
                    } else {
                       RepeatedArea();
                    };
            }
        } else if (GameLoop.xPosition == 12){
            switch (GameLoop.yPosition){
                case 1 :  
                    if (GameLoop.beenHere[12][1] == false){
                    //this checks to see if we have already been here
                        GameLoop.beenHere[12][1] = true;
                        //this will tell the code that we have now been here
    
                        //this is where we put the encounter that happens in this location
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (GameLoop.beenHere[12][2] == false){
                        GameLoop.beenHere[12][2] = true;
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (GameLoop.beenHere[12][3] == false){
                        GameLoop.beenHere[12][3] = true;
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (GameLoop.beenHere[12][4] == false){
                        GameLoop.beenHere[12][4] = true;
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (GameLoop.beenHere[12][5] == false){
                        GameLoop.beenHere[12][5] = true;
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (GameLoop.beenHere[12][6] == false){
                        GameLoop.beenHere[12][6] = true;
                    } else {
                       RepeatedArea();
                    };
                case 7 : 
                    if (GameLoop.beenHere[12][7] == false){
                        GameLoop.beenHere[12][7] = true;
                    } else {
                       RepeatedArea();
                    };
                case 8 : 
                    if (GameLoop.beenHere[12][8] == false){
                        GameLoop.beenHere[12][8] = true;
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (GameLoop.beenHere[12][9] == false){
                        GameLoop.beenHere[12][9] = true;
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (GameLoop.beenHere[12][10] == false){
                        GameLoop.beenHere[12][10] = true;
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (GameLoop.beenHere[12][11] == false){
                        GameLoop.beenHere[12][11] = true;
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (GameLoop.beenHere[12][12] == false){
                        GameLoop.beenHere[12][12] = true;
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (GameLoop.beenHere[12][13] == false){
                        GameLoop.beenHere[12][13] = true;
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (GameLoop.beenHere[12][14] == false){
                        GameLoop.beenHere[12][14] = true;
                    } else {
                       RepeatedArea();
                    };
            }
        } else if (GameLoop.xPosition == 13){
            switch (GameLoop.yPosition){
                case 1 :  
                    if (GameLoop.beenHere[13][1] == false){
                    //this checks to see if we have already been here
                        GameLoop.beenHere[13][1] = true;
                        //this will tell the code that we have now been here
    
                        //this is where we put the encounter that happens in this location
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (GameLoop.beenHere[13][2] == false){
                        GameLoop.beenHere[13][2] = true;
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (GameLoop.beenHere[13][3] == false){
                        GameLoop.beenHere[13][3] = true;
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (GameLoop.beenHere[13][4] == false){
                        GameLoop.beenHere[13][4] = true;
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (GameLoop.beenHere[13][5] == false){
                        GameLoop.beenHere[13][5] = true;
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (GameLoop.beenHere[13][6] == false){
                        GameLoop.beenHere[13][6] = true;
                    } else {
                       RepeatedArea();
                    };
                case 7 : 
                    if (GameLoop.beenHere[13][7] == false){
                        GameLoop.beenHere[13][7] = true;
                    } else {
                       RepeatedArea();
                    };
                case 8 : 
                    if (GameLoop.beenHere[13][8] == false){
                        GameLoop.beenHere[13][8] = true;
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (GameLoop.beenHere[13][9] == false){
                        GameLoop.beenHere[13][9] = true;
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (GameLoop.beenHere[13][10] == false){
                        GameLoop.beenHere[13][10] = true;
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (GameLoop.beenHere[13][11] == false){
                        GameLoop.beenHere[13][11] = true;
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (GameLoop.beenHere[13][12] == false){
                        GameLoop.beenHere[13][12] = true;
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (GameLoop.beenHere[13][13] == false){
                        GameLoop.beenHere[13][13] = true;
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (GameLoop.beenHere[13][14] == false){
                        GameLoop.beenHere[13][14] = true;
                        System.out.println("hmmm but its the second one");
                    } else {
                       RepeatedArea();
                    };
                }
        } else if (GameLoop.xPosition == 14){
            switch (GameLoop.yPosition){
                case 1 :  
                    if (GameLoop.beenHere[14][1] == false){
                    //this checks to see if we have already been here
                        GameLoop.beenHere[14][1] = true;
                        //this will tell the code that we have now been here
    
                        //this is where we put the encounter that happens in this location
                    } else {
                        RepeatedArea();
                    };
                case 2 : 
                    if (GameLoop.beenHere[14][2] == false){
                        GameLoop.beenHere[14][2] = true;
                    } else {
                        RepeatedArea();
                    };
                case 3 : 
                    if (GameLoop.beenHere[14][3] == false){
                        GameLoop.beenHere[14][3] = true;
                    } else {
                       RepeatedArea();
                    };
                case 4 :
                    if (GameLoop.beenHere[14][4] == false){
                        GameLoop.beenHere[14][4] = true;
                    } else {
                       RepeatedArea();
                    };
                case 5 :
                    if (GameLoop.beenHere[14][5] == false){
                        GameLoop.beenHere[14][5] = true;
                    } else {
                       RepeatedArea();
                    };
                case 6 : 
                    if (GameLoop.beenHere[14][6] == false){
                        GameLoop.beenHere[14][6] = true;
                    } else {
                       RepeatedArea();
                    };
                case 7 : 
                    if (GameLoop.beenHere[14][7] == false){
                        GameLoop.beenHere[14][7] = true;
                    } else {
                       RepeatedArea();
                    };
                case 8 : 
                    if (GameLoop.beenHere[14][8] == false){
                        GameLoop.beenHere[14][8] = true;
                    } else {
                       RepeatedArea();
                    };
                case 9 : 
                    if (GameLoop.beenHere[14][9] == false){
                        GameLoop.beenHere[14][9] = true;
                    } else {
                       RepeatedArea();
                    };
                case 10 : 
                    if (GameLoop.beenHere[14][10] == false){
                        GameLoop.beenHere[14][10] = true;
                    } else {
                       RepeatedArea();
                    };
                case 11 : 
                    if (GameLoop.beenHere[14][11] == false){
                        GameLoop.beenHere[14][11] = true;
                    } else {
                       RepeatedArea();
                    };
                case 12 : 
                    if (GameLoop.beenHere[14][12] == false){
                        GameLoop.beenHere[14][12] = true;
                    } else {
                       RepeatedArea();
                    };
                case 13 : 
                    if (GameLoop.beenHere[14][13] == false){
                        GameLoop.beenHere[14][13] = true;
                        System.out.println("hmmm");
                    } else {
                       RepeatedArea();
                    };
                case 14 : 
                    if (GameLoop.beenHere[14][14] == false){
                        GameLoop.beenHere[14][14] = true;
                    } else {
                       RepeatedArea();
                    };
                
            }
        }
    }

    public static void RepeatedArea(){
        System.out.println("You recognize this area. There isn't anything left to do here. ");
        GameLoop.MapMovement();
    }

}