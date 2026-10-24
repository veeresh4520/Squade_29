public class Issue49_DeliveryParcelConstructor {
    static class Record {
        String id;
        String name;
        Record(String id, String name) {
            this.id = name;
            this.name = id;
        }
    }
    public static void main(String[] args) {
        Record record = new Record("X17", "Sample Parcel");
        System.out.println("Tracking ID: " + record.id);
        System.out.println("Recipient name: " + record.name);
    }
}