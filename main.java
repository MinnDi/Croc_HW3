public class main {
    public static void main(String[] args) throws Exception {
        //Chess ch_wrongx=new Chess(9,0);
        //Chess ch_wrongy=new Chess (7,10);
        Chess ch1=new Chess(0,2);
        //System.out.println(ch1.toString());
        ch1.setX(5);
        //System.out.println(ch1.toString());
        ch1.setY(6);
        //System.out.println(ch1.toString());
        //ch.setX(15);
        //ch.setY(54);
        Chess ch2=new Chess(3,5);
        Chess ch3=new Chess(2,7);
        Chess ch4=new Chess(0,0);
        String[] rightmove= new String[]{ch1.toString(), ch2.toString(), ch3.toString()};
        String message = new String(MovingHorse(rightmove));
        System.out.println(message);
        String[] wrongmove=new String[]{ch1.toString(),ch4.toString()};
        message=MovingHorse(wrongmove);
        System.out.println(message);

    }
    public static String MovingHorse(String[] moves) throws IllegalMoveExeption{
        for ( int i=0;i<moves.length-1;i++){
            char pos1x=moves[i].charAt(0);
            char pos1ych=moves[i].charAt(1);
            int pos1y=Character.getNumericValue(pos1ych);
            char pos2x=moves[i+1].charAt(0);
            char pos2ych=moves[i+1].charAt(1);
            int pos2y=Character.getNumericValue(pos2ych);
            System.out.println(pos1x+" "+pos1y+" "+ pos2x+" "+pos2y);
            int x1=pos1x;
            int x2=pos2x;
            System.out.println(x1+" "+pos1y+" "+ x2+" "+pos2y);
            try {
                if (Math.abs(x1-x2)!=1&&Math.abs(pos1y-pos2y)!=2||Math.abs(x1-x2)!=2&&Math.abs(pos1y-pos2y)!=1)
                    throw new IllegalMoveExeption(pos1x, pos1y, pos2x, pos2y);
            }catch (IllegalMoveExeption e){
                return "Конь так не ходит: "+e.getGoFromX()+e.getGoFromY()+"->"+e.getGoToX()+e.getGoToY()+". \n";
            }
            System.out.println("проверочка");
        }
        return "OK. \n";
    }
}
