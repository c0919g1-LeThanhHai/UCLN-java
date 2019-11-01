package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.print("Nhập vào số thứ nhất ");
        a = scanner.nextInt();
        System.out.print("Nhập vào số thứ hai ");
        b = scanner.nextInt();
        UCLN(a, b);
    }

    public static void UCLN(int a, int b) {
        String result = "là ước chung lớn nhất của " + a + " và " + b;
        int num1 = a, num2 = b;
        while (num1 != num2) {
            if (num1 > num2) {
                num1 -= num2;
            } else {
                num2 -= num1;
            }
        }
        System.out.printf("%d %s ", num1, result);
    }


}
