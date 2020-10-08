public class Animals {
    private int age;
    public double weight;
    private boolean gender;
    private String family;
    private float speed;
    private byte frequency;
    private boolean watch;

    public static void main(String[] args) {
        Animals myAnimal1 = new Animals();
        myAnimal1.setAge(5);
        System.out.println("my animal age is "+ myAnimal1.getAge());
    }

    public int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double value){ weight = value; }

    public static void sleep() {
        Animals sleepAnimal = new Animals();
        sleepAnimal.setSpeed(0);
        sleepAnimal.setFrequency((byte) 40);
        sleepAnimal.setWatch(false);
    }

    public byte getFrequency() {
        return frequency;
    }

    protected void setFrequency(byte frequency) {
        this.frequency = frequency;
    }

    public boolean getWatch() {
        return watch;
    }

    public void setWatch(boolean watch) {
        this.watch = watch;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }


    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }
}

