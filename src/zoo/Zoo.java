package zoo;

public class Zoo {
    public static void main(String[] args) {
        Cage<Monkey> monkeyCage = new Cage<>();
        monkeyCage.setAnimal1(new Monkey());
        monkeyCage.setAnimal2(new Monkey());
        Monkey animal1 = monkeyCage.getAnimal1();

        Cage<Lion> lionCage = new Cage<>();
        lionCage.setAnimal1(new Lion());
        lionCage.setAnimal2(new Lion());
        Lion animal11 = lionCage.getAnimal1();

    }
}
