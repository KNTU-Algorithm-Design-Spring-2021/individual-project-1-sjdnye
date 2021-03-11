import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of dots:");
        int n = scanner.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        System.out.println("enter the coordinates of each dot(first x, then y:");
        for (int i=0; i<n;i++){
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
        }
    }

    







    //merge function
    public static void mergeSort(int[] a) {
        if (a.length <= 1) {
            return;
        }
        int mid = a.length / 2;
        int[] left = new int[mid];
        int[] right = new int[a.length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = a[i];
        }
        for (int i = mid; i < a.length; i++) {
            right[i - mid] = a[i];
        }
        mergeSort(left);
        mergeSort(right);

        merge(a, left, right);
    }
    public static void merge(int[] a, int[] left, int[] right) {

        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                a[k++] = left[i++];
            }
            else {
                a[k++] = right[j++];
            }
        }
        while (i < left.length) {
            a[k++] = left[i++];
        }
        while (j < right.length) {
            a[k++] = right[j++];
        }
    }
}
