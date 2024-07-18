public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int rotations = 2;

        // Left rotation
        arr = leftRotate(arr, rotations);
        System.out.println("Left rotation by " + rotations + " positions: " + Arrays.toString(arr));

        // Right rotation
        arr = rightRotate(arr, rotations);
        System.out.println("Right rotation by " + rotations + " positions: " + Arrays.toString(arr));
    }

    public static int[] leftRotate(int[] arr, int rotations) {
        rotations = rotations % arr.length; // Handle cases where rotations > arr.length
        int[] rotatedArr = new int[arr.length];

        System.arraycopy(arr, rotations, rotatedArr, 0, arr.length - rotations);
        System.arraycopy(arr, 0, rotatedArr, arr.length - rotations, rotations);

        return rotatedArr;
    }

    public static int[] rightRotate(int[] arr, int rotations) {
        rotations = rotations % arr.length; // Handle cases where rotations > arr.length
        int[] rotatedArr = new int[arr.length];

        System.arraycopy(arr, arr.length - rotations, rotatedArr, 0, rotations);
        System.arraycopy(arr, 0, rotatedArr, rotations, arr.length - rotations);

        return rotatedArr;
    }
}