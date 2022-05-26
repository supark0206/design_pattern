package week_6.printer01;

public class Printer {
    private static Printer printer = null;
    private Printer() {}

    public static Printer getPrinter(){
        if(printer==null) {
            printer = new Printer();
        }
        return printer;
    }



    public void print(String str){
        System.out.println(str);
    }
}
