
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codes;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vijayendran
 */
public class PrimeFact {

    BigInteger value;
    static Scanner scan;
    ArrayList factors;

    public PrimeFact() {
        scan = new Scanner(System.in);
        factors = new ArrayList();

    }

    public ArrayList primeCalc(BigInteger value) {
        BigInteger i = new BigInteger("2");
        //System.out.println(i.add(BigInteger.ONE)+" "+compareB(i, value));
        
        while(compareB(i, value))
        {
            while((value.mod(i)).equals(BigInteger.ZERO))
            {
                factors.add(i);
                value=value.divide(i);
            }
            i=i.add(BigInteger.ONE);
        }
        return factors;
    }

    public static boolean compareB(BigInteger a, BigInteger b) {
        int rslt;
        boolean ret = false;
        rslt = a.compareTo(b);
        if (rslt == 0) {
            ret = true;
        } else if (rslt == -1) {
            ret = true;
        } else if (rslt == 1) {
            ret = false;
            }
        return ret;
    }


}
