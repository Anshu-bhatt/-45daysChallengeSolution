import java.util.*;

class ConcateString {
    public static void main(String[] args) {
        String st1= new String();
        String st2= new String();
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the first string: ");
        st1=scan.nextLine();
        System.out.println("Enter the second string: ");
        st2=scan.nextLine();
        System.out.println("Concated string: "+(st1+st2));
    }
}
