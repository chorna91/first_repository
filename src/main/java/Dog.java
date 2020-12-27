import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Dog extends Animals {
    private int jump;
    private Color wool;
    private Volume voice;

    public Dog(int jump, Volume voice, Color wool){
        this.jump = jump;
        this.voice = voice;
        this.wool = wool;
    }

    enum Color { Grey, White, Black, Ginger}

    enum Volume{ Loud, Middle, Quiet}

    @Override
    public void sleep() {
        setSpeed(0);
        setWatch(false);
        setJump(0);
    }

    public static void main(String[] args) {
        Dog yshasty = new Dog (3, Volume.Middle, Color.Black);
        yshasty.sleep();
    }

}
