package prptotype;

/**
 * @author 李国栋
 * @create 2020-12-16 6:56 上午
 */
public class Main {
    public static void main(String[] args) {
        Sheep sheep1 = new Sheep("tom",18,"red");
        sheep1.friend = new Sheep("jack",11,"blue");
        try {
            Sheep sheep2 = (Sheep) sheep1.clone();
            Sheep sheep3 = (Sheep) sheep1.clone();
            Sheep sheep4 = (Sheep) sheep1.clone();



            System.out.println("sheep1 = "+sheep1+"sheep1.friend"+sheep1.friend.hashCode());
            System.out.println("sheep2 = "+sheep2+"sheep2.friend"+sheep2.friend.hashCode());
            System.out.println("sheep3 = "+sheep3+"sheep3.friend"+sheep3.friend.hashCode());
            System.out.println("sheep4 = "+sheep4+"sheep4.friend"+sheep4.friend.hashCode());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
