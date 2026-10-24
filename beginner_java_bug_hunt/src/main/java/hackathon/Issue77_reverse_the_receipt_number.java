public class Issue77_reverse_the_receipt_number { public static void main(String[] args) { int n=1240, r=0; while(n>0) { r=r*10+n%10; n/=100; } System.out.println("Reverse: "+r); } }
