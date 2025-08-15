public class SortColors {
    public static void sortColors(int[] arr) {
        int left = 0, current = 0, right = arr.length - 1;
        while (current <= right) {
            if (arr[current] == 0) {
                int temp = arr[left];
                arr[left] = arr[current];
                arr[current] = temp;
                left++;
                current++;
            } else if (arr[current] == 1) {
                current++;
            } else {
                int temp = arr[current];
                arr[current] = arr[right];
                arr[right] = temp;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 1, 0, 2, 1, 0};
        sortColors(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
