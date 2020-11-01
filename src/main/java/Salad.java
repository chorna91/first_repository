public class Salad extends Food {
    float protein;

    Salad(float a, float b) {
        super.protein = a; // обращаемся к переменной protein из класса Food
        protein = b; // обращаемся к переменной protein из класса Salad
    }

    void show() {
        System.out.println("i из суперкласса: " + super.protein);
        System.out.println("i в подклассе: " + protein);
    }

    public static void main(String args[]) {
        Salad newSalad = new Salad(10, 20);
        newSalad.show(a, b);
    }
}
