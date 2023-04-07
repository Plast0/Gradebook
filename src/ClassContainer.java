import java.util.ArrayList;
import java.util.HashMap;


public class ClassContainer {
    HashMap<String, Class> classMap = new HashMap<>();
    void addClass(String groupName, Class className) {
        if (classMap.containsKey(groupName) || classMap.containsKey(className)) System.out.println("This class has already been added.");
        else {
            classMap.put(groupName, className);
            System.out.println(groupName +" was added to gradebook");
        }
    }
    void removeClas(String groupName){
        if (classMap.containsKey(groupName)) {
            classMap.remove(groupName);
            System.out.println(groupName + " was erased.");
        }
        else{
            System.out.println("There is no class with that name.");
        }
    }
    ArrayList findEmpty(){
        ArrayList listOFEmptyClass = new ArrayList<>();
        classMap.forEach((key, value) ->{
            if(value.listOfStudents.isEmpty()){
                System.out.println(key + " is empty.");
                listOFEmptyClass.add(value);
            }
        });
        return listOFEmptyClass;
    }
    void summary(){
        classMap.forEach((key, value) ->{
            System.out.println("Class name " + key );
            double percentage = (((double) value.listOfStudents.size()) /value.maxStudentCount)*100;
            System.out.println("Class occupancy in percent "+ percentage+"%");
        });
    }

}
