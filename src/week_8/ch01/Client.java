package week_8.ch01;

public class Client {
    public static void main(String[] args){
        Lamp lamp = new Lamp();
        Button lampButton = new Button(lamp);
        lampButton.pressed();
    }
}
