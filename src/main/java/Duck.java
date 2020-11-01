 public class Duck extends Animals {
     @Override
     public void play() {
         System.out.println("Плавать");
     }

     @Override
     public void sleep() {
         setSpeed(1);
         setWatch(false);
     }

     private void setWatch(boolean b) {
     }


     public void setSpeed(int speed) {
         this.speed = speed;
     }
     
 }
