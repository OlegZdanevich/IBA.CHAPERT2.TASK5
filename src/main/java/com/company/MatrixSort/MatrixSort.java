package com.company.MatrixSort;


import com.company.LineAndElement.LineAndElement;
import com.company.LineAndElement.LineAndElementComp;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class MatrixSort {
    private double[][] matrix = null;
    private int size = 0;
    private static final Logger log = Logger.getLogger(MatrixSort.class);

    public MatrixSort(int size) {
        try {

            if (size <= 0) throw new IllegalArgumentException("Size should be greater then zero");

            this.size = size;
            matrix = new double[this.size][this.size];

            generateRandomMatrix();

        } catch (IllegalArgumentException exception) {

            StackTraceElement[] info = exception.getStackTrace();
            StringBuilder trace = new StringBuilder("");

            for (int i = info.length - 1; i >= 0; i--) {
                trace.append(info[i].toString() + "\n");
            }

            log.error(exception.getMessage() + "\nTrace: \n" + trace);

            this.size = 1;
            matrix = new double[this.size][this.size];
            generateRandomMatrix();

        }
    }

    public void sort(int k) {
        try {
            if (k < 0) throw new IllegalArgumentException("K should be greater then zero");
            if (k >= size) throw new IllegalArgumentException("Size shouldn't be greater then number of columns");

            ArrayList<LineAndElement> arrayOfElemenmts = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                arrayOfElemenmts.add(new LineAndElement(matrix[i][k], matrix[i]));
            }

            Collections.sort(arrayOfElemenmts, new LineAndElementComp());
            int counterOfLines = 0;

            for (LineAndElement element : arrayOfElemenmts) {
                matrix[counterOfLines] = element.getLine().clone();
                counterOfLines++;
            }

        } catch (IllegalArgumentException exception) {

            StackTraceElement[] info = exception.getStackTrace();
            StringBuilder trace = new StringBuilder("");

            for (int i = info.length - 1; i >= 0; i--) {
                trace.append(info[i].toString() + "\n");
            }
            log.error(exception.getMessage() + "\nTrace: \n" + trace);

        }
    }

    @Override
    public String toString() {

        StringBuilder toReturn = new StringBuilder("");

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MatrixSort)) return false;

        MatrixSort that = (MatrixSort) o;

        if (size != that.size) return false;
        return Arrays.deepEquals(matrix, that.matrix);
    }

    @Override
    public int hashCode() {
        int result = Arrays.deepHashCode(matrix);
        result = 31 * result + size;
        return result;
    }
}
