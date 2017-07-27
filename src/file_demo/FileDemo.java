package file_demo;

import java.beans.IntrospectionException;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sifu on 2017/3/20.
 */
//需求：列出指定目录中的所有的文件，包括子文件夹中的所有文件（试用递归算法）
public class FileDemo {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\sifu\\Desktop\\图片");
        listAllFiles(file);
    }
private static int index= 121;
    //列出所有的文件
    public static void listAllFiles(File f) {
        //第一级子文件
        File[] fs = f.listFiles();
        for (File file : fs) {
            //如果是文件
            if (file.isFile()){
                System.out.println(file.getName());
            }

            //如果子文件是目录，则继续递归
            if (file.isDirectory()) {
                listAllFiles(file);
            }
        }
    }

}
