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
}
