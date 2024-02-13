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
public class InRaSoNguyenVaDaoNguoc {
    public static void x(long n){
        if(n < 10){
            System.out.print(n + " ");
            return;
        }else{
        x(n / 10);
        System.out.print(n % 10 + " ");
        }
    }
     public static void ng(long n){
        if(n < 10){
            System.out.print(n + " ");
            return;
        }else{
        System.out.print(n % 10 + " ");
        ng(n / 10);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        x(n);
        System.out.println();
        ng(n);
    }
}
