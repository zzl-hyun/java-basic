package poly.car1;

public class Driver {
    private Car car;

    public void setCar(Car car) {
        System.out.println("set car"+ car);
        this.car = car;
    }
    public void drive() {
        System.out.println("drive car");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
