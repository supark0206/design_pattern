package decorator.ch04;

import decorator.ch03.Display;

public class CrossingDecorator extends DisplayDecorator{
    public CrossingDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
    }
    public void draw(){
        super.draw();
        drawCrossing();
    }
    private void drawCrossing(){
        System.out.println("\t횡단보도표시");
    }
}
