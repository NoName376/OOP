package Lab2;

public class StarTriangle {
    int width;

    public StarTriangle(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= width; i++) {
            for (int j = 0; j < i; j++) {
                result.append("[*]");
            }
            
            result.append("\n");
        }
        return result.toString();
    }
    
    public static void main(String[] args) {
        StarTriangle triangle = new StarTriangle(5);
        
        System.out.println(triangle);
    }
}