package com.company;


import java.util.Map;
import java.util.TreeMap;

public class MatrixSort {
    protected double[][] matrix = null;
    protected int size = 0;

    MatrixSort(int size) {
        try {
            if (size <= 0) throw new IllegalArgumentException("Size must be greater then zero");
            this.size = size;
            matrix = new double[size][size];
            generateRandomMatrix();

        } catch (IllegalArgumentException e) {
            StackTraceElement[] info = e.getStackTrace();
            for (int i = info.length - 1; i >= 0; i--) {
                System.err.println(info[i].toString());
            }
            System.err.println(e);
        }
    }

    public void sort(int k) {
        try {
            if (k <= 0) throw new IllegalArgumentException("K must be greater then zero");
            if (k >= size) throw new IllegalArgumentException("Size must be greater then column");
            TreeMap<Double, double[]> tree = new TreeMap<>();
            for (int i = 0; i < size; i++) {
                tree.put(matrix[i][k], matrix[i]);
            }
            int counter = 0;
            for (Map.Entry<Double, double[]> item : tree.entrySet()) {
                matrix[counter] = item.getValue().clone();
                counter++;
            }
        } catch (IllegalArgumentException e) {
            StackTraceElement[] info = e.getStackTrace();
            for (int i = info.length - 1; i >= 0; i--) {
                System.err.println(info[i].toString());
            }
            System.err.println(e);
        }
    }

    @Override
    public String toString() {

        StringBuilder toReturn = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int k = 0; k < size; k++) {
                toReturn.append(matrix[i][k] + ", ");
            }
            toReturn.append("\n");
        }
        return toReturn.toString();
    }

    private void generateRandomMatrix() {
        for (int i = 0; i < size; i++) {
            for (int k = 0; k < size; k++) {
                matrix[i][k] = +(Math.random() * (size * 2 + 1)) - size;
            }
        }
    }
}
