package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        // 첫 번째 상품 주문 정보 입력
//        ProductOrder order1 = new ProductOrder();
//        order1.productName = "두부";
//        order1.price = 2000;
//        order1.quantity = 2;
//        orders[0] = order1;
//
//        // 두 번째 상품 주문 정보 입력
//        ProductOrder order2 = new ProductOrder();
//        order2.productName = "김치";
//        order2.price = 5000;
//        order2.quantity = 1;
//        orders[1] = order2;
//
//        // 세 번째 상품 주문 정보 입력
//        ProductOrder order3 = new ProductOrder();
//        order3.productName = "콜라";
//        order3.price = 1500;
//        order3.quantity = 2;
//        orders[2] = order3;

        orders[0] = createProductOrder("두부", 2000, 2);
        orders[1] = createProductOrder("두부", 2000, 2);
        orders[2] = createProductOrder("두부", 2000, 2);

        printOrders(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println(totalAmount);
    }

    static ProductOrder createProductOrder(String productName, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;

        return order;
    }

    static void printOrders(ProductOrder[] orders){
        for(ProductOrder order : orders){
            System.out.println(order.productName + order.price + order.quantity);
        }
    }
    static int getTotalAmount(ProductOrder[] orders){
        int totalAmount = 0;
        for(ProductOrder order : orders){
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
