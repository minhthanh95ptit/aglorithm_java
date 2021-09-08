package recusion;

public class printElement {
    public static void printElement(int[] arr, int index) {
        // Bai toan co so
        if (index < 0 || index >= arr.length) {
            return;
        }
        // Cong thuc quy nap, in phan tu index
        printElement(arr, index + 1);
        System.out.println(arr[index]);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printElement(arr, 0);

    }
}
