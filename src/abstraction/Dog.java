package abstraction;

import implementor.Hunting;

public class Dog implements Animal{

    private Hunting hunting;

    public Dog(Hunting hunting) {
        this.hunting = hunting;
    }

    @Override
    public void attack() {
        hunting.attackImpl();
    }

    @Override
    public void eat() {
        System.out.println("날고기를 먹는다.");
    }
}
