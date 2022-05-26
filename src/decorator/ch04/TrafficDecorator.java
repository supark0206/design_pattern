package decorator.ch04;

import decorator.ch03.Display;
import decorator.ch03.DisplayDecorator;

public class TrafficDecorator extends DisplayDecorator {
    public TrafficDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
    }
    
    public void draw(){
        super.draw();
        drawTraffic();
    }

    private void drawTraffic() {
        System.out.println("\t교통량표시");
    }


}
