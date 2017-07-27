package demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by sifu on 2017/7/21.
 *
 * @author sifu
 * @version 1.0.0
 */


public class LiDemo {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\sifu\\Desktop\\电影名\\1.txt");
        File img = new File("C:\\Users\\sifu\\Desktop\\电影名\\2.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        BufferedReader imgbf = new BufferedReader(new FileReader(img));
        String line = null;
        String imgLine = null;
        StringBuffer stringBuffer = new StringBuffer();
        while ((line = bufferedReader.readLine()) != null && (imgLine = imgbf.readLine()) != null) {
            String s = "<li>\n" +
                    "<div class=\"video_img\">\n" +
                    "<img src=\"image/" + imgLine + "\"/>\n" +
                    "</div>\n" +
                    "<div class=\"video_name\">\n" +
                    "<span>" + line + "</span>\n" +
                    "</div>\n" +
                    "</li>\n";
            stringBuffer.append(s);
        }
        System.out.println(stringBuffer);
        bufferedReader.close();
    }
}
