package md.cibric.java_core1.lesson3;

import java.util.Arrays;

public class HomeWorkApp3 {

    private static int[] arr;

    public static void main(String[] args) {
        invertingArray();
        System.out.println(Arrays.toString(createArrayPlusOneHundred(100)));
        lessThanSix();
        oneInDiagonal();
        int[] array = { -22, 4, -92, 5, 199, 45 };
        checkMaximal(array);
        checkMinimal(array);





    }




    public static void checkMaximal(int[] array) {
        Arrays.sort(array);
        int max = array[array.length - 1];
        System.out.println(max);
    }

    public static void checkMinimal(int[] array) {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[0]) {
                min = array[i];
            }
        }
        System.out.println(min);
    }


    private static void oneInDiagonal() {
        int[][] arr1 = new int[5][5];
        arr1[0][0] = 1;
        arr1[1][1] = 1;
        arr1[2][2] = 1;
        arr1[3][3] = 1;
        arr1[4][4] = 1;


        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }
    }


    private static void lessThanSix() {
        int[] numbArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < numbArr.length; i++) {
            if (numbArr[i] < 6) {
                numbArr[i] *= 2;
            }
            System.out.print(numbArr[i] + " ");
        }
    }


    public static int[] createArrayPlusOneHundred(int n) {
        int[] arr = new int[n];
        for (int i = 1; i <= n; i++) {
            arr[i - 1] = i;
        }

        return arr;
    }


    private static void invertingArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.print(arr[i] + " ");

        }
    }
}
