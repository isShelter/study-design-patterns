package prptotype;

/**
 * @author 李国栋
 * @create 2020-12-16 6:52 上午
 */
public class Sheep implements Cloneable {

    private String name;
    private int age;
    private String color;
    private String addr = "新疆羊";
    public Sheep friend;// 是对象, 克隆会如何处理, 默认是浅拷贝

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

//    @Override
//    public String toString() {
//        return "Sheep : [name = "+name+",age = "+age+",color = "+color+"]";
//    }


    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep sheep =null;
        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        return sheep;
    }
}
