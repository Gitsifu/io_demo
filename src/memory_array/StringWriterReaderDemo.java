package memory_array;

import java.io.StringReader;
import java.io.StringWriter;

/**
 * Created by sifu on 2017/3/23.
 */
//字符串流（字符串的内存流）
public class StringWriterReaderDemo {
    public static void main(String[] args) throws Exception {
        //字符串的输出流
        StringWriter swriter = new StringWriter();
        swriter.write("四福你今年几岁啊？");
        swriter.write("年年19岁！");
        System.out.println(swriter.toString());
        //字符串的输入流
        StringReader sReader = new StringReader(swriter.toString());
        char[] data = new char[1024];
        int len = -1;
        while ((len = sReader.read(data)) != -1) {
            System.out.println(new String(data,0,len));
        }
    }
}
