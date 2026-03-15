package lab2.Problem2;

public class Pawn extends Piece {
    public Pawn(Position p, String c) { 
    		super(p, c); 
    	}

    @Override
    public boolean isLegalMove(Position pos) {
        int dir      = color.equals("White") ? -1 : 1;
        int startRow = color.equals("White") ?  6 : 1;
        
        int dx = pos.getX() - position.getX();
        int dy = Math.abs(position.getY() - pos.getY());

        if (dy == 0 && dx == dir) return true;
        if (dy == 0 && dx == 2 * dir && position.getX() == startRow) return true;
        if (dy == 1 && dx == dir) return true;
        return false;
    }

    @Override
    public String getCodeName() { return "P"; }
}