package interview;

public class ChessBoard {

    public static void main(String[] args) {

        // Example usage:

        String initialPosition = "e2";

        int numMoves = 3;

        String finalPosition = calculatePawnPosition(initialPosition, numMoves);

        System.out.println("Final position: " + finalPosition);

    }

 

    public static String calculatePawnPosition(String initialPosition, int numMoves) {

        // Convert the initial position to row and column indices

        int row = 8 - (initialPosition.charAt(1) - '0'); // '1' maps to row 7, '2' to row 6, etc.

        int col = initialPosition.charAt(0) - 'a'; // 'a' maps to column 0, 'b' to column 1, etc.

 

        // Move the pawn forward numMoves times

        for (int i = 0; i < numMoves; i++) {

            row--; // Move one row up

        }

 

        // Convert the final position back to algebraic notation

        char finalCol = (char) ('a' + col);

        char finalRow = (char) ('1' + (8 - row));

        return finalCol + "" + finalRow;

    }

}
