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
public class TinhToan4 {
    public static double tinh(long n){
        if(n== 0) return 0;
        double sum = tinh(n - 1) + (double)1/n;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.printf("%.3f",(double)tinh(n));
    }
}
