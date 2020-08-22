package lesson2;


public class Main {

    public static void main(String[] args) {
        //1 задание
        {
            int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) {
                    arr[i] = 0;
                } else {
                    arr[i] = 1;
                }
            }
        }

        //2 задание
        {
            int arr[] = new int[8];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = i * 3;
                //System.out.printf("%3d", arr[i]);
            }
        }

        //3 задание
        {
            int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 6) {
                    arr[i] *= 2;
                }
                //System.out.printf("%3d", arr[i]);
            }
        }

        //4 задание
        {
            int n = 12;
            int[][] arr = new int[n][n];

            for (int i = 0; i < arr.length; i++) {
                arr[i][i] = 1;
                arr[i][n - 1 - i] = 1;
            }
        }

        //7 задание
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//
//        for (int i = 0; i > -20; i--) {
//            move(arr, i);
//            System.out.println(Arrays.toString(arr));
//            arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
//        }
//        System.out.println("---------------------");
//        for (int i = 0; i < 20; i++) {
//            move(arr, i);
//            System.out.println(Arrays.toString(arr));
//            arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
//        }

    }

    //5 задание
    static int max(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int min(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }


    //6 задание
    static boolean checkBalance(int[] arr) {

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i < arr.length; i++) {

            for (int j = 0; j < i; j++) {
                sum1 += arr[j];
            }

            for (int j = i; j < arr.length; j++) {
                sum2 += arr[j];
            }

            if (sum1 == sum2) {
                return true;
            }
            sum1 = 0;
            sum2 = 0;
        }
        return false;

    }

    // 7 задание
    static void move(int[] arr, int n) {

        if (n >= arr.length || -n >= arr.length) {
            n %= arr.length;
        }

        if (n > arr.length / 2) {
            n -= arr.length;
        } else if (-n > arr.length / 2) {
            n += arr.length;
        }

        int t;

        if (n >= 0) {
            for (int i = 0; i < n; i++) {
                t = arr[arr.length - 1];

                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = t;
            }
        } else {
            for (int i = 0; i > n; i--) {
                t = arr[0];

                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = t;
            }
        }


    }
}
