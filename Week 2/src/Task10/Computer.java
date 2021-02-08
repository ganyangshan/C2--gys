package Task10;

public class Computer {
    private USB[] a = new USB[4];
    public void add(USB usb) {
        for(int i=0;i<a.length;i++) {
            if(a[i]==null) {
                a[i]=usb;
                break;
            }
        }
    }

    public void powerOn() {
        for(int i=0;i<a.length;i++) {
            if(a[i]!=null) {//如果不是空的则开机
                a[i].turnOn();
            }
        }
        System.out.println("电脑开机成功");
    }

    public void powerOff() {
        for(int i=0;i<a.length;i++) {
            if(a[i]!=null) {//接口
                a[i].turnOff();
            }
        }
        System.out.println("电脑关机成功");
    }

}