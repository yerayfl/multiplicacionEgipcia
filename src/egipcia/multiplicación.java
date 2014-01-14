package egipcia;

import java.math.BigInteger;

public class multiplicación {

    public multiplicación() {
    }
    private BigInteger uno = new BigInteger("1");
    private BigInteger cero = new BigInteger("0");
    private BigInteger dos = new BigInteger("2");

    public BigInteger multiplicacionegipcia(BigInteger n, BigInteger m) {
        BigInteger[] resul = new BigInteger[2];
        resul = multiplicaEgipcia(n, m, uno);
        return resul[0];
    }

    private BigInteger[] multiplicaEgipcia(BigInteger n, BigInteger m, BigInteger doble1) {
        BigInteger[] aux = new BigInteger[2];
        if (doble1.compareTo(m) == 1) {
            return new BigInteger[]{cero, cero};
        } else {
            aux = multiplicaEgipcia(n, m, doble1.multiply(dos));
        }
        if ((aux[1].add(doble1)).compareTo(m) <= 0) {
            return new BigInteger[]{(aux[0].add(n.multiply(doble1))),
                (aux[1].add(doble1))};
        } else {
            return aux;
        }
    }
}
