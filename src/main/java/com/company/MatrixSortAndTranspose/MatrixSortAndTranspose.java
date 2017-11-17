package com.company.MatrixSortAndTranspose;

import com.company.MatrixSort.MatrixSort;

public class MatrixSortAndTranspose extends MatrixSort {

    public MatrixSortAndTranspose(int size) {
        super(size);
    }

    public void transpose() {
        try {
            if (matrix == null) throw new NullPointerException("Matrix should be initialized");
            double buffer[][] = new double[size][size];
            for (int k = 0; k < size; k++) {
                for (int i = 0; i < size; i++) {
                    buffer[i][k] = matrix[k][i];
                }
            }
            matrix = buffer.clone();
        }
        catch (NullPointerException exception) {
            StackTraceElement[] info = exception.getStackTrace();
            StringBuilder trace = new StringBuilder("");

            for (int i = info.length - 1; i >= 0; i--) {
                trace.append(info[i].toString() + "\n");
            }
            log.error(exception.getMessage() + "\nTrace: \n" + trace);
        }
    }
}
