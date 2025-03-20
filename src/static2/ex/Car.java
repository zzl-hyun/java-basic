package static2.ex;

public class Car {
    private String model;
    static private int quantity;

    public Car(String model) {
        this.model = model;
        System.out.println("차랑 구입, 이름: " + model);
        quantity++;
    }

    static public void showTotalCars(){
        System.out.println("구매한 차량 수: " + quantity);
    }
}
