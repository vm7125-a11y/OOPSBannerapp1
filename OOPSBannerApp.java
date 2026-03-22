import java.util.*;

public class OOPSBannerApp {

    public static void main(String[] args) {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });

        map.put('P', new String[]{
            " ***** ",
            "*     *",
            "*     *",
            " ***** ",
            "*      ",
            "*      ",
            "*      "
        });

        map.put('S', new String[]{
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        });

        String text = "OOPS";

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < text.length(); j++) {
                System.out.print(map.get(text.charAt(j))[i] + "  ");
            }
            System.out.println();
        }
    }
}