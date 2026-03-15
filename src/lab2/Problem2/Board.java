package lab2.Problem2;

public class Board {

    private final Piece[][] grid = new Piece[8][8];

    public Board() {
        setupPieces("Black", 0, 1);
        setupPieces("White", 7, 6);
    }

    private void setupPieces(String color, int backRow, int pawnRow) {
        grid[backRow][0] = new Rook(new Position(backRow, 0), color);
        grid[backRow][1] = new Knight(new Position(backRow, 1), color);
        grid[backRow][2] = new Bishop(new Position(backRow, 2), color);
        grid[backRow][3] = new Queen(new Position(backRow, 3), color);
        grid[backRow][4] = new King(new Position(backRow, 4), color);
        grid[backRow][5] = new Bishop(new Position(backRow, 5), color);
        grid[backRow][6] = new Knight(new Position(backRow, 6), color);
        grid[backRow][7] = new Rook(new Position(backRow, 7), color);
        
        for (int c = 0; c < 8; c++)
            grid[pawnRow][c] = new Pawn(new Position(pawnRow, c), color);
    }

    public void applyMove(Position from, Position to) {
        Piece piece = grid[from.getX()][from.getY()];
        grid[to.getX()][to.getY()] = piece;
        grid[from.getX()][from.getY()] = null;
        piece.setPosition(to);
    }

    public Piece[][] getGrid() { return grid; }

    public Piece getPiece(Position pos) {
        return grid[pos.getX()][pos.getY()];
    }
}