import java.util.HashMap;


public class ClassContainer {
    HashMap<String, Class> classMap = new HashMap<>();
    void addClass(String groupName, Class className) {
        if (classMap.containsKey(groupName)) System.out.println("This class has already been added.");
        else {
            classMap.put(groupName, className);
        }
    }
    void removeClas(String groupName){
        if (classMap.containsKey(groupName)) classMap.remove(groupName);
        else{
            System.out.println("There ");
        }
    }
    void findEmpty(){

    }

}
