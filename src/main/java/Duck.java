import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class Duck extends Animals implements Animals.Player {
    private boolean fly;

    public Duck (boolean a, boolean b){
        fly = a;
        setGender(b);
    }

    @Override
    public void play() {
        System.out.println("Плавать");
    }

    @Override
    public void sleep() {
        setSpeed(1);
        setWatch(false);
        this.setFly(false);
    }

}
