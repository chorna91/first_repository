import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Dog extends Animals implements Animals.Player {
    private int jump;
    private Color wool;
    private Volume voice;

    public Dog(int x, Volume y, Color z){
        jump = x;
        voice = Volume.Loud;
        wool = Color.Ginger;
    }

    enum Color {
        Grey,
        White,
        Black,
        Ginger
    }

    enum Volume{
        Loud,
        Middle,
        Quiet
    }

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
