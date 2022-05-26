package week_6.printer04;

public class Printer {
    private static Printer printer = null;
    private int counter = 0;
    private Printer() {}

    public synchronized static Printer getPrinter(){
        if(printer==null) {
            printer = new Printer();
        }
        return printer;
    }



    public void print(String str){
            counter++;
            System.out.println(str+"/"+counter);
    }
}
