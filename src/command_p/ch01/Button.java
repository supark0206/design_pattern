package command_p.ch01;

public class Button {
    private Lamp theLamp;

    public Button(Lamp theLamp) {
        this.theLamp = theLamp;
    }
    public void pressed(){
        theLamp.turnOn();
    }
}
