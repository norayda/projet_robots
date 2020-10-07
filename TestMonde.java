import java.util.ArrayList;
import java.util.Scanner;

public class TestMonde {

    @SuppressWarnings("resource")
    public static void main(String [] args){
        RobotNormal m=new RobotNormal((int)(Math.random()*20),(int)(Math.random()*20));
        RobotIdiot n=new RobotIdiot((int)(Math.random()*20),(int)(Math.random()*20));
        RobotIdiot g=new RobotIdiot((int)(Math.random()*20),(int)(Math.random()*20));
        ArrayList<Robot> liste= new ArrayList<Robot>();
        liste.add(m);
        liste.add(n);
        liste.add(g);

        Scanner scan = new Scanner(System.in);

        Monde world= new Monde(liste,20);
        System.out.println(world.toString()+"\n \n \n");
        world.nextRound();
        scan.next();
        System.out.println(world.toString());

        world.nextRound();
        scan.next();
        System.out.println(world.toString());

        world.nextRound();
        scan.next();
        System.out.println(world.toString());

        world.nextRound();
        scan.next();
        System.out.println(world.toString());

        world.nextRound();
        scan.next();
        System.out.println(world.toString());

        world.nextRound();
        scan.next();
        System.out.println(world.toString());

    }
}