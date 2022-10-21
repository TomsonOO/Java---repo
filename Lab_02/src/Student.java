public class Student implements Comparable<Student> {

    String firstName;
    String lastName;
    StudentCondition status;
    int birth;
    double points;

    public Student(String firstName, String lastName, StudentCondition status, int birth, double points) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.status = status;
        this.birth = birth;
        this.points = points;
    }

    @Override public int compareTo(String lastName)
    {
        // if the string are not equal
        if (this.lastName.compareTo(lastName) != 0) {
            return this.lastName.compareTo(lastName);
        }
        else {
            // we compare lastName if firstNames are equal
            return this.lastName.compareTo(lastName);
        }
    }

    @Override public int compareFragmentTo(String lastName)
    {
        // if the string are not equal
        if (this.lastName.compareTo(lastName) != 0) {
            return this.lastName.compareTo(lastName);
        }
        else {
            // we compare lastName if firstNames are equal
            return this.lastName.compareTo(lastName);
        }
    }


    public void print(){
        System.out.println("first name: " + this.firstName + "%n last name: " + this.lastName + "%n status: " + this.status + "%n birth year: " + this.birth + "%n points: " + this.points);
    }

    public void setPoints(double points){
        this.points += points;
    }


}
