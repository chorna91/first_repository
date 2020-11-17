public class Salad extends Food {
    private int numberOfLeaves;
    private String colorOfLeaves;
    private boolean ifClean;


    public Salad(int numberOfLeaves, boolean ifClean, float fat) {
        this.numberOfLeaves = numberOfLeaves;
        this.ifClean = ifClean;
        setFat(fat);
    }

    public Salad(int i1, String i2, boolean i3) {
    }

    public static void main(String args[]) {
        Salad newSalad = new Salad( 10, "green", true);
        newSalad.show();
    }

    void show() {
        System.out.println("колличество листьев " + numberOfLeaves);
        System.out.println("цвет листьев " + colorOfLeaves);
    }

    @Override
    public void onSelect() {
        System.out.println("выбирай салат кажый день");
    }

    @Override
    public void eat() {
        System.out.println("салат нужно есть каждый день");
    }
}
