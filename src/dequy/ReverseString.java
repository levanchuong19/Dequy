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
public class ReverseString {
   // loai de quy gi
    //input output
    //thuat toan
    //demo
    // S T R I N G
    private static void characters(String str, int dem) {
        if (dem < str.length()) {
            System.out.print(str.charAt(dem) + " ");
            characters(str, dem + 1);
        }
    }

    private static void reverse(String str) {
        if (!str.isEmpty()) {
            System.out.print(str.charAt(str.length() - 1) + " ");
            reverse(str.substring(0, str.length() - 1));
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        String inputString = scanner.nextLine();
        System.out.print("Các ký tự của chuỗi:");
        characters(inputString, 0);
        System.out.print("\nChuỗi đảo ngược: ");
        reverse(inputString);
    }
}
