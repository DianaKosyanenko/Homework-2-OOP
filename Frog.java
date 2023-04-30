public class Frog  extends Amphibians implements Jumping, Waterfable{
    public Frog(String name) {
        super(name);
    }

    @Override
    public int jumpHeight() {
        return 20;
    }

    @Override
    public String say() {
        return null;
    }

    @Override
    public int swimspeed() {
        return 20;
    }
}
