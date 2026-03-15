package lab2.Problem2;

public class Bishop extends Piece {
    public Bishop(Position p, String c) { 
    		super(p, c); 
    	}
    
    @Override
    public boolean isLegalMove(Position pos) {
        return Math.abs(position.getX() - pos.getX()) == Math.abs(position.getY() - pos.getY());
    }
    
	@Override
	public String getCodeName() {
		return "B";
	}
}