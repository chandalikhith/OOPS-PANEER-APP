/**
 * OOPSBannerApp
 *
 * UC4: Display "OOPS" banner using String Array and Loop
 * Improves modularity and reusability
 *
 * @author Likhith
 * @version 4.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String line1 = String.join("  ",
                " ***** ",
                " ***** ",
                " ***** ",
                " ***** ");

        String line2 = String.join("  ",
                "*     *",
                "*     *",
                "*     *",
                "*     *");

        String[] banner = {
                line1,
                line2,
                line2,
                line2,
                line2,
                line2,
                line1
        };

        // Enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}