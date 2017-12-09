package movableexp;

public class MovableExp {

    public static void main(String[] args) {

        MovablePoint m1 = new MovablePoint(5, 6, 10, 15); 
        System.out.println(m1.y);
        m1.moveUp();
        System.out.println(m1.y);

        MovableCircle m2 = new MovableCircle(5, 6, 9, 15, 9); 
        System.out.println(m2.getCenter().x);
        m2.moveRight();
        System.out.println(m2.getCenter().x);
        
        MovableRectangle m3 = new MovableRectangle(5, 12, 9, 6, 4, 12);
        System.out.println(m3.getBottomRight().y);
        m3.moveDown();
        System.out.println(m3.getBottomRight().y);
        System.out.println(m3.FindCircumference());
        System.out.println(m3.FindArea());
    }

}
