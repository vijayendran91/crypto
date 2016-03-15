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
public class SandM {
    static ArrayList modv,rem,exp;
    static Scanner scan;
    static int current=0; 
    
    public SandM() {
        modv=new ArrayList();
        rem=new ArrayList();
        exp=new ArrayList();
        scan=new Scanner(System.in);
    }
    
    public BigInteger findMod(BigInteger u,BigInteger m,BigInteger p)
    {
        BigInteger temp1,temp2,temp3,temp4,A;
        exp.add(m);
        rem.add(m.mod(new BigInteger("2")));
        modv.add(u.mod(p));
        current++;
        temp1=(BigInteger) exp.get(current-1);
        System.out.println(!(temp1.equals(BigInteger.ONE)));
        
        while(!(temp1.equals(BigInteger.ONE)))
        {
            temp1= (((BigInteger)exp.get(current-1)).divide(new BigInteger("2")));
            exp.add(temp1);
           // System.out.println(temp2);
            temp3= (((BigInteger)exp.get(current)).mod(new BigInteger("2")));
            rem.add(temp3);
            temp4=(BigInteger) modv.get(current-1);
            BigInteger temp5 = temp4.pow(2);
            BigInteger temp6 = temp5.mod(p);
            modv.add(temp6);
            current++;
            //System.out.println("punda baadu");
        
        }
        //System.out.println("otha ommaala");
        A=BigInteger.ONE;
        current--;
        while(current>=0)
        {
            if(!(((BigInteger)rem.get(current)).equals(BigInteger.ZERO)))
            {
                A=(A.multiply(((BigInteger)(modv.get(current))))).mod(p);
            
            }
            current--;
            //System.out.println("thevidiya munda");
        
        }
    
        return A;
    }
    public static void main(String args[])
    {
        SandM sm=new SandM();
       System.out.println(sm.findMod(scan.nextBigInteger(), scan.nextBigInteger(), scan.nextBigInteger()));
    }
    
}
