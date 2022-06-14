package telran.regex.tools;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhotoSelector {
    public static String[] selectPictures(String[] pictures, String regex) {
//        Chicago\20151111_232000.png,
//        regex = "(png|jpg)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < pictures.length; i++) {
            matcher = pattern.matcher(pictures[i]);
            if (matcher.find()) {
                builder.append(pictures[i]);
                builder.append(",");
            }
        }
        String[] arr = builder.toString().split(",");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        return arr;
    }
}
