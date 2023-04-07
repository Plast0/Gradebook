import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Jan", "Kowalski", StudentCondition.PRESENT, 2001, 20.0 );
        Student student2 = new Student("Alicja", "Nowak", StudentCondition.PRESENT, 2001, 20.0 );
        Student student3 = new Student("Jakub", "Jakubowski", StudentCondition.PRESENT, 2001, 20.0 );
        Student student4 = new Student("Jakub", "Jakubowski", StudentCondition.PRESENT, 2001, 20.0 );
        Student student5 = new Student("Jan", "Snieg", StudentCondition.PRESENT, 2001, 20.0 );
        Student student6 = new Student("Henryk", "Garncarz", StudentCondition.PRESENT, 2001, 20.0 );
        Student student7 = new Student("Howard", "Rzemioslolubny", StudentCondition.PRESENT, 2001,0.0);
        Student student8 = new Student("Piotrek", "Cosieniedostal", StudentCondition.PRESENT, 2001,1.0);
        Class class1 = new Class("Class 1", 6);
        class1.addStudent(student1);
        class1.addStudent(student2);
        class1.addStudent(student3);
        class1.addStudent(student4);
        class1.addStudent(student5);
        class1.addStudent(student6);
        class1.addStudent(student7);
        class1.addStudent(student8);
        System.out.println("------------------");
        class1.addPoints(student3, 16);
        System.out.println("------------------");
        class1.getStudent(student6);
        class1.getStudent(student7);
        System.out.println("------------------Changing condition------------------");
        class1.changeCondition(student3, StudentCondition.ABSENT );
        class1.changeCondition(student2, StudentCondition.SICK );
        class1.changeCondition(student5, StudentCondition.REWORKING );
        System.out.println("------------------");
        class1.removePoints(student6, 10);
        System.out.println("------------------Looking for student that's on the list------------------");
        class1.search("Snieg");
        System.out.println("------------------Looking for student that's not on the list------------------");
        class1.search("Buba");
        System.out.println("------------------Partial searching --------------------");
        class1.searchPartial("l");
        System.out.println("------------------Searching for students with chosen condition ----------------");
        class1.countByCondition(StudentCondition.PRESENT);
        System.out.println("------------------Class summary------------------");
        class1.summary();
        System.out.println("------------------Class sorted by student's name------------------");
        class1.sortByName();
        System.out.println("------------------Class sorted by student's points-----------------");
        class1.sortByPoints();
        System.out.println("------------------Student with most points in class-----------------");
        class1.max();
        System.out.println("------------------Adding class to new container-----------------");
        ClassContainer gradebook = new ClassContainer();
        gradebook.addClass("Class 1", class1);
        System.out.println("------------------Adding the same class again-----------------");
        gradebook.addClass("Class 1", class1);
        System.out.println("------------------Adding another class-----------------");
        Class class2 = new Class("Class 2", 2);
        gradebook.addClass("Class 2", class2);
        System.out.println("------------------Finding empty classes-----------------");
        List emptyClass = gradebook.findEmpty();
        System.out.println("------------------Container summary-----------------");
        gradebook.summary();
        System.out.println("------------------Removing secound class-----------------");
        gradebook.removeClas("Class 2");
        System.out.println("------------------Container summary-----------------");
        gradebook.summary();
    }
}