package decorator.ch01;

public class Client {
    public static void main(String[] args) {
        RoadDisplay road = new RoadDisplay();
        road.draw();

        RoadDisplay roadWithLane = new RoadDisplayWithLane();
        roadWithLane.draw();
    }
}
