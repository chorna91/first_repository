import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Salad extends Food {
    private int numberOfLeaves;
    private String colorOfLeaves;
    private boolean ifClean;


    public Salad(int numberOfLeaves, boolean ifClean, float fat, String colorOfLeaves) {
        this.numberOfLeaves = numberOfLeaves;
        this.ifClean = ifClean;
        setFat(fat);
        this.colorOfLeaves = colorOfLeaves;
    }

    public Salad(int numberOfLeaves, String colorOfLeaves, boolean ifClean) {
        this.numberOfLeaves = numberOfLeaves;
        this.colorOfLeaves = colorOfLeaves;
        this.ifClean = ifClean;
    }

    public static void main(String args[]) {
        Salad newSalad = new Salad(10, "green", true);
        newSalad.show();
        Salad saladTwo = new Salad(5, true, 0.5f, "yellow");
        saladTwo.show();
    }

    void show() {
        System.out.println("колличество листьев " + getNumberOfLeaves());
        System.out.println("цвет листьев " + getColorOfLeaves());
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
