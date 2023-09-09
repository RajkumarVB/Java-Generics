package zoo;

public class Zoo {
    public static void main(String[] args) {
        Cage<Monkey> monkeyCage = new Cage(new Monkey(), new Lion()); // Raw use
//        Cage<Monkey> monkeyCage1 = new Cage<Monkey>(new Monkey(), new Lion()); // This will not work!
        Cage<Monkey> monkeyCage1 = new Cage<Monkey>(new Monkey(), new Monkey());
    }
}
