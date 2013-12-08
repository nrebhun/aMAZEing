/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package amazeing;

/**
 *
 * @author nicholasrebhun
 */
public class MazePiece {
    String piece = "+";
    private boolean upperWall, lowerWall, leftWall, rightWall;
    
    public MazePiece() {
        //boolean setWall = AMAZEing.generator.nextBoolean();
        int randomInt = (AMAZEing.generator.nextInt()) % 15;
        byte randomByte = ;
        
        switch(random) {
            case 14:
                // dead end, exit up
                SetUpperWall(false);
                SetLowerWall(true);
                SetLeftWall(true);
                SetRightWall(true);
                break;
            case 13:
                // dead end, down
                SetUpperWall(true);
                SetLowerWall(false);
                SetLeftWall(true);
                SetRightWall(false);
                break;
            case 12:
                // dead end, left
                SetUpperWall(true);
                SetLowerWall(true);
                SetLeftWall(false);
                SetRightWall(false);
                break;
            case 11:
                // dead end, right
                SetUpperWall(true);
                SetLowerWall(true);
                SetLeftWall(false);
                SetRightWall(false);
                break;
            case 10:
                // top-left corner
                SetUpperWall(true);
                SetLowerWall(false);
                SetLeftWall(true);
                SetRightWall(false);
                break;
            case 9:
                // top-right corner
                SetUpperWall(true);
                SetLowerWall(false);
                SetLeftWall(false);
                SetRightWall(true);
                break;
            case 8:
                // dead end, left
                SetUpperWall(true);
                SetLowerWall(true);
                SetLeftWall(false);
                SetRightWall(false);
                break;
            case 7:
                // dead end, right
                SetUpperWall(true);
                SetLowerWall(true);
                SetLeftWall(false);
                SetRightWall(false);
                break;
            case 6:
                // horizontal hallway
                SetUpperWall(true);
                SetLowerWall(true);
                SetLeftWall(false);
                SetRightWall(false);
                break;
            case 5:
                // horizontal hallway
                SetUpperWall(true);
                SetLowerWall(true);
                SetLeftWall(false);
                SetRightWall(false);
                break;
            case 4:
                // horizontal hallway
                SetUpperWall(true);
                SetLowerWall(true);
                SetLeftWall(false);
                SetRightWall(false);
                break;
            case 3:
                // horizontal hallway
                SetUpperWall(true);
                SetLowerWall(true);
                SetLeftWall(false);
                SetRightWall(false);
                break;
            case 2:
                // vertical hallway
                SetUpperWall(false);
                SetLowerWall(false);
                SetLeftWall(true);
                SetRightWall(true);
                break;
            case 1:
                // Single wall: Upper
                SetUpperWall(true);
                SetLowerWall(true);
                SetLeftWall(false);
                SetRightWall(false);
                break;
            case 0:
                SetUpperWall(true);
                SetLowerWall(true);
                SetLeftWall(false);
                SetRightWall(false);
                break
                
                break;
            default:
                System.out.println("Error: random = " +random+".\nYou should never see this message.");
        }
        
    }
    public void GetPiece(){ System.out.print(piece);}
    
    private void SetUpperWall(boolean setWall){
        upperWall = setWall;
    }
    
    private void SetLowerWall(boolean setWall){
        lowerWall = setWall;
    }
    
    private void SetLeftWall(boolean setWall){
        leftWall = setWall;
    }
    
    private void SetRightWall(boolean setWall){
        rightWall = setWall;
    }
    public boolean GetUpperWall(){ return upperWall;}
    public boolean GetLowerWall(){ return lowerWall;}
    public boolean GetLeftWall(){ return leftWall;}
    public boolean GetRightWall(){ return rightWall;}
    
}