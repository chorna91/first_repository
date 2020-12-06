import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Type;


@Setter
@Getter
abstract class Animals {
    private boolean gender;
    private String family;
    private float speed;
    private byte frequency;
    private boolean watch;

    public Animals (){

    }

    interface Player{
        public abstract void play();
    }


    public abstract void sleep();

}
