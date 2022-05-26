package week_8.ch04;

enum Mode{LAMP,ALARM};

public class Button {
    private Command command;

    public Button(Command command) {
        setCommand(command);
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressed(){
       command.execute();
    }
}
