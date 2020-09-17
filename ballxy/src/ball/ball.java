package ball;

public class ball {
    private Double x = 0.0;
    private Double y = 0.0;

    public ball(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }
    public void setXY(Double x, Double y) {
        this.x = x;
        this.y = y;

    }
    public void move (Double xDisp, Double yDisp) {
        x += xDisp;
        y += yDisp;
    }

    @Override
    public String toString() {
        return "ball @ (" + x +";"+ y + ")";
    }
}
