public abstract class Robot {
    protected int i,j;
    protected int numserie;
    protected static int nb=0;


    public Robot(int i, int j){
        this.i=i;
        this.j=j;
        numserie=nb;
        nb++;
    }
    protected void move(int di,int dj){
        i=di;
        j=dj;

    }
    public abstract void move(Monde m);
    public abstract void action(Monde m);
    public int getNum(){
        return numserie;
    }
    @Override
    public String toString(){
        String a= ""+numserie;
        return a;
    }


}