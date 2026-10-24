public class Issue53_DeliveryParcelSearch {
    public static void main(String[] args) {
        int[] ids = new int[] {7, 8, 7, 129};
        int target = 129;
        int found = 0;
        for (int i = 0; i < ids.length - 1; i++) {
            if (ids[i] != target) found = i + 1;
        }
        System.out.println("Index=" + found);
    }
}
