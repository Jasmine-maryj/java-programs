package Searching.BinarySearch.Problems;

public class FindPositionInfiniteArray {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 6, 7, 8, 10, 11, 12, 15, 20, 23, 30 };
        int target = 8;
        int ans = findAns(arr, target);
        System.out.println("The ans found at " + ans);
    }

    public static int findAns(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        return binarySearch(arr, target, start, end);
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
