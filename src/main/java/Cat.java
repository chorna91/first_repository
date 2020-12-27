import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Cat extends Animals{
    enum Color{
        Green, Brown, Blue, Gray
    }

    private String name;
    private Color eyes;


    public Cat (String name, Color eyes){
        this.name = name;
        this.eyes = eyes;
    }

    @Override
    public void sleep() {
        setWatch(false);
        System.out.println("Спать и мурчать");
    }

    public static void main(String[] args) {
        Cat myrsik = new Cat ("Мурзик", Color.Green);
        System.out.println(myrsik.getName());
        System.out.println(myrsik.getEyes());
        myrsik.sleep();
    }


}
