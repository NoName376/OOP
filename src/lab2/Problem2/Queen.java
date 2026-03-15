package lab2.Problem2;

public class Queen extends Piece {
    public Queen(Position p, String c) { 
    		super(p, c); 
    	}
    
    @Override
    public boolean isLegalMove(Position pos) {
        int dx = Math.abs(position.getX() - pos.getX());
        int dy = Math.abs(position.getY() - pos.getY());
        
        return 	position.getX() == pos.getX() || 
        			position.getY() == pos.getY() || 
        			dx == dy;
    }
    
    @Override
    public String getCodeName() {
    		return "Q";
    }
}