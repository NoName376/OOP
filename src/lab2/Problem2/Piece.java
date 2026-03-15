package lab2.Problem2;

public abstract class Piece {
	public Piece(Position position, String color) {
        this.position = position;
        this.color = color;
    }
	
    public abstract boolean isLegalMove(Position pos);
    public abstract String getCodeName();
	

    public String getColor() { return color; }
    public Position getPosition() { return position; }
    public void setPosition(Position pos) { this.position = pos; }
    
    protected Position position;
    protected String color;

    @Override
    public String toString() {
        return color.substring(0, 1) + " " + getCodeName();
    }
}