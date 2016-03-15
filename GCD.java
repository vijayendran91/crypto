/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codes;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author vijayendran
 */
public class GCD {

    public BigInteger retGCD(BigInteger one,BigInteger two) {
        BigInteger min, i;
        Scanner scan = new Scanner(System.in);
        if ((one.compareTo(two)) == -1) {
            min = two;
        } else {
            min = one;
        }

        i = min;
        while ((i.compareTo(BigInteger.ONE)) == 1 || ((i.compareTo(BigInteger.ONE))) == 0) {

            if ((one.mod(i)).intValue() == 0 && (two.mod(i)).intValue() == 0) {
                //System.out.println("GCD is " + i);
                break;
            }

            i=i.subtract(BigInteger.ONE);
        }

        return i;
    }

}
