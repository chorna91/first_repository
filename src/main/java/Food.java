import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public abstract class Food {
    private double weight;
    private String taste;
    private float protein;
    private float fat;
    private float carbohydrates;


    public Food(double weight, float protein, float fat, float carbohydrates) {
        this.weight = weight;
        this.protein = protein;
        this.fat = fat;
        this.carbohydrates = carbohydrates;
    }

    public Food() {
    }


    public String getProductInformation() {
        return "Fat level - " + Float.toString(getFat()) + "\n" + "Protein level -" + Float.toString(getProtein()) + "\n" + "Weight level -" + Double.toString(getWeight());
    }

    public abstract void onSelect();

    public abstract void eat();

}