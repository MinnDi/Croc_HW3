public class Chess {
    private int x;
    private int y;

    public void setY(int y) throws IllegalArgumentException{
        if (y<0||y>7)
            throw new IllegalArgumentException("Wrong y. Argument should be in the range of [0:7]");
        else
            this.y = y;
    }

    public void setX(int x) throws IllegalArgumentException{
        if (x<0||x>7)
            throw new IllegalArgumentException("Wrong x. Argument should be in the range of [0:7]");
        else
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }
    public Chess (int x, int y) throws IllegalArgumentException{
        if (x<0||x>7||y<0||y>7)
            throw new IllegalArgumentException("Wrong arguments. Arguments should be in the range of [0:7]");
        else {
            this.x = x;
            this.y = y;
        }
    }

    @Override
    public String toString() {
        int x=getX();
        int y=getY();
        String alf=new String("abcdefgh");
        String str;
        str = new String() + alf.charAt(x) + (y + 1)+"\n";
        return str;
    }


}
