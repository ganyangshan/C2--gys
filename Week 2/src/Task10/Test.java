package Task10;

public class Test {

    public static void main(String[] args) {
        Computer us = new Computer();
        us.add(new Mouse());
        us.add(new KeyBoard());
        us.add(new Microphone());
        us.powerOn();
        System.out.println("                ");
        us.powerOff();
    }

}