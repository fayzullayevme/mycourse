import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        System.out.println("enter kilometr");
        double son1 = getUserInfo();
        System.out.println((long)toMilSoat(son1));
    }

    public static double toMilSoat(double son) {
        double milKmda = 1.609;
        if (son < 0) {
            return -1;
        }
        return son / milKmda;
    }

    public static double getUserInfo() {
        return new Scanner(System.in).nextDouble();
    }
}