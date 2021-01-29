import java.util.Scanner;

public class task3 {
    public static void F(char [] a){
        int i=0,j=a.length-1;
        char t;
        for(;j>i;i++,j--){
            t=a[i];
            a[i]=a[j];
            a[j]=t;
        }
        System.out.println(a);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char a[] = {'a','c','u','g','q'};
        F(a);
    }

    }