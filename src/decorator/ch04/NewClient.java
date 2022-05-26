package decorator.ch04;

import decorator.ch03.Display;
import decorator.ch03.RoadDisplay;
import decorator.ch03.TrafficDecorator;

public class NewClient {
    public static void main(String[] args) {
        Display roadWithLaneTraffic =
                new LaneDecorator(
                        new TrafficDecorator(
                                new CrossingDecorator(
                                        new RoadDisplay()
                                )
                        )
                );

        roadWithLaneTraffic.draw();
    }
}
