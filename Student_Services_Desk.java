import java.util.*;

public class Student_Services_Desk {

    private static int nextSID = 22;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Map<Integer, Student> studentInfo = new TreeMap<>();

        // Pre-load some students for testing
        studentInfo.put(21, new Student(21, "Zog", "TheDestroyer",
                new ArrayList<>(List.of("BIT 143", "MATH 411", "ENG 120"))));
        studentInfo.put(20, new Student(20, "Mary", "Sue",
                new ArrayList<>(List.of("BIT 142", "MATH 142", "ENG 100"))));
        studentInfo.put(1, new Student(1, "Joe", "Bloggs",
                new ArrayList<>(List.of("BIT 115", "MATH 141", "ENG 101"))));

        char choice = 'L';

        while (choice != 'q') {
            displayMenu();
            choice = keyboard.nextLine().trim().toLowerCase().charAt(0);
            System.out.println();

            switch (choice) {
                case 'f':
                    findStudent(studentInfo, keyboard);
                    break;
                case 'l':
                    listStudents(studentInfo);
                    break;
                case 'a':
                    addStudent(studentInfo, keyboard);
                    break;
                case 'd':
                    deleteStudent(studentInfo, keyboard);
                    break;
                case 'm':
                    modifyStudent(studentInfo, keyboard);
                    break;
                case 'q':
                    System.out.println("Thanks for using the program - goodbye!\n");
                    break;
                default:
                    System.out.println("Sorry, but I didn't recognize the option " + choice);
                    break;
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\nWhat would you like to do next? ");
        System.out.println("F - Find a specific student");
        System.out.println("L - List all the students (for debugging purposes)");
        System.out.println("A - Add a new student");
        System.out.println("D - Delete an existing student");
        System.out.println("M - Modify an existing student");
        System.out.println("Q - Quit (exit) the program");
        System.out.print("What is your choice?\n(type in the letter & then the enter/return key) ");
    }

    private static void findStudent(Map<Integer, Student> studentInfo, Scanner keyboard) {
        System.out.println("Find a student (based on their ID number):\n");
        System.out.print("What is the ID number of the student to find? ");
        int idToFind = keyboard.nextInt();
        keyboard.nextLine(); // Consume the newline character
        Student foundStudent = studentInfo.get(idToFind);

        if (foundStudent != null) {
            System.out.println(foundStudent);
        } else {
            System.out.println("Didn't find a student with ID # " + idToFind);
        }
    }

    private static void listStudents(Map<Integer, Student> studentInfo) {
        System.out.println("The following students are registered:");
        for (Student student : studentInfo.values()) {
            System.out.println(student);
        }
    }

    private static void addStudent(Map<Integer, Student> studentInfo, Scanner keyboard) {
        System.out.println("Adding a new student\n");
        System.out.println("Please provide the following information:");
        System.out.print("Student's first name? ");
        String firstName = keyboard.nextLine();
        System.out.print("Student's last name? ");
        String lastName = keyboard.nextLine();
        System.out.println("Enter classes (type 'stop' to finish):");

        List<String> classes = new ArrayList<>();
        String className;
        while (true) {
            className = keyboard.nextLine().trim();
            if (className.equalsIgnoreCase("stop")) {
                break;
            }
            classes.add(className);
        }

        int newSID = nextSID++;
        Student newStudent = new Student(newSID, firstName, lastName, classes);
        studentInfo.put(newSID, newStudent);
    }

    private static void deleteStudent(Map<Integer, Student> studentInfo, Scanner keyboard) {
        System.out.println("Deleting an existing student\n");
        System.out.print("What is the ID number of the student to delete? ");
        int idToDelete = keyboard.nextInt();
        keyboard.nextLine(); // Consume the newline character
        Student removedStudent = studentInfo.remove(idToDelete);

        if (removedStudent != null) {
            System.out.println("Student account found and removed from the system!");
        } else {
            System.out.println("Didn't find a student with ID # " + idToDelete);
        }
    }

    private static void modifyStudent(Map<Integer, Student> studentInfo, Scanner keyboard) {
        System.out.println("Modifying an existing student\n");
        System.out.print("What is the ID number of the student to modify? ");
        int idToModify = keyboard.nextInt();
        keyboard.nextLine(); // Consume the newline character
        Student existingStudent = studentInfo.get(idToModify);

        if (existingStudent != null) {
            // ... (rest of the method)
        } else {
            System.out.println("Didn't find a student with ID # " + idToModify);
        }
    }
}
