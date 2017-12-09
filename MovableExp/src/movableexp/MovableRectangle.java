package movableexp;

public class MovableRectangle implements Movable {

    private MovablePoint topLeft, bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {

        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public MovablePoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MovablePoint topLeft) {
        this.topLeft = topLeft;
    }

    public MovablePoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MovablePoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    @Override
    public void moveUp() {
        topLeft.y += topLeft.ySpeed;
        bottomRight.y += bottomRight.ySpeed;
    }

    @Override
    public void moveDown() {
        topLeft.y -= topLeft.ySpeed;
        bottomRight.y -= bottomRight.ySpeed;
    }

    @Override
    public void moveRight() {
    }

    @Override
    public void moveLeft() {
    }

    public int FindCircumference() {
        return Math.abs(2 * (topLeft.y - bottomRight.y)) + Math.abs(2 * (bottomRight.x - topLeft.x));
    }

    public int FindArea() {
        return (topLeft.y - bottomRight.y) * (bottomRight.x - topLeft.x);
    }
}
