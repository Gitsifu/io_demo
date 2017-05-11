package object;

/**
 * Created by sifu on 2017/3/24.
 */
public class User implements java.io.Serializable {
    //设置版本号
    public static final long serialVersionUID = 1L;
    private String name;
    //添加transient修饰符则这个字段不能序列化
    transient private String password;
    private int age;

    public User(String name, String  password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }


    public String toString() {
        return "User[" + "name=" + name + ",password=" + password + ",age=" + age + "]";
    }
}
