/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codes;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author vijayendran
 */
class Fish {

    static Scanner scan;
    static ArrayList quotlist, rem, inv;

    Fish() {
        scan = new Scanner(System.in);
        quotlist = new ArrayList();
        rem = new ArrayList();
        inv = new ArrayList();
    }

    public BigInteger mainFish(BigInteger x,BigInteger y) {
        Fish fish = new Fish();
        rem.add(y);
        rem.add(x);
        fish.divide();
        fish.inversion();
        return fish.oddEven();
    }

    public void divide() {
        BigInteger temp1, temp2;
        while (!(rem.get(rem.size() - 1).equals(new BigInteger("1")))) {
            temp1 = (BigInteger) rem.get(rem.size() - 1);
            temp2 = (BigInteger) rem.get(rem.size() - 2);
            rem.add(temp2.remainder(temp1));
            quotlist.add(temp2.divide(temp1));

        }
      //  System.out.println(rem);
        //System.out.println(quotlist);
    }

    public void inversion() {
        inv.add(new BigInteger("0"));
        inv.add(new BigInteger("1"));

        BigInteger qtemp, temp1, temp2, temp3;

        int length = quotlist.size() - 1;
        while (length >= 0) {
            qtemp = (BigInteger) quotlist.get(length);
            temp1 = (BigInteger) inv.get(inv.size() - 1);
            temp2 = (BigInteger) inv.get(inv.size() - 2);
            temp3 = qtemp.multiply(temp1);
            inv.add(temp3.add(temp2));
            length--;
        }

       // System.out.println(inv);
    }

    public BigInteger oddEven() {
        BigInteger temp1;
        if((rem.size()-1)%2==0)
        {
            temp1=((BigInteger)rem.get(0)).subtract((BigInteger)(inv.get(inv.size()-1)));
         //   System.out.println("The inverse value is "+temp1);
        }
        else
        {
           // System.out.println("The inverse value is"+inv.get(inv.size()-1));
            temp1=(BigInteger) inv.get(inv.size()-1);
        }
        return temp1;
    }


    public static void main(String args[])
    {
        Fish fish=new Fish();
       System.out.println( fish.mainFish((new BigInteger("10")), (new BigInteger("11"))));
      // ECC_Root root=new ECC_Root();
      // System.out.println(root.findRoots((new BigInteger("2")), (new BigInteger("7"))));
    }

}
