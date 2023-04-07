import java.util.*;

public class Class {
    String groupName;
    List<Student> listOfStudents;
    int maxStudentCount;

    public Class(String groupName, int maxStudentCount) {
        this.groupName = groupName;
        this.listOfStudents = new ArrayList<Student>();
        this.maxStudentCount = maxStudentCount;
    }
    public class studentPointComparator implements Comparator<Student>{
        @Override
        public int compare(Student s1, Student s2) {
            return (int) (s1.pointsSum - s2.pointsSum);
        }
    }

    void addStudent(Student student){
        int comparableInt = -1;
        if(listOfStudents.size() < this.maxStudentCount ){
            for(Student studentSearch : listOfStudents ) {
                comparableInt = studentSearch.compare(student);
                //System.out.println(comparableInt); // for testing compare int value
            }
            if (comparableInt != 0) {
                listOfStudents.add(student);
                System.out.println(student.name + " "+ student.surname+" was added to the group.");
            } else {
                System.out.println("You can't add student with the same surname again to this group.");
            }
        }else {
            System.err.println("You can't add more students to this group.");
        }
    }

    void addPoints(Student student, double points){

        student.pointsSum += points;
        System.out.println(student.name+ " "+ student.surname+" gain "+ points +" points.");
    }
    void getStudent(Student student) {
        if (student.pointsSum <= 0) {
            listOfStudents.remove(student);
            System.out.println(student.name+ " "+ student.surname +" was erased from the class");
        }
    }
    void changeCondition(Student student, StudentCondition condition){
        student.condition = condition;
        System.out.println(student.name+ " "+ student.surname +" is " + condition);
    }

    void removePoints(Student student, double points){
        student.pointsSum -= points;
        System.out.println(student.name+ " "+ student.surname+" lost "+ points+ " points.");
    }
    void  search(String name){
        boolean isOnTheList = false;
        for(Student studentSearch : listOfStudents ){
            if( name == studentSearch.surname){
                System.out.println("Student that you are looking: ");
                System.out.println(studentSearch.toString());
                isOnTheList = true;
            }
        }
        if( isOnTheList == false) {
            System.out.println("There is no student with surname "+ name+ " in this class");
        }
    }
    void searchPartial(String name){
        boolean isOnTheList = false;
        for(Student studentSearch : listOfStudents ){
            if( studentSearch.surname.contains(name)){
                System.out.println("Student that you are looking: ");
                System.out.println(studentSearch.toString());
                isOnTheList = true;
            } else if (studentSearch.name.contains(name)) {
                System.out.println("Student that you are looking: ");
                System.out.println(studentSearch.toString());
                isOnTheList = true;
            }
        }
        if( isOnTheList == false) {
            System.out.println("There is no student with surname "+ name+ " in this class");
        }
    }
    void countByCondition(StudentCondition condition){
        boolean hasCondition = false;
        System.out.println("Students that are "+ condition +": ");
        for(Student studentSearch : listOfStudents ) {
            if (condition == studentSearch.condition) {
                System.out.println(studentSearch.name + " "+ studentSearch.surname);
                hasCondition = true;
            }
            if (hasCondition == false) {
                System.out.println("There is no one with that condition");
            }
        }
    }
    void summary(){
        for(Student studentSeatch : listOfStudents){
            System.out.println(studentSeatch.toString());
        }
    }

    void sortByName () {
        Collections.sort(listOfStudents, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.surname.compareTo(o2.surname);
            }
        });
        for(Student studentSearch : listOfStudents ){
            System.out.println(studentSearch.toString());
        }
    }
    void sortByPoints(){
        Collections.sort(listOfStudents, new studentPointComparator());
        Collections.reverse(listOfStudents);
        for(Student studentSearch : listOfStudents ){
            System.out.println(studentSearch.toString());
        }
    }
    void max(){
        System.out.println(Collections.max(listOfStudents, new studentPointComparator()));
    }
    boolean empty(){
        return listOfStudents.isEmpty();
    }
}
