public class Exercise {

    public static int sumDiagonalElements(int[][] array) {
        int cell_value = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[0].length; col++) {
                if (row == col) {

                    cell_value = array[row][col] + cell_value;

                }


            }
        }
        System.out.print(cell_value + " ");
        return cell_value;
    }

    public static void main(String[] args) {
        Exercise exercise = new Exercise();
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        exercise.sumDiagonalElements(array);
    }
}


