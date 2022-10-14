import java.util.Scanner;
public class division {
    public static void main(String[] args){
        System.out.println("enter first number: ");
        int firstNum  = getUserNum();
        System.out.println("enter second number: ");
        int secondNum  = getUserNum();
        int result = divisionNum(firstNum, secondNum);
        System.out.println("Natija " +result);
    }

    public static int getUserNum(){
        return new Scanner(System.in).nextInt();
    }
    public static int divisionNum(int firstNum, int secondNum ) {
            System.out.println(firstNum + " soni " + secondNum + " bo'lmaydi!");
            return firstNum / secondNum;

    }
}
