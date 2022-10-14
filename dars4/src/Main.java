import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("enter first number: ");
        int year  = getUserNum();
        boolean condFirst = year % 4==0;
        boolean condSecond = year % 100 != 0;
        boolean condThird = year % 400==0;
        if ((condFirst && condSecond) || (condThird)){
            System.out.println(year +" Bu yil kabisiya yili");
        }
        else{
            System.out.println(year +" Bu yil kabisiya yili emas!");
        }
    }
    public static int getUserNum(){
        return new Scanner(System.in).nextInt();
    }
}