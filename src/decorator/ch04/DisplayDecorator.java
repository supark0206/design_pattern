package decorator.ch04;

import decorator.ch03.Display;

public class DisplayDecorator extends decorator.ch03.Display {

    private decorator.ch03.Display decoratedDisplay;

    public DisplayDecorator(Display decoratedDisplay) {
        this.decoratedDisplay = decoratedDisplay;
    }

    @Override
    public void draw() {
        decoratedDisplay.draw();
    }
}
