public class sortedAndRotatedArrayCode {

    public static int search(int arr[], int target, int si, int ei) {
        // base case
        if (si > ei) {
            return -1;
        }

        // kaam
        int mid = si + (ei - si) / 2;

        // case FOUND
        if (arr[mid] == target) {
            return mid;
        }

        // mid on L1
        if (arr[si] <= arr[mid]) {
            // case A: target in L1 left
            if (target >= arr[si] && target <= arr[mid]) {
                return search(arr, target, si, mid - 1);
            } else {
                // case B: target in L2 right
                return search(arr, target, mid + 1, ei);
            }
        }

        // mid on L2
        else {
            // case C : target in L2
            if (arr[mid] <= target && target <= arr[ei]) {
                return search(arr, target, mid + 1, ei);
            } else {
                // case D: target in L1
                return search(arr, target, si, mid - 1);
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int tarIdx = search(arr, target, 0, arr.length - 1);
        System.out.println(tarIdx);
    }

}
