package telran.regex.tools;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhotoSelector {
    public static String[] selectPictures(String[] pictures, String regex) {
//        "London\\20151001_110023.jpg",
//        regex = "\\d{4}[09|10|11]\\d{2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < pictures.length; i++) {
            matcher = pattern.matcher(pictures[i]);
            if (matcher.find()) {
                builder.append(pictures[i]+",");
            }
        }
        String[] arr = builder.toString().split(",");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        return arr;
    }
}
