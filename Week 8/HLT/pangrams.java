public class pangrams {

    public static void main(String[] args) {

        // Initialising the sentence and the booleans
        String sentence = "Sixty zippers were quickly picked from the woven jute bag.";
        Boolean a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z;

        a = b = c = d = e = f = g = h = i = j = k = l = m = n = o = p = q = r = s = t = u = v = w = x = y = z = false;

        // Loop to iterate over each letter of the string.
        for (int letter = 0; letter < sentence.length(); letter++) {

            //converting each character to a lower case from the string
            char character = Character.toLowerCase(sentence.charAt(letter));

            // Switch-case evaluating each letter of the alphabet
            switch (character) {
                case 'a':
                    a = true;
                    break;
                case 'b':
                    b = true;
                    break;
                case 'c':
                    c = true;
                    break;
                case 'd':
                    d = true;
                    break;
                case 'e':
                    e = true;
                    break;
                case 'f':
                    f = true;
                    break;
                case 'g':
                    g = true;
                    break;
                case 'h':
                    h = true;
                    break;
                case 'i':
                    i = true;
                    break;
                case 'j':
                    j = true;
                    break;
                case 'k':
                    k = true;
                    break;
                case 'l':
                    l = true;
                    break;
                case 'm':
                    m = true;
                    break;
                case 'n':
                    n = true;
                    break;
                case 'o':
                    o = true;
                    break;
                case 'p':
                    p = true;
                    break;
                case 'q':
                    q = true;
                    break;
                case 'r':
                    r = true;
                    break;
                case 's':
                    s = true;
                    break;
                case 't':
                    t = true;
                    break;
                case 'u':
                    u = true;
                    break;
                case 'v':
                    v = true;
                    break;
                case 'w':
                    w = true;
                    break;
                case 'x':
                    x = true;
                    break;
                case 'y':
                    y = true;
                    break;
                case 'z':
                    z = true;
                    break;
            }
        }

        /**
         * If statement handles whether sentence variable is or NOT a pangram
         * which prints to the terminal.
         */
        if (a && b && c && d && e && f && g && h && i && j && k && l && m && n && o && p && q && r && s && t && u && v
                && w && x && y && z) {
            System.out.println(sentence + " is a pangram!");
        } else {
            System.out.println(sentence + " is not a pangram!");
        }
    }
}

/**
 * 6 - checking if results are pangram or not:
 * A wizard’s job is to vex chumps quickly in fog: pangram
 * Brown jars prevented the mixture from freezing too quickly: pangram
 * I once went to a quiet place in the Bahamas to see a very dodgy taxman: not a pangram
 * We promptly judged antique ivory buckles for the next prize: pangram
 */