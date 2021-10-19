
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        
        String[] [] board = new String[5] [5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++){
                board[i][j] = "[ ]";
                System.out.print(board[i][j]);
            }
            System.out.println("");


        }
    }
}
