package week_7.ch03;

public class SLEEPING implements LightState{
    private static LightState instance = new SLEEPING();

    public static LightState getInstance(){
        return instance;
    }
    @Override
    public void on_button_pushed(Light light) {
        System.out.println("Light On Back ");
        light.setState(ON.getInstance());

    }

    @Override
    public void off_button_pushed(Light light) {
        System.out.println("Light off Back");
        light.setState(OFF.getInstance());
    }
}
