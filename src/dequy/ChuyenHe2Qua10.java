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
public class ChuyenHe2Qua10 {
    public  static void chuyen(int n){
        if(n == 0) return;
        chuyen(n / 2);
        System.out.print(n % 2 );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n  == 0){
            System.out.println("0") ;
                    return;
        }
        chuyen(n);
    }
 
}
