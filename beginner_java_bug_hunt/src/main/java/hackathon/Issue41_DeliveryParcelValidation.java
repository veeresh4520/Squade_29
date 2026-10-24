public class Issue41_DeliveryParcelValidation {
    public static void main(String[] args) {
        int requested = 0;
        int available = 5;
        if (requested < 0 || requested > available) {
            System.out.println("Request rejected");
        } else {
            System.out.println("Request accepted");
        }
    }
}