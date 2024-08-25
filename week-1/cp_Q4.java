
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Scanner scan = new Scanner(System.in);
        float degree=scan.nextFloat();
        
        //for celcius to fahrenhite
        float f=((9.0f / 5)*degree) + 32;
        System.out.println("degree to fahrenhite: "+f);
        
        //for fahrenhite to celcius
        float c=(5.0f / 9)*(f-32);
        System.out.println("fahrenhite to degree: "+c);
    }
}
