/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.dandiahmadin.userlogin;
import java.util.Scanner;
/**
 *
 * @author
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi user login dengan pendekatan objek
 */
public class Latihan33Login {
    private static String usName,passWord;
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukan Username = ");
        usName = input.next();

        System.out.print("Masukan Password = ");
        passWord = input.next();
        System.out.println();
        User login = new User();
        login.pengecekanLogin(usName, passWord);
    }
}
