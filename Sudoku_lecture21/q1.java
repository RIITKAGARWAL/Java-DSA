import java.util.Scanner;

class q1 {

   public static boolean isOk(int row, int col, int num, int[][] fullgrid) {
      // Horizontal and vertical check
      for (int idx = 0; idx < 9; idx++) {
         if (fullgrid[row][idx] == num || fullgrid[idx][col] == num) {
            return false;
         }
      }

      // Grid check
      int startRow = row / 3 * 3;
      int startCol = col / 3 * 3;
      for (int i = startRow; i < startRow + 3; i++) {
         for (int j = startCol; j < startCol + 3; j++) {
            if (fullgrid[i][j] == num) {
               return false;
            }
         }
      }

      return true;
   }

   public static boolean traverse(int row, int col, int[][] fullgrid) {
      if (row == 9) {
         return true;
      }

      if (col == 9) {
         return traverse(row + 1, 0, fullgrid);
      }

      if (fullgrid[row][col] != 0) {
         return traverse(row, col + 1, fullgrid);
      }

      for (int num = 1; num <= 9; num++) {
         if (isOk(row, col, num, fullgrid)) {
            fullgrid[row][col] = num;
            if (traverse(row, col + 1, fullgrid)) {
               return true;
            }
            fullgrid[row][col] = 0;
         }
      }

      return false;
   }

   public static void sudokuSolver(int[][] fullgrid) {
      traverse(0, 0, fullgrid);
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int[][] fullgrid = new int[9][9];

      System.out.println("Enter the Sudoku puzzle (use 0 for empty cells):");
      for (int i = 0; i < 9; i++) {
         for (int j = 0; j < 9; j++) {
            fullgrid[i][j] = scanner.nextInt();
         }
      }

      if (sudokuSolver(fullgrid)) {
         System.out.println("Solved Sudoku:");
         for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
               System.out.print(fullgrid[i][j] + " ");
            }
            System.out.println();
         }
      } else {
         System.out.println("No solution exists.");
      }

      scanner.close();
   }
}
