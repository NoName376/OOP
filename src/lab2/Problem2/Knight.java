package lab2.Problem2;

public class Knight extends Piece {
    public Knight(Position p, String c) { 
    		super(p, c); 
    	}
    
    @Override
    public boolean isLegalMove(Position pos) {
        int dx = Math.abs(position.getX() - pos.getX());
        int dy = Math.abs(position.getY() - pos.getY());
        
        return 	(dx == 2 && dy == 1) || 
        			(dx == 1 && dy == 2);
    }
    
	@Override
	public String getCodeName() {
		return "N";
	}
}