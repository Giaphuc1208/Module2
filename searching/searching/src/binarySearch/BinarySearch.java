package binarySearch;

public class BinarySearch {
    static int[] list = {1, 2, 0, 8, 2, 0, 0, 1, 2, 3, 0, 1, 2, 0, 0, 0, 2};
    static int binarySearch(int[] list, int key){
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list, 2));  /* 0 */
        System.out.println(binarySearch(list, 11)); /* 4 */
        System.out.println(binarySearch(list, 0)); /*12 */
        System.out.println(binarySearch(list, 4));  /*-1 */
        System.out.println(binarySearch(list, 6));  /*-1 */
        System.out.println(binarySearch(list, 3)); /*-1 */
    }
}
