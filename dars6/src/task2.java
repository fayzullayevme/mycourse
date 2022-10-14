import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        System.out.println("enter kilometr: ");
        double son1  = getUserNum();
        kmToMilSoat(son1);
    }
    public static void kmToMilSoat(double son){
        double milKmda =1.609;
        if (son>0){
            System.out.println(son +" km = " +(long)son/milKmda +" mil");
        }
        else if(son<0){
            System.out.println(" -1 ");
        }
    }
    public static double getUserNum(){
        return new Scanner(System.in).nextDouble();
    }
}

