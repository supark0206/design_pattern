package strategy.Robot_02;

public interface MovingStrategy {
    void move();
}

class WalkingStrategy implements MovingStrategy {

    @Override
    public void move() {
        System.out.println("walking!!!");
    }
}

class FlyingStrategy implements MovingStrategy{

    @Override
    public void move() {
        System.out.println("flying!!!");
    }
}