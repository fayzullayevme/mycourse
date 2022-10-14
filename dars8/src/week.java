import java.util.Scanner;

public class week {
    public static void main(String[] args) {
        System.out.println("sonni kiriting:");
        Scanner myInfo=new Scanner(System.in);
        int numDays=myInfo.nextInt();
        printDayOfTheWeek(numDays);
    }

    public static void printDayOfTheWeek(int days){
        switch (days) {
            case 1:
                System.out.println("Dushanba"); break;
            case 2:
                System.out.println("Seshanba"); break;
            case 3:
                System.out.println("Chorshanba"); break;
            case 4:
                System.out.println("Payshanba"); break;
            case 5:
                System.out.println("Juma"); break;
            case 6:
                System.out.println("Shanba"); break;
            case 7:
                System.out.println("Yakshanba"); break;
            default:
                System.out.println("Invalid day"); break;
        }
    }
}
