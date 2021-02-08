package Task7;
//7.模拟农学院动物医疗系统信息。
//         定义抽象家禽类(Poultry)
//        (1)私有成员变量：动物种类(name)，症状(symptom)，年龄(age)， 病因（illness）
//        (2)提供空参和带参构造方法
//        (3)成员方法：
//        ①抽象方法症状(showSymptom)
//        ②普通方法基本信息(showMsg)
//        ③提供 setXxx 和 getXxx 方法
//         定义普通鸭子类(Duck)继承家禽类(Poultry)
//        (1)提供空参和带参构造方法
//        (2)重写 showSymptom 方法，打印症状信息。
public class animal {
    public static void main(String[] args){
        Duck duck = new Duck("鸭子", "感冒", "发烧", 2);//
        duck.show();
        duck.showSymptom();//重写 showSymptom 方法，打印症状信息。
    }

}
