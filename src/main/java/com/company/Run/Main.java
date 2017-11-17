package com.company.Run;

import com.company.Exceptions.Exceptions;
import com.company.MatrixSortAndTranspose.MatrixSortAndTranspose;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {

            System.out.print("Enter size: ");
            int n = Integer.parseInt(input.next());

            MatrixSortAndTranspose matrix = new MatrixSortAndTranspose(n);

            System.out.println("Before transpose:");
            System.out.println(matrix);

            matrix.transpose();

            System.out.println("After transpose:");
            System.out.println(matrix);

        } catch (NumberFormatException exception) {
            Exceptions.notNumberException(exception);
        } catch (NullPointerException exception) {
            Exceptions.notInitializedException(exception);
        }
    }
}
