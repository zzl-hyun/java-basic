package extends1.overriding;

public class ElectricCar extends Car {
    public void charge(){
      System.out.println("Car charged");
    }

    @Override
    public void move(){
        System.out.println("Electric Car moving");
    }
}
