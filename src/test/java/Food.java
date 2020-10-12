public class Food {
    private double weight;
    private boolean taste;
    private float protein;
    private float fat;

  public static void main(){
      Food food = new Food();
      food.setWeight(10.4);
      food.setFat(5);
      food.setProtein((float) 2.3);
      System.out.println(food.getProductInformation());
  }

  public String getProductInformation(){
      return "Fat level - "+ Float.toString(getFat()) +"\n"+ "Protein level - "+ Float.toString(getProtein()) +"\n"+ "Weight level - "+ Double.toString(getWeight());
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