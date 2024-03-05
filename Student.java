import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {

    public static final int NOBODY = -1;

    private int SID;
    private String firstName;
    private String lastName;
    private List<String> classes;

    public Student(int SID, String firstName, String lastName, List<String> curClasses) {
        this.SID = SID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.classes = new ArrayList<>(curClasses);
    }

    public int getSID() {
        return SID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<String> getClasses() {
        // Returning an unmodifiable list to prevent external modification
        return Collections.unmodifiableList(classes);
    }

    @Override
    public String toString() {
        return "{" +
                " SID='" + getSID() + "'" +
                ", firstName='" + getFirstName() + "'" +
                ", lastName='" + getLastName() + "'" +
                ", classes=" + getClasses() +
                "}";
    }

    // Methods for modifying the state of the object
    public void addCourse(String course) {
        classes.add(course);
    }

    public void removeCourse(String course) {
        classes.remove(course);
    }
}
