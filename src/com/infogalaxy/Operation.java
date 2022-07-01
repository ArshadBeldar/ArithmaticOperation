package com.infogalaxy;

import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
        Addition addition = new Addition();
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("WELCOME TO OPERATION");

        System.out.println("Enterthe 2 Numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = addition.add(a,b);
        System.out.println("Addition="+c);
    }
}
