public class RobotIdiot extends RobotPollueur {

    public RobotIdiot(int i, int j){
        super(i,j);
    }

    public void move(Monde m) {
        int x=(int)(Math.random()*m.getDim());
        int y=(int)(Math.random()*m.getDim());
        move(x,y);
    }
    public void action(Monde m){
        if(Math.random()<.2){
            super.action(m);
        }
    }
    @Override
    public String toString() {
        return "B"+ numserie;
    }

}