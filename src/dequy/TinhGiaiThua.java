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
public class TinhGiaiThua {
    public static long tinh(int n){
        if(n == 0) return 1;
        return tinh(n - 1) * n;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    }
}
