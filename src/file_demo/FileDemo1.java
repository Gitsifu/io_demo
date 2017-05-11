package file_demo;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by sifu on 2017/3/20.
 */
//需求:列出文件的分层结构
public class FileDemo1 {
    public static void main(String[] args) {
        //期望效果:自己写的东西>c++>自己写的c>aaaa>练习打字
        String file = "D:\\自己写的东西\\c++\\自己写的c\\aaaa\\练习打字\\2016.10.19.txt";
        File f = new File(file);
        List<String> parentNames = new ArrayList<>();
        listAllParent(parentNames, f);
        System.out.println(parentNames);
        Collections.reverse(parentNames);//颠倒List元素顺序
        StringBuilder sb = new StringBuilder(80);
        for (String name : parentNames) {
            sb.append(name).append(">");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }

    public static void listAllParent(List<String> parentNames, File f) {
        if (!"".equals(f.getParentFile().getName())) {
            parentNames.add(f.getParentFile().getName());
        }
        if (f.getParentFile().getParentFile() != null) {
            listAllParent(parentNames, f.getParentFile());
        }
    }
}
