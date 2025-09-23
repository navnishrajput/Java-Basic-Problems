public class Order {

    String orderId;
    String orderDate;

    Order(String orderId, String orderDate){
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

}
class ShippedOrder extends Order{
    int trackingNumber;

    ShippedOrder(int trackingNumber , String orderId, String orderDate){
        super(orderId,orderDate);
        this.trackingNumber = trackingNumber;
    }

}
class DeliveredOrder extends ShippedOrder{
    String deliverydate;
    DeliveredOrder(String orderId, String orderDate, int trackingNumber, String deliverydate){
        super(trackingNumber,orderId,orderDate);
        this.deliverydate = deliverydate;
    }
    void getOrderStatus(){
        System.out.println("Order confrim");
    }
    void Display(){
        System.out.println("Order Id: "+orderId);
        System.out.println("Order date: "+orderDate);
        System.out.println("TRack number: "+trackingNumber);
        System.out.println("Delivery Date: "+deliverydate);
        getOrderStatus();
    }

}
class Final1{
    public static void main(String[] args) {
        DeliveredOrder D = new DeliveredOrder("N123","12 Aug",12324,"15 august");
        D.Display();

    }

}
