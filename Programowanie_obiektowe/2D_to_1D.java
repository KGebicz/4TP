public class Main {
    public static void main(String[] args) {
        int[][] array2D = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

        int size = 0;
        for (int[] row : array2D) {
            size += row.length;
        }

        int[] flat = flatten(array2D, size);

        for (int num : flat) {
            System.out.print(num + " ");
        }
    }

    public static int[] flatten(int[][] array, int size) {
        int[] result = new int[size];
        int index = 0;

        for (int[] row : array) {
            for (int value : row) {
                result[index++] = value;
            }
        }
        return result;
    }
}
