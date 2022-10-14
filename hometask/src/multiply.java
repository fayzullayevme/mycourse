import java.util.Scanner;
public class multiply {
    public static void main(String[] argrs){
        System.out.println("enter first number: ");
        int firstNum1  = getUserNum();
        System.out.println("enter second number: ");
        int secondNum1  = getUserNum();
        int result1 = multiplyNum(firstNum1, secondNum1);
        System.out.println("Natija: "+ result1);
}
    public static int getUserNum(){
        return new Scanner(System.in).nextInt();
    }
    public static int multiplyNum(int firstNum1, int secondNum1 ) {
            return firstNum1 * secondNum1;
    }
}
