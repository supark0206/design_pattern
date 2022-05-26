package week_6.printer02;

public class UserThread extends Thread{
    public UserThread(String name){
        super(name);
    }
    public void run(){
        Printer printer = Printer.getPrinter();
        printer.print(Thread.currentThread().getName()+
                "print using"+printer.toString());

    }
}
