import java.util.ArrayList;


public class Monde {
    private int dimension;
    private ArrayList<Robot> robots=new ArrayList<Robot>();
    private ListeLIFO[][] pile;

    public Monde(ArrayList<Robot> robot, int dim){
        robots= robot;
        dimension=dim;
        int a=0;
        pile=new ListeLIFO[dimension][dimension];
        for(int i=0;i<dimension;i++){
            for(int j=0;j<dimension;j++){
                pile[i][j]= new ListeLIFO();
                a=(int)(Math.random()*3);
                for (int x=0;x<a;x++) {
                    pile[i][j].push(new PapierGras());
                }


            }
        }
    }
    public int getDim(){
        return dimension;
    }

    public ListeLIFO getPile(int i, int j) {
        return pile[i][j];
    }
    public String toString() {
        String s="";
        boolean rob=false;
        for(int i=0;i<dimension;i++) {
            s+="\n";
            for(int j=0;j<dimension;j++) {

                for(int x=0;x<robots.size();x++) {
                    if((robots.get(x).i==i) && (robots.get(x).j==j)) {

                        s+=robots.get(x).toString()+" ";
                        rob=true;

                    }
                }
                if(!rob){
                    if(pile[i][j].Size()==0) {
                        s+=" . ";
                    }
                    else {
                        s+=" "+pile[i][j].Size()+" ";
                    }
                }
                rob=false;
            }
        }
        return s;
    }

    public void nextRound() {

        for(int x=0;x<robots.size();x++) {

            robots.get(x).action(this);
            robots.get(x).move(this);
        }
    }
}
