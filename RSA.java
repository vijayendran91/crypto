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
public class RSA {
    static Scanner scan;
    static BigInteger p,q,e,d,n,phi_n;
    static ArrayList plist,clist,dlist;
    static String plaintext;

    
    
    RSA()
    {
        scan=new Scanner(System.in);
        plist=new ArrayList();
        clist=new ArrayList();
        dlist=new ArrayList();
        
    }
    public static void main(String args[])
    {
        RSA rsa=new RSA();
        
        
        System.out.println("Enter prime P and q");
        p=scan.nextBigInteger();
        q=scan.nextBigInteger();
        n=p.multiply(q);
        System.out.println(n);
        phi_n=(p.subtract(BigInteger.ONE)).multiply((q.subtract(BigInteger.ONE)));
        computeE();
        getInverseD();
        getPBlocks();
        encryptP();
        decryptP();
    }
    
    public static void computeE() {
        GCD gcd=new GCD();
        e=(new BigInteger("2"));
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
    public static void getInverseD()
    {
        Fish fish=new Fish();
        d=fish.mainFish(e, phi_n);
    
    }
    
    public static void getPBlocks()
    {
        int size;
        System.out.println("Enter the p blocks followed by the size of blocks");
        size=scan.nextInt();
        for(int i=0;i<size;i++)
        {
            System.out.println(" Enter p block"+plist.add(scan.nextBigInteger()));
            
        }
    
    }
    public static void encryptP()
    {
        BigInteger temp;
        for(Object obj:plist)
        {
            temp=new BigInteger(String.valueOf(obj));
            temp=temp.pow(e.intValue());
            temp=temp.mod(n);
            System.out.println(temp);
            clist.add(temp);
        }
    
    
    }

    public static void decryptP()
    {
        System.out.println("Decryption process:::");
        BigInteger temp;
        for(Object obj:clist)
        {
            temp=new BigInteger(String.valueOf(obj));
            temp=temp.pow(d.intValue());
            temp=temp.mod(n);
            System.out.println(temp);
            dlist.add(temp);
        }
    
    }

}
