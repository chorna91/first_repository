import lombok.Getter;
import lombok.Setter;


interface LivingCreature {
    void run();
    void sleep();

}

@Setter
@Getter
abstract class Animals implements LivingCreature {
    private boolean gender;
    private String family;
    private float speed;
    private byte frequency;
    private boolean watch;

    public Animals (){
    }

    public void run() {

    }

    public void sleep(){}

}
