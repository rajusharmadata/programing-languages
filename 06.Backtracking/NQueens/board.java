package NQueens;

public class board {
public  static void ArrangeTheQueen(){
    
}



    public static void printChessBoard(char board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");  // Print element with space
            }
            System.out.println(); // New line after each row
        }
    }
    public static void main(String[] args) {
        int n = 2;
        char chessboard[][]  = new char[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                chessboard[i][j] = 'x';
            }
        }
    printChessBoard(chessboard);
    }
}