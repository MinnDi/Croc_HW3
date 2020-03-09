public class IllegalMoveExeption extends Exception {
    private char goFromX;
    private int goFromY;
    private char goToX;
    private int goToY;

    public IllegalMoveExeption(char pos1x, int pos1y, char pos2x, int pos2y){
        goFromX=pos1x;
        goFromY=pos1y;
        goToX=pos2x;
        goToY=pos2y;
    }

    public char getGoFromX() {
        return goFromX;
    }

    public int getGoFromY() {
        return goFromY;
    }

    public char getGoToX() {
        return goToX;
    }

    public int getGoToY() {
        return goToY;
    }
}
