/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codes;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 *
 * @author vijayendran
 */
public class ScalarMulti {

    Power pow = new Power();
    Fish fish = new Fish();
    BigInteger xr, yr, B;

    public ArrayList Multi(BigInteger xp, BigInteger yp, BigInteger xq, BigInteger yq, BigInteger a, BigInteger p) {
        BigInteger Bnum, BDen, B, Bsq, A, Aden, Anum;
        ArrayList list = new ArrayList();
        if (xp.equals(xq) && yp.equals(yq)) {
            Bnum = (pow.pow(xp, (new BigInteger("2")))).add(a);
            BDen = yp.multiply((new BigInteger("2")));
            BDen = fish.mainFish(BDen, p);
            B = Bnum.multiply(BDen);
            Bsq = pow.pow(B, (new BigInteger("2")));
            xr = Bsq.subtract((new BigInteger("2")).multiply(xp));
            yr = (B.multiply(xp.subtract(xr))).subtract(yp);

        } else {
            if ((BigInteger.ZERO).equals(xp.subtract(xq))) {
                list.add("o");
                list.add("o");

            } else {
                Aden = xp.subtract(xq);
                Anum = yp.subtract(yq);
                Aden = fish.mainFish(Aden, p);
                A = Anum.multiply(Aden);
                xr = ((pow.pow(A, (new BigInteger("2"))).subtract(xp))).subtract(xq);
                yr = (A.multiply(xp.subtract(xr))).subtract(yp);
                list.add(xr.mod(p));
                list.add(yr.mod(p));

            }
        }
        return list;
    }

    public static void main(String args[]) {
        ScalarMulti sm = new ScalarMulti();
        ArrayList list1 = new ArrayList();
        list1 = sm.Multi((new BigInteger("18")), (new BigInteger("14")), (new BigInteger("18")), (new BigInteger("10")), (new BigInteger("2")), (new BigInteger("23")));
        System.out.print(list1);
    }

}
