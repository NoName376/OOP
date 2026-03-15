package lab2.Problem2;

public class Position {
	public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
	
    public int getX() { return x; }
    public int getY() { return y; }

    private int x; 
    private int y;

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Position)) return false;
        Position position = (Position) o;
        return x == position.x && y == position.y;
    }
}
