package week_7.ch02;

public class Light {
    private static int ON = 0;
    private static int OFF = 1;
    private static int SLEEPING = 2;
    private int state;

    public Light(){
        state = OFF;
    }

    public void on_button_pushed(){
        if(state == ON){
            System.out.println("취침등 상태");
            state = SLEEPING;
        }
        else if (state == SLEEPING){
            System.out.println("Light On");
            state = ON;
        }
        else{
            System.out.println("Light ON");
            state = ON;
        }
    }

    public void off_button_pushed(){
        if(state == OFF){
            System.out.println("반응없음");
        }
        else if(state == SLEEPING){
            System.out.println("Light OFF");
            state = OFF;
        }
        else{
            System.out.println("LightOFF");
            state = OFF;
        }
    }
}
