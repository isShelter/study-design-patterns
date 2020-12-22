package singleton;

/**
 * @author 李国栋
 * @create 2020-12-17 11:14 上午
 */
public class SingletonTest07 {
    public static void main(String[] args) {
        System.out.println("使用静态内部类完成单例模式");
//        Singleton instance = Singleton.getInstance();
//        Singleton instance2 = Singleton.getInstance();
//        System.out.println(instance == instance2); // true
//        System.out.println("instance.hashCode=" + instance.hashCode());
//        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

enum Singleton {
    INSTANCE; //属性
}