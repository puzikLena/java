package lesson1;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
//        size2();
        int n = getRandomArrMaxCount(1000);
        System.out.println(n);
    }
    private static void size2() {
        int[] arr = new int[]{1, 1, 0, 1, 1, 1,0,1};
        int k = 0;
        int kmax = 0;
        for (int num : arr) {

            if (num == 1) {
                k++;
                if (k > kmax) {
                    kmax = k;
                }
            } else {
                k = 0;
            }
        }
        System.out.printf("Большая последовательность %s", kmax);
    }
//    2 способ
private static int getRandomArrMaxCount(int size) {
    int[] arr = new int[size];
    Random random = new Random();
    for (int i = 0; i < arr.length; i++) {
        arr[i] = random.nextInt(2); //0-1
//            arr[i] = random.nextInt(3, 10); //3-9
    }

/*        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            System.out.println(num);
        }*/

    int count = 0;
    int maxCount = 0;
    for (int num : arr) {
        if (num == 1) {
            count++;

            if (count > maxCount) {
                maxCount = count;
            }
        } else {
            count = 0;
        }
    }
    System.out.println(Arrays.toString(arr));
    return maxCount;
}
}

