package properties_demo;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by sifu on 2017/3/25.
 */
public class LoadResourceDemo {
    public static void main(String[] args) throws Exception {
        //创建Properties对象
        Properties p = new Properties();
        //加载输入流中的数据，加载之后，逐句都在陪对象中
        //p.load(new FileInputStream("D:\\db.properties"));//缺陷：用的绝对路径
        p.load(new FileInputStream("src\\db.properties"));
        System.out.println(p);
        System.out.println("用户名：" + p.getProperty("username"));
        System.out.println("密码：" + p.getProperty("password"));
    }
}
