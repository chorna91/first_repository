class Animal{
    private boolean gender;
    private String family;
    private float speed;
    private byte frequency;
    private boolean watch;

    public byte getFrequency() {
        return frequency;
    }

    public void setFrequency(byte frequency) {
        this.frequency = frequency;
    }

    public static void main(String[] args){
        Animal myAnimal1 = new Animal();
        myAnimal1.play();
    }

    public void play() {
        System.out.println("Играть");
    }

    public void sleep() {
        setSpeed(0);
        setFrequency((byte) 1);
        setWatch(false);
    }

    public boolean isWatch() {
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
