public class Student implements Comparable<Student>{
    String name;
    String surname;
    StudentCondition condition;
    int dateOfBirth;
    double pointsSum;

    public Student(String name, String surname, StudentCondition condition, int dateOfBirth, double pointsSum) {
        this.name = name;
        this.surname = surname;
        this.condition = condition;
        this.dateOfBirth = dateOfBirth;
        this.pointsSum = pointsSum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", condition=" + condition +
                ", dateOfBirth=" + dateOfBirth +
                ", pointsSum=" + pointsSum +
                '}';
    }

    @Override
    public int compare(Student student) {
        int comparedSurname = this.surname.compareTo(student.surname);
        return comparedSurname;
    }

    public void setPointsSum(double pointsSum) {
        this.pointsSum = pointsSum;
    }
}
