import java.util.ArrayList;
import java.util.List;

public class Class {
    String groupName;
    List<Student> listOfStudents;
    int maxStudentCount;

    public Class(String groupName, int maxStudentCount) {
        this.groupName = groupName;
        this.listOfStudents = new ArrayList<Student>();
        this.maxStudentCount = maxStudentCount;
    }

    void addStudent(Student student){
        for(Student studentSearch : listOfStudents ) {
            int comp = studentSearch.compare(student);
            System.out.println(comp);
            if (comp == 0) {
                listOfStudents.add(student);
                System.out.println("Dodano studenta");
            } else {
                System.out.println("Nie dodano");
            }
        }
    }
    void sortByName () {
        for(Student studentSearch : listOfStudents ){
            System.out.println("");
        }
    }
}
