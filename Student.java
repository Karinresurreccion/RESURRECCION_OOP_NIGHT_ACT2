package resurreccion_oop_n;
import java.util.Scanner;
        
public class Student {
      private final String firstName;
    private final String lastName;
    private int age;
    private boolean isMinor;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isMinor = age < 18;
    }

    public String getName() {
        return lastName + ", " + firstName;
    }

    public void increaseAge() {
        age++;
        isMinor = age < 18;
    }

    @Override
    public String toString() {
        String status = isMinor ? "minor" : "adult";
        return lastName + ", " + firstName + " - " + age + " - " + status;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your first name: ");
            String firstName = scanner.nextLine();
            System.out.print("Enter your last name: ");
            String lastName = scanner.nextLine();
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            Student student = new Student(firstName, lastName, age);
            
            System.out.println("\n");
           
            System.out.print("Enter test case number: ");
            int testCaseNumber = scanner.nextInt();
            
            switch (testCaseNumber) {
                case 1 -> {
                    if (student.age < 18) {
                        System.out.println("Test Case 1: Student under 18");
                        System.out.println(student);
                    } else {
                        System.out.println("Invalid test case for age over 18.");
                    }
                }
                case 2 -> {
                    if (student.age < 18) {
                        System.out.println("Test Case 2: Increase age of student1");
                        student.increaseAge();
                        System.out.println(student);
                    } else {
                        System.out.println("Invalid test case for age over 18.");
                    }
                }
                case 3 -> {
                    if (student.age > 18) {
                        System.out.println("Test Case 3: Student over 18");
                        System.out.println(student);
                    } else {
                        System.out.println("Invalid test case for age under or equal to 18.");
                    }
                }
                default -> System.out.println("Invalid test case number.");
            }
        }
    }
}

   
