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
public class EccMain {
    static Scanner scan;
    static ArrayList list;
    static BigInteger a,ysq,b,x,p,i;
    public EccMain() {
        scan=new Scanner(System.in);
        
    }
    
    
    public static void main(String args[])
    {
        EccMain emain=new EccMain();
        a=new BigInteger(scan.next());
        b=new BigInteger(scan.next());
        p=new BigInteger(scan.next());
    }     

}
