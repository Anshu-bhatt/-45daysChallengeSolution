import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Scanner scan = new Scanner(System.in);
        int year=0;
        year=scan.nextInt();
        if((year%100!=0 &&  year%4==0) || year%400==0)
        {
            System.out.println("YAY! its a leap year.");
        }
        else
        {
            System.out.println("NAH! its not a leap year.");
        }
    }
}
