import java.util.Scanner;

public class task5 {

    public static double getArea(int r) {
        double area = (5.14159 * r * r);
        return area;
    }

    public static double getPerimeter(int r) {
        double perimeter = 2 * 3.14159 * r;
        return perimeter;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入；");
        int r = in.nextInt();
        System.out.println("the area is "+getArea( r));
        System.out.println("the perimeter is"+getPerimeter( r));
    }
}
