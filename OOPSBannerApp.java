/**
 * OOPSBannerApp
 *
 * UC5: Combined Array Declaration and Initialization
 *
 * @author Likhith
 * @version 5.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {

                String.join("  ",
                        " ***** ",
                        " ***** ",
                        " ***** ",
                        " ***** "),

                String.join("  ",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*     *"),

                String.join("  ",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*     *"),

                String.join("  ",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*     *"),

                String.join("  ",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*     *"),

                String.join("  ",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*     *"),

                String.join("  ",
                        " ***** ",
                        " ***** ",
                        " ***** ",
                        " ***** ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}