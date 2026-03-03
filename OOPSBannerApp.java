/**
 * OOPSBannerApp
 *
 * UC7: Store Character Pattern in a Class
 *
 * @author Likhith
 * @version 7.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Create character pattern objects
        CharacterPattern oPattern = new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPattern pPattern = new CharacterPattern('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        CharacterPattern sPattern = new CharacterPattern('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });

        // Word to display
        CharacterPattern[] word = { oPattern, oPattern, pPattern, sPattern };

        // Print banner row by row
        for (int i = 0; i < 7; i++) {
            StringBuilder row = new StringBuilder();

            for (CharacterPattern cp : word) {
                row.append(cp.getPattern()[i]).append("  ");
            }

            System.out.println(row);
        }
    }

    // Static Inner Class
    static class CharacterPattern {

        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter
        public String[] getPattern() {
            return pattern;
        }

        public char getCharacter() {
            return character;
        }
    }
}