import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.stream.IntStream;

public class Utils {
    private static int countNumberTask = 1;

    public static void printLine() {
        System.out.println("============================================");
    }
    public static void printMidLine() {
        System.out.println("=================");
    }

    public static int getRandom(int maxInt) {
        return new Random().nextInt(maxInt);
    }

    public static String getDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.forLanguageTag("ru"));
        return dtf.format(LocalDate.now());
    }

    public static void printNumberTask() {
        printLine();
        System.out.printf("+++++++++++++++\t Задача № %d\t +++++++++++++++ \n", countNumberTask++);
        printLine();
    }

    public static String compareToArray (int[] arr1, int[] arr2) {
        return Arrays.stream(arr1).sum() > Arrays.stream(arr2).sum() ? Arrays.toString(arr1) : Arrays.toString(arr2);
    }

    public static int[] createRandomArray (int arraySize, int maxInt) {
        int[] arrayR = new int[arraySize]; // add check on -2 maxInt must be
        // positive
        for (int i = 0; i < arrayR.length; i++) {
            arrayR[i] = getRandom(maxInt);
        }
        return arrayR;
    }

    public static int getMidValue (int[] array) {
        int mid = 0;
        if (array.length == 0) {
            return -1; //error
        } else {
            for (int i = 0; i < array.length; i++) {
                mid += array[i];
            }
        }
        return mid/array.length;
    }

    public static int getMaxValue (int[] array) {
        int max = Integer.MIN_VALUE;
        if (array.length < 0) {
            return -1;  //error
        } else {
            for (int i = 0; i < array.length; i++) {
                if (max < array[i]) {
                    max = array[i];
                }
            }
        }
        return max;
    }

    public static int getMinValue (int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static int[] getMaxMinMedFromArray (int[] array) {
        final int ARRAYSIZE = 3;
        int[] arrayMaxMinMed = new int[ARRAYSIZE];
            for (int i = 0; i < arrayMaxMinMed.length; i++) {
                if (i == 0) {
                    arrayMaxMinMed[i] = getMaxValue(array);
                } else if (i == 1) {
                    arrayMaxMinMed[i] = getMinValue(array);
                } else {
                    arrayMaxMinMed[i] = getMidValue(array);
                }
            }
        return arrayMaxMinMed;
        }

    public static int [][] create2DArrayRandom (int row,int column,int lower, int upper){
        int[][] arr = new int[row][column];
        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr[i].length;j++){
                arr[i][j]=lower+(int)(Math.random()*((upper-1)+lower));
            }
        }
        return arr;
    }


}
