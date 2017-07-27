package demo;

import java.io.*;
import java.nio.file.Files;

/**
 * Created by sifu on 2017/7/21.
 *
 * @author sifu
 * @version 1.0.0
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        File file = new File("G:\\电影");
        Reader reader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line = null;
        StringBuffer sb = new StringBuffer();
        while ((line = bufferedReader.readLine()) != null){
            sb.append(line).append("\"").append(",");
        }
        System.out.println(sb);
        //4.关闭流
        reader.close();
    }
}
