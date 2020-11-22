class Cat extends Animals {
    @Override
    public void play() {
        System.out.println("Прыгать");
    }

    @Override
    public void sleep() {
        setWatch(false);
        System.out.println("Спать и мурчать");
    }

}
