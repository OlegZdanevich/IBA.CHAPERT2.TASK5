package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = input.nextInt();
        MatrixSortAndTranspose matrix = new MatrixSortAndTranspose(n);
        System.out.println("Before transpose:");
        System.out.println(matrix);
        matrix.transpose();
        System.out.println("After transpose:");
        System.out.println(matrix);
    }
}
