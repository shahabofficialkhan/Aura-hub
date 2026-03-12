import java.lang.classfile.instruction.SwitchCase;
import java.util.Random;

public class Test {
    

    public static void main(String[] args) {
        AutomaticCar c1= new AutomaticCar("CAR 1", 20);
        AutomaticCar c2= new AutomaticCar("CAR 2", 19);
        AutomaticCar c3= new AutomaticCar("CAR 3", 25);
        Random random = new Random();
        int r  = 0;
        int r2 = 0;
    for (int i = 1 ;  i < 4 ; i++)
      {
        r = random.nextInt(500);
        r2 = random.nextInt(500);
       c1.updatespeed(r); 
       c2.updatespeed(r2); 


    //    c3.updatespeed(random.nextInt(500)); 
    //   System.out.println("Car 1  "+ r + "\nCar 2  "+ r2 );
        // System.out.println(c1.getgear()+ "\n"+c2.getgear() +"\n"+c2.getgear());

      }
        
   
    if (r == r2 ){
        System.out.println("No one ");
    }  
    else
    if (r < r2 ){
        System.out.println("Car 2 Win ");
    }
   else {
        System.out.println("Car 1 Win ");
    }
}
}
