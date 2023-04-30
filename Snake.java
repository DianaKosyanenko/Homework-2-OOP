public class Snake extends Amphibians implements Crawling, Waterfable{
    public Snake(String name) {
        super(name);
    }

    @Override
    public int crawlingSpeed() {
        return 15;
    }

    @Override
    public String say() {
        return "shhhhh";
    }

    @Override
    public int swimspeed() {
        return 25;
    }
}
