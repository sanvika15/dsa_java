public class CeilingAndFloor {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int x = 10;

        int[] result = findCeilingAndFloor(arr, x);

        System.out.println("Ceiling of " + x + " in the array is " + result[0]);
        System.out.println("Floor of " + x + " in the array is " + result[1]);
    }

    public static int[] findCeilingAndFloor(int[] arr, int x) {
        int ceiling = Integer.MAX_VALUE;
        int floor = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= x && arr[i] < ceiling) {
                ceiling = arr[i];
            }
            if (arr[i] <= x && arr[i] > floor) {
                floor = arr[i];
            }
        }

        return new int[] {ceiling, floor};
    }
}