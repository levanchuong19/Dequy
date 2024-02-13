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
public class TinhTongChanLe {
    public static long check(int n){
        if(n == 0) return 0;
        if(n % 2 == 0) return check(n-1) + n;
        else return check(n - 1) - n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(check(n));
    }
}
