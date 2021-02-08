package Task6;
//6. 编写一个 Java 应用程序，设计一个汽车类 Vehicle，包含的属性有车轮个数 wheels 和车重
//        weight。小车类 Car 是 Vehicle 的子类，其中包含的属性有载人数 loader。卡车类 Truck 也是
//        Vehicle 的子类，其中包含的属性有载人数 loader 和载重量 payload。每个类都有构造方法和
//        输出相关数据的方法。最后，写一个测试类来测试这些类的功能。
public class vehicle {//输入什么，返回什么
     int wheels;
    int weight;
    public int Wheels(int wheels) {
        return wheels;
    }
    public int Weight(int weight) {
        return weight;
    }
    public vehicle(int wheels,int weight){
    this.weight=weight;
    this.wheels=wheels;
    }
}
