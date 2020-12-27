import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class Duck extends Animals {
    private boolean fly;

    public Duck (boolean a, boolean b){
        fly = a;
        setGender(b);
    }

    @Override
    public void run() {
        System.out.println("Только плавать");
    }

    @Override
    public void sleep() {
        setSpeed(1);
        setWatch(false);
        this.setFly(false);
    }

}
