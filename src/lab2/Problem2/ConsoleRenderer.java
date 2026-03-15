package lab2.Problem2;

public class ConsoleRenderer {

    public void drawBoard(Piece[][] grid) {
        System.out.println();
        System.out.println("     0    1    2    3    4    5    6    7");
        System.out.println("  +----+----+----+----+----+----+----+----+");

        for (int r = 0; r < 8; r++) {
            System.out.print(r + " |");

            for (int c = 0; c < 8; c++) {
                Piece p = grid[r][c];

                if (p == null) {
                    System.out.print(" .  |");
                } else {
                    String s = p.toString();

                    if (s.length() == 1) {
                        System.out.print(" " + s + "  |");
                    } else if (s.length() == 2) {
                        System.out.print(" " + s + " |");
                    } else {
                        System.out.print(" " + s + "|");
                    }
                }
            }

            System.out.println();
            System.out.println("  +----+----+----+----+----+----+----+----+");
        }

        System.out.println();
    }

    public void showTurn(String color) {
        System.out.println(color + "'s turn.  Enter: row1 col1 row2 col2  (or 'exit')");
    }

    public void showError(String msg) {
        System.out.println("  [!] " + msg);
    }

    public void showInfo(String msg) {
        System.out.println("  " + msg);
    }
}