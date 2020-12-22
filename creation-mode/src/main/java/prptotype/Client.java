package prptotype;

/**
 * @author 李国栋
 * @create 2020-12-16 10:28 上午
 */
public class Client {

//    public static void main(String[] args) {
//        // 传统的方法
//        Sheep sheep = new Sheep("tom", 1, "白色");
//        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
//        Sheep sheep3 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
//        Sheep sheep4 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
//        Sheep sheep5 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor()); //....
//        System.out.println(sheep);
//        System.out.println(sheep2);
//        System.out.println(sheep3);
//        System.out.println(sheep4);
//        System.out.println(sheep5);
//    }

    public static void main(String[] args) throws Exception {
        DeepProtoType p = new DeepProtoType();
        p.name = "悟空";
        p.deepCloneableTarget = new DeepCloneableTarget("孙大圣", "猴子的类");

        //method 1 深拷贝

//		DeepProtoType p2 = (DeepProtoType) p.clone();
//		System.out.println("p.name=" + p.name + "p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
//		System.out.println("p2.name=" + p.name + "p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());

//        //method 2 深拷贝
        DeepProtoType p2 = (DeepProtoType) p.deepClone();
        System.out.println("p.name=" + p.name + "p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
        System.out.println("p2.name=" + p.name + "p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());
    }
}

