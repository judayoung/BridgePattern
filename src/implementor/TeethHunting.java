package implementor;

public class TeethHunting implements Hunting {

    private String teeth;

    public TeethHunting(String teeth) {
        this.teeth = teeth;
    }

    @Override
    public void attackImpl() {
        System.out.println(teeth + "로 물어뜯는다.");
    }
}
