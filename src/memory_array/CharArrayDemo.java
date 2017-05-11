package memory_array;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;

/**
 * Created by sifu on 2017/3/23.
 */
public class CharArrayDemo {
    //字节的数组流/内存流
    public static void main(String[] args) throws Exception {
        //字节数组输出流：程序--》内存
        CharArrayWriter out = new CharArrayWriter();
        out.write("四福");
        //要使用存储的数据
        char[] data = out.toCharArray();

        //字节数组输入流：内存--》程序
        CharArrayReader in = new CharArrayReader(data);
        char[] buffer = new char[5];
        int len = -1;
        while ((len = in.read(buffer)) != -1) {
            System.out.println(new String(buffer, 0, len));
        }
        in.close();
        out.close();
    }

}
