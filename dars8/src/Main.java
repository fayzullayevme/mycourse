public class Main {
    public static void main(String[] args) {
        char myChar='A';
        String myStr="Salom";
        print(myChar);
        print(myStr);
    }
//method overloading
    public static void print(String txt) {
        System.out.println(txt);
    }

    public static void print(char txt) {
        System.out.println(txt);
    }
}