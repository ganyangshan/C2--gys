package Task8;
// 定义抽象类 A，抽象类 B 继承 A，普通类 C 继承 B  A 类中，定义成员变量 numa，赋值为 10，抽象 showA 方法。
//         B 类中，定义成员变量 numb，赋值为 20，抽象 showB 方法。
//         C 类中，定义成员变量 numc，赋值为 30，重写 showA 方法，打印 numa，重写 showB
//        方法，打印 numb，定义 showC 方法，打印 numc。  测试类中，创建 C 对象，调用 showA 方法，showB 方法，showC 方法。
public abstract class abstractA {//抽象类A
    int numa = 10;
    public abstract void showA();
    }

