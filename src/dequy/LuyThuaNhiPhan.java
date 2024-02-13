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
public class LuyThuaNhiPhan {
    public static long tinh(int a, int b){
        long mod = 1000000007;
        if(b == 0 ) return 1 ;
        long x = tinh(a, b/2);
        if(b % 2 == 0) return x * x % mod;
        return (x * x % mod)*a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(tinh(a , b));
    }
}
