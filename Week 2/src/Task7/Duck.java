package Task7;

public class Duck extends Poultry{
    public Duck() {

    }

    public Duck(String name, String illness, String symptom, int age) {

        super(name, illness, symptom, age);

    }

    @Override//抽象继承可重写部分

    public void showSymptom() {//重写

        System.out.println("症状为:" +getSymptom() );

    }
}
