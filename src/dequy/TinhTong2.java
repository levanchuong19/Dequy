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
public class TinhTong2 {
    public static long tong(int n){
        if(n == 0) return 0;
        long sum = tong(n -1) + n * n * n;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(tong(n));
    }
}
