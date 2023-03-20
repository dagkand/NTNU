package oving3;


import java.util.ArrayList;
import java.util.List;

public class Nim{
    
    private List<Integer> board = new ArrayList<>();

    public Nim(int pileSize) {
        for (int i = 0; i < 3; i++) {
            board.add(pileSize);
        }
        
    }
    public Nim() {
        for (int i = 0; i < 3; i++) {
            board.add(10);
        }
    }


    public void removePieces(int number, int targetPile) {
        if (isGameOver()) {
            throw new IllegalStateException("The game is finished.");
        }
        else if (isValidMove(number, targetPile)) {
            int temp1 = board.get(targetPile) - number;
            board.set(targetPile, temp1);
        } 
        else {
            throw new IllegalArgumentException("Not a valid number.");
        }
    }

    public boolean isValidMove(int number, int targetPile) {
        if (isGameOver()) {
            return false;
        } else if (targetPile > board.size()) {
            return false;
        
        } else if (targetPile < 0) {
            return false;
        } 
        
        else if (!(number > 0 && number <= board.get(targetPile))) {
            return false;
        }
        
        for (int i = 0; i < 3; i++) {
            if (board.get(i) >= number) {
                return true;
            }
        }
            
        return false;
    }

    public boolean isGameOver() {
        for (int i = 0; i < board.size(); i++) {
            if (board.get(i) <= 0) {
                return true;
            }
            
        } 
        return false;
    }

    public int getPile(int targetPile) {
        return board.get(targetPile); 
    }

    @Override
    public String toString() {
        return "The pile has" + board + " pieces left";
    }
    

    public static void main(String[] args) {
    }

}
