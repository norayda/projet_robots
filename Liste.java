import java.util.ArrayList;
public abstract class Liste {
    protected ArrayList<Object> liste;

    public Liste(){
        liste=new ArrayList<Object>();
    }
    public boolean isEmpty (){
        return liste==null;
    }
    public int Size(){
        return liste.size();
    }
    public  void push(Object o){
        liste.add(o);
    }
    public abstract void pop();

}