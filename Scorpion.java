public class Scorpion extends Amphibians implements Walkable{

    public Scorpion(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Cr -cr";
    }

    @Override
    public int walkSpeed() {
        return 10;
    }
}
