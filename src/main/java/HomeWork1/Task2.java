package HomeWork1;

public class Task2 {
    //    2. Дан массив nums = [3,2,2,3] и число val = 3.
//    Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//    Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
//    а остальные - равны ему.
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int[] arrEquals = new int[nums.length];
        int[] arrNotEquals = new int[nums.length];

        int arrEqualsIndex = 0;
        int arrNotEqualsIndex = 0;

        for (int num : nums) {
            if (val == num) {
                arrEquals[arrEqualsIndex++] = num;
            } else {
                arrNotEquals[arrNotEqualsIndex++] = num;
            }
        }
        int[] resultArray = new int[nums.length];
        System.arraycopy(arrNotEquals, 0, resultArray, 0, arrNotEqualsIndex);
        System.arraycopy(arrEquals, 0, resultArray, arrNotEqualsIndex, arrEqualsIndex);
        for (int j : resultArray) {
            System.out.print(j + " ");
        }
    }
}
