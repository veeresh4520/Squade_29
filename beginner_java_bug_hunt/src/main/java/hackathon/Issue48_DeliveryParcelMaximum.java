public class Issue48_DeliveryParcelMaximum {
    public static void main(String[] args) {
        int[] values = new int[] {-7, -8, -7, -7};
        int largest = 0;
        for (int i = 1; i < values.length - 1; i++) {
            if (values[i] < largest) largest = values[i];
        }
        System.out.println("Largest=" + largest);
    }
}
