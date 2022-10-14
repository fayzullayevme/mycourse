import java.util.Locale;
import java.util.Scanner;

public class months {
    public static void main(String[] args) {
        System.out.println("oyni kiriting:");
        Scanner myInfo=new Scanner(System.in);
        String myMonth=myInfo.next();
        months(myMonth);
    }

    public static String months(String myStr) {
        switch (myStr.toLowerCase()) {
            case "fevral":
                System.out.println("28/29");
                break;
            case "yanvar", "mart", "may", "iyul", "avgust", "oktyabr", "dekabr":
                System.out.println("31");
                break;
            case "aprel", "iyun", "sentyabr", "noyabr":
                System.out.println("30");
                break;
            default:
                System.out.println("Bunday oy mavjud emas!");
                break;
        }
        return myStr;
    }
}

