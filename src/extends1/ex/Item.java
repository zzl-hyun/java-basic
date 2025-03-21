package extends1.ex;

public class Item {
    protected String name;
    protected int price;

    protected Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    protected void print(){
        System.out.println(name + price);
    }

    protected int getPrice(){
        return price;
    }
}
