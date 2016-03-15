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
public class NewClass {
    
    
    public static void computeE() {
        GCD gcd=new GCD();
        BigInteger e,phi_n;
        phi_n=new BigInteger("557938784200");
        e=(new BigInteger("7"));
        while(((e.compareTo(phi_n))==-1) || ((e.compareTo(phi_n))==0))
        {
            if((gcd.retGCD(e, phi_n).equals(BigInteger.ONE)))
            {
                break;
            }
            e=e.add(BigInteger.ONE);
        
        }
    
        System.out.println("e is "+e);
    }
    public static void main(String args[])
    {
        computeE();
    }

}
