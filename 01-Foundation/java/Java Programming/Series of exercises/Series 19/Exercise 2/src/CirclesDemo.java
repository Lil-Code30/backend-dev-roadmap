
public class CirclesDemo {

    static void playWithCircle(ICircle c) {
        c.moveCenter(1,2);
        c.changeRadius(7);
        System.out.println(c);
    }

    public static void main(String[] args) {
        ICircle ca = new CircleA(3,4, 1);
        ICircle cb = new CircleB(7, 8, 2);
        playWithCircle(ca);
        playWithCircle(cb);
    }
}
