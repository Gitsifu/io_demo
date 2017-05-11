package object;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by sifu on 2017/3/24.
 */
//序列化与反序列化
public class ObjectStreamDemo {
    public static void main(String[] args) throws Exception {
        //序列化
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\123.txt"));
        out.writeObject(new User("四福","123456", 19));
        out.close();
        //反序列化
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\123.txt"));
        User user = (User) in.readObject();
        System.out.println(user);
        in.close();
    }
}
