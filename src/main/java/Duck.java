import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.With;

@Data @Setter @Getter @With
public class Duck extends Animals {
    private boolean fly;

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
