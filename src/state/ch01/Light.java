package state.ch01;

public class Light {
    private static int ON = 0;
    private static int OFF = 1;
    private int state;

    public Light(){
        state = OFF;
    }

    public void on_button_pushed(){
        if(state == ON){
            System.out.println("반응없음");

        }
        else{
            System.out.println("LightON");
            state = ON;
        }
    }

    public void off_button_pushed(){
        if(state == OFF){
            System.out.println("반응없음");
        }
        else{
            System.out.println("LightOFF");
            state = OFF;
        }
    }
}
