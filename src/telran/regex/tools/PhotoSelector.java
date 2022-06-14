package telran.regex.tools;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhotoSelector {
    public static String[] selectPictures(String[] pictures, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        int matcherCounter = 0;

        for (int i = 0; i < pictures.length; i++) {
            matcher = pattern.matcher(pictures[i]);
            if (matcher.find()) {
                matcherCounter++;
            }
        }
        String[] arr = new String[matcherCounter];

        for (int i = 0; i < pictures.length; i++) {
            matcher = pattern.matcher(pictures[i]);
            if (matcher.find()) {
                arr[i] = pictures[i];
            }


        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        return arr;
    }
}
