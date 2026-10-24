public class Issue55_DeliveryParcelStringSearch {
    public static void main(String[] args) {
        String storedId = new String("ID-7");
        String requestedId = new String("ID-7");
        if (storedId == requestedId) System.out.println("Parcel ID found");
        else System.out.println("Parcel ID not found");
    }
}