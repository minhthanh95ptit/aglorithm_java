package quick_sort;

import java.util.Arrays;

public class MyQuickSort {
    static void quickSort(int[] a, int L, int R){
        if(L >= R){
            return;
        }
        //B1. Chon khoa
        int midIndex = (L + R) / 2;
        int key = a[midIndex];
        //B2. Phan bo lai mang theo khoa
        int k = partion(a, L, R, key);
        System.out.println("L=" + L + "R=" + R + "key=" + key + "k=" + k);
        System.out.println(Arrays.toString(Arrays.copyOfRange(a, L, R + 1)));
        System.out.println("=========================================");
        //B3. Chia doi mang => lap lai
        quickSort(a, L, k - 1);
        quickSort(a, k, R);
    }
    //return pivot value
    static int partion(int[] a, int L, int R, int key){
        int iL = L;
        int iR = R;
        while(iL <= iR){
            //Voi iL, di tim phan tu >= ket de doi cho
            while(a[iL] < key) iL++;
            // voi iR, di tim phan tu <= key de doi cho
            while(a[iR] > key) iR--;
            // doi cho 2 phan tu khong dung vi tri
            if(iL <= iR){
                int temp = a[iL];
                a[iL] = a[iR];
                a[iR] = temp;
                iL++; iR--;
            }
        }
        return iL;
    }
    public static void main(String[] args) {
        int[] a = {6,7,7,6,4,5,8,1};
        System.out.println("Start");
        quickSort(a, 0, a.length - 1);
        System.out.println("Finish");
        System.out.println(Arrays.toString(a));
    }
}
