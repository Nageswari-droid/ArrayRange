import java.util.*;

public class ArrayRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize;
        arraySize = scanner.nextInt();

        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("The range of the array is " + findArrayRange(array, arraySize));
    }

    public static int findArrayRange(int[] array, int arraySize) {
        Arrays.sort(array);
        return (array[arraySize - 1] - array[0]);
    }
}
