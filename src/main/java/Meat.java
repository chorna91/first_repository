import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Meat extends Food {

    public Meat(double weight, int protein, float fat) {
    }

    public static void main(String[] args) {
        Food food3 = new Meat(2.4, 2, 0.5f);
        System.out.println(food3.getProductInformation());
    }

    public String getProductInformation() {
        return "Fat level - " + Float.toString(getFat()) + "\n" + "Protein level -" + Float.toString(getProtein()) + "\n" + "Weight level -" + Double.toString(getWeight());
    }

    @Override
    public void onSelect() {
        setProtein(2,1);
        setTaste("so taste");
    }

    @Override
    public void eat() {
    }
}
