package lab2.Problem2;

public class Rook extends Piece {
    public Rook(Position p, String c) { 
    		super(p, c); 
    	}
    
    @Override
    public boolean isLegalMove(Position pos) {
        return 	position.getX() == pos.getX() || 
        			position.getY() == pos.getY();
    }
    
    @Override
	public String getCodeName() {
		return "R";
	}
}