public class Spider extends Arachnids implements Jumping, Walkable {
    public Spider(String name) {
        super(name);
    }

    @Override
    public int jumpHeight() {
        return 100;
    }

    @Override
    public String say() {
        return "Ch - ch";
    }

    @Override
    public int walkSpeed() {
        return 25;
    }
}
