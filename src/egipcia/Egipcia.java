package egipcia;

import java.math.BigInteger;

public class Egipcia {

    public static void main(String[] args) {
        multiplicación a = new multiplicación();
        BigInteger c = new BigInteger("5");
        BigInteger b = new BigInteger("55");


        System.out.println(a.multiplicacionegipcia(c, b));

    }
}
