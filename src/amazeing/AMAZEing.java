package amazeing;

import java.util.Random;

/**
 *
 * @author nicholasrebhun
 */
public class AMAZEing {
    static Random generator = new Random(System.currentTimeMillis());
    static int rNum;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int width = 10;
        int height = 8;
        int i = 0;
        int j = 0;
        

        MazePiece[][] theMaze;
        theMaze = new MazePiece[width][height];

        for (i = 0; i < height; i++) {

            for (j = 0; j < width; j++) {
                rNum = generator.nextInt() % 2;
                if(rNum < 0) rNum = (rNum * -1);
                if ((i == 0) || (i == (height-1))) {    //ceiling
                    theMaze[i][j] = new Floor();

                } else if ((j == 0) || (j == (width-1))) {      //outermost walls
                    theMaze[i][j] = new Wall();
                } else {
                    if (rNum == 0) {
                        theMaze[i][j] = new Floor();
                    } else if (rNum == 1) {
                        theMaze[i][j] = new Wall();
                    }
                }
            }
        }
        
        PrintMaze(theMaze, width, height);
    }

    public static void PrintMaze(MazePiece[][] theMaze, int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                theMaze[i][j].GetPiece();
            }
            System.out.println();
        }
    }
    
    public static void DEBUG(MazePiece[][] theMaze, int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("rNum: " + rNum + ", ");
                System.out.print("i: " + i + ", j: " + j + ", piece : ");
                theMaze[i][j].GetPiece();
                System.out.println();
            }
            System.out.println();
        }
    }
}