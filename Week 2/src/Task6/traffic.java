package Task6;

import java.util.Scanner;

//6. 编写一个 Java 应用程序，设计一个汽车类 Vehicle，包含的属性有车轮个数 wheels 和车重
//        weight。小车类 Car 是 Vehicle 的子类，其中包含的属性有载人数 loader。卡车类 Truck 也是
//        Vehicle 的子类，其中包含的属性有载人数 loader 和载重量 payload。每个类都有构造方法和
//        输出相关数据的方法。最后，写一个测试类来测试这些类的功能。
public class traffic {
    public static void main(String[] args) {
        car c=new car(4,1150,3);
        System.out.println("车轮有"+c.wheels+"个    "+"车重"+c.weight);
        System.out.println("这是小车能载6人，实载"+c.loader+"人");
        truck t=new truck(6,15000,3,7000);
        System.out.println("车轮有"+t.wheels+"个    "+"车重"+t.weight);
        System.out.println("这是卡车能载3人，实载"+t.loader+"人");
        System.out.println("这是卡车核载5000kg，实载"+t.payload+"kg");
    }
}