package lab2.Problem2;

public class King extends Piece {
    public King(Position p, String c) { 
    		super(p, c); 
    	}
    
    @Override
    public boolean isLegalMove(Position pos) {
        return 	Math.abs(position.getX() - pos.getX()) <= 1 && 
        			Math.abs(position.getY() - pos.getY()) <= 1;
    }
	@Override
	public String getCodeName() {
		return "K";
	}
}