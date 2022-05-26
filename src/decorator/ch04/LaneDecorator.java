package decorator.ch04;

import decorator.ch03.Display;
import decorator.ch03.DisplayDecorator;

public class LaneDecorator extends DisplayDecorator {
    public LaneDecorator(Display decoratedDisplay){
        super(decoratedDisplay);
    }
    public void draw(){
        super.draw();
        drawLane();
    }
    
    private void drawLane() {
        System.out.println("\t차선 표시");
    }

}
