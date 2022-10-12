package implementor;

public class ClawHunting implements Hunting{
    @Override
    public void attack() {
        System.out.println("발톱으로 할퀸다.");
    }
}
