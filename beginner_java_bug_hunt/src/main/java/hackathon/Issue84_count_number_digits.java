public class Issue84_count_number_digits { public static void main(String[] args) { int n=1133, count=0; while(n>0) { count++; n/=100; } System.out.println("Digits: "+(count+1)); } }
