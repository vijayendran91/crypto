/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codes;

import java.math.BigInteger;

/**
 *
 * @author vijayendran
 */
public class ECC_Root {

    static BigInteger a, p, temp, r;

    ECC_Root() {

    }

    public BigInteger findRoots(BigInteger a,BigInteger p) {
        Power pow=new Power();
        temp = p.add((new BigInteger("1")));
        temp=temp.divide((new BigInteger("4")));
        temp=pow.pow(a, temp);
        r=temp.mod(p);
        
        return r;
    }
}
