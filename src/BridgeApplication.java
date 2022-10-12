import abstraction.Animal;
import abstraction.Cat;
import abstraction.Dog;
import implementor.ClawHunting;
import implementor.Hunting;
import implementor.TeethHunting;

public class BridgeApplication {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Let's begin Bridge Pattern with an animal example!\n");

        System.out.println("...create a cat hunting with a claw");
        Hunting hunting = new ClawHunting();
        Animal clawCat = new Cat(hunting);
        clawCat.attack();
        clawCat.eat();

        System.out.println("...create a cat hunting with teeth");
        hunting = new TeethHunting("송곳니");
        Animal teethCat = new Cat(hunting);
        teethCat.attack();
        teethCat.eat();

        System.out.println("...create a dog hunting with teeth");
        Animal teethDog = new Dog(hunting);
        teethDog.attack();
        teethDog.eat();
    }

}
