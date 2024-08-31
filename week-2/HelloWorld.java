import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.getGrade();
        s1.avg();
        s1.display();
    }
}

class Student
{
    String name;
    int maths, sci, eng;
    float average;
    
    void getGrade()
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the grade of maths: ");
        maths=scan.nextInt();
        System.out.println("Enter the grade of science: ");
        sci=scan.nextInt();
        System.out.println("Enter the grade of english: ");
        eng=scan.nextInt();
    }
    
    void avg()
    {
        average=(float)(maths+sci+eng)/3;
        System.out.println("The average is "+average);
    }
    
    void display()
    {
        System.out.println("Maths Grade: "+maths);
        System.out.println("Science Grade: "+sci);
        System.out.println("English Grade "+eng);
    }
}

