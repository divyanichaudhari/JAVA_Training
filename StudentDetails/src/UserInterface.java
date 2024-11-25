import java.util.Scanner;
 
public class UserInterface {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Get student details
        System.out.println("Enter Student's Id:");
        int studentId = Integer.parseInt(scanner.nextLine());
 
        System.out.println("Enter Student's Name:");
        String studentName = scanner.nextLine();
 
        System.out.println("Enter Student's address:");
        String studentAddress = scanner.nextLine();
 
        String collegeResponse;
        Student student;
 
        while (true) {
            System.out.println("Whether the student is from NIT(Yes/No):");
            collegeResponse = scanner.nextLine().trim().toLowerCase();
 
            if (collegeResponse.equals("yes") || collegeResponse.equals("y")) {
                student = new Student(studentId, studentName, studentAddress);
                break;
            } else if (collegeResponse.equals("no") || collegeResponse.equals("n")) {
                System.out.println("Enter the college name:");
                String collegeName = scanner.nextLine();
                student = new Student(studentId, studentName, studentAddress, collegeName);
                break;
            } else {
                System.out.println("Wrong Input");
            }
        }
 
        // Output student details
        System.out.println(student);
    }
}