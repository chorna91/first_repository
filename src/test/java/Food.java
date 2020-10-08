public class Food {
    private double weight;
    public boolean taste;
    private float protein;
    private float fat;

  public static void main(double meal){
      Food animal = new Food();
      animal.setWeight(10.4);
      animal.setFat(5);
      animal.setProtein((float) 2.3);
      meal = animal.getFat() + animal.getProtein() + animal.getWeight();
  }

    public boolean isTaste() {
        return taste;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public float getProtein() {
        return protein;
    }

    public void setProtein(float protein) {
        this.protein = protein;
    }

    public float getFat() {
        return fat;
    }

    public void setFat(float fat) {
        this.fat = fat;
    }
}