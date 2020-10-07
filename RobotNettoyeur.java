public abstract class RobotNettoyeur extends Robot{

    public RobotNettoyeur(int i, int j){
        super(i,j);
    }

    public abstract void move(Monde m);
    public void action(Monde m){
        m.getPile(i,j).pop();
        System.out.println("papier retiré i:"+i+" j :"+j);
    }
}