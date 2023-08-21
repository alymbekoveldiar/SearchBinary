import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(rec(a, 5));
    }

    public static int rec(int[] array, int n) {
        int start = 0;
        int finish = array.length - 1;
        int middle;
        while (start <= finish) {
            middle = start + (finish - start) / 2;
            if (array[middle] == n) {
                return middle;
            }
            if (array[middle] > n) {

                finish = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return -1;
    }
}