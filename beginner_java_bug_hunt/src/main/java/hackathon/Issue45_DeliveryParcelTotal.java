public class Issue45_DeliveryParcelTotal {
    public static void main(String[] args) {
        int[] values = {2, 3, 4};
        int total = 0;
        for (int i = 0; i < values.length - 1; i++) {
            total += values[i];
        }
        System.out.println("Total Delivery parcels: " + total);
    }
}