package strategy.Robot_01;

public abstract class Robot{
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void attack();

    public abstract void move();
}

class TaekwonV extends Robot{
    public TaekwonV(String name){
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("미사일공격");
    }

    @Override
    public void move() {
        System.out.println("걷기");
    }
}

class Atom extends Robot{

    public Atom(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("강한 펀치");
    }

    @Override
    public void move() {
        System.out.println("날기");
    }
}

class Client{
    public static void main(String args[]){
        Robot taekwonV = new TaekwonV("TaekwonV");
        Robot atom = new Atom("Atom");

        System.out.println("My name is "+ taekwonV.getName() );
        taekwonV.attack();
        taekwonV.move();

        System.out.println("My name is "+ atom.getName() );
        atom.attack();
        atom.move();
    }
}

