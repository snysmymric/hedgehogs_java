public class MainApp {

    public static void main(String[] args) {
        System.out.println(Utils.getDate());

        System.out.println(abbr("Sergey",4));

    }
    public static String abbr (String str, int size) {
       return str.substring(0,size - 3) + "...";

    }


}
