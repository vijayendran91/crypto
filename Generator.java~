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
public class Generator {

    static ArrayList list;
    static Scanner scan;
    static BigInteger prime, pmo;

    public Generator() {
        list = new ArrayList();
        scan = new Scanner(System.in);

    }

    public static void main(String args[]) {
        PrimeFact pf = new PrimeFact();
        Generator gen = new Generator();
        prime = scan.nextBigInteger();
        pmo = prime.subtract(BigInteger.ONE);
        list = pf.primeCalc(pmo);
        gen.generateVal(new BigInteger("2"));

    }

    public void generateVal(BigInteger g) {
        BigInteger temp;
        int flag=0;
        while (gLessorEql(g, pmo)) {
                
            for(Object obj:list)
            {
                temp=new BigInteger(String.valueOf(obj));
                temp=pmo.divide(temp);
                temp=g.pow(temp.intValue());
                temp=temp.mod(prime);
                //System.out.println(temp);
                if(temp.equals(BigInteger.ONE))
                {
                    
                    flag=0;
                    break;
                }
                else
                {
                    flag=1;
                }
            }
            if(flag==1)
            {
                printG(g);
                break;
                
            }
            
            g=g.add(BigInteger.ONE);
        }
    }

    private boolean gLessorEql(BigInteger g, BigInteger pmo) {
        int rslt;
        boolean ret = false;
        rslt = g.compareTo(pmo);
        if (rslt == 0) {
            ret = true;
        } else if (rslt == -1) {
            ret = true;
        } else if (rslt == 1) {
            ret = false;
        }
        return ret;

    }

    private void printG(BigInteger g) {
      
        System.out.println("value is"+g);
    }

}
