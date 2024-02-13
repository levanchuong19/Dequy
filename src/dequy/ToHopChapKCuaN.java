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
public class ToHopChapKCuaN {
    public static int c(int n ,int k){
        if(k == 0 || n == k) return 1;
        k = Math.min(k,n -k);
        return c( n - 1, k-1) + c(n-1, k);
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int k = sc.nextInt();
         System.out.println(c(n, k));
    }
}
