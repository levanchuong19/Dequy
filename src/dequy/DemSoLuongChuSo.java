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
public class DemSoLuongChuSo {
    public static long dem(long n){
        if(n < 10) return 1;
        long check = dem(n / 10) + 1;
        return check;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(dem(n));
    }
}
