package lesson02.home;

public class Board {
    Shape[] board = new Shape[4];

    public Board(Shape[] board) {
        this.board = board;
    }

    public Board() {
    }

    public void putFigure(Shape figure) {
        for (int i = 0; i < board.length; i++) {
            if (board[i] == null) {
                board[i] = figure;
                break;
            }
        }
    }

    public void removeFigure(Shape figure) {
        for (int i = 0; i < board.length; i++) {
            if (board[i] == figure) {
                board[i] = null;
                break;
            }
        }
    }

    public void showFigures() {
        String str = "";
        for (int i = 0; i < board.length; i++) {
            if (board[i] != null) {
                str += board[i];
            }
        }
        System.out.println("Figures on te board: " + str);
    }

    public void areaBoard() {
        double areaSum = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i] != null) {
                areaSum += board[i].getArea();
            }
        }
        System.out.println("The total area of figures on the board is: " + areaSum);
    }
}