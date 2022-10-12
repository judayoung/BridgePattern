package abstraction;

import implementor.Hunting;

public class Cat implements Animal{

    private Hunting hunting;

    public Cat(Hunting hunting) {
        this.hunting = hunting;
    }

    @Override
    public void attack() {
        hunting.attackImpl();
    }

    @Override
    public void eat() {
        System.out.println("생선을 먹는다.");
    }

}
