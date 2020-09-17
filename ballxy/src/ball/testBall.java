package ball;

public class testBall {
    public static void main(String[] args) {
        ball b1 = new ball(1.1, 2.5);
        System.out.println(b1);
        b1.setX(1337.1);
        System.out.println(b1);
        b1.move(100.0, 100.0);
        System.out.println(b1);
        b1.setXY(22.0, 132.2);
        System.out.println(b1);
    }
}
