package Task7;
//7.模拟农学院动物医疗系统信息。
//         定义抽象家禽类(Poultry)
//        (1)私有成员变量：动物种类(name)，症状(symptom)，年龄(age)， 病因（illness）
//        (2)提供空参和带参构造方法
//        (3)成员方法；
//        ①抽象方法症状(showSymptom)
//        ②普通方法基本信息(showMsg)
//        ③提供 setXxx 和 getXxx 方法
//         定义普通鸭子类(Duck)继承家禽类(Poultry)
//        (1)提供空参和带参构造方法
//        (2)重写 showSymptom 方法，打印症状信息。
public  abstract class Poultry {// 定义抽象家禽类(Poultry)
    private int age;
    private String name;
    private String illness;
    private String symptom;
    public abstract void showSymptom();//抽象方法症状(showSymptom)
    public void show() {//普通方法基本信息(showMsg)
        System.out.print("动物种类:" + name);
        System.out.println(",年龄:" + age + "岁");
        System.out.println("入院原因:" + illness);
    }
    public Poultry(String name, String illness, String symptom, int age) {//带参构造
        this.name = name;
        this.illness = illness;
        this.symptom = symptom;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getIllness() {
        return illness;
    }
    public void setIllness(String illness) {
        this.illness = illness;
    }
    public String getSymptom() {
        return symptom;
    }
    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }
    public Poultry() {
        super();//空参构造来调用函数
    }

}