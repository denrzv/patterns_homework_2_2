public class BinOps {
    final private int RADIX = 2;

    public String sum(String a, String b) {
        int aInt = Integer.parseInt(a, RADIX);
        int bInt = Integer.parseInt(b, RADIX);

        return Integer.toBinaryString(aInt + bInt);
    }

    public String mult(String a, String b) {
        int aInt = Integer.parseInt(a, RADIX);
        int bInt = Integer.parseInt(b, RADIX);

        return Integer.toBinaryString(aInt * bInt);
    }
}