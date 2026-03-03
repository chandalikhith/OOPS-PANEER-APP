/**
 * OOPSBannerApp
 *
 * UC6: Modular Banner using Static Helper Methods
 *
 * @author Likhith
 * @version 6.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] o = getO();
        String[] p = getP();
        String[] s = getS();

        // Combine letters row by row
        for (int i = 0; i < 7; i++) {
            System.out.println(
                    o[i] + "  " +
                    o[i] + "  " +
                    p[i] + "  " +
                    s[i]
            );
        }
    }

    // Static method for Letter O
    public static String[] getO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Static method for Letter P
    public static String[] getP() {
        return new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    // Static method for Letter S
    public static String[] getS() {
        return new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        };
    }
}