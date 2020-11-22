import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
abstract class Animals {
    boolean gender;
    String family;
    float speed;
    byte frequency;
    boolean watch;

    public abstract void play();

    public abstract void sleep();

}
