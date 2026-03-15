package lab2.Problem2;

public class MoveValidator {

    public String validate(Piece[][] grid, Position from, Position to, String turn) {
        Piece piece = grid[from.getX()][from.getY()];

        if (piece == null || !piece.getColor().equals(turn))
            return "No your piece at that square.";
        
        if (from.equals(to))
            return "Start and end are the same.";
        
        if (!piece.isLegalMove(to))
            return "Illegal move for " + piece.getCodeName() + ".";
        
        if (!(piece instanceof Knight) && !pathClear(grid, from, to))
            return "Path is blocked.";

        Piece target = grid[to.getX()][to.getY()];

        if (piece instanceof Pawn) {
            boolean diagonal = from.getY() != to.getY();
            
            if (diagonal && (target == null || target.getColor().equals(turn)))
                return "Pawn captures only diagonally onto enemy.";
        
            if (!diagonal && target != null)
                return "Pawn cannot move forward into a piece.";
        }

        if (target != null && target.getColor().equals(turn))
            return "Cannot capture your own piece.";

        return null;
    }

    private boolean pathClear(Piece[][] grid, Position from, Position to) {
        int dr = Integer.compare(to.getX(), from.getX());
        int dc = Integer.compare(to.getY(), from.getY());
        
        int r = from.getX() + dr;
        int c = from.getY() + dc;
        
        while (r != to.getX() || c != to.getY()) {
            if (grid[r][c] != null) return false;
        
            r += dr;
            c += dc;
        }
        
        return true;
    }
}