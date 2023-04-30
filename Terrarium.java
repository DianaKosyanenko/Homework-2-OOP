import java.util.ArrayList;
import java.util.List;

public class Terrarium {


    private List<Animal> listAnimal = new ArrayList<>();

    public List<Animal> getListAnimal() {
        return listAnimal;
    }

    public Terrarium addList(Animal animal) {
        listAnimal.add(animal);
        return this;
    }

    private Radio radio;

    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    public List<Sayable> getSayble() {
        List<Sayable> sayables = new ArrayList<>();
        for (var item : listAnimal) {
            sayables.add(item);

        }
        sayables.add(radio);
        return sayables;
    }

    public List<Walkable> walkables() {
        List<Walkable> walkables = new ArrayList<>();
        for (var item : listAnimal) {
            if (item instanceof Walkable)
                walkables.add((Walkable) item);

        }
        return walkables;
    }

    public List<Jumping> jumpings() {
        List<Jumping> jumpings = new ArrayList<>();
        for (var item : listAnimal) {
            if (item instanceof Jumping)
                jumpings.add((Jumping) item);

        }
        return jumpings;
    }

    public List<Crawling> crawlings() {
        List<Crawling> crawlings = new ArrayList<>();
        for (var item : listAnimal) {
            if (item instanceof Crawling)
                crawlings.add((Crawling) item);

        }
        return crawlings;
    }

    public List<Waterfable> waterfables() {
        List<Waterfable> waterfables = new ArrayList<>();
        for (var item : listAnimal) {
            if (item instanceof Waterfable)
                waterfables.add((Waterfable) item);

        }
        return waterfables;
    }

    public Walkable winnerWalk() {
        int indx = 0;
        for (int i = 0; i < walkables().size(); i++) {
            if (walkables().get(i).walkSpeed() > walkables().get(indx).walkSpeed())
                indx = i;

        }
        return walkables().get(indx);
    }

    public Jumping winnerJump() {
        int indx = 0;
        for (int i = 0; i < jumpings().size(); i++) {
            if (jumpings().get(i).jumpHeight() > jumpings().get(indx).jumpHeight())
                indx = i;

        }
        return jumpings().get(indx);
    }
    public Waterfable winnerSwim() {
        int indx = 0;
        for (int i = 0; i < waterfables().size(); i++) {
            if (waterfables().get(i).swimspeed() > waterfables().get(indx).swimspeed())
                indx = i;

        }
        return waterfables().get(indx);
    }

    public Crawling winnerCrawling() {
        int indx = 0;
        for (int i = 0; i < crawlings().size(); i++) {
            if (crawlings().get(i).crawlingSpeed() > crawlings().get(indx).crawlingSpeed())
                indx = i;

        }
        return crawlings().get(indx);
    }
}
