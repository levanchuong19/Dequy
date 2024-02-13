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
public class ChuSoLonNhatVaNhoNhat {
    public static int csln(long n){
        if(n < 10) return (int)n;
        return (int)Math.max(csln(n / 10), n % 10);
    }
    public static int csbn(long n){
        if(n < 10) return (int)n;
        return (int)Math.min(csbn(n/10), n%10);
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
               long n = sc.nextLong();
        System.out.println(csln(n) + " " + csbn(n));
    }
}
