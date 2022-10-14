import java.util.Scanner;
public class Main {
    public static void main(String[] argrs){
        System.out.println("Birinchi raqamni kiriting: ");
        int firstNumber = getUserInput();
        System.out.println("Ikkinchi raqamni kiriting: ");
        int secondNumber = getUserInput();
        int result = addNumbers(firstNumber, secondNumber);
        System.out.println("Natija: "+ result);
    }
    public static int getUserInput(){
        return new Scanner(System.in).nextInt();
    }
    public static int addNumbers(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
}