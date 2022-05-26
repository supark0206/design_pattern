package decorator.ch03;

public class NewClient {
    public static void main(String[] args) {
        Display roadWithLaneTraffic =
                new TrafficDecorator(
                        new LaneDecorator(
                                new RoadDisplay()
                        )
                );
        roadWithLaneTraffic.draw();
    }
}
