import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Dog extends Animals {
    private int jump;

    @Override
    public void play() {
        System.out.println("Выть на луну");
    }

    @Override
    public void sleep() {
        setSpeed(0);
        setWatch(false);
        setJump(0);
    }

}
