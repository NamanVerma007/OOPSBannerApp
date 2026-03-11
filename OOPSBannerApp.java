import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Inner Class to store character and pattern
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
    }

    public static void main(String[] args) {

        // Map to store characters and patterns
        Map<Character, CharacterPattern> patternMap = new HashMap<>();

	patternMap.put('O', new CharacterPattern('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        }));

        patternMap.put('O', new CharacterPattern('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        }));

        patternMap.put('P', new CharacterPattern('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        }));

        patternMap.put('S', new CharacterPattern('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        }));

        String banner = "OOPS";

        int height = 5;

        // Print banner row by row
        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : banner.toCharArray()) {

                CharacterPattern cp = patternMap.get(c);

                if (cp != null) {
                    line.append(cp.getPattern()[i]).append("  ");
                }
            }

            System.out.println(line);
        }
    }
}