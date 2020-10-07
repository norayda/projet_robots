
public class RobotNormal extends RobotNettoyeur{

    public RobotNormal(int i, int j){
        super(i,j);
    }

    public void move(Monde m) {
        boolean b=false;

        if((i==m.getDim()-1)&&(j==0||j==m.getDim()-1)){
            move(0,0);
            b=true;
        }

        if(!b && (i%2==0 && j<m.getDim()-1)){
            move(i,j+1);
            b=true;
        }
        if(!b && (i%2!=0 && j>0)){
            move(i,j-1);
            b=true;
        }

        if(!b &&(j==0 || j==m.getDim()-1)){
            move(i+1,j);
        }

    }
    public void action(Monde m) {
        if(m.getPile(i,j).Size()!=0) {
            super.action(m);

        }
    }
    @Override
    public String toString() {
        return "N"+ numserie;
    }
}