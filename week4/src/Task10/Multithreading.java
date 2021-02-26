package Task10;

public class Multithreading {

        public static int A = 0; //定义一个静态全局变量，作为标志位

        public static void main(String[] args) {//线程A输出偶数
            Thread r1 = new Thread(
                    ()->{
                        while(A<=10){
                            while(A%2==1&&A<=10);
                            System.out.println(Thread.currentThread().getName()+"打印:"+A);
                            A++;
                        }
                    }
            );
            Thread r2 = new Thread(//线程B输出奇数
                    ()->{
                        while(A<10){
                            while(A%2==0&&A<10);
                            System.out.println(Thread.currentThread().getName()+"打印:"+A);
                            A++;
                        }
                    }
            );
            r1.setName("线程A");
            r2.setName("线程B");
            r1.start();
            r2.start();
        }
    }

