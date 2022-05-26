package week_5.Robot_02;

public class Client {
    public static void main(String[] args){
        Robot taekwonV =  new TaekwonV("TaekwonV");
        Robot atom = new Atom("Atom");

        taekwonV.setMovingStrategy(new WalkingStrategy());
        taekwonV.setAttackStrategy(new MissileStrategy());

        atom.setMovingStrategy(new FlyingStrategy());
        atom.setAttackStrategy(new PunchStrategy());

        System.out.println("내 이름은 "+ taekwonV.getName());
        taekwonV.move();
        taekwonV.attack();

        System.out.println("내 이름은 "+ atom.getName());
        atom.move();
        atom.attack();
    }
}
