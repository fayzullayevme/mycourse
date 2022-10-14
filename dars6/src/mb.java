import java.util.Scanner;

public class mb {
    public static void main(String[] args) {
        System.out.println("hajm kbni kiriting:");
        int son1=getUserInfo();
        printMegaBytesAndKiloBytes(son1);
    }

    public static void printMegaBytesAndKiloBytes(int kilobytes) {
        if (kilobytes<0){
            System.out.println("Invalid Value");
        } else {
            int natija = kilobytes/1024;
            int qoldiq = kilobytes%1024;
            System.out.println(kilobytes +" KB = " +natija +" MB " +qoldiq +" KB ");
        }

    }
    public static int getUserInfo() {
        return new Scanner(System.in).nextInt();
    }

