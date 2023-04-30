public  abstract class Amphibians extends Animal {
    public Amphibians(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "mise";
    }
}
