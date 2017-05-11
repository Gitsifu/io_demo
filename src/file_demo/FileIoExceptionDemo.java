package file_demo;

import java.io.*;

/**
 * Created by sifu on 2017/3/21.
 */
//正确处理io异常，关闭资源
public class FileIoExceptionDemo {
    public static void main(String[] args)throws Exception{
        text1();//java7自动资源关闭
       // text2();//java7之前

    }

    private static void text2() {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        //1.创建源
        File src = new File("D:\\123.txt");
        File copySrc = new File("D:\\123_copy.txt");
        try {
            //2.创建流对象
            inputStream = new FileInputStream(src);
            outputStream = new FileOutputStream(copySrc);
            //3.io具体操作
            byte[] data = new byte[10];
            int len = -1;//表示已经读取了多少个字节数，如果是-1表明文件已经读取到最后
            while ((len = inputStream.read(data)) != -1) {
                //打印读取的数据
                //System.out.println(new String(data, 0, len));
                //写入读取的数据
                outputStream.write(data, 0, len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //4.关闭资源
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
            try {
                if (outputStream != null) {
                    outputStream.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }

    public static void text1(){
        File src = new File("D:\\123.txt");
        File copySrc = new File("D:\\123_copy.txt");
        //java7提供的自动资源关闭
        try(
                InputStream inputStream = new FileInputStream(src);
                OutputStream outputStream = new FileOutputStream(copySrc);
                    ){
            byte[] data = new byte[10];
            int len = -1;//表示已经读取了多少个字节数，如果是-1表明文件已经读取到最后
            while ((len = inputStream.read(data)) != -1){
                //System.out.println(new String(data,0,len)); //打印读取的数据
                outputStream.write(data,0,len);  //写入读取的数据
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
 /*
        //1.创建源
        File src = new File("D:\\123.txt");
        File copySrc = new File("D:\\123_copy.txt");
        //2.创建流对象
        InputStream inputStream = new FileInputStream(src);
        OutputStream outputStream = new FileOutputStream(copySrc);
        //3.io具体操作
        byte[] data = new byte[10];
        int len = -1;//表示已经读取了多少个字节数，如果是-1表明文件已经读取到最后
        while ((len = inputStream.read(data)) != -1){
            //打印读取的数据
            System.out.println(new String(data,0,len));
            //写入读取的数据
            outputStream.write(data,0,len);
        }
        //4.关闭资源
        inputStream.close();
        outputStream.close();
        */