package data_stream;

import java.io.*;

/**
 * Created by sifu on 2017/3/25.
 */
//数据流
//必须读写一一对应，如writeByte对应readByte
public class DataStreamDemo {
    public static void main(String[] args) throws Exception {
        File f = new File("D:\\123.txt");
        write(f);
        read(f);
    }

    public static void read(File f) throws Exception {
        DataInputStream in = new DataInputStream(new FileInputStream(f));
        System.out.println(in.readByte());
        System.out.println(in.readChar());
        System.out.println(in.readUTF());
    }

    public static void write(File f) throws Exception {
        DataOutputStream out = new DataOutputStream(new FileOutputStream(f));
        out.writeByte(65);
        out.writeChar('c');
        out.writeUTF("will");
        out.close();
    }
}
