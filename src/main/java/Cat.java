import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.With;

@Data @Setter @Getter @With
abstract class Animals {
    boolean gender;
    String family;
    float speed;
    byte frequency;
    boolean watch;

    public abstract void play();

    public abstract void sleep();

}

 class Cat extends Animals {
    @Override
    public void play() {
        System.out.println("Прыгать");
    }

    @Override
    public void sleep() {
        System.out.println("Спать и мурчать");
    }

 }
