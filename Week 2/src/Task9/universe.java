package Task9;
// 定义接口 Universe，提供抽象方法 doAnything。  定义普通类 Star，提供成员发光 shine 方法
//         定义普通类 Sun，继承 Star 类，实现 Universe 接口
//         测试类中，创建 Star 对象，调用 shine 方法
//         测试类中，多态的方式创建 Sun 对象，调用 doAnything 方法，向下转型，调用 shine 方
//     法.
public interface universe {//// 定义接口 Universe，提供抽象方法 doAnything。
    public abstract void doAnything();
}
