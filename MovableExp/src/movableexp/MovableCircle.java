package movableexp;

public class MovableCircle implements Movable { // saved as "MovableCircle.java"
    // instance variables

    private MovablePoint center;   // can use center.x, center.y directly
    //  because they are package accessible
    private int radius;

    // Constructor
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        // Call the MovablePoint's constructor to allocate the center instance.
        center = new MovablePoint(x, y, xSpeed, ySpeed);

    }

    public MovablePoint getCenter() {
        return center;
    }

    public void setCenter(MovablePoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    // Implement abstract methods declared in the interface Movable
    @Override
    public void moveUp() {
        center.y += center.ySpeed;
    }

    @Override
    public void moveDown() {
        center.y -= center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x -= center.xSpeed;
    }

    @Override
    public void moveRight() {
        center.x += center.xSpeed;
    }
    public int FindCircumference(){
     return (int) (2*Math.PI*radius);
    }
}
