package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        String newStr =  str.toLowerCase();
        String[] wavey = newStr.split("");
        String[] splitted = newStr.split("");
        String finalString = "";
        finalString += newStr;
        for (int i = 0; i < splitted.length ; i++) {
            for (int j = 0; j < wavey.length ; j++) {
                if( i == j){
                    splitted[i].replace(splitted[i],splitted[i].toUpperCase());
                }
                splitted[i] += wavey[j];
            }
            }

        return splitted;
    }
}
