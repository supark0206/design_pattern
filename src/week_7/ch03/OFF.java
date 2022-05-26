package week_7.ch03;

public class OFF implements LightState{
    private static LightState instance = new OFF();

    public static LightState getInstance(){
        return instance;
    }
    @Override
    public void on_button_pushed(Light light) {
        System.out.println("Light on");
        light.setState(ON.getInstance());

    }

    @Override
    public void off_button_pushed(Light light) {
        System.out.println("반은 없음");
        light.setState(OFF.getInstance());
    }
}
