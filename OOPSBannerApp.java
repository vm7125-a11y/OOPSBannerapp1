public class OOPSBannerApp {

    public static void main(String[] args) {

        String[][] banner = {
            {" ***** ", "*     *", "*     *", "*     *", "*     *", "*     *", " ***** "},
            {" ***** ", "*     *", "*     *", "*     *", "*     *", "*     *", " ***** "},
            {" ***** ", "*     *", "*     *", " ***** ", "*      ", "*      ", "*      "},
            {" ***** ", "*      ", "*      ", " ***** ", "      *", "      *", " ***** "}
        };

        for (int i = 0; i < banner[0].length; i++) {
            for (int j = 0; j < banner.length; j++) {
                System.out.print(banner[j][i] + "  ");
            }
            System.out.println();
        }
    }
}