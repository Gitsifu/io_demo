package transform;

import java.io.*;

/**
 * Created by sifu on 2017/3/23.
 */
//字节流转字符流
public class StreamCopyDemo {
    public static void main(String[] args) throws Exception {

        File src = new File("D:\\123.txt");
        File copySrc = new File("D:\\123_copy.txt");
        InputStreamReader in = new InputStreamReader(new FileInputStream(src));
        OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(copySrc));
        char[] data = new char[1024];
        int len = -1;
        while ((len = in.read(data)) != -1) {
            out.write(data, 0, len);
        }
        in.close();
        out.close();
    }
}
