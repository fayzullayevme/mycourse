public class task {
    public static void main(String[] args) {
       int talaba1=83;
       int talaba2=47;
       int talaba3=70;
       int talaba4=92;
       check(talaba1);
       check(talaba2);
       check(talaba3);
       check(talaba4);
    }
    public static void check(int talaba){
        if (talaba>=90){
            System.out.println(talaba +" bal olgan talaba 'A' sinfga to'g'ri keladi ");
        }
        else if(talaba>=80){
            System.out.println(talaba +" bal olgan talaba 'B' sinfga to'g'ri keladi ");
        } else if (talaba>=70) {
            System.out.println(talaba +" bal olgan talaba 'C' sinfga to'g'ri keladi ");
        } else if (talaba>=60) {
            System.out.println(talaba +" bal olgan talaba 'D' sinfga to'g'ri keladi ");
        } else if (talaba>=50) {
            System.out.println(talaba +" bal olgan talaba 'E' sinfga to'g'ri keladi ");
        } else if (talaba<50) {
            System.out.println(talaba +" bal olgan talaba 'F' sinfga to'g'ri keladi ");
        }
    }
}
