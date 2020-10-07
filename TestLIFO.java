
public class TestLIFO {
    public static void main(String[] args) {
        Liste l=new ListeLIFO();
        System.out.println(l.Size());
        l.push(new PapierGras());
        System.out.println(l.Size());
        l.pop();
        l.pop();
        System.out.println(l.Size());


    }
}
