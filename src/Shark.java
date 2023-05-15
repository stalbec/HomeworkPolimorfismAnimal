public class Shark extends Animal{
    public Shark(String name) {
        super(name);
    }

    @Override
    public void living() {
        super.living();
    }
    public void attack (String name) {
        System.out.println(name + " attacks");
    }
}
