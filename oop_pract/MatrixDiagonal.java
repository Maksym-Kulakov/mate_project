package oop_pract;

public class MatrixDiagonal {
  public int[] getDiagonal(int[][] matrix) {
    int[] diagonal = new int[matrix.length];
    int index = 0;
    for (int[] value : matrix) {
      diagonal [index] = matrix [index][index];
      index++;
    }
    return diagonal;
  }

  public int[] getCounterDiagonal(int[][] matrix) {
    int[] counterdiagonal = new int[matrix.length];
    int index = 0;
    int index_col = matrix.length - 1;
    for (int[] value : matrix) {
      counterdiagonal [index] = matrix [index][index_col];
      index++;
      index_col--;
    }
    return counterdiagonal;
  }


  public static void main(String[] args) {
    int [][] matrix = {{0, 1, 2}, {4, 5, 6}, {1, 1, 1}};
    for(int value : new MatrixDiagonal().getDiagonal(matrix)) {
      System.out.println(value);
    }
    for(int value : new MatrixDiagonal().getCounterDiagonal(matrix)) {
        System.out.println(value);
    }
  }
}