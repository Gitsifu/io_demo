package memory_array;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

/**
 * Created by sifu on 2017/3/23.
 */
//合并流/顺序流
public class SequenceInputStreamDemo {
    public static void main(String[] args) throws Exception{
        SequenceInputStream in =
                new SequenceInputStream(new FileInputStream("D:\\123.txt"), new FileInputStream("D:\\123_copy.txt"));
        byte[] data = new byte[1024];
        int len = -1;
        while((len = in.read(data)) != -1){
            System.out.println(new String(data,0,len));
        }
    }
}
