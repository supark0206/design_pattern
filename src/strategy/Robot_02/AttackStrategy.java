package strategy.Robot_02;

public interface AttackStrategy {
    void attack();
}

class PunchStrategy implements AttackStrategy {

    @Override
    public void attack() {
        System.out.println("Punch!!!");
    }
}

class MissileStrategy implements AttackStrategy {

    @Override
    public void attack() {
        System.out.println("Missile!!!");
    }
}
