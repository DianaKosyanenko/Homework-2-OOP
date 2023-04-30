public class Main {
    public static void main(String[] args) {
        Terrarium terrarium = new Terrarium();
        terrarium.setRadio(new Radio());

        terrarium.addList(new Spider("Gosha"))
                .addList(new Snake("Irinka"))
                .addList(new Scorpion("Pushoc"))
                .addList(new Frog("Maska"));
        for (var item:terrarium.getListAnimal()) {
            System.out.println(item);

        }
        for (var item:terrarium.getSayble()) {
            System.out.println(item.say());

        }
        System.out.println("-----------");
        for (var item:terrarium.walkables()) {
            System.out.printf("%s - %d\n", item.toString(), item.walkSpeed());
        }
        System.out.println("-----------");
        System.out.println("Winner" + " " + terrarium.winnerWalk());
        System.out.println("------------");
        System.out.println("Winner" + " " + terrarium.winnerJump());
        System.out.println("------------");
        System.out.println("Winner" + " " + terrarium.winnerCrawling());
        System.out.println("------------");
        System.out.println("Winner" + " " + terrarium.winnerSwim());

    }
}
