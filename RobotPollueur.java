public abstract class RobotPollueur extends Robot{

    public RobotPollueur(int i, int j){
        super(i,j);

    }

    public abstract void move(Monde m);
    public void action(Monde m){
        m.getPile(i,j).push(new PapierGras());
        System.out.println("papier déposé i:"+i+" j :"+j);
    }
}