import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Fish extends Food {
    private String plankton;

    public Fish() {
    }

    @Override
    public void onSelect() {
        setWeight(2);
        setTaste("taste");

    }

    @Override
    public void eat() {
        Fish fish = new Fish();
        System.out.println("Рыба есть " + fish.getPlankton());
    }

    public static void main(String[] args) {
        Food fish = new Fish();
        System.out.println("Рыба содержит в себе " + fish.getProductInformation());
    }

}
