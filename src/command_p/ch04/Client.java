package command_p.ch04;

public class Client {
    public static void main(String[] args){
        Lamp lamp = new Lamp();
        Command lampOnCommand = new LampOnCommand(lamp);
        Button btn1 = new Button(lampOnCommand);
        btn1.pressed();

        Alarm alarm = new Alarm();
        Command alarmOnCommand = new AlarmOnCommand(alarm);
        Button btn2 = new Button(alarmOnCommand);
        btn2.pressed();

        btn2.setCommand(lampOnCommand);
        btn2.pressed();

    }
}
