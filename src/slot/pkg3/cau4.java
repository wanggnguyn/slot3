/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot.pkg3;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class cau4 {
    public static int fatorial(int n) {
        int i, fatorial = 1;
        for (i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static int check(int n) {
        int k = n, sum = 0;
        while (k > 0) {
            int digit = k % 10;
            sum += fatorial(digit);
            k = k / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n;
        System.out.println("Enter n: ");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            if (i == check(i)) {
                System.out.println("peterson numbers are: " + i);
            }
        }
    }
}