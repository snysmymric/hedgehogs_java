import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {

        System.out.println(Utils.getDate());

        int[] arr1 = {3, 7, 7, 12};
        int[] arr2 = {3, 8 , 7, 23};
        System.out.println(Utils.compareToArray(arr1, arr2));


        int[] randomArray = Utils.createRandomArray(2,1);
        int max = Utils.getMaxValue(randomArray);
        int min = Utils.getMinValue(randomArray);
        int mid = Utils.getMidValue(randomArray);
        int[] maxMinMid = Utils.getMaxMinMedFromArray(randomArray);
        System.out.println(Arrays.toString(randomArray));
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("mid = " + mid);
        System.out.println(Arrays.toString(maxMinMid));
        System.out.println(Arrays.toString(Utils.createRandomArray(8,234)));

    }

}
