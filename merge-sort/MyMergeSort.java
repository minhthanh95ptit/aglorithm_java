import java.util.Arrays;

public class MyMergeSort {
    public static int[] merge(int[] arr1, int[] arr2){
        int n = arr1.length + arr2.length;
        int[] result = new int[n];

        int i = 0, i1 = 0, i2 = 0;
        
        while(i < n){
            if(i1 < arr1.length && i2 < arr2.length){
                if(arr1[i1] <= arr2[i2]){ //a1 nho hon
                    result[i] = arr1[i1];
                    i++; i1++;
                }else{// a2 nho hon
                    result[i] = arr2[i2];
                    i++;
                    i2++;

                }
            } else { //a1 rong hoac a2 rong
                if(i1 < arr1.length){
                    result[i] = arr1[i1];
                    i++;
                    i1++;
                }
                else{
                    result[i] = arr2[i2];
                    i++;
                    i2++;
                }
            }
        }
        return result;
    }

    public static int[] mergeSort(int[] a, int L, int R){
        // Truong hop dac biet
        if(L > R) return new int[0];
        if(L == R){
            int[] singleElement = {a[L]};
            return singleElement;
        }
        // Truong hop Tong quat

        //Chia ra
        System.out.println("Chia: " + L + " - " + R);
        int k = (L+R)/2;
        int[] arr1 = mergeSort(a, L, k);
        int[] arr2 = mergeSort(a, k + 1, R);
        
        //Tron vao arr1 va arr2 la cac mang da sap xep
        int[] result = merge(arr1, arr2);
        return result;
    }

    public static int[] sortArray(int[] nums){
        return mergeSort(nums, L, R);
    }

    public static void main(String[] args) {
        // MyMergeSort s = new MyMergeSort();
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,8,10};
        System.out.println(Arrays.toString(merge(arr1, arr2)));
        // mergeSort(arr1, L, R)

    }
}