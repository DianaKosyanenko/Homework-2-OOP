public abstract class Arachnids extends Animal {

    public Arachnids(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "Bugs";
    }
}
