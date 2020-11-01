public class Fish extends Food {
    public Fish(double weight, int protein, float fat) {
    }

    public static void main(String[] args) {
        Food fish = new Fish(6.4, 9, 0);
        System.out.println("Рыба содержит в себе "+ fish.getProductInformation());
    }
}
