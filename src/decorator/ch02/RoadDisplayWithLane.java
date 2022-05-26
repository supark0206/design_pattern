package decorator.ch02;

import decorator.ch01.RoadDisplay;

public class RoadDisplayWithLane extends RoadDisplay {
    public void draw(){
        super.draw();
        drawLane();
    }
    private void drawLane(){
        System.out.println("차선표시");
    }
}
