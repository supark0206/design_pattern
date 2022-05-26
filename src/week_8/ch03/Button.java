package week_8.ch03;

enum Mode{LAMP,ALARM};

public class Button {
    private Lamp theLamp;
    private Alarm theAlarm;
    private Mode theMode;


    public Button(Lamp theLamp,Alarm theAlarm) {
        this.theAlarm = theAlarm;
        this.theLamp = theLamp;
    }
    public void setMode(Mode mode){
        this.theMode = mode;
    }
    public void pressed(){
        switch (theMode){
            case LAMP:
                theLamp.turnOn();
            case ALARM:
                theAlarm.start();
                break;
        }
    }
}
