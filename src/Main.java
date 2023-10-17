import javax.swing.undo.AbstractUndoableEdit;
import java.util.concurrent.*;

public class Main {
    public static class Student {
        String name ;
        int rollNo ;
        int age ;
        Student(String name, int rollNo, int age){
            this.name = name ;
            this.rollNo = rollNo ;
            this.age = age ;
        }
        Student(Student student){
            this.name = student.name ;
            this.rollNo = student.rollNo ;
            this.age = student.age ;
        }
    }
    public static void main(String[] args) {
        Student S1 = new Student("Arun",12345,29) ;
        Student S2 = new Student((S1)) ;
        System.out.println(S2.name);
        System.out.println(S2.age);
        System.out.println(S2.rollNo);
    }
}