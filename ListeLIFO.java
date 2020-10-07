
public class ListeLIFO extends Liste{
    public ListeLIFO(){
        super();
    }

    public void pop() {
        if(liste.size()!=0)
            liste.remove(liste.size()-1);
        else System.out.println("liste vide");
    }


}