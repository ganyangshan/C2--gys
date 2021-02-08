package Task9;

public class sun extends Star implements universe{// 定义普通类 Sun，继承 Star 类，实现 Universe 接口
    @Override
    public void doAnything() {
        System.out.println("sun:太阳吸引着9大行星旋转");
    }
    @Override
    public void shine() {
        System.out.println("sun:光照八分钟,到达地球");
    }
}
