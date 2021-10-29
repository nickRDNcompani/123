package com.company;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
Point p1 = new Point(1, 1);
Point p2 = new Point(5, 5);
        System.out.println(p1.distanceToAnotherPoint(p2));
     }
}


