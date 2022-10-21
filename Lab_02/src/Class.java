import java.util.ArrayList;
import java.util.List;

public class Class {

    String groupName;
    List<Student> studentsList = new ArrayList<Student>();
    int maxStudents;

    public void addStudent(Student NewStudent){

        if(studentsList.contains(NewStudent)){
            System.out.println("%n Student is already in the list");
        }
        else if(studentsList.size() >= maxStudents){
            System.out.println("%n Students list is full");
        }
        else {
            studentsList.add(NewStudent);
            System.out.println("%n Student added to the list");
        }
    }
    public void addPoints(Student Student, double points){
        Student.setPoints(points);
        System.out.println("%n Points added to the " + Student.firstName + " " + Student.lastName);
    }

    public void getStudent(Student StudentToRemove){
        if(StudentToRemove.points == 0){
            studentsList.remove(StudentToRemove);
            System.out.println("%n" + StudentToRemove.firstName + " " + StudentToRemove.lastName + " was successfully removed from the students list");
        }
        else {
            System.out.println("%n Students points are not 0");
        }
    }

    public void changeConditions(Student Student, StudentCondition status){
        Student.status = status;
        System.out.println("%n Student status is changed");
    }

    public void removePoints(Student Student, double points){
        Student.points -= points;
        System.out.println("%n Student points are removed");
    }

    public void search(String lastName){

        for (int i=0; i<studentsList.size(); i++){
            Student StudentToCompare = studentsList.get(i);
            lastName.compareTo(StudentToCompare.lastName);
        }
    }

    public void searchPartial(String fragmentName){
        for (int i=0; i<studentsList.size(); i++){
            Student StudentToCompare = studentsList.get(i);
            fragmentName.compareTo(StudentToCompare.lastName);
        }

    }

}
