public class Fan {
    private final int slow = 1;
    private final int medium = 2;
    private final int fast = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    public Fan() {
        this.speed = slow;
        this.on = false;
        this.radius =5;
        this.color = "blue";
    }

    public int getSlow() {
        return slow;
    }

    public int getMedium() {
        return medium;
    }

    public int getFast() {
        return fast;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "{" +
                "speed=" + slow +
                ", ison=" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}


