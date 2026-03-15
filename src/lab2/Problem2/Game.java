package lab2.Problem2;

import java.util.Scanner;

public class Game {
	public Game() {
        this.board     = new Board();
        this.validator = new MoveValidator();
        this.renderer  = new ConsoleRenderer();
    }
	
    private final Board            board;
    private final MoveValidator    validator;
    private final ConsoleRenderer  renderer;
    private       String           currentTurn = "White";

    public void start() {
        Scanner sc = new Scanner(System.in);
        renderer.showInfo("White starts from row 6-7, Black from 0-1 ===");
        renderer.drawBoard(board.getGrid());
        renderer.showTurn(currentTurn);

        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.equalsIgnoreCase("exit")) break;

            String[] parts = line.split("\\s+");
            if (parts.length != 4) {
                renderer.showError("Format: row1 col1 row2 col2");
                continue;
            }

            try {
                Position from = new Position(Integer.parseInt(parts[0]),
                                             Integer.parseInt(parts[1]));
                
                Position to   = new Position(Integer.parseInt(parts[2]),
                                             Integer.parseInt(parts[3]));

                String error = validator.validate(board.getGrid(), from, to, currentTurn);
                if (error != null) {
                    renderer.showError(error);
                } else {
                    board.applyMove(from, to);
                    currentTurn = currentTurn.equals("White") ? "Black" : "White";
                    renderer.drawBoard(board.getGrid());
                    renderer.showTurn(currentTurn);
                }

            } catch (NumberFormatException e) {
                renderer.showError("Use numbers 0-7 only.");
            }
        }

        sc.close();
        renderer.showInfo("Game over.");
    }
}