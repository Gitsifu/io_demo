package utf_8demo;

import java.util.Arrays;

/**
 * Created by sifu on 2017/3/23.
 */
//编码于解码操作（包含解决乱码问题）
public class EncodingDemo {
    public static void main(String[] args) throws Exception {
        String msg = "四福";
        //编码操作：String-->byte[]
        byte[] data = msg.getBytes("UTF-8");
        System.out.println(Arrays.toString(data));
        //解码操作:byte[] --> String
        //因为服务器都是老外写的，所以老外解码使用自己的ISO-8859-1
        String ret = new String(data, "ISO-8859-1");
        System.out.println(ret);//对于中文来说 ： 乱码：åç¦
        //=============
        //解决方案：
        data = ret.getBytes("ISO-8859-1");
        ret = new String(data, "UTF-8");
        System.out.println(ret);
    }
}
