package com.r.array;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TraverseMatrixDiagonal {
    private static final Logger LOGGER= LoggerFactory.getLogger(TraverseMatrixDiagonal.class);

    public void traverse(int[][] matrix){
        for(int i=0; i< matrix.length; i++ ){
            for(int j=0; j < matrix[i].length;j++){
                LOGGER.info(String.valueOf(matrix[i][j]));
            }
        }

    }

    public static void main(String[] args){
        int[][] matrix= new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        TraverseMatrixDiagonal test= new TraverseMatrixDiagonal();

        test.traverse(matrix);
    }
}
