package com.company.Logic.MatrixSortAndTranspose;

import com.company.Logic.MatrixSort.MatrixSort;

public class MatrixSortAndTranspose extends MatrixSort {

    public MatrixSortAndTranspose(int size) {
        super(size);
    }

    public void transpose() {
        double result[][] = new double[size][size];

        for (int k = 0; k < size; k++) {
            for (int i = 0; i < size; i++) {
                result[i][k] = matrix[k][i];
            }
        }

        matrix = result.clone();

    }
}
