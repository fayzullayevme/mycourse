import javax.swing.*;
import java.util.Scanner;

public class Minutes {
    public static void main(String[] args) {
        Scanner k= new Scanner(System.in);
        System.out.println("sekundni kiriting: ");
        int m= k.nextInt();
        System.out.println( getDurationString(m));
    }

    public static String getDurationString(int minutes, int sekundes) {
        if (minutes < 0 || sekundes < 0 || sekundes > 59){
            return  "Invalid value";
        }
        return String.format("%s H %s M %s S ", minutes/60, minutes%60, sekundes) ;
    }

    public static String getDurationString(int seconds) {
        if (seconds<0)
            return "Invalid value";
        int myMinut= seconds/60;
        int mySecond = seconds%60;
        return getDurationString(myMinut, mySecond);
    }
}
