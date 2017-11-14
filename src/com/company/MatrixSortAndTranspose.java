package com.company;

public class MatrixSortAndTranspose extends MatrixSort {
    MatrixSortAndTranspose(int size) {
        super(size);
    }
    public void transpose()
    {
        double buffer[][]=new double[size][size];
        for (int k=0;k<size;k++)
        {
            for (int i=0;i<size;i++)
            {
                buffer[i][k]=matrix[k][i];
            }
        }
        matrix=buffer.clone();


    }
}
