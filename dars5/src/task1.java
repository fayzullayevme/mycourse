import java.util.Scanner;
public class task1{
    public static void main(String[] argrs){
        System.out.println("Birinchi raqamni kiriting: ");
        double firstNumber = getUserInput();
        System.out.println("Ikkinchi raqamni kiriting: ");
        double secondNumber = getUserInput();
        System.out.println("Operatorni kiriting: ");
        String amal = getUserInputFun();

        if (amal.equals("+")){
            System.out.println(firstNumber+secondNumber);
        } else if (amal.equals("-")) {
            System.out.println(firstNumber-secondNumber);
        } else if (amal.equals("*")) {
            System.out.println(firstNumber*secondNumber);
        } else if (amal.equals("/")) {
            System.out.println(firstNumber/secondNumber);
        } else if (amal.equals("%")) {
            System.out.println(firstNumber%secondNumber);
        }
        else {
            System.out.println("bunday amal mavjud emas");
        }

    }
    public static double getUserInput(){
        return new Scanner(System.in).nextDouble();
    }
    public static String getUserInputFun(){
        return new Scanner(System.in).next();
    }

}