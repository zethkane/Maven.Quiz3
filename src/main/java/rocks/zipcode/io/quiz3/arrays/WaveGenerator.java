package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        String[] wavey = new String[str.length()];
        String newStr =  str.toLowerCase();
        String finalString = "";
        for (int i = 0; i < wavey.length; i++) {
            finalString = newStr.replace(newStr.charAt(i), 'A');
            wavey[i] = finalString;
            finalString = "";
        }
        return wavey;
    }
}
