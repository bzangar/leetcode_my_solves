import java.math.BigInteger;

//30.06.2025

public class _67 {
    public static void main(String[] args) {
        System.out.println( addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
                "1101010101010101010101010101010101010101010101010101010101010101"));
    }

    static  public String addBinary(String a, String b) {
        BigInteger a1 = new BigInteger(a, 2);
        BigInteger b1 = new BigInteger(b, 2);
        BigInteger sum = a1.add(b1);
        return sum.toString(2);
    }
}
//
//Runtime
//5
//ms
//        Beats
//17.55%
//
//Memory
//42.52
//MB
//        Beats
//29.04%
