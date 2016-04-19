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
public class Main {
    public static void main(String args[])
    {
        Fish fish=new Fish();
       System.out.println( fish.mainFish((new BigInteger("10")), (new BigInteger("11"))));
      // ECC_Root root=new ECC_Root();
      // System.out.println(root.findRoots((new BigInteger("2")), (new BigInteger("7"))));
    }
    
}
