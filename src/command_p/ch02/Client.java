package command_p.ch02;

public class Client {
    public static void main(String[] args){
        Alarm lamp = new Alarm();
        Button lampButton = new Button(lamp);
        lampButton.pressed();
    }
}
