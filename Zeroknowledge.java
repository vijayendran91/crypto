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
public class Zeroknowledge {
    static Scanner scan;
    static int p,q,n;
    static int priv1=9,priv2=10;
    static int a=19,b=24,c=51;
    static int x=0,y=1;
    public Zeroknowledge() {
        scan=new Scanner(System.in);
        
    }
    public static void main(String args[])
    {
        Zeroknowledge zk=new Zeroknowledge();
        SandM sm=new SandM();
        
        p=scan.nextInt();
        q=scan.nextInt();
        n=p*q;
        Fish fish=new Fish();
        BigInteger v1=new BigInteger(String.valueOf(n));
        BigInteger v2=new BigInteger(String.valueOf(priv1*priv1));
        BigInteger v3=new BigInteger(String.valueOf(priv2*priv2));
        System.out.println(fish.mainFish(v2, v1));
        System.out.println(fish.mainFish(v3, v1));
        BigInteger two=new BigInteger("2");
        BigInteger biga=new BigInteger("19");
        BigInteger bigb=new BigInteger("24");
        BigInteger bigc=new BigInteger("51");
        BigInteger resA=sm.findMod(biga, two, v1);
        BigInteger resB=sm.findMod(bigb, two, v1);
        BigInteger resC=sm.findMod(bigc, two, v1);
        
    }
    
    
    
}
