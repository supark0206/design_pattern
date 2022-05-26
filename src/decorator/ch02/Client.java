package decorator.ch02;

public class Client {
    public static void main(String[] args) {
        RoadDisplay road = new RoadDisplay();
        road.draw();

        RoadDisplayWithLane roadDisplayWithLane = new RoadDisplayWithLane();
        roadDisplayWithLane.draw();

        RoadDisplay roadWithTraffic = new RoadDisplayWithTraffic();
        roadWithTraffic.draw();


    }
}
