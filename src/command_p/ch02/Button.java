package command_p.ch02;

public class Button {
    private Alarm theAlarm;

    public Button(Alarm theAlarm) {
        this.theAlarm = theAlarm;
    }
    public void pressed(){
        theAlarm.turnOn();
    }
}
