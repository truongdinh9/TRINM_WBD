public class Home {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 7, 8};
        int index = minValue(arr);
        System.out.print(" " + arr[index]);
    }

    public static int minValue(int[] array) {
        int min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }
}
