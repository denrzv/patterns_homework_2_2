public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();

        String a = "00010100";
        String b = "10100100";

        System.out.printf("%s + %s = %s%n", a, b, bins.sum(a, b));
        System.out.printf("%s * %s = %s%n", a, b, bins.mult(a, b));
    }
}