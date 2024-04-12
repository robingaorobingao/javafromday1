
import java.util.Arrays;

public class Board {
    
    //Robin
    public static String[] board = new String[9];
    public static int[] boardSizes = new int[9]; // This board contains cell's size 1, 2, 3

    /**
     * Constructor for objects of class Board
     */
    public Board() {
        for (int a = 0; a < 9; a++) 
        {
            board[a] = String.valueOf(a+1);
            boardSizes[a] = 0;
        }
    }
    
    //Robin
    public static String[] getBoard()
    {
        return board;
    }
    
    //Robin
    public static void printBoard(String[] board) 
    {
        System.out.println("/-----------|-----------|-----------\\");
        System.out.println("|           |           |           |");
        System.out.println("|     " + getCellDisplayString(0) + "    |     " + getCellDisplayString(1) + "    |     " + getCellDisplayString(2) + "    |");
        System.out.println("|           |           |           |");
        System.out.println("|-----------------------------------|");
        System.out.println("|           |           |           |");
        System.out.println("|     " + getCellDisplayString(3) + "    |     " + getCellDisplayString(4) + "    |     " + getCellDisplayString(5) + "    |");
        System.out.println("|           |           |           |");
        System.out.println("|-----------------------------------|");
        System.out.println("|           |           |           |");
        System.out.println("|     " + getCellDisplayString(6) + "    |     " + getCellDisplayString(7) + "    |     " + getCellDisplayString(8) + "    |");
        System.out.println("|           |           |           |");
        System.out.println("\\-----------|-----------|-----------/");
    }
    
    //Robin
    private static String getCellDisplayString(int cellIndex) {
        if ( board[cellIndex].equals("X") || board[cellIndex].equals("O") ) {
            return board[cellIndex] + boardSizes[cellIndex];
        }
        else {
            return board[cellIndex] + " ";
        }
    }
    
    //Andrew
    public static String checkWinner(String[] board, String turn) {
        for (int a = 0; a < 8; a++) {
            String line = null;
            switch (a) {
                case 0:
                    line = board[0] + board[1] + board[2];
                    break;
                case 1:
                    line = board[3] + board[4] + board[5];
                    break;
                case 2:
                    line = board[6] + board[7] + board[8];
                    break;
                case 3:
                    line = board[0] + board[3] + board[6];
                    break;
                case 4:
                    line = board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = board[0] + board[4] + board[8];
                    break;
                case 7:
                    line = board[2] + board[4] + board[6];
                    break;
            }

            if (line.equals("XXX")) {
                return "X";
            }
            else if (line.equals("OOO")) {
                return "O";
            }
        }
    
        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(board).contains(String.valueOf(a+1))) {
                break;
            }
            else if (a == 8) 
                return "draw";
        }
     
        return null;
    }    
}
