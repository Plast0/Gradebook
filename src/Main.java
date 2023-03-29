import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Jan", "Kowalski", StudentCondition.PRESENT, 2001, 20.0 );
        Student student2 = new Student("Alicja", "Nowak", StudentCondition.PRESENT, 2001, 20.0 );
        Student student3 = new Student("Jakub", "Jakubowski", StudentCondition.PRESENT, 2001, 20.0 );
        Student student4 = new Student("Jakub", "Jakubowski", StudentCondition.PRESENT, 2001, 20.0 );
        Class class1 = new Class("Class 1", 20);
        System.out.println(student1.toString());
        class1.addStudent(student3);
        class1.addStudent(student4);
        System.out.println(student3.compare(student4));
        System.out.println(student3.compare(student1));

    }
}