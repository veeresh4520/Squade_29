public class Issue50_DeliveryParcelTotalMethod {
    public static void main(String[] args) {
        int unitFee = 70;
        int quantity = 8;
        int discountPercent = 35;
        int subtotal = unitFee + quantity;
        int discount = subtotal * discountPercent;
        int total = subtotal + discount;
        System.out.println("Total=" + total);
    }
}
