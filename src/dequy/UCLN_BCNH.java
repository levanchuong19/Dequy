/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dequy;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class UCLN_BCNH {
    public static long gcd(long a , long b){
        if(b== 0) return a;
        return gcd(b , a% b);
    }
    public static long lcm(long a, long b){
        return a / gcd(a, b) * b;  // a* b / gcd(a,b) tran 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(gcd(a, b));
        System.out.println(lcm(a, b));
    }
}
