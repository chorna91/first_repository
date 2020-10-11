public class Food {
    private double weight;
    private boolean taste;
    private float protein;
    private float fat;
    static double meal;

  public static void main(){
      Food food = new Food();
      food.setWeight(10.4);
      food.setFat(5);
      food.setProtein((float) 2.3);
      meal = food.getFat() + food.getProtein() + food.getWeight();
  }

    public boolean isTaste() {
        return taste;
    }

    public void setTaste(boolean taste) {
        this.taste = taste;
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