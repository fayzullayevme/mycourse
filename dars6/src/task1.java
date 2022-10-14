import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        System.out.println("enter number: ");
        int son1  = getUserNum();
        check(son1);
    }
    public static void check(int son){
        if (son>0){
            System.out.println(son +" musbat son ");
        }
        else if(son<0){
            System.out.println(son +" manfiy son ");
        } else if (son==0) {
            System.out.println(son +" nol ");
        }
      }
    public static int getUserNum(){
        return new Scanner(System.in).nextInt();
    }
}
