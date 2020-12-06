import lombok.Getter;
import lombok.Setter;

@Getter @Setter
class Cat extends Animals implements Animals.Player {
    private String name;
    private Color eyes;

    public Cat (String name, Color eyes){
        this.name = name;
        this.eyes = Color.Green;
    }

    enum Color{
        Green,
        Brown,
        Blue,
        Gray
    }

    @Override
    public void play() {
        System.out.println("Прыгать");
    }

    @Override
    public void sleep() {
        setWatch(false);
        System.out.println("Спать и мурчать");
    }

}
