package memory_array;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * Created by sifu on 2017/3/23.
 */
//字节的数组流/内存流
public class ByteArrayDemo {
    public static void main(String[] args) throws Exception{
        //字节数组输出流：程序--》内存
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write("ABCDEF".getBytes());
        //要使用存储的数据
        byte[] data = out.toByteArray();

        //字节数组输入流：内存--》程序
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        byte[] buffer = new byte[5];
        int len = -1;
        while ((len = in.read(buffer)) != -1) {
            System.out.println(new String(buffer, 0, len));
        }
        in.close();
        out.close();
    }
}
