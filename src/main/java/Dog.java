import lombok.Data;


@Data
public class Dog extends Animals {
    @Override
    public void play() {
        System.out.println("Выть на луну");
    }

    @Override
    public void sleep() {
        setSpeed(0);
        setWatch(false);
    }

    private void setWatch(boolean b) {
    }

    private void setSpeed(int i) {
    }

}
