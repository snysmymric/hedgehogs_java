import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Utils {

    public static void printLine() {
        System.out.println("============================================");
    }

    public static int getRandom(int maxInt) {
        return new Random().nextInt(maxInt);
    }

    public static String getDate() {
        return new SimpleDateFormat("dd/MM/yyyy").format(new Date());
    }


}
